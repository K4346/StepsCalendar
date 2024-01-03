package com.example.stepscalendar

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.stepscalendar.ui.screens.steps_calendar.StepsCalendarScreen


@Composable
fun StepsCalendarAppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = StepsCalendarScreenRoutes.StepsCalendar.name
    ) {

        composable(StepsCalendarScreenRoutes.StepsCalendar.name) {
            StepsCalendarScreen(navController = navController)
        }
    }
}

enum class StepsCalendarScreenRoutes {
    StepsCalendar,
}