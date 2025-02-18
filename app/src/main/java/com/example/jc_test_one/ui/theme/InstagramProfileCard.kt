package com.example.jc_test_one.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jc_test_one.R

@Composable
fun CardTest() {
    Card(
        modifier = Modifier
            .padding(8.dp),
        shape = RoundedCornerShape(
            topEnd = 4.dp,
            topStart = 4.dp
        ),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground)
    ) {
        InstagramProfileCard()
    }
}

@Composable
fun InstagramProfileCard() {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(50.dp)
                    .background(MaterialTheme.colorScheme.onBackground),
                painter = painterResource(id = R.drawable.instagram_icon),
                contentDescription = null
            )
            UserStatistics(title = "Posts", value = "6,950")
            UserStatistics(title = "Followers", value = "436M")
            UserStatistics(title = "Following", value = "76")
        }
        Text(
            text = "Instagram",
            fontSize = 32.sp,
            fontFamily = FontFamily.Cursive
        )
        Text(
            text = "#compose",
            fontSize = 14.sp,
            textDecoration = TextDecoration.Underline
        )
        Text(
            buildAnnotatedString {
                withStyle(SpanStyle(fontWeight = FontWeight.Bold ,textDecoration = TextDecoration.None)) {
                    append("My git: ")
                }
                withStyle(SpanStyle(fontFamily = FontFamily.Monospace, textDecoration = TextDecoration.None)){
                    append("ValentinPside")
                }
            },
            fontSize = 14.sp,
        )
        Button(onClick = {}) {
            Text(
                text = "Open on GitHub"
            )
        }
    }

}

@Composable
private fun UserStatistics(
    title: String, value: String
) {
    Column(
        modifier = Modifier
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = value,
            fontSize = 24.sp,
            fontFamily = FontFamily.Cursive
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
private fun PreviewCardDark() {
    JC_Test_OneTheme(darkTheme = true) {
        CardTest()
    }
}

@Preview
@Composable
private fun PreviewCardLight() {
    JC_Test_OneTheme(darkTheme = false) {
        CardTest()
    }
}