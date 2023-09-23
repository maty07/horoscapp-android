package com.matydev.horoscapp.ui.palmistry

import android.Manifest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.PermissionChecker
import androidx.fragment.app.Fragment
import com.matydev.horoscapp.databinding.FragmentPalmistryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PalmistryFragment : Fragment() {

    companion object {
        private const val CAMERA_PERMISSION = Manifest.permission.CAMERA
    }

    private var _binding: FragmentPalmistryBinding? = null
    private val binding get() = _binding!!

    private val requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
        isGraneted ->
            if (isGraneted) {
                // start camera
            } else {
                Toast.makeText(
                    requireContext(),
                    "Acepta los permisos para poder disfrutar de una experiencia mágica",
                    Toast.LENGTH_LONG
                ).show()
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPalmistryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // comprobar permiso camera
        if (checkCameraPermission()) {
            // tiene permisos
            // start camera
        } else {
            requestPermissionLauncher.launch(CAMERA_PERMISSION)
        }

    }

    private fun checkCameraPermission(): Boolean {
        return PermissionChecker.checkPermission(requireContext(), CAMERA_PERMISSION, 0, 0, null
        )== PermissionChecker.PERMISSION_GRANTED
    }


}