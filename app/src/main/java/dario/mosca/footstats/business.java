package dario.mosca.footstats;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;

/**
 * Created by mosca on 20.11.2017.
 */

public class business implements Serializable {

    @org.jetbrains.annotations.Contract(pure = true)
    public static Integer calculateMatchs(){
        Integer res = 3+2;
        return res;
    }

    @Contract(pure = true)
    public static Integer calculateTime(){
        Integer res = 90 + 45 + 30 + 60;
        return res;
    }

    @Contract(pure = true)
    public static Integer goals(){
        Integer res = 1 + 0 + 2 + 0;
        return res;
    }

    @Contract(pure = true)
    public static Integer passes(){
        Integer res = 2 + 1 + 1 + 0;
        return res;
    }

    @Contract(pure = true)
    public static Integer yellowCards(){
        Integer res = 0;
        return res;
    }

    @Contract(pure = true)
    public static Integer redCards(){
        Integer res = 0;
        return res;
    }
}
