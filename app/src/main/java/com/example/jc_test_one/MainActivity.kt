package com.example.jc_test_one

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
    UserInfo("Valentin", 30)
    TimesTable()
}

@Composable
fun UserInfo(name: String, age: Int) {
    Column {
        Text("Hello $name! You are $age years old")
        Text("And you learning compose!")
    }
}

@Preview
@Composable
fun TimesTable() {
    Column(
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxSize()
    ) {
        for(i in 1 until 10){
            Row(
                modifier = Modifier
                .fillMaxWidth()
                    .weight(1F)
            ){
                for(j in 1 until 10){
                    Text(text = "${i * j}")
                }
            }
        }
    }
}