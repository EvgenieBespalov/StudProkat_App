package com.example.rent_of_things_app

import android.app.Application
import android.content.Context
import com.example.rent_of_things_app.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(
                provideNetworkModule(),
                provideDataModule(),
                provideDomainModule(),
                providePresentationModule(),
                provideSharedPreferencesModule(),
            )
        }
    }
}