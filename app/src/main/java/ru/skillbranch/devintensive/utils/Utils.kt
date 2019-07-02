package ru.skillbranch.devintensive.utils

object Utils {

    fun parseFullName(fullName: String?) : Pair<String?, String?> {

        when {
            fullName.isNullOrBlank() -> return null to null
        }

        val parts : List<String>?  = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return firstName to lastName
    }

    fun toInitials(firstName: String?, lastName: String?): String? {

        val result =  when {
            !firstName.isNullOrBlank() && !lastName.isNullOrBlank() -> "${firstName.first()}${lastName.first()}"
            firstName.isNullOrBlank() -> if (lastName.isNullOrBlank()) null else lastName.first().toString()
            else -> firstName.first().toString()
        }

        return result?.toUpperCase()
    }

}