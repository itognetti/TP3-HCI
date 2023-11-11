package com.example.tp3hci.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tp3hci.ui.theme.Orange
import com.example.tp3hci.ui.theme.Osc

@Composable
fun LoginRegisterScreen(name: String, modifier: Modifier = Modifier) {
    Column (modifier= Modifier
        .padding(0.dp)
        .fillMaxWidth()
        .background(Osc)
        .fillMaxHeight()
        .padding(16.dp), verticalArrangement = Arrangement.Bottom) {
        ElevatedButton(onClick = { /*TODO*/ }, Modifier.fillMaxWidth().padding(bottom = 20.dp)) {
            Text(text = "REGISTRARSE" , color = Orange)
        }

        ElevatedButton(onClick = { /*TODO*/ },Modifier.fillMaxWidth().padding(bottom = 100.dp)) {
            Text(text = "INICIAR SESION" , color=Orange)
        }
    }
    Column {
        Text(text  = "FINSPO",color = Orange, modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally))
    }
}