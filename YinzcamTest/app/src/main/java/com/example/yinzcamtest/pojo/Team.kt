package com.example.yinzcamtest.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Team : Serializable {
    @SerializedName("TriCode")
    @Expose
    var triCode: String? = null

    @SerializedName("FullName")
    @Expose
    var fullName: String? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("City")
    @Expose
    var city: String? = null

    @SerializedName("Record")
    @Expose
    var record: String? = null

    @SerializedName("Wins")
    @Expose
    var wins: String? = null

    @SerializedName("Losses")
    @Expose
    var losses: String? = null

    @SerializedName("WinPercentage")
    @Expose
    var winPercentage: String? = null


    constructor(
        triCode: String?,
        fullName: String?,
        name: String?,
        city: String?,
        record: String?,
        wins: String?,
        losses: String?,
        winPercentage: String?
    ) : super() {
        this.triCode = triCode
        this.fullName = fullName
        this.name = name
        this.city = city
        this.record = record
        this.wins = wins
        this.losses = losses
        this.winPercentage = winPercentage
    }

}