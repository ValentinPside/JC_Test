package com.example.jc_test_one

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import com.example.jc_test_one.ui.theme.InstagramProfileCard
import com.example.jc_test_one.ui.theme.JC_Test_OneTheme
import com.example.jc_test_one.ui.theme.PostCard


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_Test_OneTheme() {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                ) {
                    //InstagramProfileCard()
                    PostCard()
                }
            }
        }
    }
}