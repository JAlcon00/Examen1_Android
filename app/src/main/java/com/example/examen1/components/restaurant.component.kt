package com.example.examen1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.examen1.models.Restaurant
import com.example.examen1.models.restaurants

@Composable
fun RestaurantCarouselComponent(restaurants: List<Restaurant>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(restaurants) { restaurant ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Contenedor circular para la imagen
                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFF44336)), // Color de ejemplo (rojo claro)
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(model = restaurant.imageUrl),
                        contentDescription = restaurant.name,
                        modifier = Modifier.size(40.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Nombre del restaurante
                Text(text = restaurant.name)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantCarouselComponentPreview() {
    // Vista previa para verificar la apariencia del carrusel
    RestaurantCarouselComponent(restaurants = restaurants)
}
