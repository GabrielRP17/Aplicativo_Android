package com.example.shopping_online_store.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MenuScreen(controladorNavegacao: NavHostController) {

    var email by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black))
    {
        Card(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Blue)) {
            Column(modifier = Modifier
                .fillMaxSize()) {

                Spacer(modifier = Modifier.height(5.dp))
                Text(

                    text = "Shopping Online Store",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .height(50.dp)
                )
                Row(horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()) {
                    Button(onClick = { controladorNavegacao.navigate("TelaCadastro" )
                    }) {
                        Text(text = "Cadastro")
                    }

                    Button(onClick = { controladorNavegacao.navigate("TelaLogin" )
                    }) {
                        Text(text = "Login")
                    }
                }




            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color(0xFF647BFA))

        ) {
            Column (modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF647BFA))
            ) {
                Column(){
                    Row(horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier.fillMaxWidth()) {
                        Button(onClick = { controladorNavegacao.navigate("TelaCadastro" )
                        }) {
                            Text(text = "Masculino")
                        }
                        Button(onClick = { controladorNavegacao.navigate("TelaLogin")
                            }) {
                            Text(text = "Feminino")
                        }
                        Button(onClick = { controladorNavegacao.navigate("TelaLogin")
                        }) {
                            Text(text = "Infantil")
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(80.dp))

        Column(verticalArrangement = Arrangement.SpaceBetween,
            modifier=Modifier
            .height(200.dp))
        {
            Text(text = "Navegue por Categorias",
                color = Color.White,
                fontSize = 25.sp)

            Spacer(modifier = Modifier.height(32.dp))

            Row(horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()) {
                Button(onClick = { controladorNavegacao.navigate("TelaCadastro" )
                }) {
                    Text(text = "Outlet")
                }
                Button(onClick = { controladorNavegacao.navigate("TelaLogin")
                }) {
                    Text(text = "Blusas")
                }
                Button(onClick = { controladorNavegacao.navigate("TelaLogin")
                }) {
                    Text(text = "Calças")
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row (horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth()) {

                Button(onClick = { controladorNavegacao.navigate("TelaCadastro" )
                }) {
                    Text(text = "Vestidos")
                }
                Button(onClick = { controladorNavegacao.navigate("TelaLogin")
                }) {
                    Text(text = "Calçados")
                }
                Button(onClick = { controladorNavegacao.navigate("TelaLogin")
                }) {
                    Text(text = "Camisas")
                }
            }
        }

        Spacer(modifier = Modifier.height(250.dp))

        Card (modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue)
        )
        {
            Column (){
                Row (horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()) {
                    Button(onClick = { controladorNavegacao.navigate("TelaMenu" )
                    }) {
                        Text(text = "Inicio")
                    }
                    Button(onClick = { controladorNavegacao.navigate("TelaLogin")
                    }) {
                        Text(text = "Categorias")
                    }
                    Button(onClick = { controladorNavegacao.navigate("TelaMenu")
                    }) {
                        Text(text = "Menu")
                    }
                }
            }
        }
    }
}