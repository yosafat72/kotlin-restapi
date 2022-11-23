package labs.yohesu.kotlinapi.model

data class GenericResponse<T>(
    val status: Boolean,
    val message: String,
    val data: T
)
