package com.example.tp3hci.ui.screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tp3hci.R
import com.example.tp3hci.ui.theme.FOrange


//fun LoginRegisterScreen(onLoginClick: () -> Unit, onRegisterClick: () -> Unit){
/*
@Preview
@Composable
fun RegisterScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.register),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logotext),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .height(250.dp)
                .padding(50.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(16.dp))
            // Botón de Registrarse
            Button(
                onClick = {
                    // Agrega la lógica de registrarse aquí
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                border = BorderStroke(3.dp, FOrange),
            ) {
                Text(
                    text = stringResource(id = R.string.register),
                    fontSize = 24.sp
                )
            }

        }

        IconButton(
            onClick = {
                // Agrega la lógica para más información aquí
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Info,
                contentDescription = "Info",
                tint = FOrange,
                modifier = Modifier.size(35.dp)
            )
        }
    }
}

 */





@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RegisterScreen() {
    var nombreCompleto by remember { mutableStateOf("") }
    var correoElectronico by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.register),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logotext),
                    contentDescription = null,
                    modifier = Modifier.size(250.dp)
                )
            }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(50.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Espacio para el nombre completo
            TextField(
                value = nombreCompleto,
                onValueChange = { nombreCompleto = it },
                label = { Text("Nombre Completo") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Espacio para el correo electrónico
            TextField(
                value = correoElectronico,
                onValueChange = { correoElectronico = it },
                label = { Text("Correo Electrónico") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Espacio para la contraseña
            TextField(
                value = contrasena,
                onValueChange = { contrasena = it },
                label = { Text("Contraseña") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Espacio para la Repetir contraseña
            TextField(
                value = contrasena,
                onValueChange = { contrasena = it },
                label = { Text("Repetir Contraseña") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Botón de registro
            Button(
                onClick = {
                    // Agrega la lógica de registro aquí
                },
                colors = ButtonDefaults.buttonColors(FOrange),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Registrarse")
            }
        }

        IconButton(
            onClick = {
                // Agrega la lógica para más información aquí
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Info,
                contentDescription = "Info",
                tint = FOrange,
                modifier = Modifier.size(35.dp)
            )
        }
    }
}



