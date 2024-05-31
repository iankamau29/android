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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ian.ui.theme.IanTheme

class AboutActivity : ComponentActivity() { override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            About()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun About() {
    var contact = LocalContext.current
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
            .background(color = Color.Black),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

    )


    {Text(

        text= "This is the about page",
        fontSize = 15.sp,
//            sp used only on font sizes
        color = Color.Blue,
        fontFamily = FontFamily.Monospace,
        fontStyle = FontStyle.Italic
                            )
        Text( "This is the second line of text ",
            fontWeight = FontWeight.Bold ,
            color = Color.Yellow,
            fontFamily = FontFamily.Monospace,
        )

        Text( "This is the third line of text ",
            fontWeight = FontWeight.Medium,
            color = Color.Blue,
            fontFamily = FontFamily.Monospace,
        )
        Text( "This is the fourth line of text ",
            fontWeight = FontWeight.ExtraLight,
            color = Color.Green,
            fontFamily = FontFamily.Monospace,
        )
        Text( "This is the fifth line of text ",
            fontWeight = FontWeight.ExtraBold,
            color = Color.Red,
            fontFamily = FontFamily.Monospace,
        )
        Text( "This is the sixth line of text ",
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            fontFamily = FontFamily.Monospace,
        )
//        custom colours html colour code.com
        Spacer(modifier = Modifier
            .height(20.dp)
        )
        Button(onClick = {
            contact.startActivity(Intent(contact,ContactActivity::class.java))
//            code that actually allows us to move from one screen to another
        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = CutCornerShape(5.dp)
        ) {
            Text("Contact ")
        }
        Image(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .border(3.dp, Color.White)
                .size(200.dp)

            ,
            painter = painterResource(id = R.drawable.image),
            contentDescription = null
        )
    }


}
