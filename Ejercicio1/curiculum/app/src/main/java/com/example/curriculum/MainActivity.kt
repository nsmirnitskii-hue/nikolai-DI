package com.example.curriculum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.curriculum.ui.theme.CURRICULUMTheme


import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CURRICULUMTheme {
                Surface {
                    contentMe()              }
            }
        }
    }
}
@Composable
fun contentMe(innerPadding: PaddingValues = PaddingValues()) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Image(
                painter = painterResource(R.drawable.perfil),
                contentDescription = "Perfil",
                modifier = Modifier
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
                    .padding(8.dp)
                    .size(220.dp)
            )
            Text(
                text = "Nikolai Smirnitskii",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Tengo 24 años, vivo en Basauri, me gusta andar y salir para hacer lo que sea con mis amigos",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium
            )


            // El resto de tu contenido permanece igual...
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(R.drawable.sport),
                    contentDescription = "Sport",   modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Sport",
                        style = MaterialTheme.typography.titleSmall )
                    Text(text = "Cuando tengo tiempo voy a nadar unos cuantos kilómetros") }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.birrete),
                    contentDescription = "Estudios",
                    modifier = Modifier.size(80.dp)
                        .clip(CircleShape)
                )
                Column {
                    Text(
                        text = "Estudios",
                        style = MaterialTheme.typography.titleSmall )
                    Text(text = "AHora mismo estoy en grado superior")  }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.food),
                    contentDescription = "Comida",
                    modifier = Modifier.size(80.dp)
                        .clip(CircleShape)
                )
                Column {
                    Text(
                        text = "Comida",
                        style = MaterialTheme.typography.titleSmall )
                    Text(text = "No tengo una comida que me gusta mas que todas, pero me gustan mucho las sopas") }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.hobby),
                    contentDescription = "Hobby",
                    modifier = Modifier.size(80.dp)
                        .clip(CircleShape)
                )
                Column {
                    Text(
                        text = "Hobby",
                        style = MaterialTheme.typography.titleSmall  )
                    Text(text = "Me gusta ver los series o animes")
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.git),
                    contentDescription = "GIT",
                    modifier = Modifier.size(80.dp)
                        .clip(CircleShape)
                )
                Image(
                    painter = painterResource(R.drawable.instagram),
                    contentDescription = "Instagramm",
                    modifier = Modifier.size(80.dp)
                        .clip(CircleShape)
                )
                Image(
                    painter = painterResource(R.drawable.x),
                    contentDescription = "X",
                    modifier = Modifier.size(80.dp)
                        .clip(CircleShape)
                )
            }
        }
    }
}
