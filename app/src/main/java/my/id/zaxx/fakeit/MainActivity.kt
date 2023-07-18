package my.id.zaxx.fakeit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import my.id.zaxx.fakeit.api.FakeApi

class MainActivity : AppCompatActivity() {
    lateinit var buttonGet :Button
    lateinit var textGet : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textGet = findViewById(R.id.get_name)
        buttonGet = findViewById(R.id.btn_get)

        buttonGet.setOnClickListener {
            var nameText = textGet

        }

    }
}