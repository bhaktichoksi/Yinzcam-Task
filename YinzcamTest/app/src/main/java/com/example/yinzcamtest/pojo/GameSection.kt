package com.example.yinzcamtest.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class GameSection : Serializable {
    @SerializedName("Heading")
    @Expose
    var heading: String? = null

    @SerializedName("Game")
    @Expose
    var game: List<Game>? = null


    constructor(heading: String?, game: List<Game>?) : super() {
        this.heading = heading
        this.game = game
    }


}