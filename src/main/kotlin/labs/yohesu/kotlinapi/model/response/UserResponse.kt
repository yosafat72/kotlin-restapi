package labs.yohesu.kotlinapi.model.response

import java.util.*

data class UserResponse(
    val id: String,
    val name: String,
    val dob: Date,
    val gender: String,
    val phone: String,
    val email: String,
    val address: String,
    val createdAt: Date,
    val updatedAt: Date
)
