package HazyApps.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView leftDie = (ImageView) findViewById(R.id.imageView_leftDie);
        final ImageView rightDie = (ImageView) findViewById(R.id.imageView_rightDie);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "The Button has been pressed!");

                Random randomNumberGenerator = new Random();
                int randomIntOne = randomNumberGenerator.nextInt(6);
                int randomIntTwo = randomNumberGenerator.nextInt(6);
                Log.d("Dicee", "The random number is " + randomIntOne);

                leftDie.setImageResource(diceArray[randomIntOne]);
                rightDie.setImageResource(diceArray[randomIntTwo]);
            }
        });
    }
}
