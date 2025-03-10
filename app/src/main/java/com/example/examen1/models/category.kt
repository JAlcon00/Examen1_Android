package com.example.examen1.models

data class Category(
    val id: Int,
    val name: String,
    val imageUrl: String
)


val categories = listOf(
    Category(1, "Burgers", "https://png.pngtree.com/png-clipart/20211116/original/pngtree-burger-vector-png-image_6944295.png"),
    Category(2, "Pizza", "https://images.vexels.com/media/users/3/157222/isolated/preview/53798bcd7054e4feaef568a5cf49574b-etiqueta-engomada-de-la-pizza.png"),
    Category(3, "Sushi", "https://images.vexels.com/media/users/3/230458/isolated/preview/e6c977c2fd1f7492e9f21d43f2166f3d-palillos-y-sushi-plano.png"),
    Category(4, "Italian", "https://images.vexels.com/media/users/3/263350/isolated/preview/18fb339cff3be50c5cf75270745e10db-comida-de-trazo-de-color-espagueti.png"),
    Category(5, "Mexican", "https://png.pngtree.com/png-clipart/20241216/original/pngtree-cartoon-tacos-png-image_17921450.png"),
    Category(6, "Chinese", "https://images.vexels.com/media/users/3/249444/isolated/preview/add4b0e3208bbb48e338b0a930353572-asian-food-noodles-soup.png"),
    Category(7, "Japanese", "https://cdn-icons-png.flaticon.com/512/3480/3480765.png"),
    Category(8, "Indian", "https://png.pngtree.com/png-clipart/20250103/original/pngtree-indian-food-talley-curry-with-rice-png-image_6814445.png"),
)