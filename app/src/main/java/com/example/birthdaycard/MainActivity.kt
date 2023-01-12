package com.example.birthdaycard

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                        BirthdayGreetingWithImage(
                            message = getString(R.string.happy_birthday_text),
                            from = getString(R.string.signature_text)
                        )
                        MyContent()
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
    BirthdayGreetingWithText(message = message, from = from)
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    Column(

    ) {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(
                    start = 16.dp,
                    top = 16.dp
                )
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp),
        )
    }
}

@Composable
fun MyContent(){

    // Fetching the Local Context
    val mContext = LocalContext.current

    Column(Modifier
        .fillMaxSize()
        .padding(bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom

    ) {

        // Creating a Button that on-click
        // implements an Intent to go to SecondActivity
        Button(onClick = {
            mContext.startActivity(Intent(mContext, Example::class.java))
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58)),
        ) {
            Text("Go to Second Activity", color = Color.White)
        }
    }
}

@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme {
        BirthdayGreetingWithImage(message = "Happy Birthday Ravi..!", from = "- From Tejas")
        MyContent()
    }
}
