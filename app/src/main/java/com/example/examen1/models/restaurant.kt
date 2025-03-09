package com.example.examen1.models

data class Restaurant(
    val id: Int,
    val name: String,
    val category: String,
    val imageUrl: String,
    val rating: Double
)


val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "La Parrilla",
        category = "Parrilla",
        imageUrl = "https://example.com/parrilla.jpg",
        rating = 4.5
    ),
    Restaurant(
        id = 2,
        name = "El Sazón Mexicano",
        category = "Comida Mexicana",
        imageUrl = "https://example.com/sazon.jpg",
        rating = 4.2
    ),
    Restaurant(
        id = 3,
        name = "Bella Pasta",
        category = "Italiana",
        imageUrl = "https://example.com/pasta.jpg",
        rating = 4.7
    ),
    Restaurant(
        id = 4,
        name = "Sushi Zen",
        category = "Japonesa",
        imageUrl = "https://example.com/sushi.jpg",
        rating = 4.8
    ),
    Restaurant(
        id = 5,
        name = "El Rincón Vegano",
        category = "Vegana",
        imageUrl = "https://example.com/vegan.jpg",
        rating = 4.3
    ),
    Restaurant(
        id = 6,
        name = "La Trattoria",
        category = "Italiana",
        imageUrl = "https://example.com/trattoria.jpg",
        rating = 4.6
    ),
    Restaurant(
        id = 7,
        name = "Burger House",
        category = "Americana",
        imageUrl = "https://example.com/burger.jpg",
        rating = 4.0
    ),
    Restaurant(
        id = 8,
        name = "El Asador",
        category = "Carnes",
        imageUrl = "https://example.com/asador.jpg",
        rating = 4.4
    ),
    Restaurant(
        id = 9,
        name = "Taco Fiesta",
        category = "Mexicana",
        imageUrl = "https://example.com/taco.jpg",
        rating = 4.1
    ),
    Restaurant(
        id = 10,
        name = "Curry House",
        category = "India",
        imageUrl = "https://example.com/curry.jpg",
        rating = 4.5
    )
)

