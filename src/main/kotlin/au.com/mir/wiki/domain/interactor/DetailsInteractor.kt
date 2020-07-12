package au.com.mir.wiki.domain.interactor

import au.com.mir.wiki.domain.port.IDetailsInteractor
import java.io.BufferedReader
import java.io.Reader
import java.nio.file.Files
import java.nio.file.Paths

object DetailsInteractor : IDetailsInteractor {

    override fun findCategoryDetails(categoryName: String): String {
        val (a, b) = listOf<String>("name", "git", "name1", "git1")
        val filePath = "./src/test/resources/wiki.csv"

        val readFile = parseCsv(readFile(filePath))

        println(readFile)

        return ""
    }

    private fun parseCsv(file: Reader): List<String> =
        file.readLines()

    private fun readFile(path: String): BufferedReader {
        val filePath = Paths.get(path)
        return Files.newBufferedReader(filePath)
    }

    private fun getCategory(categoryName: String?) {
        TODO()
    }
}
