package au.com.mir.wiki.controller

import au.com.mir.wiki.domain.IDetailsInteractor
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@RequestMapping("/details")
class detailsController(val detailsInteractor: IDetailsInteractor) {
    @ApiOperation(
        value = "finds the details of specified category"
//        response = ""
    )
    @GetMapping("/")
    fun findCategoryDetails(
        @RequestParam(required = false) name: String
    ): String  {
        return detailsInteractor.findCategoryDetails(name)
    }
}
