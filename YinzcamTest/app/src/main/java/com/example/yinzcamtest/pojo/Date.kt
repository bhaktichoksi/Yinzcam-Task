package com.example.yinzcamtest.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Date : Serializable {
    @SerializedName("Numeric")
    @Expose
    var numeric: String? = null

    @SerializedName("Text")
    @Expose
    var text: String? = null

    @SerializedName("Time")
    @Expose
    var time: String? = null

    @SerializedName("Timestamp")
    @Expose
    var timestamp: String? = null

    @SerializedName("IsTBA")
    @Expose
    var isTBA: String? = null

    @SerializedName("IsTba")
    @Expose
    var isTba: String? = null


    constructor(
        numeric: String?,
        text: String?,
        time: String?,
        timestamp: String?,
        isTBA: String?,
        isTba: String?
    ) : super() {
        this.numeric = numeric
        this.text = text
        this.time = time
        this.timestamp = timestamp
        this.isTBA = isTBA
        this.isTba = isTba
    }

}