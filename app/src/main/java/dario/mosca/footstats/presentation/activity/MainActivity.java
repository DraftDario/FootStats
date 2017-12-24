package dario.mosca.footstats.presentation.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import dario.mosca.footstats.R;
import dario.mosca.footstats.presentation.fragment.CallbackFragment;
import dario.mosca.footstats.presentation.fragment.MenuFragment;

public class MainActivity extends AppCompatActivity {

    private Fragment currentFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Charge le fragment par défaut et enregistre l'activité pour les callbacks.
        loadFragment(MenuFragment.getInstance());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Actions définie selon les options pressées dans le menu.
        switch (item.getItemId()) {
            case R.id.action_settings:
                // Do something.

                Toast.makeText(this.getApplicationContext(), "Setting", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_wait:
                // Do something else.

                Toast.makeText(this.getApplicationContext(), "Wait", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Cette méthode charge l'instance de fragment passée en paramètre.
     *
     * @param newFragmentInstance L'instance du nouveau fragment.
     */
    public void loadFragment(Fragment newFragmentInstance) {
        // Ceci est le fragment manager. C'es tlui qui gère les transactions.
        FragmentManager fragmentManager = getSupportFragmentManager();

        // S'il y a un fragment chargé, on l'enleve pour afficher le nouveau et on l'ajoute au stack.
        if (currentFragment != null) {
            fragmentManager.beginTransaction()
                    .remove(currentFragment)
                    .add(R.id.fragmentContent, newFragmentInstance)
                    .addToBackStack(null)
                    .commit();


            // On met à jour le fragment courrant.
            currentFragment = newFragmentInstance;

            // Sinon, c'est qu'on démarre l'appli et qu'aucun fragment n'est encore chargé. On ajoute le premier fragment au stack.
        } else {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContent, newFragmentInstance)
                    .commit();

            // On met a jour le fragment courrant.
            currentFragment = newFragmentInstance;
        }

        // Si le fragment à besoin de faire des callbacks, on lui renseigne l'activité.
        if (newFragmentInstance instanceof CallbackFragment) {
            // La on enregistre l'activité si elle en a besoin.
            ((CallbackFragment) newFragmentInstance).registerForCallback(this);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
