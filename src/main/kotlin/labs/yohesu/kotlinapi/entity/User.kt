package labs.yohesu.kotlinapi.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tbl_user")
data class User(
    @Id
    val id: String,

    @Column(name = "name")
    val name: String?,

    @Column(name = "dob")
    val dob: Date?,

    @Column(name = "gender")
    val gender: String?,

    @Column(name = "phone ")
    val phone: String?,

    @Column(name = "email")
    val email: String?,

    @Column(name = "address")
    val address: String?,

    @Column(name = "created_at")
    val createdAt: Date?,

    @Column(name = "updated_at")
    val updatedAt: Date?
)