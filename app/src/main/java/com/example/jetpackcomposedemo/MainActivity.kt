package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.core.setContent
import androidx.ui.material.*
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcomposedemo.ui.JetpackComposeDemoTheme
import com.example.jetpackcomposedemo.ui.home.BottomBar
import com.example.jetpackcomposedemo.ui.home.DrawerLayout
import com.example.jetpackcomposedemo.ui.home.TopAppBarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                mainScreen()
            }
        }
    }
}

@Composable
fun mainScreen(
    scaffoldState: ScaffoldState = remember { ScaffoldState() }
) {
    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = { TopAppBarLayout(scaffoldState = scaffoldState) },
        bottomAppBar = { BottomBar() },
        drawerContent = { DrawerLayout(scaffoldState = scaffoldState) }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeDemoTheme {
        mainScreen()
    }
}