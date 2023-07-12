package com.example.rent_of_things_app.di

import com.example.rent_of_things_app.presentation.*
import com.example.rent_of_things_app.screen.ProfileScreen
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

fun providePresentationModule(): Module =
    module {
        viewModel {
            ProductListScreenViewModel()
        }
        viewModel {
            RentalOffersListScreenViewModel()
        }
        viewModel {
            ProductCreationScreenViewModel()
        }
        viewModel {
            ProductCardScreenViewModel()
        }
        viewModel {
            SignInScreenViewModel()
        }
        viewModel {
            SignUpScreenViewModel()
        }
        viewModel {
            ProfileScreenViewModel()
        }
    }