package com.example.app

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.AppTheme

class BottomActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaff()
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Scaff() {
    Scaffold(
        topBar = {
            TopAppBar(title = {Text("Top App Bar")})
                // Row(){}
            },
        content={
                LazyColumn(content = {
                    item{
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color(0xFF3E384A)),

                            //horizontalAlignment = Alignment.CenterHorizontally,
                            //verticalArrangement = Arrangement.Center

                        ) {

                            Spacer(modifier = Modifier.height(20.dp))
                            Text("Category",
                                color = Color.White,
                                fontSize = 26.sp,
                                //fontFamily = calibriFontFamily, ask how to change font
                            )
                            Spacer(modifier = Modifier.height(20.dp))

                            // First 3 cards
                            LazyRow {
                                item() {


                                    Card(
                                        shape = RoundedCornerShape(20),
                                        elevation = CardDefaults.cardElevation(10.dp),
                                        colors = CardDefaults.cardColors(Color.LightGray),
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(150.dp)
                                    ) {

                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable {
                                                    // Handle card click here
                                                }
                                        ) {


                                            Image(
                                                painter = painterResource(R.drawable.berries),
                                                contentDescription = "Card Image",
                                                modifier = Modifier
                                                    .size(60.dp) // Adjust the image size
                                                    .background(Color.LightGray) // Add a background for the image
                                                    .padding(10.dp)
                                            )

                                            //  Spacer(modifier = Modifier.width(16.dp))


                                            Text(
                                                "Fruits",
                                                color = Color(0xFF3E384A),
                                                fontSize = 18.sp,
                                                modifier = Modifier
                                                    .weight(1f), // Allow the text to expand and take available space
                                                textAlign = TextAlign.Center
                                            )


                                        }


                                    }
                                }
                                item() {


                                    Card(
                                        shape = RoundedCornerShape(20),
                                        elevation = CardDefaults.cardElevation(10.dp),
                                        colors = CardDefaults.cardColors(Color.LightGray),
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(150.dp)
                                    ) {

                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable {
                                                    // Handle card click here
                                                }
                                        ) {


                                            Image(
                                                painter = painterResource(R.drawable.tomato),
                                                contentDescription = "Card Image",
                                                modifier = Modifier
                                                    .size(60.dp) // Adjust the image size
                                                    .background(Color.LightGray) // Add a background for the image
                                                    .padding(10.dp)
                                            )

                                            // Spacer(modifier = Modifier.width(16.dp))


                                            Text(
                                                "Veget",
                                                color = Color(0xFF3E384A),
                                                fontSize = 18.sp,
                                                modifier = Modifier.weight(1f), // Allow the text to expand and take available space
                                                textAlign = TextAlign.Center
                                            )


                                        }


                                    }
                                }
                                item() {


                                    Card(
                                        shape = RoundedCornerShape(20),
                                        elevation = CardDefaults.cardElevation(10.dp),
                                        colors = CardDefaults.cardColors(Color.LightGray),
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(150.dp)
                                    ) {

                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable {
                                                    // Handle card click here
                                                }
                                        ) {


                                            Image(
                                                painter = painterResource(R.drawable.spice),
                                                contentDescription = "Card Image",
                                                modifier = Modifier
                                                    .size(60.dp) // Adjust the image size
                                                    .background(Color.LightGray) // Add a background for the image
                                                    .padding(10.dp)
                                            )

                                            //  Spacer(modifier = Modifier.width(16.dp))


                                            Text(
                                                "Spices",
                                                color = Color(0xFF3E384A),
                                                fontSize = 18.sp,
                                                modifier = Modifier
                                                    .weight(1f), // Allow the text to expand and take available space
                                                textAlign = TextAlign.Center
                                            )


                                        }


                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(20.dp))
                            Text("Popular" ,
                                color = Color.White,
                                fontSize = 26.sp,
                            )
                            Spacer(modifier = Modifier.height(20.dp))

                            // second one card

                            Card(
                                shape = RoundedCornerShape(20),
                                elevation = CardDefaults.cardElevation(10.dp),
                                colors = CardDefaults.cardColors(Color.LightGray),
                                modifier = Modifier
                                    .padding(8.dp)
                                    //.width(150.dp)
                                    .clickable {
                                        // Handle card click here
                                    }
                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {

                                    Image(
                                        painter = painterResource(R.drawable.pomy),
                                        contentDescription = "Card Image",
                                        modifier = Modifier
                                            .size(120.dp) // Adjust the image size
                                            .background(Color.LightGray) // Add a background for the image
                                    )

                                    Spacer(modifier = Modifier.width(16.dp))



                                    Text(
                                        "Pomegranate",
                                        color = Color(0xFF3E384A),
                                        fontSize = 26.sp,
                                        modifier = Modifier.weight(1f), // Allow the text to expand and take available space
                                        textAlign = TextAlign.Center
                                    )


                                }


                            }


                            Spacer(modifier = Modifier.height(20.dp))
                            Text("Top Item",
                                color = Color.White,
                                fontSize = 26.sp,
                            )
                            Spacer(modifier = Modifier.height(20.dp))

                            // last two cards

                            LazyRow(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                item() {

                                    Card(
                                        shape = RoundedCornerShape(20),
                                        elevation = CardDefaults.cardElevation(10.dp),
                                        colors = CardDefaults.cardColors(Color.LightGray),
                                        modifier = Modifier
                                            .padding(8.dp)
                                            //.fillMaxWidth(0.5f)
                                            .width(190.dp)
                                    ) {

                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .clickable {
                                                    // Handle card click here
                                                }

                                        ) {


                                            Box(
                                                contentAlignment = Alignment.Center,
                                                modifier = Modifier
                                                    .weight(1f)
                                                    .fillMaxWidth()
                                                    .fillMaxHeight(0.5f) // Top half of the card
                                            ) {
                                                Image(
                                                    painter = painterResource(R.drawable.orange),
                                                    contentDescription = "Card Image",
                                                    modifier = Modifier
                                                        .size(120.dp)
                                                        .background(Color.LightGray)
                                                        .padding(10.dp)
                                                )
                                            }

                                            Box(
                                                contentAlignment = Alignment.Center,
                                                modifier = Modifier
                                                    .weight(1f)
                                                    .fillMaxWidth()
                                                    .fillMaxHeight(0.5f) // Bottom half of the card
                                            ) {
                                                Text(
                                                    "Fresh Orange",
                                                    color = Color(0xFF3E384A),
                                                    fontSize = 26.sp,
                                                    textAlign = TextAlign.Center
                                                )
                                            }

                                        }


                                    }
                                }
                                item() {

                                    Card(
                                        shape = RoundedCornerShape(20),
                                        elevation = CardDefaults.cardElevation(10.dp),
                                        colors = CardDefaults.cardColors(Color.LightGray),
                                        modifier = Modifier
                                            .padding(8.dp)
                                            //.fillMaxWidth(0.5f)
                                            .width(190.dp)
                                    ) {

                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .clickable {
                                                    // Handle card click here
                                                }

                                        ) {


                                            Box(
                                                contentAlignment = Alignment.Center,
                                                modifier = Modifier
                                                    .weight(1f)
                                                    .fillMaxWidth()
                                                    .fillMaxHeight(0.5f) // Top half of the card
                                            ) {
                                                Image(
                                                    painter = painterResource(R.drawable.berries),
                                                    contentDescription = "Card Image",
                                                    modifier = Modifier
                                                        .size(120.dp)
                                                        .background(Color.LightGray)
                                                        .padding(10.dp)
                                                    //.border(3.dp, Color.Gray, CircleShape)

                                                )
                                            }

                                            Box(
                                                contentAlignment = Alignment.Center,
                                                modifier = Modifier
                                                    .weight(1f)
                                                    .fillMaxWidth()
                                                    .fillMaxHeight(0.5f) // Bottom half of the card
                                            ) {
                                                Text(
                                                    "Strawberry",
                                                    color = Color(0xFF3E384A),
                                                    fontSize = 26.sp,
                                                    textAlign = TextAlign.Center
                                                )
                                            }


                                        }


                                    }
                                }


                            }

                        }



                    }
                })
        },
        bottomBar = { BottomAppBar() { Text("Bottom App Bar") } }
        /*Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_SIGNUP) {
                        popUpTo(ROUTE_LOGIN) { inclusive = true }
                    }
                }
            ,
            text = "About page"
        )*/
    )

}
