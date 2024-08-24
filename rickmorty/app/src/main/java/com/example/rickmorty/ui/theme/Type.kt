package com.example.rickmorty.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    bodyLarge = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = RickMortyColor.blue
    ),
    bodySmall = TextStyle(
        fontSize = 12.sp,
        color = Color.Black
    ),
    headlineSmall = TextStyle(
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        color = RickMortyColor.kiwiGreen
    ),
    headlineMedium = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = RickMortyColor.callaGreen
    ),
    labelSmall = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )
)