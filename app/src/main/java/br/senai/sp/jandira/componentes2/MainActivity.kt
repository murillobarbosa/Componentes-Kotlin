package br.senai.sp.jandira.componentes2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
//import androidx.navigation.compose.composable
import br.senai.sp.jandira.componentes2.Login.Screen.LoginScren
import br.senai.sp.jandira.componentes2.Menu.Screen.MenuScreen
import br.senai.sp.jandira.componentes2.Pedidos.Screen.PedidosScreen
import br.senai.sp.jandira.componentes2.Perfil.Screen.PerfilScren
import br.senai.sp.jandira.componentes2.ui.theme.Componentes2Theme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable



class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Componentes2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    val navController = rememberAnimatedNavController()
                    AnimatedNavHost(
                        navController = navController,
                        startDestination = "login",
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentScope.SlideDirection.Down,
                                animationSpec = tween(2000)
                            ) + fadeIn(tween(2000))
                        },

                            exitTransition = {
                                slideOutOfContainer(
                                    AnimatedContentScope.SlideDirection.Down,
                                    tween(2000)
                                )
                            }
                                           ) {
                        composable(route = "Login") { LoginScren(navController) }
                        composable(route = "menu") { MenuScreen(navController) }
                        composable(route = "pedidos") { PedidosScreen(navController) }
                        composable(route = "perfil/{nomeUsuario}/{idadeUsuario}") {
                            var nome = it.arguments!!.getString("nomeUsuario")
                            var idade = it.arguments!!.getString("idadeUsuario")
                            PerfilScren(navController, nome!!, idade!!)
                        }
                    }

                }
            }
        }
    }
}

