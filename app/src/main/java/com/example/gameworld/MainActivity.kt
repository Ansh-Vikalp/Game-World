package com.example.gameworld

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.ght)
        mediaPlayer.start()
        mediaPlayer.setLooping(true)

        btn_dice.setOnClickListener{
            val intentone = Intent(this,MainActivity2::class.java)
            startActivity(intentone)
        }

        btn_coin.setOnClickListener{
            val intenttwo = Intent(this,MainActivity3::class.java)
            startActivity(intenttwo)
        }

        btn_rock.setOnClickListener{
            val intentthree = Intent(this,MainActivity4::class.java)
            startActivity(intentthree)
        }


    }
}