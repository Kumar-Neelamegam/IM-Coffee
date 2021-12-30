package com.kumarjku.imcoffee.dataandmodels

import java.util.*

data class UserTransactions(
    val transactionId: Int,
    val accountId:Int,
    val userId:Int,
    val credit:Int,
    val balance:Int,
    val createdDate: Date,
    val isActive: Boolean,
)
