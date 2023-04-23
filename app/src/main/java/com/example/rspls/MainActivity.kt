package com.example.rspls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.rspls.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var p1 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        val rand = Random(System.nanoTime())
        return (start..end).random(rand)
    }

    fun btnRock_Click(view: View) {
        p1 = 1
        binding.imgPl.setImageResource(R.drawable.rock)
        binding.imgPl2.setImageResource(R.drawable.start)
        binding.imgInfo.setImageResource(R.drawable.kinfo)
    }

    fun btnScissor_Click(view: View) {
        p1 = 2
        binding.imgPl.setImageResource(R.drawable.scissors)
        binding.imgPl2.setImageResource(R.drawable.start)
        binding.imgInfo.setImageResource(R.drawable.kinfo)
    }

    fun btnPaper_Click(view: View) {
        p1 = 3
        binding.imgPl.setImageResource(R.drawable.paper)
        binding.imgPl2.setImageResource(R.drawable.start)
        binding.imgInfo.setImageResource(R.drawable.kinfo)
    }

    fun btnLizard_Click(view: View) {
        p1 = 4
        binding.imgPl.setImageResource(R.drawable.lizard)
        binding.imgPl2.setImageResource(R.drawable.start)
        binding.imgInfo.setImageResource(R.drawable.kinfo)
    }

    fun btnSpok_Click(view: View) {
        p1 = 5
        binding.imgPl.setImageResource(R.drawable.spok)
        binding.imgPl2.setImageResource(R.drawable.start)
        binding.imgInfo.setImageResource(R.drawable.kinfo)
    }

    fun btnStart_Click(view: View) {
        val start = 1
        val end = 5
        val p2 = rand(start, end)
        if (p1 == 0) {
            binding.txtResult.text = "Выберите значение"
        } else
            when (p2) {
                1 -> binding.imgPl2.setImageResource(R.drawable.rock)
//                    iv2.setImageResource(R.drawable.rock)
                2 -> binding.imgPl2.setImageResource(R.drawable.scissors)
                3 -> binding.imgPl2.setImageResource(R.drawable.paper)
                4 -> binding.imgPl2.setImageResource(R.drawable.lizard)
                5 -> binding.imgPl2.setImageResource(R.drawable.spok)
            }
        if (p1 != 0) {
            if ((p1 == 1 && p2 == 1) || (p1 == 2 && p2 == 2) || (p1 == 3 && p2 == 3) || (p1 == 4 && p2 == 4) || (p1 == 5 && p2 == 5)) {
                binding.txtResult.text = "Ничья"
            } else if ((p1 == 1 && p2 == 3) || (p1 == 1 && p2 == 4) || (p1 == 2 && p2 == 1) || (p1 == 2 && p2 == 5) || (p1 == 3 && p2 == 2) || (p1 == 3 && p2 == 4)
                || (p1 == 4 && p2 == 2) || (p1 == 4 && p2 == 5) || (p1 == 5 && p2 == 1) || (p1 == 5 && p2 == 3)
            ) {
                binding.txtResult.text = "Ты выйграл"
            } else if ((p1 == 3 && p2 == 1) || (p1 == 4 && p2 == 1) || (p1 == 1 && p2 == 2) || (p1 == 5 && p2 == 2) || (p1 == 2 && p2 == 3) || (p1 == 4 && p2 == 3)
                || (p1 == 2 && p2 == 4) || (p1 == 5 && p2 == 4) || (p1 == 1 && p2 == 5) || (p1 == 3 && p2 == 5)
            ) {
                binding.txtResult.text = "Ты проиграл"
            }
        }
        if (p1 == p2) {
            binding.imgInfo.setImageResource(R.drawable.ii)
        } else if ((p1 == 1 && p2 == 3) || (p1 == 3 && p2 == 1)) {
            binding.imgInfo.setImageResource(R.drawable.rockwinscissors)
        } else if ((p1 == 1 && p2 == 4) || (p1 == 4 && p2 == 1)) {
            binding.imgInfo.setImageResource(R.drawable.rockwinlizard)
        } else if ((p1 == 2 && p2 == 1) || (p1 == 1 && p2 == 2)) {
            binding.imgInfo.setImageResource(R.drawable.paperwinrock)
        } else if ((p1 == 2 && p2 == 5) || (p1 == 5 && p2 == 2)) {
            binding.imgInfo.setImageResource(R.drawable.paperwinspok)
        } else if ((p1 == 3 && p2 == 2) || (p1 == 2 && p2 == 3)) {
            binding.imgInfo.setImageResource(R.drawable.scissorswinpaper)
        } else if ((p1 == 3 && p2 == 4) || (p1 == 4 && p2 == 3)) {
            binding.imgInfo.setImageResource(R.drawable.scissorswinlizard)
        } else if ((p1 == 4 && p2 == 2) || (p1 == 2 && p2 == 4)) {
            binding.imgInfo.setImageResource(R.drawable.lizardwinpaper)
        } else if ((p1 == 4 && p2 == 5) || (p1 == 5 && p2 == 4)) {
            binding.imgInfo.setImageResource(R.drawable.lizardwinspok)
        } else if ((p1 == 5 && p2 == 1) || (p1 == 1 && p2 == 5)) {
            binding.imgInfo.setImageResource(R.drawable.spokwinrock)
        } else if ((p1 == 5 && p2 == 3) || (p1 == 3 && p2 == 5)) {
            binding.imgInfo.setImageResource(R.drawable.spokwinscissor)
        }
    }
}