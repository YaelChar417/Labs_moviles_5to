package com.app.pokedexapp.data.repository

import com.app.pokedexapp.data.mapper.toDomain
import com.app.pokedexapp.data.remote.api.PokemonApi
import com.app.pokedexapp.domain.model.Pokemon
import com.app.pokedexapp.domain.repository.PokemonRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonRepositoryImpl
    @Inject
    constructor(
        private val api: PokemonApi,
    ) : PokemonRepository {
        override suspend fun getPokemonList(): List<Pokemon> {
            val response = api.getPokemonList()
            return response.results.map { result ->
                // Obtener el id de la url
                val id =
                    result.url
                        .split("/")
                        .dropLast(1)
                        .last()

                // Hacer la llamada a la api para obtener detalles
                api.getPokemon(id).toDomain()
            }
        }

        override suspend fun getPokemonById(id: String): Pokemon = api.getPokemon(id).toDomain()
    }
