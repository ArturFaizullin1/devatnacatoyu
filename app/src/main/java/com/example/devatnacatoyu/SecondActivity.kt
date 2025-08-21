package com.example.devatnacatoyu

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.animation.AnimationUtils
import net.objecthunter.exp4j.ExpressionBuilder
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val result: TextView = findViewById<TextView>(R.id.result)
        val operation: TextView = findViewById<TextView>(R.id.operation)
        val b_sqrt: TextView = findViewById<TextView>(R.id.b_sqrt)
        val b_log2: TextView = findViewById<TextView>(R.id.b_log2)
        val b_in: TextView = findViewById<TextView>(R.id.b_in)
        val b_lestb: TextView = findViewById<TextView>(R.id.b_leftb)
        val b_rightb: TextView = findViewById<TextView>(R.id.b_rightb)
        val b_xy: TextView = findViewById<TextView>(R.id.b_xy)
        val b_AC: TextView = findViewById<TextView>(R.id.b_AC)
        val b_back: TextView = findViewById<TextView>(R.id.b_back)
        val b_percent: TextView = findViewById<TextView>(R.id.b_percent)
        val b_delenie: TextView = findViewById<TextView>(R.id.b_delenie)
        val b_sin: TextView = findViewById<TextView>(R.id.b_sin)
        val b_seven: TextView = findViewById<TextView>(R.id.b_seven)
        val b_eith: TextView = findViewById<TextView>(R.id.b_eith)
        val b_nine: TextView = findViewById<TextView>(R.id.b_nine)
        val b_umnoj: TextView = findViewById<TextView>(R.id.b_umnoj)
        val b_cos: TextView = findViewById<TextView>(R.id.b_cos)
        val b_for: TextView = findViewById<TextView>(R.id.b_for)
        val b_five: TextView = findViewById<TextView>(R.id.b_five)
        val b_six: TextView = findViewById<TextView>(R.id.b_six)
        val b_minus: TextView = findViewById<TextView>(R.id.b_minus)
        val b_pi: TextView = findViewById<TextView>(R.id.b_pi)
        val b_one: TextView = findViewById<TextView>(R.id.b_one)
        val b_two: TextView = findViewById<TextView>(R.id.b_two)
        val b_three: TextView = findViewById<TextView>(R.id.b_three)
        val b_plus: TextView = findViewById<TextView>(R.id.b_plus)
        val b_ee: TextView = findViewById<TextView>(R.id.b_ee)
        val b_noool: TextView = findViewById<TextView>(R.id.b_noool)
        val b_tochka: TextView = findViewById<TextView>(R.id.b_tochka)
        val b_nol: TextView = findViewById<TextView>(R.id.b_nol)
        val b_ravno: TextView = findViewById<TextView>(R.id.b_ravno)

        b_sqrt.setOnClickListener {
            operation.append("sqrt(")
            val animation = AnimationUtils.LoadAnimation(context, R.anim.button_press_animation)
            it.startAnimation(animation)
        }
        b_log2.setOnClickListener {
            operation.append("log2(")
        }
        b_in.setOnClickListener {
            operation.append("in(")
        }
        b_lestb.setOnClickListener {
            operation.append("(")
        }
        b_rightb.setOnClickListener {
            operation.append(")")
        }
        b_xy.setOnClickListener {
            operation.append("x*y")
        }
        b_percent.setOnClickListener {
            operation.append("%")
        }
        b_delenie.setOnClickListener {
            operation.append("/")
        }
        b_sin.setOnClickListener {
            operation.append("sin(")
        }
        b_seven.setOnClickListener {
            operation.append("7")
        }
        b_eith.setOnClickListener {
            operation.append("8")
        }
        b_nine.setOnClickListener {
            operation.append("9")
        }
        b_umnoj.setOnClickListener {
            operation.append("*")
        }
        b_cos.setOnClickListener {
            operation.append("cos(")
        }
        b_for.setOnClickListener {
            operation.append("4")
        }
        b_five.setOnClickListener {
            operation.append("5")
        }
        b_six.setOnClickListener {
            operation.append("6")
        }
        b_minus.setOnClickListener {
            operation.append("-")
        }
        b_pi.setOnClickListener {
            operation.append("pi")
        }
        b_one.setOnClickListener {
            operation.append("1")
        }
        b_two.setOnClickListener {
            operation.append("2")
        }
        b_three.setOnClickListener {
            operation.append("3")
        }
        b_plus.setOnClickListener {
            operation.append("+")
        }
        b_ee.setOnClickListener {
            operation.append("e")
        }
        b_noool.setOnClickListener {
            operation.append("000")
        }
        b_tochka.setOnClickListener {
            operation.append(".")
        }
        b_nol.setOnClickListener {
            operation.append("0")
        }
        b_ravno.setOnClickListener {
            val optext = operation.text.toString()
            if (optext != "") {
                try {
                    val expr = ExpressionBuilder(operation.text.toString()).build()
                    val res = expr.evaluate()
                    val longers = res.toLong()
                    if (longers.toDouble() == res) {
                        result.text = longers.toString()
                    } else {
                        result.text = res.toString()
                    }
                } catch (e: Exception) {
                    result.text = "Error"
                }
            }
        }
        b_back.setOnClickListener {
            val s = operation.text.toString()
            if (s != "") {
                operation.text = s.substring(0, s.length - 1)
            }
        }
        b_AC.setOnClickListener {
            operation.text = ""
            result.text = ""
        }
        result.setOnClickListener {
            val restext = result.text.toString()
            if (restext != "Error" && restext != "") {
                operation.text = restext
                result.text = ""
            }
        }
    }
}
