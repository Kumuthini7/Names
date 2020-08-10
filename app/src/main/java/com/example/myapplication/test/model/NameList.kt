package com.example.myapplication.test.model

import com.google.gson.annotations.SerializedName

data class NameList(

	@SerializedName("Name")
	var name: String? = null,

	@SerializedName("Type")
	var type: Int? = null
)
