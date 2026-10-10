package cl.nora.composelab.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cl.nora.composelab.model.Asignatura

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    asignatura: Asignatura,
    onVolver: () -> Unit
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Detalle") }) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(asignatura.nombre, style = MaterialTheme.typography.headlineSmall)
            Spacer(Modifier.height(12.dp))
            Text("Profesor: ${asignatura.profesor}")
            Text("Sala: ${asignatura.sala}")
            Text("Horario: ${asignatura.horario}")
            Spacer(Modifier.height(20.dp))
            Button(onClick = onVolver) { Text("Volver") }
        }
    }
}