package com.meksconways.plantsworld.core.model

import com.google.gson.annotations.SerializedName


data class Links (
    @SerializedName("self") val self : String,
    @SerializedName("first") val first : String,
    @SerializedName("last") val last : String
)