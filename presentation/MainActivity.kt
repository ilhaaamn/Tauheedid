package com.tauheedid.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.tauheedid.ui.TauheedIdTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TauheedIdTheme {
                // A surface container using the 'background' color from the theme
                Greeting(name = "Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        TopAppBar(title = { Text(text = "Tauheedid", style = TextStyle(color = Color.White)) })
        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TauheedIdTheme {
        Greeting("Android")
    }
}