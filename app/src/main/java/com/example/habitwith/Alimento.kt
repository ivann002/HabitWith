package com.example.habitwith

import com.google.gson.annotations.SerializedName

data class Alimento(
    var generic_name:String?="",
    var code:String?="",
    var allergens:String?="",
)