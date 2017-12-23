package dario.mosca.footstats.presentation.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dario.mosca.footstats.R;
import dario.mosca.footstats.menu;
import dario.mosca.footstats.utils.Const;

/**
 * Created by d-a-d on 22.12.2017.
 */

public class MenuFragment extends Fragment {

    public MenuFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        //nbMatchs
        TextView nbMatchs = (TextView) view.findViewById(R.id.matchs);
        nbMatchs.setText(Const.NB_MATCHS + menu.calculateMatchs());

        //gameTime
        TextView gameTime = (TextView) view.findViewById(R.id.time2);
        gameTime.setText(Const.GAME_TIME + menu.calculateTime() + " min.");

        //goals
        TextView goals = (TextView) view.findViewById(R.id.goals);
        goals.setText(Const.GOALS + menu.goals());

        //passes
        TextView passes = (TextView) view.findViewById(R.id.passes);
        passes.setText(Const.PASSES + menu.passes());

        //yellowCards
        TextView yellow = (TextView) view.findViewById(R.id.yellow);
        yellow.setText(Const.YELLOW_CARDS + menu.yellowCards());

        //redCards
        TextView red = (TextView) view.findViewById(R.id.red);
        red.setText(Const.RED_CARDS + menu.redCards());

        return view;
    }

}
