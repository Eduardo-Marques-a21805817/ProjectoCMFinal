package pt.ulusofona.deisi.cm2223.g21805817.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import pt.ulusofona.deisi.cm2223.g21805817.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({mostrarMainActivity()},3000)
        //val handler = handler().postDelayed({mostrarMainActivity()}, 3000)

    }

    private fun mostrarMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}