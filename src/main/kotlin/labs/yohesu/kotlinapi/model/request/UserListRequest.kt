package labs.yohesu.kotlinapi.model.request

import javax.validation.constraints.NotNull

data class UserListRequest(

    @field:NotNull
    val page: Int
)
