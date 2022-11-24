package labs.yohesu.kotlinapi.controller

import labs.yohesu.kotlinapi.model.GenericResponse
import labs.yohesu.kotlinapi.model.request.UserCreateRequest
import labs.yohesu.kotlinapi.model.request.UserGetRequest
import labs.yohesu.kotlinapi.model.response.UserResponse
import labs.yohesu.kotlinapi.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val service: UserService) {

    @PostMapping(value = ["/api/user/create"])
    fun createUser(@RequestBody body: UserCreateRequest) : GenericResponse<UserResponse>{
        val result = service.create(body)
        return GenericResponse(true, "Successfully added data !", result)
    }
    @PostMapping(value = ["/api/user/get"])
    fun getUser(@RequestBody body: UserGetRequest) : GenericResponse<UserResponse>{
        val result = service.get(body)
        return GenericResponse(true, "Successfully !", result)
    }

}