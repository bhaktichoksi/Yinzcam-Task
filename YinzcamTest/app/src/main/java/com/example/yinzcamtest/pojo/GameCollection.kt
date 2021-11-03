package com.example.yinzcamtest.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class GameCollection : Serializable {


    @SerializedName("Team")
    @Expose
    var team: Team? = null

    @SerializedName("Opponent")
    @Expose
    var opponent: Opponent? = null

    @SerializedName("Date")
    @Expose
    var date: Date? = null

    @SerializedName("Week")
    @Expose
    var week: String? = null

    @SerializedName("Venue")
    @Expose
    var venue: String? = null

    @SerializedName("IsHome")
    @Expose
    var isHome: Boolean? = null

    @SerializedName("GameState")
    @Expose
    var gameState: String? = null

    constructor(
            team: Team?,
            opponent: Opponent?,
            date: Date?,
            week: String?,
            venue: String?,
            isHome: Boolean?,
            gameState: String?
    ) : super() {
        this.team = team
        this.opponent = opponent
        this.date = date
        this.week = week
        this.venue = venue
        this.isHome = isHome
        this.gameState = gameState
    }

}