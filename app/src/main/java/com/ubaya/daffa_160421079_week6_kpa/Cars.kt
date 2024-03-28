package com.ubaya.daffa_160421079_week6_kpa

data class Cars(
    val id:String?,
    val mode:String?,
    val year:String,
    val colors:List<String>?,
    val specs:specsDetails?
)

data class specsDetails(
    val engine:String?,
    val transmission:String?,
    val fuel_type:String?
)