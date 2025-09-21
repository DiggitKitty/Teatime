package com.example.teatime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.teatime.ui.theme.TeaTimeTheme
import com.example.teatime.ui.theme.MainScreen
import com.example.teatime.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TeaTimeTheme {
                MainScreen()
                    }
                }

            }
        }

