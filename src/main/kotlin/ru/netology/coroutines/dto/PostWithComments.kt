package ru.netology.coroutines.dto


data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
) {
    override fun toString(): String {
        return "Post with comments $post -> comments: $comments \n"
    }
}
