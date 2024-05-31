package com.example.ian

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ian.ui.theme.IanTheme

class ContactActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            home()
        }
    }
}





@Preview(showBackground = true)
@Composable
fun home() {
    var search by remember {
        mutableStateOf(TextFieldValue(""))
    }
    LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .background(color = Color(0xff00FFFFFF))
                    .fillMaxSize()
            ) {
                val paddingModifier = Modifier.padding(10.dp)
                Card(
                    modifier = Modifier,
                    colors = CardDefaults.cardColors(Color.Red)



                    ) {
                    Column(
                        modifier = paddingModifier
                            .fillMaxWidth()
                    ) {
                        Text(text = "Location", color = Color.White)
                        Text(text = "New York,USA", color = Color.White)
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "select"
                            )

                        TextField(value = search, onValueChange = { search = it },
                            shape = RoundedCornerShape(20.dp),
                            label = { Text(text = "search", color = Color.Black) },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Search,

                                    contentDescription = "search"
                                )
                            })

                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(180.dp),
                ) {
                    Column {
                        Text(text = "#Special For You")
                    }

                    Column {
                        Text(text = "see all")
                    }
                }
                Spacer(modifier = Modifier.height(23.dp))
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.hi),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
//                .border(3.dp, Color.White)

                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(220.dp),
                ) {
                    Column {
                        Text(text = "Category")
                    }

                    Column {
                        Text(text = "see all")
                    }
                }
                Spacer(modifier = Modifier.height(25.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(23.dp),
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.download),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Text(text = "clothes")
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.cpu),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Text(text = "electronics")
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.s),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Text(text = "shoes")
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.images),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Text(text = "watches")
                    }

                }
                Spacer(modifier = Modifier.height(24.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(200.dp),
                ) {
                    Column {
                        Text(text = "Flash sale")
                    }

                    Column {
                        Text(text = "closing in")
                    }
                }
                LazyRow {
                    item {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.outlinedButtonColors(),
                                border = BorderStroke(1.dp, Color.Gray)
                            ) {
                                Text(text = "all")

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.outlinedButtonColors(),
                                border = BorderStroke(1.dp, Color.Gray)
                            ) {
                                Text(text = "Newest")

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.outlinedButtonColors(),
                                border = BorderStroke(1.dp, Color.Gray)
                            ) {
                                Text(text = "Popular")

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.outlinedButtonColors(),
                                border = BorderStroke(1.dp, Color.Gray)
                            ) {
                                Text(text = "clothes")

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.outlinedButtonColors(),
                                border = BorderStroke(1.dp, Color.Gray)
                            ) {
                                Text(text = "Shoes")

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.outlinedButtonColors(),
                                border = BorderStroke(1.dp, Color.Gray)
                            ) {
                                Text(text = "Electronics")
                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.outlinedButtonColors(),
                                border = BorderStroke(1.dp, Color.Gray)
                            ) {
                                Text(text = "Watches")
                            }

                        }
                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.w),
                            contentDescription = null,
                            modifier = Modifier
                                .size(178.dp)

                        )
                    }
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.t),
                            contentDescription = null,
                            modifier = Modifier
                                .size(200.dp)

                        )
                    }
                }

            }
        }
    }
}

