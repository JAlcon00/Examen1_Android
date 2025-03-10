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
        name = "L. Caesars",
        category = "Italiana",
        imageUrl = "https://logos-world.net/wp-content/uploads/2022/02/Little-Caesars-Symbol.png",
        rating = 4.5
    ),
    Restaurant(
        id = 2,
        name = "KFC",
        category = "Americana",
        imageUrl = "https://upload.wikimedia.org/wikipedia/sco/thumb/b/bf/KFC_logo.svg/2048px-KFC_logo.svg.png",
        rating = 4.2
    ),
    Restaurant(
        id = 3,
        name = "Italiannis",
        category = "Italiana",
        imageUrl = "https://images.rappi.com.mx/restaurants_logo/990006799-1517008292-1651616757352.png",
        rating = 4.7
    ),
    Restaurant(
        id = 4,
        name = "Dairy Queen",
        category = "Helado",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Dairy_Queen_logo.svg/1200px-Dairy_Queen_logo.svg.png",
        rating = 4.8
    ),
    Restaurant(
        id = 5,
        name = "Dominos",
        category = "Americana",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Domino%27s_pizza_logo.svg/1018px-Domino%27s_pizza_logo.svg.png",
        rating = 4.3
    ),
    Restaurant(
        id = 6,
        name = "IHOP",
        category = "Americana",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/IHOP_logo.svg/2560px-IHOP_logo.svg.png",
        rating = 4.6
    ),
    Restaurant(
        id = 7,
        name = "Burger king",
        category = "Americana",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Burger_King_2020.svg/800px-Burger_King_2020.svg.png",
        rating = 4.0
    ),
    Restaurant(
        id = 8,
        name = "Starbucks",
        category = "Café",
        imageUrl = "https://cdn.shopify.com/s/files/1/0260/4384/2606/files/starbucks-redprinting.com_480x480.png?v=1703428496",
        rating = 4.4
    ),
    Restaurant(
        id = 9,
        name = "Mc. Donalds",
        category = "Americana",
        imageUrl = "https://1000marcas.net/wp-content/uploads/2019/11/McDonalds-logo.png",
        rating = 4.1
    ),
    Restaurant(
        id = 10,
        name = "Tim Hortons",
        category = "Café",
        imageUrl = "https://1000marcas.net/wp-content/uploads/2021/09/Tim-Hortons-Logo.png",
        rating = 4.5
    )
)

