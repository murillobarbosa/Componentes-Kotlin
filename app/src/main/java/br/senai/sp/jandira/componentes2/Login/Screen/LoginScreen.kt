package br.senai.sp.jandira.componentes2.Login.Screen

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
fun LoginScren(navController: NavController) {



    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
            .padding(vertical = 50.dp,
            ), verticalArrangement = Arrangement.SpaceEvenly
    ) {

            Row(modifier = Modifier.fillMaxWidth()) {
                Text(modifier = Modifier.fillMaxWidth(),
                    text = "Login",
                    fontSize = 40.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            }

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Button(onClick = {
                    navController.navigate("menu")
                }) {
                    Text(text = "Entrar",
                        fontSize = 25.sp)
                }
            }


    }
}

//@Preview (showBackground = true ,showSystemUi = true)
//@Composable
//fun LoginPreview() {
//    LoginScren()
//}