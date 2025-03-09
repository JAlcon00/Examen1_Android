package com.example.examen1.models

data class Category(
    val id: Int,
    val name: String,
    val imageUrl: String
)


val categories = listOf(
    Category(1, "Burgers", "https://example.com/burger.jpg"),
    Category(2, "Pizza", "https://example.com/pizza.jpg"),
    Category(3, "Sushi", "https://example.com/sushi.jpg"),
    Category(4, "Italian", "https://example.com/italian.jpg"),
    Category(5, "Mexican", "https://example.com/mexican.jpg"),
    Category(6, "Chinese", "https://example.com/chinese.jpg"),
    Category(7, "Japanese", "https://example.com/japanese.jpg"),
    Category(8, "Indian", "https://example.com/indian.jpg"),
)