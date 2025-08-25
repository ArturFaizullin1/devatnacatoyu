package com.example.devatnacatoyu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.devatnacatoyu.databinding.FragmentCalculatorBinding
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorFragment : Fragment() {

    private var binding: FragmentCalculatorBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalculatorBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            bSqrt.setOnClickListener {
                operation.append("sqrt(")
            }
            bLog2.setOnClickListener {
                operation.append("log2")
            }
            bIn.setOnClickListener {
                operation.append("in(")
            }
            bLeftb.setOnClickListener {
                operation.append("(")
            }
            bRightb.setOnClickListener {
                operation.append(")")
            }
            bXy.setOnClickListener {
                operation.append("x*y")
            }
            bPercent.setOnClickListener {
                operation.append("%")
            }
            bDelenie.setOnClickListener {
                operation.append("/")
            }
            bSin.setOnClickListener {
                operation.append("sin(")
            }
            bSeven.setOnClickListener {
                operation.append("7")
            }
            bEith.setOnClickListener {
                operation.append("8")
            }
            bNine.setOnClickListener {
                operation.append("9")
            }
            bUmnoj.setOnClickListener {
                operation.append("*")
            }
            bCos.setOnClickListener {
                operation.append("cos(")
            }
            bFor.setOnClickListener {
                operation.append("4")
            }
            bFive.setOnClickListener {
                operation.append("5")
            }
            bSix.setOnClickListener {
                operation.append("6")
            }
            bMinus.setOnClickListener {
                operation.append("-")
            }
            bPi.setOnClickListener {
                operation.append("pi")
            }
            bOne.setOnClickListener {
                operation.append("1")
            }
            bTwo.setOnClickListener {
                operation.append("2")
            }
            bThree.setOnClickListener {
                operation.append("3")
            }
            bPlus.setOnClickListener {
                operation.append("+")
            }
            bEe.setOnClickListener {
                operation.append("e")
            }
            bNoool.setOnClickListener {
                operation.append("000")
            }
            bTochka.setOnClickListener {
                operation.append(".")
            }
            bNol.setOnClickListener {
                operation.append("0")
            }
            bRavno.setOnClickListener {
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
            bBack.setOnClickListener {
                val s = operation.text.toString()
                if (s != "") {
                    operation.text = s.substring(0, s.length - 1)
                }
            }
            bAC.setOnClickListener {
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
}