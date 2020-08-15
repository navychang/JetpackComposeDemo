package com.example.jetpackcomposedemo.ui.home

import androidx.compose.Composable
import androidx.ui.foundation.Icon
import androidx.ui.graphics.Color
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Star
import androidx.ui.unit.dp

@Composable
fun FloatingActionButtonLayout() {
    FloatingActionButton(
        onClick = {},
        backgroundColor = Color.LightGray,
        elevation = 10.dp
    ) {
        Icon(asset = Icons.Default.Star)
    }

}