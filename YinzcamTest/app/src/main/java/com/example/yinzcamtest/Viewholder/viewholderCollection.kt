package com.example.yinzcamtest.Viewholder

import android.content.Context
import android.os.Build
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.yinzcamtest.R
import com.example.yinzcamtest.pojo.GameCollection
import com.squareup.picasso.Picasso
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class viewholderCollection(itemView: View) : RecyclerView.ViewHolder(itemView) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun bindItems(foCollection: GameCollection, context: Context?) {

        val txtName = itemView.findViewById(R.id.tvName) as TextView
        val txtOName = itemView.findViewById(R.id.tvOName) as TextView
        val txtTricode = itemView.findViewById(R.id.tvTricode) as TextView
        val txtOTricode = itemView.findViewById(R.id.tvOTricode) as TextView
        val txtRecord = itemView.findViewById(R.id.tvRecord) as TextView
        val txtORecord = itemView.findViewById(R.id.tvORecord) as TextView
        val txtDatetext = itemView.findViewById(R.id.tvDatetext) as TextView
        val txtDatetime = itemView.findViewById(R.id.tvDatetime) as TextView
        val txtWeek = itemView.findViewById(R.id.tvWeek) as TextView
        val txtVenue = itemView.findViewById(R.id.tvVenue) as TextView
        val txtGameState = itemView.findViewById(R.id.tvGamestate) as TextView
        val imgLogo = itemView.findViewById(R.id.img_logo) as ImageView
        val imgOPLogo = itemView.findViewById(R.id.img_op_logo) as ImageView

        if (foCollection != null) {

            txtName.setText(foCollection.team?.name)
            txtOName.setText(foCollection.opponent?.name)
            txtTricode.setText(foCollection.team?.triCode)
            txtOTricode.setText(foCollection.opponent?.triCode)
            txtRecord.setText(foCollection.team?.record)
            txtORecord.setText(foCollection.opponent?.record)

            val format = SimpleDateFormat("MMMM d, yyyy")
            val myFormat = "EEE, MMM d" //In which you need put here
            val sdf = SimpleDateFormat(myFormat, Locale.US)
            try {
                if (foCollection.date != null) {
                    val date = format.parse(foCollection.date!!.text)
                    val lsConvertedDate = sdf.format(date)
                    txtDatetext.setText(lsConvertedDate)
                }

            } catch (e: ParseException) {
                e.printStackTrace()
            }

            txtDatetime.setText(foCollection.date?.time)
            txtWeek.setText(foCollection.week)
            txtVenue.setText(foCollection.venue)
            txtGameState.setText(foCollection.gameState)

            val imageUri =
                "https://yc-app-resources.s3.amazonaws.com/nfl/logos/nfl_" + foCollection.opponent?.triCode?.toLowerCase() + "_light.png"
            Picasso.with(context).load(imageUri).into(imgOPLogo)

            val imgUri =
                "https://yc-app-resources.s3.amazonaws.com/nfl/logos/nfl_" + foCollection.team?.triCode?.toLowerCase() + "_light.png"
            Picasso.with(context).load(imgUri).into(imgLogo)
        }
    }
}