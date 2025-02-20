package com.example.jc_test_one

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import com.example.jc_test_one.ui.botany.MainScreen
import com.example.jc_test_one.ui.instagram.TimesTable
import com.example.jc_test_one.ui.theme.JC_Test_OneTheme
import com.example.jc_test_one.ui.vk.VkMainScreen


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
                    //TimesTable()
                    //InstagramProfileCard()
                    //PostCard()
                    //VkMainScreen()
                    MainScreen()
                }
            }
        }
    }
}