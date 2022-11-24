package labs.yohesu.kotlinapi.service

import labs.yohesu.kotlinapi.model.request.UserCreateRequest
import labs.yohesu.kotlinapi.model.request.UserGetRequest
import labs.yohesu.kotlinapi.model.request.UserUpdateRequest
import labs.yohesu.kotlinapi.model.response.UserResponse

interface UserService {
    fun create(request: UserCreateRequest): UserResponse
    fun get(request: UserGetRequest): UserResponse

    fun update(request: UserUpdateRequest): UserResponse
}