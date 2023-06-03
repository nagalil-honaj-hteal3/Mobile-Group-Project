package com.example.mobilegroupproject.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "Welcome to our application"
    }

    val text: LiveData<String> = _text
}