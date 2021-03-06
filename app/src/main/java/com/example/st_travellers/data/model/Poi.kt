package com.example.st_travellers.data.model

data class Poi(val pois: List<PoiData>)

data class PoiData(
    val nombre: String,
    val descripcion: String,
    val imagen: String,
    val puntuacion: Float,
    val descripcioncompleta: String,
    val latitud: Double,
    val longitud: Double
)
