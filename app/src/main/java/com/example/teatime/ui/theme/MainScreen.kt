package com.example.teatime.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Beispiel-Tee-Klasse
data class Tea(val name: String, val color: Color)

// Liste deiner Tees
val teas = listOf(
    Tea("Grüner Tee", MatchaGreen),
    Tea("Schwarzer Tee", BlackTeaBrown),
    Tea("Rooibos", RooibosRedBrown)
)

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Meine Tees",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Tee-Buttons
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                teas.forEach { tea ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .clickable { /* Aktion */ },
                        colors = CardDefaults.cardColors(
                            containerColor = tea.color
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = tea.name,
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    TeaTimeTheme {
        MainScreen()
    }
}
