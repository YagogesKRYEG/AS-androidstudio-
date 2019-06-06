package br.com.psgraduao

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler() . postDelayed({
            var tela = Intent(this, MainActivity::class.java)
            startActivity(tela)
        }, 2000)
    }
}
