/*********************************************************************
 * CLASS: CharacterInfo
 * PROGRAMMER: Bryan Butz
 * LOGON ID:   z1836033
 * TA: Harshith Desamsetti
 * DUE DATE:   4/15/2019
 *
 * FUNCTION:  This class contains the information(quotes) of the characters
 * used for the image buttons as well as creating an array of
 * the character's image files.
 */
package edu.niu.z1836033.streetfightermoves


object CharacterInfo {
    var description = arrayOf("Ryu\nHadouken", "Ken\nShoryuken", "Guile\nSonic Boom", "Sagat\nTiger Uppercut", "Ryu\nTatsumaki Senpuu Kyaku", "Dhalsim\nYoga Fire")
    var id = intArrayOf(R.drawable.ryu1, R.drawable.ken1, R.drawable.guile1,
            R.drawable.sagat1, R.drawable.ryu2, R.drawable.dhalsim1)
} //end CharacterInfo class
