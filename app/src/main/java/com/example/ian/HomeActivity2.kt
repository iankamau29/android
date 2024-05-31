package com.example.ian

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HomeActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           Home()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Home(
    backgroundImageResId: Int = R.drawable.trol,
    content: @Composable () -> Unit = {}
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = backgroundImageResId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        content()

    }


    val mainContext = LocalContext.current
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
//            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "This is the about page",
            fontSize = 20.sp,
            color = Color.Yellow,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            modifier = Modifier

//                .background(Color.White)
                .padding(16.dp)
                .border(2.dp, Color.White, shape = RoundedCornerShape(8.dp)),

        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "This is the second line of text",
            fontWeight = FontWeight.Bold,
            color = Color.LightGray,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "This is the third line of text",
            fontWeight = FontWeight.Medium,
            color = Color.White,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "This is the fourth line of text",
            fontWeight = FontWeight.ExtraLight,
            color = Color.Green,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "This is the fifth line of text",
            fontWeight = FontWeight.ExtraBold,
            color = Color.Red,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "This is the sixth line of text",
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                mainContext.startActivity(Intent(mainContext, MainActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = CutCornerShape(8.dp)
        ) {
            Text("About", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.layout),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
//                .border(3.dp, Color.White)
                .size(200.dp)
        )
    }
}










