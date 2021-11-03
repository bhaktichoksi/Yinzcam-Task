package com.example.yinzcamtest.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Yinzcam : Serializable {
    @SerializedName("Team")
    @Expose
    var team: Team? = null

    @SerializedName("GameSection")
    @Expose
    var gameSection: List<GameSection>? = null


    constructor(
        team: Team?,
        gameSection: List<GameSection>?
    ) : super() {
        this.team = team
        this.gameSection = gameSection

    }

}