package com.example.gameworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main4.*

class  Play(private val typ:Int=3)
{
    fun result():Int
    {
        return (1..typ).random()
    }
}



class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        btn_press.setOnClickListener{
            playResult()
            txt_result.isVisible=true
        }

        playResult()




    }


    private fun playResult(){
        val obj=Play()
        val ans: Int = obj.result()
//        var com: Int=0
//        var use: Int=0
        if(et_value.text.isNullOrEmpty())
        {
            txt_result.text="Invalid Entry"
            return
        }

        if(et_value.text.toString().toInt()>3 || et_value.text.toString().toInt()<=0)
        {
            txt_result.text="Invalid Entry"
            return
        }


        else if(et_value.text.toString().toInt()==ans)
        {
            txt_result.text="Draw"
        }

        else if(et_value.text.toString().toInt()==1 && ans==3)
        {
//            ++use
            txt_result.text="You Won!"
//            v_us.text=use.toString()
//            v_com.text=com.toString()
        }

        else if(et_value.text.toString().toInt()==2 && ans==1)
        {
//            ++use
            txt_result.text="You Won!"
//            v_us.text=use.toString()
//            v_com.text=com.toString()
        }

        else if(et_value.text.toString().toInt()==3 && ans==2)
        {
//            ++use
            txt_result.text="You Won!"
//            v_us.text=use.toString()
//            v_com.text=com.toString()
        }

        else
        {
//            ++com
            txt_result.text="You Lose!"
//            v_us.text=use.toString()
//            v_com.text=com.toString()
        }

        val image= when(ans)
        {
            1->R.drawable.rock
            2->R.drawable.paper
            else->R.drawable.scissors
        }

        img_result.setImageResource(image)

    }


}