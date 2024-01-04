package com.example.shopping_online_store.Screens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.shopping_online_store.R

@Composable
fun LoginScreen(controladorNavegacao: NavHostController) {

    var email by remember {
        mutableStateOf("")
    }
    var senha by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black))
    {

        Spacer(modifier = Modifier.height(32.dp))

        Image(
            painter = painterResource(id = R.drawable.logo_image),
            contentDescription = "logo",
            modifier = Modifier
                .size(200.dp)
                .padding(top = 16.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))
        Card(
            modifier = Modifier
                    .fillMaxWidth()
                .height(350.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Blue),
            elevation = CardDefaults.cardElevation(8.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)

            ) {
                TextField(
                    value = email,
                    shape = RoundedCornerShape(16.dp),
                    onValueChange = { email = it },
                    modifier = Modifier
                        .fillMaxWidth(),
                    label = {Text(text="Usuário:") }
                )

                Spacer(modifier = Modifier.height(32.dp))

                TextField(
                    value = senha,
                    shape = RoundedCornerShape(16.dp),
                    onValueChange = { senha = it },
                    modifier = Modifier
                        .fillMaxWidth(),
                    label = {Text(text="Senha:")}
                )

                Spacer(modifier = Modifier.height(25.dp))

                Button(onClick = {
                    controladorNavegacao.navigate("telaMenu")
                }) {
                    Text(text = "Login")
                }

                Spacer(modifier = Modifier.height(20.dp))

                Button(onClick = {
                    controladorNavegacao.navigate("telaCadastro")
                }) {
                    Text(text = "Cadastro")
                }
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { controladorNavegacao.navigate("telaMenu")
        }) {
            Text(text = "Voltar")
        }
    }
}