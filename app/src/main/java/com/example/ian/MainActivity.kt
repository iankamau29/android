package com.example.ian

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Safaris()
        }
    }
}

@SuppressLint("InvalidColorHexValue")
@Preview(showBackground = true)
@Composable
fun Safaris(
    backgroundImageResId: Int = R.drawable.forest,
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
    val context = LocalContext.current


    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(color = Color(0xff00FFFFFF))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {





        Image(
            painter = painterResource(id = R.drawable.company),
            contentDescription = null,
            modifier = Modifier

                .clip(RoundedCornerShape(10.dp))
//                .border(3.dp, Color.White)
                .size(200.dp)
                .background(color = Color(0xff00FFFFFF))
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Welcome to Safari",
            fontSize = 20.sp,
            color = Color.Blue,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .background(Color.White)
                .padding(16.dp)
                .border(2.dp, Color.Blue, shape = RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(24.dp))




        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    context.startActivity(Intent(context, LoginActivity::class.java))
                },
                colors = ButtonDefaults.buttonColors(Color.Magenta),
                shape = CutCornerShape(8.dp)
            ) {
                Text("Login", color = Color.White, fontSize = 16.sp)
            }
            Button(
                onClick = {
                    context.startActivity(Intent(context, BotActivity::class.java))
                },
                colors = ButtonDefaults.buttonColors(Color.Magenta),
                shape = CutCornerShape(8.dp)
            ) {
                Text("Home", color = Color.White, fontSize = 16.sp)
            }
        }
    }
}

