package com.example.examen1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.examen1.models.Food
import com.example.examen1.models.foods
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star


@Composable
fun FoodGridComponent(foods: List<Food>) {
    // LazyVerticalGrid es experimental: debes habilitarlo en tu Gradle
    // con 'androidx.compose.foundation:foundation' y usar @OptIn(ExperimentalFoundationApi::class)
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(foods) { food ->
            FoodItem(food = food)
        }
    }
}

@Composable
fun FoodItem(food: Food) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen de la comida
        Image(
            painter = rememberAsyncImagePainter(model = food.imageUrl),
            contentDescription = food.name,
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Nombre de la comida
        Text(
            text = food.name,
            fontWeight = FontWeight.Bold
        )

        // Simulando una calificación con estrella (si lo deseas)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "Rating",
                tint = Color(0xFFFFC107),
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "4.5") // Aquí podrías usar un rating real si lo tuvieras
        }

        // Precio en una especie de “badge” rojo
        Box(
            modifier = Modifier
                .padding(top = 4.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFFE53935)) // rojo
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Text(
                text = "$${food.price}",
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FoodGridComponentPreview() {
    FoodGridComponent(foods = foods)
}
