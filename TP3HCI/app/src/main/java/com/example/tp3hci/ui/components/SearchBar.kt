package com.example.tp3hci.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import com.example.tp3hci.R
import com.example.tp3hci.ui.theme.Osc
import com.example.tp3hci.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    onSearchTextChanged: (String) -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(24.dp)),
        value = searchQuery,
        onValueChange = {
            searchQuery = it
            onSearchTextChanged(it)
        },
        placeholder = { Text(
            text = stringResource(id = R.string.search_bar),
            color = Osc
        ) },
        leadingIcon = { Icon(
            Icons.Filled.Search, contentDescription = "Search",
            tint = Osc
        ) },
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                // Puedes manejar aquí la acción de "Done" si es necesario
            }
        ),
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Osc,
            cursorColor = Osc,
            focusedIndicatorColor = Osc,
            unfocusedIndicatorColor = Osc
        )
    )
}