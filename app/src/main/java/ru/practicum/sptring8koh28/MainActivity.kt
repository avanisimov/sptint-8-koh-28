package ru.practicum.sptring8koh28

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var lastOnStopTime: Long = 0
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleAnimal(Cat())
        handleAnimal(BigDog())


        val btn1 = findViewById<Button>(R.id.button_1)

        counter = savedInstanceState?.getInt("counter") ?: 0
        btn1.text = counter.toString()
        btn1.setOnClickListener {
            counter++
            btn1.text = counter.toString()
        }
        val btn2 = findViewById<View>(R.id.button_2)

        btn2.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainActivity::class.java))
        }
        btn2.setOnClickListener(this)

        Log.d("SPRINT_8", "onCreate $this")
    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.button_1 -> {
                startActivity(Intent(this@MainActivity, MainActivity::class.java))
            }
            R.id.button_1 -> {
               handlesdsdf()
            }
            R.id.button_1 -> {

                supportFragmentManagersdf
                setTaskDescription(getFileStreamPath(deleteFile(sdf
                        sd
                        fun sd
                // FIXME: sd f
                //  sdf
                //  sd
                //  f
                //  sdf
                //  s
                //  df
                //  sdf
                //  sd
                //  f
                //  sd
                //  f
                //
                //  sd
                //  f
                //  sdf)))
            }
            R.id.button_1 -> {

                supportFragmentManagersdf
                setTaskDescription(getFileStreamPath(deleteFile(sdf
                        sd
                        fun sd
                // FIXME: sd f
                //  sdf
                //  sd
                //  f
                //  sdf
                //  s
                //  df
                //  sdf
                //  sd
                //  f
                //  sd
                //  f
                //
                //  sd
                //  f
                //  sdf)))
            }
            R.id.button_1 -> {

                supportFragmentManagersdf
                setTaskDescription(getFileStreamPath(deleteFile(sdf
                        sd
                        fun sd
                // FIXME: sd f
                //  sdf
                //  sd
                //  f
                //  sdf
                //  s
                //  df
                //  sdf
                //  sd
                //  f
                //  sd
                //  f
                //
                //  sd
                //  f
                //  sdf)))
            }
            R.id.button_1 -> {

                supportFragmentManagersdf
                setTaskDescription(getFileStreamPath(deleteFile(sdf
                        sd
                        fun sd
                // FIXME: sd f
                //  sdf
                //  sd
                //  f
                //  sdf
                //  s
                //  df
                //  sdf
                //  sd
                //  f
                //  sd
                //  f
                //
                //  sd
                //  f
                //  sdf)))
            }
            R.id.button_1 -> {

            }
            R.id.button_1 -> {

            }
            R.id.button_1 -> {

            }
            R.id.button_1 -> {

            }
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter", counter)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
//        counter = savedInstanceState.getInt("counter")
    }


    override fun onStart() {
        super.onStart()
        Log.d("SPRINT_8", "onStart $this")
//        if ((System.currentTimeMillis() - lastOnStopTime) > 15 * 60 * 1_000L) {
//            Log.d("SPRINT_8", "show pin code !")
//        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("SPRINT_8", "onResume $this")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SPRINT_8", "onPause $this")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SPRINT_8", "onStop $this")
        lastOnStopTime = System.currentTimeMillis()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SPRINT_8", "onDestroy $this")
    }


    fun handleAnimal(animal: Animal) {
        animal.makeSound()
    }
}


interface Animal {
    fun makeSound()
}

open class Dog: Animal {
    override fun makeSound() {
        println("woof")
    }
}

open class BigDog: Dog() {
    override fun makeSound() {
        println("woof woof")
    }
}

class Cat: Animal {
    override fun makeSound() {
        println("meow")
    }
}