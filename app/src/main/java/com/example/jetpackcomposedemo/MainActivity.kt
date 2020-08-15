package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.remember
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Border
import androidx.ui.foundation.Text
import androidx.ui.foundation.lazy.LazyColumnItems
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.jetpackcomposedemo.ui.JetpackComposeDemoTheme
import com.example.jetpackcomposedemo.ui.home.BottomBar
import com.example.jetpackcomposedemo.ui.home.DrawerLayout
import com.example.jetpackcomposedemo.ui.home.FloatingActionButtonLayout
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
        topBar = { TopAppBarLayout(scaffoldState = scaffoldState) },
        bottomBar = { BottomBar() },
        drawerContent = { DrawerLayout(scaffoldState = scaffoldState) },
        floatingActionButton = { FloatingActionButtonLayout()},
        floatingActionButtonPosition = Scaffold.FabPosition.Center,
        isFloatingActionButtonDocked = true
    ) {
        LazyColumnItems(items = createData()) {
            Card(
                elevation = 3.dp,
                modifier = Modifier.padding(10.dp).fillMaxSize().heightIn(40.dp),
                border = Border(2.dp, Color.LightGray)
            ) {
                Column(
                    horizontalGravity = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = it.toString(), modifier = Modifier.padding(10.dp,5.dp))
                }
            }
            
            ConstraintLayout() {
                
            }
        }
    }
}

private fun createData():List<Int>{
    val res:ArrayList<Int> = ArrayList();
    for(i in 0..100){
        res.add(i);
    }
    return res.toList()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeDemoTheme {
        mainScreen()
    }
}