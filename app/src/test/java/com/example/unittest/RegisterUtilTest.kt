package com.example.unittest


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegisterUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegisterUtil.validateRegister("","123","123")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username  and correctly repeared password returns true`(){
        val result = RegisterUtil.validateRegister("Burak","123","123")
        assertThat(result).isFalse()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegisterUtil.validateRegister("BARSLAN","123","123")
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`(){
        val result = RegisterUtil.validateRegister("Burak","123","qweasdzxc")
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegisterUtil.validateRegister("Burak","","")
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password return false`(){
        val result = RegisterUtil.validateRegister("Burak","asdasdas","asdasdas")
        assertThat(result).isFalse()
    }
}