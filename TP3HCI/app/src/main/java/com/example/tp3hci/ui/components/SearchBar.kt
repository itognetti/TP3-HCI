package com.example.tp3hci.ui.components

//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//
//@Composable
//fun SearchBar(navController: NavHostController, viewModel: MainViewModel) {
//    var query by remember { mutableStateOf(TextFieldValue("")) }
//    TextField(
//        modifier = Modifier
//            .padding(1.dp)
//            .fillMaxWidth(0.8f),
//        colors = TextFieldDefaults.textFieldColors(
//            backgroundColor = Tertiary,
//            focusedLabelColor = Secondary,
//            trailingIconColor = Secondary,
//            unfocusedIndicatorColor = Color.Transparent,
//            disabledIndicatorColor = Color.Transparent,
//            focusedIndicatorColor = Color.Transparent,
//        ),
//        shape = CircleShape,
//        trailingIcon = {
//            Icon(
//                imageVector = Icons.Default.Search,
//                contentDescription = "searchBar"
//            )
//        },
//        value = query,
//        onValueChange = {
//            query = it
//        },
//        label = {
//            Text(
//                text = stringResource(R.string.search),
//                modifier = Modifier.padding(horizontal = 5.dp),
//                textAlign = TextAlign.Center
//            )
//        },
//        singleLine = true,
//        keyboardOptions = KeyboardOptions(
//            imeAction = ImeAction.Search
//        ),
//        keyboardActions = KeyboardActions(
//            onSearch = {
//                navController.navigate("search/${query.text}")
//            }
//        )
//    )
//}