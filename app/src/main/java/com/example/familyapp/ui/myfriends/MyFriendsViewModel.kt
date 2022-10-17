package com.example.familyapp.ui.myfriends

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my friends Fragment"
    }
    val text: LiveData<String> = _text
}