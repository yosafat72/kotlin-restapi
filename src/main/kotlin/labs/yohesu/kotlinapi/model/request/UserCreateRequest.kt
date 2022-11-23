package labs.yohesu.kotlinapi.model.request

import java.util.*
import javax.validation.constraints.Email
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class UserCreateRequest(

    @field:NotBlank
    val name: String,

    @field:NotNull
    val dob: Date,

    @field:NotBlank
    val gender: String,

    @field:NotBlank
    @field:Min(value = 8)
    val phone: String,

    @field:NotBlank
    @field:Email
    val email: String,

    @field:NotBlank
    val address: String
)
