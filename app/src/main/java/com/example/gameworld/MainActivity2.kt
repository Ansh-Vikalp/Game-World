package com.example.gameworld

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val rollButton: Button = findViewById(R.id.button)


        rollButton.setOnClickListener {
            rollDice()
            image7.isVisible=true
            player()}

    }


    private fun player(){
        val mediaplayer: MediaPlayer = MediaPlayer.create(this ,R.raw.mym)
        mediaplayer.start()
//        mediaplayer.release()
//        mediaplayer.isLooping() = true



    }

    private fun rollDice() {
        val dice = Dice(6)//Object created
        val diceRoll = dice.roll()//Storing value of fun call
        val diceImage: ImageView = findViewById(R.id.image7)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
    }

}

class Dice(private val numSides: Int) {
    //Created a function that roll a dice and return random value
    fun roll(): Int {
        return (1..numSides).random()
    }
}