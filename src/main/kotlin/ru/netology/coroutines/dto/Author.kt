package ru.netology.coroutines.dto


data class Author(
    val id: Long,
    val name: String,
    val avatar: String,
) {
    override fun toString(): String {
        return name
    }
}
