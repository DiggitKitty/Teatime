package com.example.teatime.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Light Colors
private val LightColors = lightColorScheme(
    primary = MatchaGreen,
    onPrimary = Color.White,
    secondary = BlackTeaBrown,
    onSecondary = Color.White,
    background = BackgroundLight,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Color.Black
)

// Dark Colors (optional, anpassbar)
private val DarkColors = darkColorScheme(
    primary = MatchaGreen,
    onPrimary = Color.Black,
    secondary = BlackTeaBrown,
    onSecondary = Color.Black,
    background = Color(0xFF121212),
    onBackground = Color.White,
    surface = Color(0xFF1E1E1E),
    onSurface = Color.White
)

@Composable
fun TeaTimeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
