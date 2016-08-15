package it.morfoza.test;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ahann on 12/08/2016.
 */
public class Grupa {

    private List<Integer> uczniowie = new LinkedList<>();

    public int[] ocenUczniow() {
        int[] result = new int[uczniowie.size()];
        for (int i=0; i<result.length; i++){
            result [i] = uczniowie.get(i);
        }
        return result;
    }

    public void dodajobregoUcznia() {
        uczniowie.add(5);

    }

    public void dodajZlegoUcznia() {
        uczniowie.add(2);

    }



}
