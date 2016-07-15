package cz.uhk.basketballcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int PocitadloA = 0;
    int PocitadloB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void color() {
        TextView pocitadloA = (TextView) findViewById(R.id.pocitadloA);
        TextView pocitadloB = (TextView) findViewById(R.id.pocitadloB);

        if (PocitadloA > PocitadloB) {
            pocitadloA.setBackgroundColor(Color.parseColor("#0AAD00"));
            pocitadloB.setBackgroundColor(Color.parseColor("#AD2100"));
        } else {
            if (PocitadloA < PocitadloB) {
                pocitadloA.setBackgroundColor(Color.parseColor("#AD2100"));
                pocitadloB.setBackgroundColor(Color.parseColor("#0AAD00"));
            } else {
                pocitadloA.setBackgroundColor(Color.parseColor("#BFBDBB"));
                pocitadloB.setBackgroundColor(Color.parseColor("#BFBDBB"));
            }
        }
    }

    public void plusTwoA(View view) {
        PocitadloA = PocitadloA + 2;
        displayA(PocitadloA);
        color();
    }

    public void plusThreeA(View view) {
        PocitadloA = PocitadloA + 3;
        displayA(PocitadloA);
        color();
    }

    public void plusFreeA(View view) {
        PocitadloA = PocitadloA + 1;
        displayA(PocitadloA);
        color();
    }

    public void plusTwoB(View view) {
        PocitadloB = PocitadloB + 2;
        displayB(PocitadloB);
        color();
    }

    public void plusThreeB(View view) {
        PocitadloB = PocitadloB + 3;
        displayB(PocitadloB);
        color();
    }

    public void plusFreeB(View view) {
        PocitadloB = PocitadloB + 1;
        displayB(PocitadloB);
        color();
    }

    public void reset(View view) {
        PocitadloA = 0;
        PocitadloB = 0;
        displayA(PocitadloA);
        displayB(PocitadloB);
        color();
    }

    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.pocitadloA);
        quantityTextView.setText("" + number);
    }

    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.pocitadloB);
        quantityTextView.setText("" + number);
    }

}

