package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class ComposeBasics : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    JetPackImage()
                }
            }
        }
    }
}

@Composable
fun JetPackImage() {
    val img = painterResource(id = R.drawable.bg_compose_background)
    Box {
        Column {

            Image(
                painter = img,
                contentDescription = null,
                modifier = Modifier
                    .wrapContentSize(Alignment.TopEnd)
            )

            Text(
                text = stringResource(R.string.jet_title),
                textAlign = TextAlign.Justify,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        top = 16.dp,
                        end = 16.dp,
                        bottom = 16.dp
                    )
                    .background(color = Color.White)
            )
            Text(
                text = stringResource(id = R.string.jet_dis),
                textAlign = TextAlign.Justify,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .background(color = Color.White)
            )
            Text(
                text = stringResource(id = R.string.jet_value),
                textAlign = TextAlign.Justify,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        top = 16.dp,
                        end = 16.dp,
                        bottom = 16.dp
                    )
                    .background(color = Color.White)
            )
        }
    }
}
/*
@Composable
fun ImgTxt() {
    Column {

        Text(
            text = stringResource(R.string.jet_title),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
        )
        Text(
            text = stringResource(id = R.string.jet_dis),
            fontSize = 16.sp,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
        )
        Text(
            text = stringResource(id = R.string.jet_value),
            fontSize = 16.sp,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
        )
    }
}

*/

@Preview(showBackground = false)
@Composable
fun ShowTheImg() {
    BirthdayCardTheme {
        JetPackImage()
    }
}