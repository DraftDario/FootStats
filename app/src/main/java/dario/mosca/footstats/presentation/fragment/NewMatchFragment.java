package dario.mosca.footstats.presentation.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dario.mosca.footstats.R;
import dario.mosca.footstats.presentation.activity.MainActivity;

/**
 * Created by mosca on 22.12.2017.
 */

public class NewMatchFragment extends Fragment implements CallbackFragment {

    // Requis par l'interface.
    private MainActivity mainActivity;

    @Override
    public void registerForCallback(MainActivity activity) {
        mainActivity = activity;
    }

    /**
     * Constructeur vide requis par le fragmentManager.
     */
    public NewMatchFragment() {
    }

    // SINGLETON
    private static NewMatchFragment instance = null;

    public static NewMatchFragment getInstance() {
        if (instance == null) {
            instance = new NewMatchFragment();
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_newmatch, container, false);

        return view;
    }


}


