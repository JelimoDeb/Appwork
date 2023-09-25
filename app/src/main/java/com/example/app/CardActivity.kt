package com.example.app

import android.os.Bundle
import android.widget.GridLayout
import android.widget.GridView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app.ui.theme.AppTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            card()
        }
    }


    @Composable
    fun card() {

        Column(
            modifier = Modifier
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {


            LazyRow {
                items(3) { columnIndex ->
                    val cardContent = when (columnIndex) {
                        0 -> "Bruh"
                        1 -> "Just learning"
                        2 -> "Cards"
                        else -> ""
                    }
                    Card(
                        shape = RectangleShape,
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.Cyan),
                        modifier = Modifier
                            .padding(8.dp)
                            .width(120.dp)
                    ) {
                        Text(
                            cardContent, // just in case each card has its own content
                            //"Bruh, Just learning what card bodies are $columnIndex",
                            // means card and the number of column
                            modifier = Modifier.padding(16.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }


        /*Column(
            modifier = Modifier
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) /*TODO*/
        { // have 3 cards as separate columns in one row
            Card(
                shape = RectangleShape, // you can have other shapes like rounded corner
                // with a percentage
                elevation = CardDefaults.cardElevation(10.dp), // can change the dp but any past ten gets to weird.
                colors = CardDefaults.cardColors(Color.Cyan)

            ) {
                Text("Bruh, Just learning what card bodies are")

            }

            Spacer(modifier = Modifier.height(10.dp))


            Card(
                shape = RectangleShape, // you can have other shapes like rounded corner
                // with a percentage
                elevation = CardDefaults.cardElevation(10.dp), // can change the dp but any past ten gets to weird.
                colors = CardDefaults.cardColors(Color.Cyan)

            ) {
                Text("Bruh, Just learning what card bodies are")

            }

            Spacer(modifier = Modifier.height(10.dp))


            Card(
                shape = RectangleShape, // you can have other shapes like rounded corner
                // with a percentage
                elevation = CardDefaults.cardElevation(10.dp), // can change the dp but any past ten gets to weird.
                colors = CardDefaults.cardColors(Color.Cyan)

            ) {
                Text("Bruh, Just learning what card bodies are")

            }


        }

         */


    }
}
