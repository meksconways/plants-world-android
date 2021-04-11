package com.meksconways.plantsworld.core.model.division

import com.google.gson.annotations.SerializedName
import com.meksconways.plantsworld.core.model.Links
import com.meksconways.plantsworld.core.model.Meta

data class DivisionsResponseModel(
    @SerializedName("data") val data: List<Data>?,
    @SerializedName("links") val links: Links?,
    @SerializedName("meta") val meta: Meta?
)

data class Data(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("slug") val slug: String?,
    @SerializedName("links") val links: Links?,
    @SerializedName("subkingdom") val subkingdom: Subkingdom?
)

data class Kingdom(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("slug") val slug: String?,
    @SerializedName("links") val links: Links?
)

data class Subkingdom(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("slug") val slug: String?,
    @SerializedName("links") val links: Links?,
    @SerializedName("kingdom") val kingdom: Kingdom?
)