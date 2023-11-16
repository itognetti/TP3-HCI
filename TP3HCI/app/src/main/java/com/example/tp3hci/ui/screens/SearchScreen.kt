package com.example.tp3hci.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tp3hci.R
import com.example.tp3hci.ui.components.CardItem
import com.example.tp3hci.ui.components.SearchBar
import com.example.tp3hci.ui.theme.Black
import com.example.tp3hci.ui.theme.FOrange
@Preview(showSystemUi = true)

@Composable
fun SearchScreen() {
    var searchQuery by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Black)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.search_screen),
            fontSize = 30.sp,
            color = FOrange
        )

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                Icons.Default.List,
                contentDescription = null,
                modifier = Modifier
                    .size(34.dp)
                    .padding(start = 10.dp),
                tint = Color.White // Ajusta el color del icono según tus necesidades
            )
            // Barra de búsqueda
            SearchBar(onSearchTextChanged = { newQuery ->
                searchQuery = newQuery
                // Realizar acciones de búsqueda según la nueva consulta
            })
            // Agrega el icono a la izquierda de la barra de búsqueda


        }

        // Lista de tarjetas
        CardItem(imageResId = R.drawable.gym1, title = "Tarjeta 1", description = "Descripción de la tarjeta 1")
        CardItem(imageResId = R.drawable.gym2, title = "Tarjeta 2", description = "Descripción de la tarjeta 2")
        CardItem(imageResId = R.drawable.gym3, title = "Tarjeta 3", description = "Descripción de la tarjeta 3")
        CardItem(imageResId = R.drawable.gym4, title = "Tarjeta 4", description = "Descripción de la tarjeta 4")
        CardItem(imageResId = R.drawable.gym5, title = "Tarjeta 5", description = "Descripción de la tarjeta 5")
    }
}