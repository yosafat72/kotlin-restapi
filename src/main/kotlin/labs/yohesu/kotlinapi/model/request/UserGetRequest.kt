package labs.yohesu.kotlinapi.model.request

import javax.validation.constraints.NotBlank

data class UserGetRequest(

    @field:NotBlank
    val id: String

)
