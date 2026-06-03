package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val targetImage: ImageView = findViewById(R.id.targetImage)
        val targetImage2: ImageView = findViewById(R.id.targetImage2)

        findViewById<Button>(R.id.btnFadeIn).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnFadeOut).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnBlink).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.blink)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnZoomIn).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnZoomOut).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnRotate).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.rotate)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnMove).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.move)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnSlideUp).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnSlideDown).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnBounce).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.bounce)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnSequential).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.sequential)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnTogether).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.together)
            targetImage.startAnimation(anim)
        }

        findViewById<Button>(R.id.btnCrossFade).setOnClickListener {
            val fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            val fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)

            if (targetImage.visibility == View.VISIBLE) {
                targetImage.startAnimation(fadeOut)
                targetImage.visibility = View.GONE
                targetImage2.visibility = View.VISIBLE
                targetImage2.startAnimation(fadeIn)
            } else {
                targetImage2.startAnimation(fadeOut)
                targetImage2.visibility = View.GONE
                targetImage.visibility = View.VISIBLE
                targetImage.startAnimation(fadeIn)
            }
        }
    }
}
