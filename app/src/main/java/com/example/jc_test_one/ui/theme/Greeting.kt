package com.example.jc_test_one.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Greeting() {
    Column {
        UserInfo("Valentin", 30)
    }
}

@Composable
private fun UserInfo(name: String, age: Int) {
    Box(contentAlignment = Alignment.Center){
        Column(
            modifier = Modifier.fillMaxWidth(1F),
        ){
            Text("Hello $name! You are $age years old")
            Text("And you learning compose!")
        }
    }
}