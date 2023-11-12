package com.example.tp3hci.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.tp3hci.Screen
import com.example.tp3hci.ui.theme.Orange
import com.example.tp3hci.ui.theme.Osc
import com.example.tp3hci.ui.theme.White

@Composable
fun BottomBar(
    currentRoute: String?,
    onNavigateToRoute: (String) -> Unit
) {
    val items = listOf(
        Screen.HomeScreen,
        Screen.SearchScreen,
        Screen.ProfileScreen
    )

    NavigationBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = Osc
    ) {
        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = if (currentRoute == item.route) Orange else White
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        color = if (currentRoute == item.route) Orange else White
                    )
                },
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = { onNavigateToRoute(item.route) },
//                colors = NavigationBarItemColors(
//                    selectedIconColor = Orange,
//                    selectedTextColor = Orange,
//                    selectedIndicatorColor = Color.Transparent,
//                    unselectedIconColor = White,
//                    unselectedTextColor = White,
//                ),
            )
        }
    }
}

