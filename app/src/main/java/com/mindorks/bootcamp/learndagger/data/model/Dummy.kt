package com.mindorks.bootcamp.learndagger.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Dummy(

        @Expose
        @SerializedName("name")
        var name:String,

        @Expose
        @SerializedName("imgUrl")
        var imgUrl:String

) {
}