package au.com.mir.wiki.domain.port

interface IDetailsInteractor {
    fun findCategoryDetails(categoryName: String): String
}
