package br.senai.sp.jandira.componentes2.Perfil.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PerfilScren(navController: NavController, nome: String, idade: String) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        verticalArrangement = Arrangement.SpaceAround
    ) {

        Row(modifier = Modifier.fillMaxWidth()) {

            Text(modifier = Modifier.fillMaxWidth(),
                text = "Perfil - $nome  $idade anos" ,
                color = Color.White,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
            )
        }
        
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(onClick = { navController.navigate("menu")}) {
                Text(text = "Voltar",
                fontSize = 20.sp
                )
            }
        }
        
        
    }

}