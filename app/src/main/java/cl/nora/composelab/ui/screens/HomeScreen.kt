package cl.nora.composelab.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onVerDetalle: () -> Unit) {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Mi Agenda Académica") })

        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = "Mis asignaturas",
                style = MaterialTheme.typography.headlineSmall
            )
            AsignaturaCard(
                nombre = "Desarrollo de Aplicaciones Móviles",
                sala = "304",
                horario = "10:00 - 12:10",
                onVerDetalle = onVerDetalle
            )
        }
    }
}
@Composable
fun AsignaturaCard(
    nombre: String,
    sala: String,
    horario: String,
    onVerDetalle: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(nombre, style = MaterialTheme.typography.titleMedium)
            Text("Sala: $sala")
            Text("Horario: $horario")
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = onVerDetalle) {
                Text("Ver detalle")
            }
        }
    }
}
