package com.example.gameworld

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main3.*


class Coin(private val faces:Int=3){


    fun roll():Int {
        return(1..faces).random()
    }


}





class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        btn_toss.setOnClickListener{
            flipCoin()
            txt_result.isVisible = true
        }

        flipCoin()



    }


    private fun flipCoin() {
        val coin = Coin()
        val coin_roll: Int = coin.roll()

        if (et_value.text.isNullOrEmpty())
        {
            txt_result.text = "Invalid Entry"//dynamic setting of text
            return
        }

        if (et_value.text.toString().toInt() > 3 || et_value.text.toString().toInt() <= 0)
        {
            txt_result.text = "Invalid Entry"
            return
        }


        if (et_value.text.toString().toInt() == coin_roll)
        {
            txt_result.text = "You Won!"
        }
        else
        {
            txt_result.text = "You Lose!"
        }

        val image = when (coin_roll)
        {
            1 -> R.drawable.heads
            2 -> R.drawable.tails
            else -> R.drawable.draw
        }
        img_result.setImageResource(image)
        val mediaplayer: MediaPlayer = MediaPlayer.create(this ,R.raw.coinutoss)
        mediaplayer.start()
    }






}