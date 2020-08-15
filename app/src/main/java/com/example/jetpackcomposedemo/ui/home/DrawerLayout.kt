package com.example.jetpackcomposedemo.ui.home

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Close
import androidx.ui.material.icons.filled.Home
import androidx.ui.unit.dp

@Composable
fun DrawerLayout(
    scaffoldState: ScaffoldState
) {
    Surface(color = Color.LightGray) {
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(Modifier.preferredHeight(24.dp))
            Divider(color = MaterialTheme.colors.onSurface.copy(alpha = .2f))
            DrawerButton(
                icon = Icons.Filled.Home,
                label = "Home",
                isSelected = true,
                action = {
                    scaffoldState.drawerState = DrawerState.Closed
                }
            )
        }
    }
}