package com.kumarjku.imcoffee.dataandmodels

import java.util.*

data class Users(
    val userId:Int,
    val firstName:String,
    val lastName:String,
    val createdDate: Date,
    val photo: String,
    val isActive: Boolean,
    val currentBalance: Double,
    val totalConsumed: Double,
)
