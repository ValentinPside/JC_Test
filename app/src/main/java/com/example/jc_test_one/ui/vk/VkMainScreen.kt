package com.example.jc_test_one.ui.vk

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jc_test_one.ui.theme.JC_Test_OneTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun VkMainScreen(){
    Scaffold (
        bottomBar = {
            BottomAppBar {
                val items = listOf(
                    NavigationItem.Home,
                    NavigationItem.Favorite,
                    NavigationItem.Profile
                )
                items.forEach {
                    NavigationBarItem(modifier = Modifier.
                        background(MaterialTheme.colorScheme.background),
                        selected = true,
                        onClick = {},
                        icon = {
                            Icon(it.icon, contentDescription = null)
                        },
                        label ={
                            Text(text = stringResource(id = it.titleResId))
                        }
                    )
                }
            }
        }
    ) {  }
}

@Preview
@Composable
private fun PreviewCardDark() {
    JC_Test_OneTheme(darkTheme = true) {
        VkMainScreen()
    }
}

@Preview
@Composable
private fun PreviewCardLight() {
    JC_Test_OneTheme(darkTheme = false) {
        VkMainScreen()
    }
}