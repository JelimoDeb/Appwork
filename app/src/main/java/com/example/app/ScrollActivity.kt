package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.app.ui.theme.AppTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            scroll()

        }
    }
}

 // the ability to scroll s known as recyclerview
// lazy columns are scrollable columns (vertically)
@Composable
fun scroll() {

     Column(
         modifier = Modifier
             .fillMaxSize(),

         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center

     ) {
         LazyRow() { // confirms that the page is scrollable
             // its unethical to just add content!

             /*items(100) { //
                 // the 100 specifies the number of items in the scope
                     index ->
                 Text("Content")

              */

                 item {
                 Row() {

                     Text("sample")
                     Image(painter = painterResource(R.drawable.img), contentDescription = null)

                     Text("sample")
                     Image(painter = painterResource(R.drawable.img), contentDescription = null)

                     Text("sample")
                     Image(painter = painterResource(R.drawable.img), contentDescription = null)

                     Text("sample")
                     Image(painter = painterResource(R.drawable.img), contentDescription = null)

                     Text("sample")
                     Image(painter = painterResource(R.drawable.img), contentDescription = null)

                     Text("sample")
                     Image(painter = painterResource(R.drawable.img), contentDescription = null)

                     Text("sample")
                     Image(painter = painterResource(R.drawable.img), contentDescription = null)

                     Text("sample")
                     Image(painter = painterResource(R.drawable.img), contentDescription = null)


                 }






             }

         }

     }
 }



