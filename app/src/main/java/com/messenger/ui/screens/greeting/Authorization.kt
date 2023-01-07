package com.messenger.ui.screens.greeting

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.messenger.ui.screens.Routing
import com.messenger.ui.theme.backgroundColor

@Composable
fun Routing.Authorization.Content(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Text(
            text = "Авторизация",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontWeight= FontWeight.W700,
            modifier = Modifier
                .fillMaxSize()
                .padding(40.dp),
        )
    }

}

@Composable
fun Temp(){
    Column() {
        Text(
            text = "Авторизация",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontWeight= FontWeight.W700,
            modifier = Modifier
                .fillMaxSize()
                .padding(40.dp),
        )
        var userName by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(80.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                value = userName,
                onValueChange = {
                    userName = it
                },
                singleLine = true,
                placeholder = { Text(text = "Username") },
                label = { Text(text = "Username") },
            )
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                visualTransformation = PasswordVisualTransformation(),
                singleLine = true,
                placeholder = { Text(text = "Password") },
                label = { Text(text = "Password") },
            )
        }
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(80.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ){
            Button(onClick = {

            }){
                Text(
                    text = "Логин",
                    modifier = Modifier
                        .padding(horizontal = 30.dp, vertical = 10.dp),
                    color = Color.White,
                )
            }
        }


        Column(modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 300.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ){
            Text(
                text = "Жопа",
                color = Color.White,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp),
                fontSize = 11.sp
            )
        }

    }
}


@Composable
@Preview(showBackground = true)
fun GreetingContentPreview(){
    Routing.Authorization.Content()
}