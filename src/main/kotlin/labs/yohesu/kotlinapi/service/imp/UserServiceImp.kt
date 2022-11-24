package labs.yohesu.kotlinapi.service.imp

import labs.yohesu.kotlinapi.controller.NotFoundException
import labs.yohesu.kotlinapi.entity.User
import labs.yohesu.kotlinapi.model.request.UserCreateRequest
import labs.yohesu.kotlinapi.model.request.UserGetRequest
import labs.yohesu.kotlinapi.model.request.UserListRequest
import labs.yohesu.kotlinapi.model.request.UserUpdateRequest
import labs.yohesu.kotlinapi.model.response.UserResponse
import labs.yohesu.kotlinapi.repository.UserRepository
import labs.yohesu.kotlinapi.service.UserService
import labs.yohesu.kotlinapi.utils.Utils
import labs.yohesu.kotlinapi.validation.ValidationUtils
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors

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

        val user = findUserByIdOrThrowNotFound(request.id)
        return convertUserToUserResponse(user = user)

    }

    override fun update(request: UserUpdateRequest): UserResponse {
        validation.validate(request)

        val user = findUserByIdOrThrowNotFound(request.id)

        user.apply {
            name = request.name
            dob = request.dob
            gender = request.gender
            phone = request.phone
            email = request.email
            address = request.address
            updatedAt = Date()
        }

        repository.save(user)

        return convertUserToUserResponse(user = user)

    }

    override fun delete(request: UserGetRequest) {
        val user = findUserByIdOrThrowNotFound(request.id)
        repository.delete(user)
    }

    override fun list(request: UserListRequest): List<UserResponse> {
        val page = repository.findAll(PageRequest.of(request.page, 10))
        println("Total page : "+page.totalPages)
        val result: List<User> = page.get().collect(Collectors.toList())
        return result.map { convertUserToUserResponse(it) }
    }

    private fun findUserByIdOrThrowNotFound(id: String) : User{
        return repository.findByIdOrNull(id = id) ?: throw NotFoundException()
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