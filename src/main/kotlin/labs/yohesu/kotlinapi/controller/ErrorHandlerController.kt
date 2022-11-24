package labs.yohesu.kotlinapi.controller

import labs.yohesu.kotlinapi.model.GenericResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorHandlerController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintViolationException: ConstraintViolationException) : GenericResponse<String>{
        return GenericResponse(
            status = false,
            message = "Bad Request!!!",
            data = constraintViolationException.message!!
        )
    }

}

class NotFoundException: Exception(){

}