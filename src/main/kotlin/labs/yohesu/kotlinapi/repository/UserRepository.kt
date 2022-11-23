package labs.yohesu.kotlinapi.repository

import labs.yohesu.kotlinapi.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, String>{

}