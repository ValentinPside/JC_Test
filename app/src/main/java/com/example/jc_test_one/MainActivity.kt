package com.example.jc_test_one

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
            TimesTable()
        }
    }
}

@Preview
@Composable
fun Greeting() {
    Column {
        UserInfo("Valentin", 30)
        TimesTable()
    }
}

@Composable
fun UserInfo(name: String, age: Int) {
    Box(contentAlignment = Alignment.Center){
        Column(
            modifier = Modifier.fillMaxWidth(1F),
        ){
            Text("Hello $name! You are $age years old")
            Text("And you learning compose!")
        }
    }
}

@Preview
@Composable
fun TimesTable() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        for (i in 1 until 10) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                for (j in 1 until 10) {
                    val color = if ((i + j) % 2 == 0) {
                        Color.Yellow
                    } else {
                        Color.White
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1F)
                            .border(1.dp, Color.Black)
                            .background(color),
                        contentAlignment = Alignment.Center

                    ) {
                        Text(text = "${i * j}")
                    }
                }
            }
        }
    }
}