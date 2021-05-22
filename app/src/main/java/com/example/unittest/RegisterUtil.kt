package com.example.unittest

object RegisterUtil {

    private var extensionValidate = listOf("Burak", "BARSLAN")
    fun validateRegister(username: String, password: String, confirmPassword: String): Boolean {

        if (username.isEmpty() || password.isEmpty()) {
            return false
        }

        if (username in extensionValidate) {
            return false
        }

        if (password != confirmPassword) {
            return false
        }

        if (password.count() { it.isDigit() } < 2) {
        return false
        }
        return true
    }
}