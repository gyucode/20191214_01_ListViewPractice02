package com.example.a20191214_01_listviewpractice02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20191214_01_listviewpractice02.datas.GameData

class MainActivity : BaseActivity() {

    val gameList = ArrayList<GameData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        addGames()
    }

    fun addGames(){
        gameList.add(GameData("아스팔트 8 : 에어본", "Gameloft"))
        gameList.add(GameData("MineCraft - Pocket Edition", "Mojang"))
        gameList.add(GameData("아스팔트7 - 히트", "Gameloft"))
        gameList.add(GameData("팔라독", "FazeCat"))
        gameList.add(GameData("Plants VS. Zombie", "EA Swiss Sarl"))
        gameList.add(GameData("swampy", "Disney"))
    }

}
