package com.example.jc_test_one.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jc_test_one.R

@Composable
fun PostCard() {
    Card(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background)
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.post_comunity_thumbnail),
                contentDescription = null
            )
            Spacer(
                modifier = Modifier
                    .size(8.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(text = "group_name",
                color = MaterialTheme.colorScheme.primary)
                Spacer(
                    modifier = Modifier
                        .size(4.dp)
                )
                Text(text = "14:00",
                    color = MaterialTheme.colorScheme.tertiary)
            }
            Icon(
                imageVector = Icons.Rounded.MoreVert,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.tertiary
            )
        }

    }
}

@Preview
@Composable
private fun PreviewCardDark() {
    JC_Test_OneTheme(darkTheme = true) {
        PostCard()
    }
}

@Preview
@Composable
private fun PreviewCardLight() {
    JC_Test_OneTheme(darkTheme = false) {
        PostCard()
    }
}