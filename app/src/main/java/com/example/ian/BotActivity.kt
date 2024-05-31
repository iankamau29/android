package com.example.ian

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
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
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ian.ui.theme.IanTheme
import java.nio.channels.SelectableChannel
import java.nio.channels.Selector

class BotActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Bott()

        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Bott(){
    val context = LocalContext.current
    var search by remember {
        mutableStateOf(TextFieldValue(""))
    }
    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = {
//                    Text(text = "Top App Bar")
//                },
//                navigationIcon = {
//                    IconButton(onClick = {}) {
//                        Icon(Icons.Filled.ArrowBack, "backIcon")
//                    }
//                },
//
//            )
//        },
        content = {
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
                                Spacer(modifier = Modifier.height(10.dp))
                                Row(){
                                    Icon(
                                        imageVector = Icons.Default.LocationOn,
                                        contentDescription = "select"
                                    )
                                Text(text = "New York,USA",
                                    color = Color.White,
                                    modifier = Modifier
                                    .clickable {   }
                                )
                                Icon(
                                    imageVector = Icons.Default.ArrowDropDown,
                                    contentDescription = "select"
                                )
                                    Spacer(modifier = Modifier.width(140.dp))
                                    IconButton(onClick = { /*TODO*/ }) {
                                        Icon(
                                            modifier = Modifier.size(60.dp),
                                            imageVector = Icons.Rounded.Menu,
                                            contentDescription = "settings"
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.height(20.dp))
                                Row (
                                      horizontalArrangement = Arrangement.spacedBy(5.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ){

                                TextField(value = search, onValueChange = { search = it },
                                    shape = RoundedCornerShape(20.dp),
                                    label = { Text(text = "search", color = Color.Black) },
                                    leadingIcon = {
                                        Icon(
                                            imageVector = Icons.Default.Search,

                                            contentDescription = "search"
                                        )
                                    })
                                    Spacer(modifier = Modifier.height(10.dp))
                                    IconButton(onClick = { context.startActivity(Intent(context, MainActivity::class.java)) }) {
                                    Icon(
                                        modifier = Modifier.size(60.dp),
                                        imageVector = Icons.Rounded.Home,
                                        contentDescription = "Home"
                                    )
                                    }
                                }
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
                                Text(text = "see all",
                                        modifier = Modifier
                                        .clickable {   }
                                )
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
                                Text(text = "see all",
                                    modifier = Modifier
                                        .clickable {   }
                                    )
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
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(20.dp)
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.naviforce),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(178.dp)

                                )
                            }
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.navyb),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(200.dp)

                                )
                            }
                        }

                    }
                }
            }

        },
        bottomBar = { BottomBar() }

    )
}
@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color.White,
        ) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,
                "",)
        },
            label = { Text(text = "Home") },
            selected = (selectedIndex.value == 0),
            onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,
                "")
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.ShoppingCart, "")
        },
            label = { Text(text = "Cart") }, selected = (selectedIndex.value == 3), onClick = {
                selectedIndex.value = 3
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Info, "")
        },
            label = { Text(text = "Info") }, selected = (selectedIndex.value == 4), onClick = {
                selectedIndex.value = 4
            })
    }
}
