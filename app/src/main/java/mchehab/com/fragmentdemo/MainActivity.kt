package mchehab.com.fragmentdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val helloFragment = HelloFragment()
    val helloSecondFragment = HelloSecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            fragmentManager.beginTransaction().add(R.id.frameLayout, helloFragment).commit()
            fragmentManager.beginTransaction().add(R.id.frameLayoutSecond, helloSecondFragment).commit()
        }
    }
}