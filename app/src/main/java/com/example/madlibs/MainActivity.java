package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;
    private EditText etWarrior;
    private EditText etMage;
    private EditText etKing;
    private EditText etKingdom;
    private EditText etColor;
    private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connects the instance variables to the layout files
        tvTitle = findViewById(R.id.tv_title);
        etWarrior = findViewById(R.id.et_warrior);
        etMage = findViewById(R.id.et_mage);
        etKing = findViewById(R.id.et_king);
        etKingdom = findViewById(R.id.et_kingdom);
        etColor = findViewById(R.id.et_color);
        btnCreate = findViewById(R.id.btn_create);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String story = "";
                story += "At a snowy mountain, two shadowy figures stood in front of a colossal stone gate. ";
                story += "One is clad in crimson armor. Their name is " + etWarrior.getText() + ". ";
                story += "The other is draped in a silver robe. Their name is " + etMage.getText() + ". ";
                story += "Hailing from the kingdom of " + etKingdom.getText() + ", they strive to slay the wicked dragon. ";
                story += "The mage, holding their grimoire, force the heavy gate open. ";
                story += "\n\nAs they enter, the stone gate closes behind them, leaving them in darkness. ";
                story += "Suddenly, a ball of blue flames launches towards them!" + etWarrior.getText() + " stands upright and slashes their sword at the projectile. ";
                story += "The fireball split in half, burning the walls beside them.";
                story += "A loud roar echoes in the chamber. Torches on the moldy walls lit up with a ghastly blue flame. ";
                story += "\n\nWith the flames restoring their vision, the two heroes see the behemoth before them. ";
                story += "A dragon covered with obsidian scales lay atop of a mountain of gold. ";
                story += "Sparing no time, " + etWarrior.getText() + " unsheathes their sword and rushes to face the dragon. ";
                story += "\n\n\"For the king! For the eternal rule of king " + etKing.getText() + "!\" yells the warrior. ";
                story += "\n\nThe moment " + etWarrior.getText() + " charged, strange words spills out of the mage's mouth. ";
                story += "The grimoire glows menacingly in response. ";
                story += "As sword and claws clash, a heavy force pushes down on the dragon. ";
                story += "It glares at the puny human in silver. Fire starts condensing in its mouth but was kept occupied by the warrior. ";
                story += "Very quickly the dragon becomes riddled with wounds. Sensing its demise, the dragon stops attacking. ";
                story += "\n\nAn ominous rumble fills the chamber hall. The torches dim — cracks appearing on the walls. ";
                story += "Chills ran down " + etMage.getText() + "'s back. They knew what was happening. ";
                story += "\n\n\"Get back here!\" " + etMage.getText() + " calls out. ";
                story += "\n\n" + etWarrior.getText() + "doesn't question them and retreats from the dragon. ";
                story += "" + etMage.getText() + " draws symbols in the air in quick succession while chanting. ";
                story += "Half of the pages in " + etMage.getText() + "'s grimoire bursts into flames. ";
                story += "Waves of mana emanates from their body causing a thick, opaque barrier to form around them. ";
                story += "At the same time, the dragon crouches into a huddle. A deep blue seeps out in between its scales. ";
                story += "\n\nSuddenly the rumbling stops. A second later, the dragon explodes with a blinding light. ";
                story += "The barrier barely withstood the impact, shattering into bits of fragmented light the moment the explosion abated. ";
                story += "" + etMage.getText() + "collapsed, heaving from the heavy toll. Their eyes shut tight with pain. ";
                story += "\n\n\"At least it's dead. Let's bring its core back to " + etKingdom.getText() + ".\" " + etMage.getText() + " wheezed. ";
                story += "\"Help me up.\" \n\n" + etWarrior.getText() + "remained silent. ";
                story += "" + etMage.getText() + "opened their eyes to find a sword through their chest. ";



            }
        });

    }
}