package dario.mosca.footstats.presentation.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dario.mosca.footstats.R;

/**
 * Created by mosca on 22.12.2017.
 */

public class NewMatchFragment extends Fragment {

    // SINGLETON
    private static NewMatchFragment instance = null;

    /**
     * Constructeur vide requis par le fragmentManager.
     */
    public NewMatchFragment() {
    }

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


