package com.example.jc_test_one.ui.botany

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jc_test_one.MainViewModel
import com.example.jc_test_one.ui.theme.JC_Test_OneTheme

@Composable
fun MainScreen(
    mainViewModel: MainViewModel = viewModel(factory = MainViewModel.factory)
){

    val itemList = mainViewModel.itemList.collectAsState(emptyList())

    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)){
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(modifier = Modifier
                .weight(1f),
                value = mainViewModel.newText.value,
                onValueChange = { text ->
                    mainViewModel.newText.value = text
                },
                label = {
                    Text(text = "Name...", modifier = Modifier)
                }
            )
            IconButton(onClick = {
                mainViewModel.insertItem()
            }) {
                Icon( imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onBackground)
            }
        }
        Spacer(modifier = Modifier
            .height(5.dp))
        LazyColumn(modifier = Modifier
            .fillMaxWidth()) {
            items(itemList.value){ item ->
                ListItem(item){
                    mainViewModel.nameEntity = it
                    mainViewModel.newText.value = it.name
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewCardDark() {
    JC_Test_OneTheme(darkTheme = true) {
        MainScreen()
    }
}

@Preview
@Composable
private fun PreviewCardLight() {
    JC_Test_OneTheme(darkTheme = false) {
        MainScreen()
    }
}