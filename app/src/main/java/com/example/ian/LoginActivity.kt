package com.example.ian

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
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
import androidx.webkit.Profile
import com.example.ian.ui.theme.IanTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Homes()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Homes(
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

    var name by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var email by remember {
        mutableStateOf(TextFieldValue(""))
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

        Image(
            painter = painterResource(id = R.drawable.layout),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
//                .border(3.dp, Color.White)
                .size(200.dp)
        )
        Text(
            text = "LOGIN",
            fontSize = 50.sp,
            color = Color.Yellow,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            modifier = Modifier

//                .background(Color.White)
                .padding(16.dp)
//                .border(2.dp, Color.White, shape = RoundedCornerShape(8.dp)),

            )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text="Come back with your ID",
            color=Color.Yellow,
            fontSize = 20.sp,
        )
        Text(
            text="For easy,fast and secure login",
            color=Color.Yellow,

        )

        OutlinedTextField(
            value = name,
            onValueChange ={ name = it},
            label = {Text(text="Name")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person,
                contentDescription = "name") },
                shape = RoundedCornerShape(50.dp),
            )


        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(

            shape = RoundedCornerShape(50.dp),
            value = email,
            onValueChange ={email = it},
            label = {Text(text="Email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email,
                contentDescription = "emailIcon") },
            )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                mainContext.startActivity(Intent(mainContext, BotActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = CutCornerShape(8.dp)
        ) {
            Text("Login", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(


            text = "Forgot Password?",

            color = Color.White,
            modifier = Modifier
                .clickable {   }
        )
        Text(text = "OR",
        fontSize= 40.sp,
            color = Color.White)
        Row (horizontalArrangement = Arrangement.spacedBy(10.dp)){

            Text(text = "Not a Member?",

                color=Color.White)

            Text(text= "sign up",
                color=Color.Green,

                modifier = Modifier
                    .clickable {
                        mainContext.startActivity(Intent(mainContext, MainActivity::class.java))
                    }
            )


        }


    }
}
