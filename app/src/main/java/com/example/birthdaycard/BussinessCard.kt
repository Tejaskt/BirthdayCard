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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class BussinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun FinalCard(
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .background(Color.DarkGray)
                //.offset(0.dp,50.dp)

        ){
            FirstView()
        }
        Box(
            modifier = Modifier
                .background(Color.Cyan)
                //.offset(15.dp,50.dp)
        ){
            SecoundView()
        }

    }
}

@Composable
fun FirstView() {
    val apkimg = painterResource(id = R.drawable.android_logo)
    Box {
        Column {
            Image(
                painter = apkimg,
                contentDescription = null,
                modifier = Modifier
                    .offset(50.dp, 20.dp)
                    .fillMaxWidth(0.7f)
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
            )
            Text(
                text = "Tejas Kanzariya",
                color = Color.Cyan,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 50.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Android Developer",
                color = Color(0xFF3ABE22),
                fontWeight = FontWeight.Medium,
                fontSize = 28.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(start = 4.dp, end = 4.dp, top = 4.dp, bottom = 4.dp)
            )
        }
    }
}

@Composable
fun SecoundView() {
    val imgPhone = painterResource(R.drawable.baseline_phone_black_24dp)
    val imgShare = painterResource(R.drawable.baseline_share_black_24dp)
    val imgEmail = painterResource(R.drawable.baseline_email_black_24dp)
    Box(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
    ) {
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Row(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                Image(painter = imgPhone, contentDescription = null)
                Text(
                    text = "+9737436797",
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    modifier = Modifier.offset(35.dp)
                )
            }
            Row(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                Image(painter = imgShare, contentDescription = null)
                Text(
                    text = "@tejas_kt_8",
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    modifier = Modifier.offset(35.dp)
                )
            }
            Row(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                Image(painter = imgEmail, contentDescription = null)
                Text(
                    text = "tejaskt@gmail.com",
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    modifier = Modifier.offset(35.dp)
                )
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun BussinessCardPreview() {
    BirthdayCardTheme {
        FinalCard()
    }
}

