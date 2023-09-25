package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.AppTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LoginScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


        ,
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
    ) {
        Text("Login Here",
            color = Color.Blue,
            )
        var usernamee by remember { mutableStateOf(TextFieldValue()) }
        var password by remember { mutableStateOf(TextFieldValue()) }

        OutlinedTextField(
            value = usernamee,
            label = {Text("Username", color = Color.Gray)},
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon")},
            //content description is a MUST, can equate it with null
            //Icons. gives a variety of options
            //keyboard options
            // keyboard options are meant to restrict the user on what is required.


            onValueChange = {
                usernamee = it
            })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            label = {Text("Password", color = Color.Gray)},
            leadingIcon = {Icon(imageVector = Icons.Default.Lock, contentDescription = "emailIcon")},
            // another option is trailingIcon, that can stay towards the end

            //keyboardOptions = keyboardOptions(keyboardType = KeyboardType.Number),
            // need an explanation on these additional explanations and how to move from
            // one page to another

            onValueChange = {
                password = it
            })
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { /*TODO*/ },
            shape = CircleShape,
            // Other shapes include: RectangleShape, RoundedCornerShape (10.dp),
            // CutCornerShape(Uses percentages for modification e.g 10)
            colors = ButtonDefaults.buttonColors (Color.Magenta), //this never worked :(



        ) {
            Text(text = "Login")
        }




    }


}

//fun keyboardOptions(keyboardType: Any): KeyboardOptions { } this has issues too

