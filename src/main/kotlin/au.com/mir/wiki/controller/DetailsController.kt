package au.com.mir.wiki.controller

import au.com.mir.wiki.domain.ReponseRoot
import au.com.mir.wiki.domain.Response
import com.fasterxml.jackson.annotation.JsonFormat
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/details")
class DetailsController() {
    @PostMapping("/")
    @ApiOperation(
        value = "finds the details of specified category",
        response = JsonFormat::class,
        consumes = "application/x-www-form-urlencoded;charset=UTF-8"
    )
    fun findCategoryDetails(
        payload: ReponseRoot?
    ): Response {
        return Response(
            response_type = "ephemeral",
            text = "What is this? - this is a wiki"
        )
    }
}
