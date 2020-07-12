package au.com.mir.wiki.domain.interactor

import org.junit.jupiter.api.Assertions.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object DetailsInteractorTest : Spek({
    describe("find category details") {
        it("should read csv file, filter by categoryName and return git repo") {

            val expected = listOf("git repo 1", "git repo 2")

            val result = DetailsInteractor.findCategoryDetails("category 1")

            assertEquals(expected, result)
        }
    }

//    describe("parseCsv") {
//        it("should read the lines of a file") {
//            // GIVEN
//            val filePath = "./src/test/resources/wiki.csv"
//            val expected = "category 2, git repo3"
//
//            // WHEN
//            val result = DetailsInteractor.parseCsv(readFile(filePath))
//            // THEN
//            assertEquals(expected, result.lines())
//        }
//    }
})
