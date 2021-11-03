package com.example.yinzcamtest.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Game : Serializable {
    @SerializedName("Week")
    @Expose
    var week: String? = null

    @SerializedName("Venue")
    @Expose
    var venue: String? = null

    @SerializedName("GameState")
    @Expose
    var gameState: String? = null

    @SerializedName("ScheduleHeader")
    @Expose
    var scheduleHeader: String? = null

    @SerializedName("Date")
    @Expose
    var date: Date? = null

    @SerializedName("Opponent")
    @Expose
    var opponent: Opponent? = null

    @SerializedName("IsHome")
    @Expose
    var isHome: Boolean? = null

    @SerializedName("Result")
    @Expose
    var result: String? = null

    constructor(
        week: String?,
        venue: String?,
        gameState: String?,
        scheduleHeader: String?,
        date: Date?,
        opponent: Opponent?,
        isHome: Boolean?,
        result: String?
    ) : super() {
        this.week = week
        this.venue = venue
        this.gameState = gameState
        this.scheduleHeader = scheduleHeader
        this.date = date
        this.opponent = opponent
        this.isHome = isHome
        this.result = result

    }

}