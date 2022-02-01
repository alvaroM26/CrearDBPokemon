package com.example.demo

import com.google.gson.Gson
import com.google.gson.JsonObject
import netscape.javascript.JSObject
import javax.persistence.Entity

@Entity //INDICA QUE TIENE QUE HACER UNA BASE DE DATOS CON NUESTROS DATOS
data class Pokemon(var nombre: String, var nivel: Int) {
    override fun toString(): String {
        val gson = Gson()
        val json = gson.toJson(this)
        val jsonObject = JsonObject()
        return gson.toJson(this)
    }
}