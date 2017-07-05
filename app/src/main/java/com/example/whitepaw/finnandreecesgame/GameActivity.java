package com.example.whitepaw.finnandreecesgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView resultText;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissor_button);
        resultText = (TextView) findViewById(R.id.result_text);
    }

    public void onClickRockButton(View button) {
        int buttonInput = 0;
        game = new Game(buttonInput);
        //String userInput = game.getPlayerInput();
        String computerChoice = game.generateComputersChoice();
        String result = game.gameLogic(computerChoice);

//        Log.d(getClass().toString(), result);
       // Intent intent = new Intent(this, GameActivity.class);
       // intent.putExtra("choice", userInput);
       // startActivity(intent);
        resultText.setText((result));
    }//Note: all commented out info is the first draft(which was wrong)

    public void onClickPaperButton(View button) {
       int buttonInput = 1;
        game = new Game(buttonInput);
        String computerChoice = game.generateComputersChoice();
        String result = game.gameLogic(computerChoice);

//        Log.d(getClass().toString(), result);
        resultText.setText((result));
    }

    public void onClickScissorsButton(View button) {
        int buttonInput = 2;
        game = new Game(buttonInput);
        String computerChoice = game.generateComputersChoice();
        String result = game.gameLogic(computerChoice);

//        Log.d(getClass().toString(), result);
        resultText.setText((result));
    }


}
