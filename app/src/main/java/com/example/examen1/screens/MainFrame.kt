package com.example.examen1.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen1.components.*
import com.example.examen1.models.categories
import com.example.examen1.models.foods
import com.example.examen1.models.restaurants


@Composable
fun MainFrame(innerPadding: PaddingValues) {
    Scaffold(


        topBar = {

            HeaderComponent(

                userName = "Yisus",
                onExitClick = { /* Acción de salir o navegar */ }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            // "Nuestras categorías"
            Text(
                text = "Nuestras categorías",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp)
            )
            CategoryCarouselComponent(categories = categories)

            // "Busca los mejores restaurantes"
            Text(
                text = "Busca los mejores restaurantes",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp)
            )
            RestaurantCarouselComponent(restaurants = restaurants)

            // "Nuestras mejores comidas"
            Text(
                text = "Nuestras mejores comidas",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp)
            )
            FoodGridComponent(foods = foods)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainFramePreview() {
    MainFrame(innerPadding = PaddingValues(20.dp))
}

