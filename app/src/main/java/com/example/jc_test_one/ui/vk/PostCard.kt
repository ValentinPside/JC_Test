package com.example.jc_test_one.ui.vk

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jc_test_one.R
import com.example.jc_test_one.ui.theme.JC_Test_OneTheme

@Composable
fun PostCard() {
    Card()
    {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .padding(8.dp)
        ) {
            PostHeader()
            Spacer(
                modifier = Modifier
                    .size(8.dp)
            )
            Text(
                text = stringResource(R.string.template_text)
            )
            Spacer(
                modifier = Modifier
                    .size(8.dp)
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth(),
                painter = painterResource(R.drawable.post_content_image),
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
            Spacer(
                modifier = Modifier
                    .size(8.dp)
            )
            Statistics()
        }
    }
}

@Composable
private fun PostHeader() {
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
            Text(
                text = "group_name",
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(
                modifier = Modifier
                    .size(4.dp)
            )
            Text(
                text = "14:00",
                color = MaterialTheme.colorScheme.tertiary
            )
        }
        Icon(
            imageVector = Icons.Rounded.MoreVert,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.tertiary
        )
    }
}

@Composable
private fun Statistics() {
    Row (verticalAlignment = Alignment.CenterVertically){
        Row(modifier = Modifier
            .weight(1f)) {
            IconWithText(R.drawable.ic_views_count, "4015")
        }
        Row(modifier = Modifier
            .weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween) {
            IconWithText(R.drawable.ic_share, "202")
            IconWithText(R.drawable.ic_comment, "408")
            IconWithText(R.drawable.ic_like, "965")
        }
    }
}

@Composable
private fun IconWithText(iconResId: Int, text: String) {
    Row {
        Icon(painter = painterResource(id = iconResId),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onBackground)
        Spacer(modifier = Modifier
            .size(4.dp))
        Text(text = text,
            color = MaterialTheme.colorScheme.onBackground)
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