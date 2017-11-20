package dario.mosca.footstats;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class main extends AppCompatActivity {
    final String NB_MATCHS = "Séléction(s) : ";
    final String GAME_TIME = "Temps de jeu : ";
    final String GOALS = "But(s) marqué(s) : ";
    final String PASSES = "Passe(s) de but : ";
    final String YELLOW_CARDS = "Carton(s) jaune(s) : ";
    final String RED_CARDS = "Carton(s) rouge(s) : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //nbMatchs
        TextView nbMatchs = (TextView) findViewById(R.id.matchs);
        nbMatchs.setText(NB_MATCHS + business.calculateMatchs());

        //gameTime
        TextView gameTime = (TextView) findViewById(R.id.time);
        gameTime.setText(GAME_TIME + business.calculateTime() + " min.");

        //goals
        TextView goals = (TextView) findViewById(R.id.goals);
        goals.setText(GOALS + business.goals());

        //passes
        TextView passes = (TextView) findViewById(R.id.passes);
        passes.setText(PASSES + business.passes());

        //yellowCards
        TextView yellow = (TextView) findViewById(R.id.yellow);
        yellow.setText(YELLOW_CARDS + business.yellowCards());

        //redCards
        TextView red = (TextView) findViewById(R.id.red);
        red.setText(RED_CARDS + business.redCards());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Bientôt, tu pourras ajouter un match", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
