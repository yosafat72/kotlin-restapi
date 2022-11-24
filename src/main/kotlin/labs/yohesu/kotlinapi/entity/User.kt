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
    var name: String?,

    @Column(name = "dob")
    var dob: Date?,

    @Column(name = "gender")
    var gender: String?,

    @Column(name = "phone ")
    var phone: String?,

    @Column(name = "email")
    var email: String?,

    @Column(name = "address")
    var address: String?,

    @Column(name = "created_at")
    val createdAt: Date?,

    @Column(name = "updated_at")
    var updatedAt: Date?
)