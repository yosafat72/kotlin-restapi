package labs.yohesu.kotlinapi.service.imp

import labs.yohesu.kotlinapi.controller.NotFoundException
import labs.yohesu.kotlinapi.entity.User
import labs.yohesu.kotlinapi.model.request.UserCreateRequest
import labs.yohesu.kotlinapi.model.request.UserGetRequest
import labs.yohesu.kotlinapi.model.response.UserResponse
import labs.yohesu.kotlinapi.repository.UserRepository
import labs.yohesu.kotlinapi.service.UserService
import labs.yohesu.kotlinapi.utils.Utils
import labs.yohesu.kotlinapi.validation.ValidationUtils
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImp(val repository: UserRepository, val validation: ValidationUtils) : UserService {

    override fun create(request: UserCreateRequest): UserResponse {

        validation.validate(request)

        val user = User(
            id = Utils().getRandomString(5),
            name = request.name,
            dob = request.dob,
            gender = request.gender,
            phone = request.phone,
            email = request.email,
            address = request.address,
            createdAt = Date(),
            updatedAt = Date()
        )
        repository.save(user)

        return convertUserToUserResponse(user = user)
    }

    override fun get(request: UserGetRequest): UserResponse {

        validation.validate(request)

        val user = repository.findByIdOrNull(request.id)

        if(user == null){
            throw NotFoundException()
        }else{
            return convertUserToUserResponse(user = user)
        }

    }

    private fun convertUserToUserResponse(user: User): UserResponse{
        return UserResponse(
            id = user.id,
            name = user.name!!,
            dob = user.dob!!,
            gender = user.gender!!,
            phone = user.phone!!,
            email = user.email!!,
            address = user.address!!,
            createdAt = user.createdAt!!,
            updatedAt = user.updatedAt!!
        )
    }

}