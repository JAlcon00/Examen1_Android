package com.example.examen1.models

data class Food(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String
)

val foods = listOf(
    Food(1, "Pizza", "Delicious pizza with cheese and vegetables", 10.99, "https://example.com/pizza.jpg"),
    Food(2, "Burger", "Juicy burger with lettuce and tomato", 8.99, "https://example.com/burger.jpg"),
    Food(3, "Sushi", "Assorted sushi rolls with soy sauce", 12.99, "https://example.com/sushi.jpg"),
    Food(4, "Pasta", "Spaghetti with meat sauce and cheese", 9.99, "https://example.com/pasta.jpg"),
    Food(5, "Salad", "Fresh garden salad with dressing", 6.99, "https://example.com/salad.jpg"),
    Food(6, "Taco", "Mexican taco with ground beef and salsa", 7.99, "https://example.com/taco.jpg"),
    Food(7, "Steak", "Grilled steak with fries and a side of salad", 15.99, "https://example.com/steak.jpg"),
    Food(8, "Ice Cream", "Scoops of delicious ice cream", 4.99, "https://example.com/ice_cream.jpg")
)
