package au.com.mir.wiki.domain


data class ReponseRoot(
    val root: MyRequestPayload?
)

data class Response(
    val response_type: String,
    val text: String
)

data class MyRequestPayload(
    val token: String?,
    val team_id: String?,
    val team_domain: String?,
    val channel_id: String?,
    val channel_name: String?,
    val user_id: String?,
    val user_name: String?,
    val command: String?,
    val text: String?,
    val response_url: String?,
    val trigger_id: String?
)
