package com.example.appue.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.appue.data.model.CountryModel




val mockedCountries = listOf(
    CountryModel("Colombia", 8, "https://flagcdn.com/w320/br.png"),
    CountryModel("Argentina", 1, "https://flagcdn.com/w320/br.png"),
    CountryModel("Francia", 4, "https://flagcdn.com/w320/br.png"),
    CountryModel("Brasil", 3, "https://flagcdn.com/w320/br.png"),
    CountryModel("Perú", 62, "https://flagcdn.com/w320/br.png"),
    CountryModel("Uruguay", 9, "https://flagcdn.com/w320/br.png")
)



@Composable

fun HomeScreen()
{
    Spacer(modifier = Modifier.height(8.dp))
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        //verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        //Bienvenido a la pantalla principal

        Text("Ranking FIFA 2025")
        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn {
            items(mockedCountries){ country ->
                Text("Country: ${country.name}")
            }

        }

    }


}