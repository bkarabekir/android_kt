package com.burakk.messageshareapp.models

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf(
            Hobby("Swimming"),
            Hobby("Walking"),
            Hobby("Drawing"),
            Hobby("Playing Football"),
            Hobby("Sleeping"),
            Hobby("Reading"))
}