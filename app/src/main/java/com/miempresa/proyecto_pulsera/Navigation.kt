package com.miempresa.proyecto_pulsera

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings


@Composable
fun Screen1(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFF08FF00), Color(0xFF00F7FF))
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Secure Child",
                color = Color.White,
                fontSize = 24.sp
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        Image(
            painter = painterResource(id = R.drawable.bracelet),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )

        Button(
            onClick = {
                navController.navigate("pantalla2")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF)) // Degradado de verde a naranja
                    )
                )
        ) {
            Text(
                text = "Comenzar",
                color = Color.White
            )
        }
    }
}

















@Composable
fun Screen3(navController: NavHostController, texto: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
            .padding(start = 16.dp, end = 16.dp),
        verticalArrangement = Arrangement.Top
    ) {

        Image(
            painter = painterResource(id = R.drawable.telefono),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Mantente al tanto de tu ser querido desde tu celular",
            color = Color.Black,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    navController.navigate("pantalla2")
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
                    .height(60.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF))
                        )
                    )
            ) {
                Text(
                    text = "Prev",
                    color = Color.White
                )
            }

            Button(
                onClick = {
                    navController.navigate("pantalla4")
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp)
                    .height(60.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF))
                        )
                    )
            ) {
                Text(
                    text = "Next",
                    color = Color.White
                )
            }

            Button(
                onClick = {
                    navController.navigate("pantalla7")
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
                    .height(60.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF))
                        )
                    )
            ) {
                Text(
                    text = "Omitir",
                    color = Color.White
                )
            }
        }
    }
}








@Composable
fun Screen4(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
            .padding(start = 16.dp, end = 16.dp),
        verticalArrangement = Arrangement.Top
    ) {

        Image(
            painter = painterResource(id = R.drawable.campana1),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Recibirás notificaciones de alerta",
            color = Color.Black,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    navController.navigate("pantalla3/.")
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
                    .height(60.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF))
                        )
                    )
            ) {
                Text(
                    text = "Prev",
                    color = Color.White
                )
            }

            Button(
                onClick = {
                    navController.navigate("pantalla5")
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
                    .height(60.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF))
                        )
                    )
            ) {
                Text(
                    text = "Next",
                    color = Color.White
                )
            }
        }
    }
}







@Composable
fun Screen5(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
            .padding(start = 16.dp, end = 16.dp),
        verticalArrangement = Arrangement.Top
    ) {

        Image(
            painter = painterResource(id = R.drawable.campana2),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Te mantendremos alerta",
            color = Color.Black,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    navController.navigate("pantalla4")
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
                    .height(60.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF))
                        )
                    )
            ) {
                Text(
                    text = "Prev",
                    color = Color.White
                )
            }

            Button(
                onClick = {
                    navController.navigate("pantalla6")
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
                    .height(60.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF))
                        )
                    )
            ) {
                Text(
                    text = "Next",
                    color = Color.White
                )
            }
        }
    }
}






@Composable
fun Screen6(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "CONSEJO",
            color = Color(0xFF04D9FF),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Text(
            text = "Puedes usar esta aplicación para contactarte con nosotros en el caso de telefono en el caso de que tengas dudas",
            color = Color.Black,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            // Círculo con icono de teléfono
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color(0xFF04D9FF), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))


        Button(
            onClick = {
                navController.navigate("pantalla7")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF))
                    )
                )
        ) {
            Text(
                text = "FINALIZAR",
                color = Color.White
            )
        }
    }
}







@Composable
fun Screen7(navController: NavHostController) {
    var isPowerOn by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = {
                    navController.navigate("pantalla12")


                },
                modifier = Modifier
                    .size(48.dp)
                    .background(Color(0xFF87CEEB), CircleShape)
            ) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = null, tint = Color.White)
            }


        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(240.dp)
                    .background(Color.Gray, RoundedCornerShape(16.dp))
                    .clickable {
                        isPowerOn = !isPowerOn
                    }
                    .padding(40.dp)
            ) {
                Image(
                    painter = painterResource(id = if (isPowerOn) R.drawable.encender else R.drawable.apagar),
                    contentDescription = null,
                    modifier = Modifier
                        .size(160.dp)
                        .align(Alignment.Center)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))



            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.White, RoundedCornerShape(16.dp))
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.desconocido),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                ) {
                    Text(
                        text = "¿Tienes alguna duda?",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Puedes contactarte con nosotros aquí.",
                        color = Color.Gray,
                        maxLines = 2
                    )
                }
            }
        }



        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.Gray)
                .padding(vertical = 16.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = {
                    navController.navigate("pantalla1")
                },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(imageVector = Icons.Default.Home, contentDescription = null, tint = Color.Black)
            }

            IconButton(
                onClick = {
                    navController.navigate("pantalla9")
                },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(imageVector = Icons.Default.Email, contentDescription = null, tint = Color.Black)
            }

            IconButton(
                onClick = { navController.navigate("pantalla10")},
                modifier = Modifier.size(48.dp)
            ) {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = null, tint = Color.Black)
            }

            IconButton(
                onClick = {navController.navigate("pantalla11") },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(imageVector = Icons.Default.Person, contentDescription = null, tint = Color.Black)
            }
        }
    }
}


















@Composable
fun Screen9(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = { navController.navigate("pantalla12") },
                modifier = Modifier
                    .size(48.dp)
                    .background(Color(0xFF87CEEB), CircleShape)
            ) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = null, tint = Color.White)
            }

            IconButton(
                onClick = {navController.navigate("pantalla8") },
                modifier = Modifier
                    .size(48.dp)
                    .background(Color(0xFF87CEEB), CircleShape)
            ) {
                Icon(imageVector = Icons.Default.Person, contentDescription = null, tint = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Icon(
            imageVector = Icons.Default.KeyboardArrowLeft,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier
                .size(48.dp)
                .clickable { navController.navigate("pantalla7") }
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Por el momento no tienes ninguna notificación ;)",
            color = Color.Gray.copy(alpha = 0.7f),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(bottom = 25.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = { navController.navigate("pantalla7")},
                modifier = Modifier.size(48.dp)
            ) {
                Icon(imageVector = Icons.Default.Home, contentDescription = null, tint = Color.Black)
            }

            IconButton(
                onClick = {navController.navigate("pantalla9") },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(imageVector = Icons.Default.Email, contentDescription = null, tint = Color.Black)
            }

            IconButton(
                onClick = { navController.navigate("pantalla10")},
                modifier = Modifier.size(48.dp)
            ) {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = null, tint = Color.Black)
            }

            IconButton(
                onClick = {navController.navigate("pantalla11") },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = null, tint = Color.Black)
            }
        }
    }
}



















@Composable
fun Screen11(navController: NavController) {
    val sendEmailLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        IconButton(
            onClick = { navController.navigate("pantalla7") },
            modifier = Modifier
                .align(Alignment.Start)
                .padding(8.dp)
        ) {
            Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null, tint = Color.Black)

        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(Color.Green, Color.Cyan),
                        startX = 0f,
                        endX = 1000f
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Consultas",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Text(
            text = "¿Tiene consultas o dudas? Presione el botón de abajo.",
            color = Color.Black,
            fontSize = 16.sp,
            modifier = Modifier.padding(8.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.contacto),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(8.dp)
        )

        Button(
            onClick = {
                val emailAddress = "jhoe.yauricasa@tecsup.edu.pe"
                val subject = "Consulta desde la aplicación"
                val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:$emailAddress")
                    putExtra(Intent.EXTRA_SUBJECT, subject)
                }
                sendEmailLauncher.launch(emailIntent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("Contáctenos")
        }
    }
}









@Composable
fun Screen12(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        IconButton(
            onClick = { navController.navigate("pantalla7") },
            modifier = Modifier
                .align(Alignment.Start)
                .padding(13.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.izquierda1),
                contentDescription = null,
                tint = Color.Cyan
            )
        }

        Button(
            onClick = { navController.navigate("pantalla3/.") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("RECOMENDACIONES", color = Color.White)
        }

        Button(
            onClick = { navController.navigate("pantalla9") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("NOTIFICACIONES", color = Color.White)
        }

        Button(
            onClick = { navController.navigate("pantalla10") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("UBICACION", color = Color.White)
        }

        Button(
            onClick = { navController.navigate("pantalla11") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("CONSULTAS", color = Color.White)
        }



    }
}
