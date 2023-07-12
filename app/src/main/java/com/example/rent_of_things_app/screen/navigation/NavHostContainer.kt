package com.example.rent_of_things_app.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.rent_of_things_app.screen.navigation.Routes
import com.example.rent_of_things_app.screen.offer_list_screens.RentalOffersListScreen

@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues
) {

    NavHost(
        navController = navController,
        startDestination = Routes.ProductListScreenRoute.route,
        modifier = Modifier.padding(paddingValues = padding),
        builder = {

            composable(Routes.ProductListScreenRoute.route) {
                ProductListScreen(navController = navController)
            }

            composable(Routes.RentalOffersListScreenRoute.route) {
                RentalOffersListScreen()
            }

            composable(Routes.ProfileScreenRoute.route) {
                ProfileScreen()
            }

            composable(Routes.ProductCardScreenRoute.route) {
                ProductCardScreen()
            }
        })

}