package com.example.jc_test_one.data

import android.app.Application

class App: Application() {
    val database by lazy { MainDb.createDataBase(this) }
}