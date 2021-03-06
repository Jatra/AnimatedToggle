package uk.co.jatra.animatedtoggle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggle: View = findViewById(R.id.toggle)
        var selected = false
        toggle.setOnClickListener {
            selected =! selected
            toggle.isSelected = selected
        }
    }
}