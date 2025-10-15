package com.app.pokedexapp.presentation.screens.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.app.pokedexapp.domain.model.Pokemon
import com.app.pokedexapp.presentation.screens.detail.components.Chip

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokemonDetailScreen(
    pokemonId: String,
    onBackClick: () -> Unit,
) {
    val mockPokemon =
        remember {
            Pokemon.getMockData().find { it.id == pokemonId }
        }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detalles del pokemon") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.Default.ArrowBack, "Back")
                    }
                },
            )
        },
    ) { padding ->
        mockPokemon?.let { pokemon ->
            Column(
                modifier =
                    Modifier
                        .fillMaxSize()
                        .padding(padding)
                        .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // Mock para el lab3
                AsyncImage(
                    model = pokemon.imageUrl,
                    contentDescription = pokemon.name,
                    modifier = Modifier.size(200.dp),
                )

                Spacer(modifier = Modifier.height(16.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(pokemon.name)
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Basic info
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Height")
                        Text("${pokemon.height / 10.0}m")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Weight")
                        Text("${pokemon.weight / 10.0}kg")
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Types
                Text("Types", style = MaterialTheme.typography.titleMedium)
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    pokemon.types.forEach { type ->
                        Chip(type = type)
                    }
                }
            }
        }
    }
}
