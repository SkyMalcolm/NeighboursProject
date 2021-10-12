package com.example.neighbourproject.neighbour.data

import java.util.*

data class People(
    var firstName: String = "",
    var lastName: String = "",
    var gender: Gender = Gender.NONE,
    var age: Int = 0,
    var interests: MutableList<Interest> = mutableListOf(),
    var image: String = "",
    var relationshipStatus: RelationshipStatus = RelationshipStatus.NONE,
    var id: String = "",
) {
    init {
        id = UUID.randomUUID().toString()
    }

    fun addInterest(interest: Interest) {
        interests.add(interest)
    }

    fun removeInterest(interest: Interest) {
        interests.remove(interest)
    }
}
