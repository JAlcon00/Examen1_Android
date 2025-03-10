package com.example.examen1.models

data class Food(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String
)

val foods = listOf(
    Food(1, "Pizza", "Delicious pizza with cheese and vegetables", 10.99, "https://www.laespanolaaceites.com/wp-content/uploads/2019/06/pizza-con-chorizo-jamon-y-queso-1080x671.jpg"),
    Food(2, "Burger", "Juicy burger with lettuce and tomato", 8.99, "https://www.cnature.es/wp-content/uploads/2021/12/hamburguesa-con-guacamole.jpg"),
    Food(3, "Sushi", "Assorted sushi rolls with soy sauce", 12.99, "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2024/06/17/17186166965831.jpg"),
    Food(4, "Pasta", "Spaghetti with meat sauce and cheese", 9.99, "https://img-global.cpcdn.com/recipes/63393da592fe98f0/400x400cq70/photo.jpg"),
    Food(5, "Salad", "Fresh garden salad with dressing", 6.99, "https://imagenes.elpais.com/resizer/v2/3KWQUZHLQFGVRIWYQGO3A5WFD4.jpg?auth=f2d14d8886b49351024920c894e7f4b9f518886e962c654538d191ee37e30bac&width=1200"),
    Food(6, "Taco", "Mexican taco with ground beef and salsa", 7.99, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkY2LjgzMN3zrzakLYoD7xBAlIvdjv3WMTWg&s"),
    Food(7, "Steak", "Grilled steak with fries and a side of salad", 15.99, "https://mandolina.co/wp-content/uploads/2024/06/carne-asada-a-la-parrilla-1080x550-1-1200x900.jpg"),
    Food(8, "Ice Cream", "Scoops of delicious ice cream", 4.99, "https://www.gourmet.cl/wp-content/uploads/2016/09/Helado_Vainilla-web-553x458.jpg")
)
