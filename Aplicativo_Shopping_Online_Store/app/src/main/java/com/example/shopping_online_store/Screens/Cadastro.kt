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
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun CadastroScreen(controladorNavegacao: NavHostController) {

    var novoEmail by remember {
        mutableStateOf("")
    }
    var novaSenha by remember {
        mutableStateOf("")
    }
    var nomeCompleto by remember {
        mutableStateOf("")
    }
    var confirmaSenha by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)) {

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Cadastro Usuário",
            fontSize = 32.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(50.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Blue),
            elevation = CardDefaults.cardElevation(8.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
            ) {
                Text(
                    text="Dados Usuário",
                    color= Color.White,
                    fontSize = 22.sp

                )
                Spacer(modifier = Modifier.height(32.dp))
                TextField(
                    value = nomeCompleto,
                    shape = RoundedCornerShape(16.dp),
                    onValueChange ={nomeCompleto = it},
                    modifier = Modifier
                        .fillMaxWidth(),
                    label = { Text(text = "Nome Completo")}
                )
                Spacer(modifier = Modifier.height(20.dp))

                TextField(
                    value = novoEmail,
                    shape = RoundedCornerShape(16.dp),
                    onValueChange = { novoEmail = it },
                    modifier = Modifier
                        .fillMaxWidth(),
                    label = {Text(text="Digite seu Email:")}
                )

                Spacer(modifier = Modifier.height(20.dp))

                TextField(
                    value = novaSenha,
                    shape = RoundedCornerShape(16.dp),
                    onValueChange = { novaSenha = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        ,
                    label = {Text(text="Digite sua Senha:")}
                )

                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    value = confirmaSenha,
                    shape = RoundedCornerShape(16.dp),
                    onValueChange = { confirmaSenha = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        ,
                    label = {Text(text="Confirme sua Senha:")}
                )
                Spacer(modifier = Modifier.height(32.dp))

                Row(horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()) {

                    Button(onClick = { controladorNavegacao.navigate("telaMenu")
                    }) {
                        Text(text = "voltar")
                    }

                    Button(onClick = { controladorNavegacao.navigate("telaLogin")
                    }) {
                        Text(text = "Cadastrar")
                    }
                }
            }
        }
    }
}