package com.example.testapplication.utils

import android.annotation.SuppressLint
import android.app.Application
import com.example.testapplication.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class MainApplication: Application() {

    @SuppressLint("HardwareIds")
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        startKoin {
            androidContext(this@MainApplication)
            modules(listOf(appModule))
        }

    }
}