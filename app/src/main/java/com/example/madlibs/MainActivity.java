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

        //connects the instance variables to the text ids on the xml
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
                story += "At a snowy mountain, two shadowy figures stood in front of a colossal stone gate.";
                story += "One is clad in crimson armor. Their name is " + etWarrior.getText() + ".";
                story += "The other is draped in a silver robe. Their name is " + etMage.getText() + ".";
                story += "Hailing from the kingdom of " + etKingdom.getText() + ", they strive to slay the wicked dragon.";
                story += "The mage, holding their grimoire, force the heavy gate open.";
                story += "\n\nAs they enter, the stone gate closes behind them, leaving them in darkness.";
                story += "Suddenly, a flaming projectile launches towards them!" + etMage.getText() + " utters a spell, casting a barrier.";
                story += "A loud roar echoes in the chamber. Torches on the moldy walls lit with ghastly blue flame.";
                story += "With the flames restoring their vision, the two heroes see the behemoth before them.";
                story += "\n\nA dragon covered with obsidian scales lay atop of mountains of gold.";
                story += "Sparing no time, " + etWarrior.getText() + " unsheathes their sword and runs to face the dragon.";
                story += "\n\n\"For the king! For the eternal rule of king " + etKing.getText() + "!\" yells the warrior.";
                story += "\n\nStrange words come out of the mage's mouth. The grimoire glows menacingly.";
                story += "The dragon suddenly feels weak as it continues to claw at the puny crimson human.";
                story += "It glares at the puny human in silver. It attempts to breathe fireballs but was kept occupied by the warrior.";
                story += "Facing the onslaught of the two experienced heroes, the dragon becomes covered in injuries.";
                story += "In an attempt to take them down along with it, the dragon stops attacking and begins to ";
            }
        });

    }
}