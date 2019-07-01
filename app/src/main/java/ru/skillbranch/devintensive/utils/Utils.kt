package ru.skillbranch.devintensive.utils

object Utils {

    fun parseFullname(fullName: String?) : Pair<String?, String?> {

        val parts = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return Pair(firstName, lastName)
    }
}