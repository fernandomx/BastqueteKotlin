package com.example.basquete

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    private var pontuacaoTimeA: Int = 0
    private var pontuacaoTimeB: Int = 0
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TIME A - BOTOES
        var botaoTresPontosTimeA: Button = findViewById(R.id.tresPontosA)
        botaoTresPontosTimeA.setOnClickListener { addTresPontosTimeA() }
        var botaoDoisPontosTimeA: Button = findViewById(R.id.doisPontosA)
        botaoDoisPontosTimeA.setOnClickListener { addDoisPontosTimeA() }
        var botaoTiroLivreTimeA: Button = findViewById(R.id.tiroLivreA)
        botaoTiroLivreTimeA.setOnClickListener { addUmPontoTimeA() }

        //TIME B - BOTOES
        var botaoTresPontosTimeB: Button = findViewById(R.id.tresPontosB)
        botaoTresPontosTimeB.setOnClickListener { addTresPontosTimeB() }
        var botaoDoisPontosTimeB: Button = findViewById(R.id.doisPontosB)
        botaoDoisPontosTimeB.setOnClickListener { addDoisPontosTimeB() }
        var botaoTiroLivreTimeB: Button = findViewById(R.id.tiroLivreB)
        botaoTiroLivreTimeB.setOnClickListener { addUmPontoTimeB() }

        //REINICIAR PARTIDA - BOTÃO
        var botaoReiniciarPartida: Button = findViewById(R.id.reiniciarPartida)
        botaoReiniciarPartida.setOnClickListener { reiniciarPartida() }

        //FINALIZAR PARTIDA - BOTAO
        var botaoFinalizarPartida: Button = findViewById(R.id.FinalizarPartida)

        botaoFinalizarPartida.setOnClickListener { finalizarPartida(pontuacaoTimeA, pontuacaoTimeB) }


    }


    fun mostrarPlacarTimeA(pontuacao: Int){
        var placarTimeA: TextView = findViewById(R.id.placarTimeA)
        placarTimeA.text = pontuacao.toString()
    }

    fun mostrarPlacarTimeB(pontuacao: Int){
        var placarTimeB: TextView = findViewById(R.id.placarTimeB)
        placarTimeB.text = pontuacao.toString()
    }

    fun reiniciarPartida(){

        pontuacaoTimeA = 0
        pontuacaoTimeB = 0
        mostrarPlacarTimeA(pontuacaoTimeA)
        mostrarPlacarTimeB(pontuacaoTimeB)

    }

    fun finalizarPartida(placarA: Int, placarB: Int){



        if (placarA > placarB) {
            Toast.makeText(this, "Time A Venceu!", Toast.LENGTH_SHORT).show()
        } else if (placarB > placarA) {
            Toast.makeText(this, "Time B Venceu!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Times Empataram!", Toast.LENGTH_SHORT).show()
        }
        reiniciarPartida()
    }

    // metodos time A
    fun addTresPontosTimeA(){
        pontuacaoTimeA += 3
        mostrarPlacarTimeA(pontuacaoTimeA)
    }

    fun addDoisPontosTimeA(){
        pontuacaoTimeA +=2
        mostrarPlacarTimeA(pontuacaoTimeA)
    }

    fun addUmPontoTimeA(){
        pontuacaoTimeA +=1
        mostrarPlacarTimeA(pontuacaoTimeA)
    }


    //metodos time b
    fun addTresPontosTimeB(){
        pontuacaoTimeB += 3
        mostrarPlacarTimeB(pontuacaoTimeB)
    }
    fun addDoisPontosTimeB(){
        pontuacaoTimeB +=2
        mostrarPlacarTimeB(pontuacaoTimeB)
    }
    fun addUmPontoTimeB(){
        pontuacaoTimeB +=1
        mostrarPlacarTimeB(pontuacaoTimeB)
    }




}