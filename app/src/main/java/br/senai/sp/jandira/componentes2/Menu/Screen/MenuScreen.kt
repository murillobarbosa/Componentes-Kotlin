package br.senai.sp.jandira.componentes2.Menu.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
            verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(modifier = Modifier.fillMaxWidth(),
        ) {
            Text(modifier = Modifier.fillMaxWidth().padding(end = 95.dp),
                textAlign = TextAlign.Center,
                text = "Menu",
                fontSize = 40.sp,
                color = Color.White
            )
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(onClick = { navController.navigate("perfil/Maria da Silva/25")}, modifier = Modifier.width(125.dp)) {
                Text(text = "Perfil",fontSize = 20.sp
                )
            }
        }

        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { navController.navigate("pedidos") }, modifier = Modifier.width(125.dp).padding(bottom = 30.dp)) {
                Text(text = "Pedidos",fontSize = 20.sp,
                )
            }

            Button(onClick = { navController.navigate( "login") }, modifier = Modifier.width(125.dp)) {
                Text(text = "Sair",fontSize = 20.sp,
                )

            }
        }

    }
}

//@Preview (showBackground = true, showSystemUi = true)
//@Composable
//fun MenuPreview() {
//    MenuScreen()
//}