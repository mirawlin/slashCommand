package au.com.mir.wiki.domain

interface IDetailsInteractor {
    fun findCategoryDetails(categoryName: String): String
}
