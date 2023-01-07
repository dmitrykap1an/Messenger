package com.messenger.ui.screens.greeting

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.messenger.data.models.User
import com.messenger.ui.screens.Routing
import com.messenger.ui.theme.backgroundColor
import com.messenger.ui.theme.contrastColor
import com.messenger.ui.theme.messageBarBackgroundColor

@Composable
fun Routing.Authorization.Content(
    onLoginClick: () -> Unit
) {
    var userName by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundColor),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1 / 3f),
            contentAlignment = Alignment.Center
        ){
            Text(
                "Kittygram",
                fontSize = 40.sp,
                color = Color.White,
                modifier = Modifier
                    .background(color = Color.Transparent)
                    .padding(horizontal = 15.dp),

                )
        }



        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1 / 3f),
            contentAlignment = Alignment.Center

        ){
            Column(
                modifier = Modifier
                    .padding(horizontal = 80.dp)
            ){
                OutlinedTextField(
                    value = userName,
                    onValueChange = {
                        userName = it
                    },
                    singleLine = true,
                    placeholder = { Text(
                        text = "Username",
                        color = Color.White )},
                    label = { Text(
                        text = "Username",
                        color = Color.White ) },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = Color.White,
                        backgroundColor = backgroundColor,
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.White)
                )

                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    visualTransformation = PasswordVisualTransformation(),
                    singleLine = true,
                    placeholder = { Text(
                        text = "Username",
                        color = Color.White )},
                    label = { Text(
                        text = "Password",
                        color = Color.White) },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = Color.White,
                        backgroundColor = backgroundColor,
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.White)
                )
            }

        }


        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1 / 3f),
            contentAlignment = Alignment.BottomCenter
        ){
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(80.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                onClick = {

                }) {

                Text(
                    text = "login",
                    modifier = Modifier
                        .padding(horizontal = 30.dp, vertical = 10.dp),
                    color = backgroundColor,
                )
            }
        }


    }
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(80.dp),
//
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Bottom
//    ) {
//
//    }
}

@Composable
fun Temp(

) {




}


@Composable
@Preview(showBackground = true)
fun GreetingContentPreview() {
    Routing.Authorization.Content(onLoginClick = {})
}