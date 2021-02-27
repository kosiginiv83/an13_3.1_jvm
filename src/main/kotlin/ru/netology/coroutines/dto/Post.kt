package ru.netology.coroutines.dto


data class Post(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
) {
    fun getPost(author: String): String {
        return "\nPost id: $id \n author: $author \n content: $content"
    }
}
