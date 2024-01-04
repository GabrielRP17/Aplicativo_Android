package com.example.shopping_online_store

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shopping_online_store.Screens.CadastroScreen
import com.example.shopping_online_store.Screens.LoginScreen
import com.example.shopping_online_store.Screens.MenuScreen
import com.example.shopping_online_store.ui.theme.Shopping_Online_StoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Shopping_Online_StoreTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize().background(Color.Black), color = MaterialTheme.colorScheme.background) {
                    val controladorNavegacao = rememberNavController()
                    NavHost(
                        navController = controladorNavegacao,
                        startDestination = "telaMenu"
                    ) {
                        composable(route = "telaLogin"){ LoginScreen(controladorNavegacao)}
                        composable(route = "telaMenu"){ MenuScreen(controladorNavegacao)}
                        composable(route = "telaCadastro"){ CadastroScreen(controladorNavegacao)}
                    }
                }
            }
        }
    }
}

