package it.eclettici.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/*
* Questa attività permette all'utente di tirare un dado (to roll a dice) e vedere il
* risultato sullo schermo.
*
* This activity allows the user to roll a dice and view the result
* on the screen.
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /*
    * Tirare il dado med aggiornare il risultato sullo schermo.
    *
    * Roll the dice and update the screen with the result.
    * */
    private fun rollDice() {
        // crea un nuovo oggetto di tipo Dice con 6 facciare del dado e lancia il dado
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Aggiorna lo schermo con il lancio del dado
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}