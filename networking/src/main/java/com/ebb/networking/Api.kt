package com.ebb.networking

import com.ebb.networking.entity.Something
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.*
import kotlinx.serialization.json.Json

class Api {
    private val httpClient = HttpClient {
        install(JsonFeature) {
            val json = Json { ignoreUnknownKeys = true }
            serializer = KotlinxSerializer(json)
        }
    }

    suspend fun getSomething(): List<Something> {
        return httpClient.get(SOME_ENDPOINT)
    }

    companion object {
        private const val SOME_ENDPOINT = "https://api.something.com"
    }
}
