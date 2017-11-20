package dario.mosca.footstats;

import org.jetbrains.annotations.Contract;

/**
 * Created by mosca on 20.11.2017.
 */

public class business {

    @Contract(pure = true)
    public static Integer calculateMatchs(){
        Integer res = 3+2;
        return res;
    }

    @org.jetbrains.annotations.Contract(pure = true)
    public static Integer calculateTime(){
        Integer res = 90 + 45 + 30 + 60;
        return res;
    }
}
