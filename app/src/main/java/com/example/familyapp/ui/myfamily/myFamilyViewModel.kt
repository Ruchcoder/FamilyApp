package com.example.familyapp.ui.myfamily

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class myfamilyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is My Family Fragment"
    }
    val text: LiveData<String> = _text
}