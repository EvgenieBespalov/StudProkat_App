package com.example.rent_of_things_app.di

import com.example.rent_of_things_app.data.converter.ProductConverter
import org.koin.core.module.Module
import org.koin.dsl.module

fun provideDataModule(): Module =
    module {
        factory { ProductConverter() }
    }