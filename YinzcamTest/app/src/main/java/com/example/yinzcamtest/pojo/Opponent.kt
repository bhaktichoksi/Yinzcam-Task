package com.example.yinzcamtest.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Opponent : Serializable {
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

    constructor(
        triCode: String?,
        fullName: String?,
        name: String?,
        city: String?,
        record: String?
    ) : super() {
        this.triCode = triCode
        this.fullName = fullName
        this.name = name
        this.city = city
        this.record = record
    }

}