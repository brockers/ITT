package org.rockerssoft.randomquote;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    private String[] quotes = {
            "\"Shouldn't you really be doing your homework.\" -Mr. Rockers",
            "\"Roses are red, violets are blue, I have 5 fingers, the 3rd ones for you.\"",
            "\"Your birth certificate is an apology letter from the condom factory.\"",
            "\"I bet your brain feels as good as new, seeing that you never use it.\"",
            "\"Yo're so ugly, when your mom dropped you off at school she got a fine for littering.\""
    };
    private int min = 0;
    private int max = 4;
    private Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        rand = new Random();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView quote = (TextView)findViewById(R.id.tvQuote);
        int randomNum = rand.nextInt((max - min) + 1) + min;

        quote.setText(quotes[randomNum]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
