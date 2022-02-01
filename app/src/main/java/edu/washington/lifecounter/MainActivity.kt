package edu.washington.lifecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var plusBtn1 : Button
    lateinit var minusBtn1: Button
    lateinit var plusFiveBtn1 : Button
    lateinit var minusFiveBtn1: Button
    lateinit var plusBtn2 : Button
    lateinit var minusBtn2: Button
    lateinit var plusFiveBtn2 : Button
    lateinit var minusFiveBtn2: Button
    lateinit var plusBtn3 : Button
    lateinit var minusBtn3: Button
    lateinit var plusFiveBtn3 : Button
    lateinit var minusFiveBtn3: Button
    lateinit var plusBtn4 : Button
    lateinit var minusBtn4: Button
    lateinit var plusFiveBtn4 : Button
    lateinit var minusFiveBtn4: Button
    lateinit var loss: EditText
    lateinit var lives1: EditText
    lateinit var lives2: EditText
    lateinit var lives3: EditText
    lateinit var lives4: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var life1 = 20
        var life2 = 20
        var life3 = 20
        var life4 = 20
        plusBtn1 = findViewById<Button>(R.id.plusBtn1)
        minusBtn1 = findViewById<Button>(R.id.minusBtn1)
        plusFiveBtn1 = findViewById<Button>(R.id.plusFiveBtn1)
        minusFiveBtn1 = findViewById<Button>(R.id.minusFiveBtn1)
        plusBtn2 = findViewById<Button>(R.id.plusBtn2)
        minusBtn2 = findViewById<Button>(R.id.minusBtn2)
        plusFiveBtn2 = findViewById<Button>(R.id.plusFiveBtn2)
        minusFiveBtn2 = findViewById<Button>(R.id.minusFiveBtn2)
        plusBtn3 = findViewById<Button>(R.id.plusBtn3)
        minusBtn3 = findViewById<Button>(R.id.minusBtn3)
        plusFiveBtn3 = findViewById<Button>(R.id.plusFiveBtn3)
        minusFiveBtn3 = findViewById<Button>(R.id.minusFiveBtn3)
        plusBtn4 = findViewById<Button>(R.id.plusBtn4)
        minusBtn4 = findViewById<Button>(R.id.minusBtn4)
        plusFiveBtn4 = findViewById<Button>(R.id.plusFiveBtn4)
        minusFiveBtn4 = findViewById<Button>(R.id.minusFiveBtn4)
        loss = findViewById<EditText>(R.id.loss)
        lives1 = findViewById<EditText>(R.id.lives1)
        lives2 = findViewById<EditText>(R.id.lives2)
        lives3 = findViewById<EditText>(R.id.lives3)
        lives4 = findViewById<EditText>(R.id.lives4)
        plusBtn1.setOnClickListener {
            life1 += 1
            lives1.setText(life1.toString())
        }
        plusBtn2.setOnClickListener {
            life2 += 1
            lives2.setText(life2.toString())
        }
        plusBtn3.setOnClickListener {
            life3 += 1
            lives3.setText(life3.toString())
        }
        plusBtn4.setOnClickListener {
            life4 += 1
            lives4.setText(life4.toString())
        }
        plusFiveBtn1.setOnClickListener {
            life1 += 5
            lives1.setText(life1.toString())
        }
        plusFiveBtn2.setOnClickListener {
            life2 += 5
            lives2.setText(life2.toString())
        }
        plusFiveBtn3.setOnClickListener {
            life3 += 5
            lives3.setText(life3.toString())
        }
        plusFiveBtn4.setOnClickListener {
            life4 += 5
            lives4.setText(life4.toString())
        }
        minusBtn1.setOnClickListener {
            life1 -= 1
            if (life1 > 0) {
                lives1.setText(life1.toString())
            } else {
                lives1.setText("0")
                loss.setText(R.string.player1Loss)
            }
        }
        minusBtn2.setOnClickListener {
            life2 -= 1
            if (life2 > 0) {
                lives2.setText(life2.toString())
            } else {
                lives2.setText("0")
                loss.setText(R.string.player2Loss)
            }
        }
        minusBtn3.setOnClickListener {
            life3 -= 1
            if (life3 > 0) {
                lives3.setText(life3.toString())
            } else {
                lives3.setText("0")
                loss.setText(R.string.player3Loss)
            }
        }
        minusBtn4.setOnClickListener {
            life4 -= 1
            if (life4 > 0) {
                lives4.setText(life4.toString())
            } else {
                lives4.setText("0")
                loss.setText(R.string.player4Loss)
            }
        }
        minusFiveBtn1.setOnClickListener {
            life1 -= 5
            if (life1 > 0) {
                lives1.setText(life1.toString())
            } else {
                lives1.setText("0")
                loss.setText(R.string.player1Loss)
            }
        }
        minusFiveBtn2.setOnClickListener {
            life2 -= 5
            if (life2 > 0) {
                lives2.setText(life2.toString())
            } else {
                lives2.setText("0")
                loss.setText(R.string.player2Loss)
            }
        }
        minusFiveBtn3.setOnClickListener {
            life3 -= 5
            if (life3 > 0) {
                lives3.setText(life3.toString())
            } else {
                lives3.setText("0")
                loss.setText(R.string.player3Loss)
            }
        }
        minusFiveBtn4.setOnClickListener {
            life4 -= 5
            if (life4 > 0) {
                lives4.setText(life4.toString())
            } else {
                lives4.setText("0")
                loss.setText(R.string.player4Loss)
            }
        }
    }
}