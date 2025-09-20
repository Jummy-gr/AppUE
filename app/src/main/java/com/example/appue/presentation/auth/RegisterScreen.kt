package com.example.appue.presentation.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable

fun RegisterScreen(navController: NavController){
    var nombre by remember {mutableStateOf(value = "")}
    var correo by remember {mutableStateOf(value = "")}
    var contraseña by remember {mutableStateOf(value = "")}
    var contraseña2 by remember {mutableStateOf(value = "")}


    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Spacer(modifier = Modifier.height(16.dp))
        Text("Registro de usuario", style = MaterialTheme.typography.headlineMedium)

        //Outlined text field para el nombre
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            placeholder = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        //Outlined text field para el correo
        OutlinedTextField(
            value = correo,
            onValueChange = { correo = it },
            label = { Text("Correo") },
            placeholder = { Text("Correo") },
            modifier = Modifier.fillMaxWidth()
        )

        //Outlined text field para la contraseña
        OutlinedTextField(
            value = contraseña,
            onValueChange = { contraseña = it },
            label = { Text("Contraseña") },
            placeholder = { Text("Contraseña") },
            modifier = Modifier.fillMaxWidth()
        )

        //Outlined text field para la contraseña
        OutlinedTextField(
            value = contraseña2,
            onValueChange = { contraseña2 = it },
            label = { Text("Confirmar Contraseña") },
            placeholder = { Text("Confirmar Contraseña") },
            modifier = Modifier.fillMaxWidth()
        )

        //space between fields
        Spacer(modifier = Modifier.height(16.dp))

        //Button for register
        Button(onClick = {
            if (correo.isNotBlank()
                && contraseña.isNotBlank()
                && contraseña == contraseña2) {
                navController.navigate("login")
            }
            // Aquí puedes agregar un else para mostrar un mensaje de error
        }, modifier = Modifier.fillMaxWidth()) {
            Text("Registrarse")
        }

    }





}
