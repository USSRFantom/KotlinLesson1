package space.ussrfantom.kotlinlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloWorld()
    }
    fun helloWorld(){
       Log.i("HelloWorld", "Hello Kotlin!")
    }
}