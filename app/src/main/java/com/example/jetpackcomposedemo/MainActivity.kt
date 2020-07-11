package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.graphics.ColorFilter
import androidx.ui.graphics.ImageAsset
import androidx.ui.graphics.Shape
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Home
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.jetpackcomposedemo.ui.JetpackComposeDemoTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        Row(modifier = Modifier.ltr.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround, verticalGravity = Alignment.Top) {

            Text(text = "Hello $name!", modifier = Modifier.padding(10.dp).gravity(Alignment.CenterVertically))
            Button(
                    text = { Text(text = name) },
                    onClick = {},
                    modifier = Modifier.padding(12.dp),
                    backgroundColor = Color.Green,
                    contentColor = Color.Yellow,
                    shape = MaterialTheme.shapes.large)

        }
        DrawerButton(
                icon = Icons.Filled.Home,
                label = "Home",
                isSelected = true,
                action = {

                }
        )
        TopAppBar(contentColor = Color.Black,modifier = Modifier.padding(10.dp)) {
            Row {
                Text(text = "Hello", modifier = Modifier.gravity(align = Alignment.CenterVertically))
                Image(asset = vectorResource(id = R.drawable.ic_mllogosvg), modifier = Modifier.ltr)
            }

        }
    }
}

@Composable
private fun DrawerButton(
        icon: VectorAsset,
        label: String,
        isSelected: Boolean,
        action: () -> Unit,
        modifier: Modifier = Modifier
) {
    val colors = MaterialTheme.colors
    val imageAlpha = if (isSelected) {
        1f
    } else {
        0.6f
    }
    val textIconColor = if (isSelected) {
        colors.primary
    } else {
        colors.onSurface.copy(alpha = 0.6f)
    }
    val backgroundColor = if (isSelected) {
        colors.primary.copy(alpha = 0.12f)
    } else {
        Color.Transparent
    }

    val surfaceModifier = modifier
            .padding(start = 8.dp, top = 8.dp, end = 8.dp)
            .fillMaxWidth()
    Surface(
            modifier = surfaceModifier,
            color = backgroundColor,
            shape = MaterialTheme.shapes.small
    ) {
        TextButton(
                onClick = action,
                modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalGravity = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                        asset = icon,
                        colorFilter = ColorFilter.tint(textIconColor),
                        alpha = imageAlpha
                )
                Spacer(Modifier.preferredWidth(16.dp))
                Text(
                        text = label,
                        style = MaterialTheme.typography.body2,
                        color = textIconColor,
                        modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeDemoTheme {
        Greeting("Android")
    }
}