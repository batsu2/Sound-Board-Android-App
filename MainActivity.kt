/*********************************************************************
 * FILE:  Street Fighter Moves
 * PROGRAMMER: Bryan Butz
 * LOGON ID:   z1836033
 * TA: Harshith Desamsetti
 * DUE DATE:   4/15/2019
 *
 * FUNCTION:   This app displays images of characters from the popular
 *             video game Street Fighter and, upon the user selecting
 *             a character, will play an audio clip of that character's
 *             move.
 */
package edu.niu.z1836033.streetfightermoves

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout

class MainActivity : Activity() {
    private var gallery: LinearLayout? = null
    private var hadoukenMP: MediaPlayer? = null
    private var shoryukenMP: MediaPlayer? = null
    private var sonicBoomMP: MediaPlayer? = null
    private var tigerUppercutMP: MediaPlayer? = null
    private var tatsumakiMP: MediaPlayer? = null
    private var yogaFireMP: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gallery = findViewById(R.id.characterLayout)

        //create the MediaPlayer for the ukulele MP3 and connect the audio
        hadoukenMP = MediaPlayer()
        hadoukenMP = MediaPlayer.create(this, R.raw.hadouken)
        shoryukenMP = MediaPlayer()
        shoryukenMP = MediaPlayer.create(this, R.raw.shoryuken)
        sonicBoomMP = MediaPlayer()
        sonicBoomMP = MediaPlayer.create(this, R.raw.sonic_boom)
        tigerUppercutMP = MediaPlayer()
        tigerUppercutMP = MediaPlayer.create(this, R.raw.tiger_uppercut)
        tatsumakiMP = MediaPlayer()
        tatsumakiMP = MediaPlayer.create(this, R.raw.tatsumaki_senpuu_kyaku)
        yogaFireMP = MediaPlayer()
        yogaFireMP = MediaPlayer.create(this, R.raw.yoga_fire)
        fillGallery()
    } //end onCreate

    private fun fillGallery() {
        var characterIB: ImageButton
        for (i in 0..5) {
            //create the ImageButton
            characterIB = ImageButton(this)

            //create a Character object
            val character = Character(CharacterInfo.description[i], CharacterInfo.id[i])

            //put the information for the Character on the ImageButton
            characterIB.setContentDescription(character.characterDescription)
            characterIB.setImageResource(character.characterID)

            //handle the clicking of the imageButton
            characterIB.setOnClickListener { v ->
                val descrip = v.contentDescription as String
                when (descrip) {
                    "Ryu\nHadouken" -> hadoukenMP?.start()
                    "Ken\nShoryuken" -> shoryukenMP?.start()
                    "Guile\nSonic Boom" -> sonicBoomMP?.start()
                    "Sagat\nTiger Uppercut" -> tigerUppercutMP?.start()
                    "Ryu\nTatsumaki Senpuu Kyaku" -> tatsumakiMP?.start()
                    "Dhalsim\nYoga Fire" -> yogaFireMP?.start()
                    else -> {}
                }
            }

            //add the imageButton to the linearLayout
            gallery?.addView(characterIB)
        } //end for loop
    } //end fillGallery
} //end MainActivity
