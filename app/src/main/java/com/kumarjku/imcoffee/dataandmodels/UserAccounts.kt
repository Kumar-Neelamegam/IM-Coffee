package com.kumarjku.imcoffee.dataandmodels

import java.util.*

data class UserAccounts(
    val accountId:Int,
    val userId:Int,
    val credit:Int,/*Calculate from transaction*/
    val balance:Int,
    val createdDate: Date,
    val isActive: Boolean,
)
