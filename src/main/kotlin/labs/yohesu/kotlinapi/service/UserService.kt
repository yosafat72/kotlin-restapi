package labs.yohesu.kotlinapi.service

import labs.yohesu.kotlinapi.model.request.UserCreateRequest
import labs.yohesu.kotlinapi.model.response.UserResponse

interface UserService {
    fun create(request: UserCreateRequest): UserResponse
}