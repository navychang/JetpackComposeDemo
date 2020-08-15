package com.example.jetpackcomposedemo.ui.home

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Row
import androidx.ui.layout.RowScope.weight
import androidx.ui.layout.preferredSize
import androidx.ui.material.BottomAppBar
import androidx.ui.material.IconButton
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Home
import androidx.ui.material.icons.filled.Menu
import androidx.ui.unit.dp

@Composable
fun BottomBar() {
    BottomAppBar {
        Row(
            modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            BottomBarIcon(asset = Icons.Default.Home)
            BottomBarIcon(asset = Icons.Default.Menu)
        }
    }
}

@Composable
fun BottomBarIcon(asset: VectorAsset) {
    IconButton(onClick = {}) {
        Image(
            asset = asset,
            modifier = Modifier.preferredSize(24.dp)
        )
    }
}