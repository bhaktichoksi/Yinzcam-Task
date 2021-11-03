package com.example.yinzcamtest


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yinzcamtest.adapter.YinzcamListAdapter
import com.example.yinzcamtest.pojo.Game
import com.example.yinzcamtest.pojo.GameCollection
import com.example.yinzcamtest.pojo.Yinzcam
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    internal var moAdapter: YinzcamListAdapter? = null
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.rvCollectionList)
        getYinzcamData()

    }

    private fun getYinzcamData(): ArrayList<GameCollection> {
        var gamecollectionList = ArrayList<GameCollection>()

        val ROOT_URL = "http://files.yinzcam.com.s3.amazonaws.com/iOS/interviews/ScheduleExercise/"
        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        fun getApiService(): Api {
            return getRetrofitInstance().create(Api::class.java)
        }

        val api = getApiService()
        val call = api.getYinzcam()

        call?.enqueue(object : Callback<Yinzcam> {
            override fun onFailure(call: Call<Yinzcam>, t: Throwable?) {

            }

            override fun onResponse(call: Call<Yinzcam>, response: Response<Yinzcam>) {

                if (response != null) {
                    if (response.isSuccessful) {

                        var game: List<Game>? = null
                        var gameList: Game
                        var GameSections = response.body().gameSection
                        if (GameSections != null) {
                            for (i in 0 until GameSections.size) {
                                var sectionList = GameSections.get(i)

                                if (sectionList != null) {
                                    game = sectionList.game

                                    if (game != null) {
                                        for (j in 0 until game.size) {
                                            gameList = game.get(j)

                                            if (gameList != null) {

                                                gamecollectionList.add(
                                                    GameCollection(
                                                        response.body().team,
                                                        gameList.opponent,
                                                        gameList.date,
                                                        gameList.week,
                                                        gameList.venue,
                                                        gameList.isHome,
                                                        gameList.gameState
                                                    )
                                                )

                                                moAdapter = YinzcamListAdapter(gamecollectionList)

                                                recyclerView.adapter = moAdapter
                                                recyclerView.layoutManager = LinearLayoutManager(
                                                    applicationContext,
                                                    RecyclerView.VERTICAL,
                                                    false
                                                )

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        })

        return gamecollectionList
    }

}