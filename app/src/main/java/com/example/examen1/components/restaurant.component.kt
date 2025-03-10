package com.example.examen1.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.examen1.models.Restaurant
import com.example.examen1.models.restaurants

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun RestaurantCarouselComponent(restaurants: List<Restaurant>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(restaurants) { restaurant ->
            RestaurantItem(restaurant = restaurant)
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun RestaurantItem(restaurant: Restaurant) {
    Card(
        modifier = Modifier
            .width(120.dp) // Mantienes el ancho del Card
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Contenedor para la imagen
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp), // Mantienes la altura del Card para la sección de la imagen
                contentAlignment = Alignment.Center // Centra la imagen
            ) {
                // Imagen más pequeña
                GlideImage(
                    model = restaurant.imageUrl,
                    contentDescription = restaurant.name,
                    modifier = Modifier
                        .size(60.dp),   // Ajusta el tamaño de la imagen a lo que necesites
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Nombre del restaurante
            Text(
                text = restaurant.name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantCarouselComponentPreview() {
    RestaurantCarouselComponent(restaurants = restaurants)
}
