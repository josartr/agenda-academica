package cl.nora.composelab.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cl.nora.composelab.model.Asignatura
import cl.nora.composelab.ui.screens.DetailScreen
import cl.nora.composelab.ui.screens.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    val mobile = Asignatura(
        nombre = "Desarrollo de Aplicaciones Móviles",
        profesor = "Profesor Juan Azócar",
        sala = "304",
        horario = "10:00 - 12:10"
    )

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onVerDetalle = { navController.navigate("detalle") }
            )
        }

        composable("detalle") {
            DetailScreen(
                asignatura = mobile,
                onVolver = { navController.popBackStack() }
            )
        }
    }
}