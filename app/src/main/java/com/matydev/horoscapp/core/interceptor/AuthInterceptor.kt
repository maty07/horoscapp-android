package com.matydev.horoscapp.core.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(private val tokenManager: TokenManager) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val token = tokenManager.getToken()
        val request = chain.request().newBuilder().addHeader("Authorization", token).build()
        return chain.proceed(request)
    }

}

class TokenManager @Inject constructor() {
    fun getToken(): String {
        // recuperar token
        return "token recuperado"
    }
}