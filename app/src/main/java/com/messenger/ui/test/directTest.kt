package com.messenger.ui.test

import com.messenger.data.models.User
import com.messenger.ui.screens.main.*
import java.time.LocalDateTime


data class Message(val user: User, val date: String, val message: String)

val message1 = Message(kitten1, "", "hola")
val message2 = Message(kitten1, "", "hola")
val message3 = Message(kitten1, "", "hola")
val message4 = Message(kitten1, "", "hola")
val message5 = Message(kitten1, "", "hola")
val message6 = Message(kitten2, "", "hola")
val message7 = Message(kitten2, "", "hola")
val message8 = Message(kitten2, "", "hola")
val message9 = Message(kitten2, "", "hola")
val message10 = Message(kitten2, "", "hola")
val message11 = Message(kitten2, "", "hola")


val listOfMessages = mutableListOf<Message>(message1, message2, message3)

