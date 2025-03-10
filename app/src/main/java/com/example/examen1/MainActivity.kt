package com.example.examen1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier

import com.example.examen1.screens.MainFrame
import com.example.examen1.ui.theme.Examen1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainFrame(innerPadding = innerPadding)
                }
                }
        }

    }
}



