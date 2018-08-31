package br.com.gustavolaviola.cliente.model

import java.util.Calendar

data class Cliente(
		val id: Long,
		val nome: String,
		val dataNascimento: Calendar,
		val email: String
)