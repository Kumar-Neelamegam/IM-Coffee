package com.kumarjku.imcoffee.dataandmodels

import java.util.*

data class AppSettings(
    val userName: String,
    val password: String,
    val coffeePrice: Double,
    val createdDate: Date,
    val isActive: Boolean,
)
