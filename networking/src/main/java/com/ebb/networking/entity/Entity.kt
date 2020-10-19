package com.ebb.networking.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Something(
    @SerialName("something_id")
    val somethingId: Int,
    @SerialName("something_description")
    val somethingDescription: String,
    @SerialName("links")
    val links: Links
)

@Serializable
data class Links(
    @SerialName("something_link")
    val somethingLink: String?,
)
