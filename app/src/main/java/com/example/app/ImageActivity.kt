package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app.ui.theme.AppTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            pics()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun pics(){
    
    Column (
        modifier = Modifier
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center






    ){
        // R means the resource
        // you do not have to use id
        // learn to optimize the images, do not load them while large, they will make the app crash
        Image(painter = painterResource(R.drawable.img),
            contentDescription = null,
            // color filter is essential in giving the image a tint
            // (low key changes the way the image was colored)
            modifier = Modifier

                .size(150.dp)
                .border(3.dp, Color.DarkGray, RoundedCornerShape(10))
                .background(Color.LightGray)

        )


    }


}