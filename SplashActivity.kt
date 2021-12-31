/*********************************************************************
 * CLASS:  SplashActivity
 * PROGRAMMER: Bryan Butz
 * LOGON ID:   z1836033
 * TA: Harshith Desamsetti
 * DUE DATE:   4/15/2019
 *
 * FUNCTION:   This class acts as a splash screen for the main app.
 */
package edu.niu.z1836033.streetfightermoves

import android.app.Activity
import android.os.Bundle
import edu.niu.z1836033.streetfightermoves.R
import android.content.Intent
import edu.niu.z1836033.streetfightermoves.MainActivity
import java.util.*

class SplashActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        //Create the TimerTask
        val task: TimerTask = object : TimerTask() {
            override fun run() {
                //Finish the activity
                finish()

                //Go to the MainActivity
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            }
        } //end TimerTask


        //Create Timer object
        val timer = Timer()


        //create the schedule
        timer.schedule(task, 5000)
    } //end onCreate
} //end SplashActivity
