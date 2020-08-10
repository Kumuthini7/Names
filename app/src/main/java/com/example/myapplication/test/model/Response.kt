package com.example.myapplication.test.model

import com.google.gson.annotations.SerializedName

data class Response(

	@SerializedName("message")
	val message: List<String>? = null,

	@SerializedName("status")
	val status: String? = null
)
