package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.app.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mit()


        }
    }
}
@Preview
@Composable //Each function should start with a composable
fun Mit() {
    //Text at 31.04 this was not showing :/
    //Text(text = "Home Screen")
    //Text(text = "Home Screen")
    // Layouts
    // Column, Row for side by side arrangement, Box layout

    Column (
        modifier = Modifier
            //.fillMaxHeight()
            //.fillMaxWidth()
            .fillMaxSize() // works for the above two
            .background(Color.Magenta)
            .fillMaxSize(),
        // the comma separates the modifier from the rest

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Text( "MIT", color = Color.Cyan )
        Text( "First App", color = Color.Red ) // by default this content aligns in the top left
        // play with the alignment stuff

        val login = LocalContext.current
        Button(onClick = {
            login.startActivity(Intent(login, LoginActivity::class.java))
        }){

            Text("Login Here")
        }
        val images = LocalContext.current
        Button(onClick = {
            images.startActivity(Intent(images, ImageActivity::class.java))
        }){

            Text("Images")
        }
        val card = LocalContext.current
        Button(onClick = {
            card.startActivity(Intent(card, CardActivity::class.java))
        }){

            Text("Cards")
        }
        val scroll = LocalContext.current
        Button(onClick = {
            scroll.startActivity(Intent(scroll, ScrollActivity::class.java))
        }){

            Text("Scroll")
        }
        val cards = LocalContext.current
        Button(onClick = {
            cards.startActivity(Intent(cards, CardActivity2::class.java))
        }){

            Text("Fruits Work")
        }
        val Scaff = LocalContext.current
        Button(onClick = {
           Scaff.startActivity(Intent(Scaff, BottomActivity::class.java))
        }){

            Text("Scaff")
        }



    }
}



