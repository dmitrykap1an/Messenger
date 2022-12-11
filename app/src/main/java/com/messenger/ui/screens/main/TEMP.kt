package com.messenger.ui.screens.main

import com.messenger.data.models.Name
import com.messenger.data.models.User

val kittens = mutableListOf<User>()

val kitten1 = User("1", Name("димасик1", "адидасик1"))
val kitten2 = User("2", Name("димасик2", "адидасик2"))
val kitten3 = User("3", Name("димасик3", "адидасик3"))
val kitten4 = User("4", Name("димасик4", "адидасик4"))

fun massAdd(){
    kittens.add(kitten1)
    kittens.add(kitten2)
    kittens.add(kitten3)
    kittens.add(kitten4)
}