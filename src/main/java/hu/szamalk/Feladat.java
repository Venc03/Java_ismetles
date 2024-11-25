package hu.szamalk;

import hu.szamalk.kozostarolo.modell.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Feladat {
    private List<AbstractIdom> idomok = new ArrayList<>();

    public void listcreate() {
        idomok.add(new Gomb(1));
        idomok.add(new Hasab(1, 2, 1));
        idomok.add(new MertaniHenger(1,2));
        idomok.add(new TomorHenger(1,2,3));
        idomok.add(new LyukasHenger(1,2,3,4));
    }

    public void Kiir(){
        for (AbstractIdom idom : idomok) {
            System.out.println("idom = " + idom.toString());
        }
        System.out.println("\n" + terfogat());
    }

    public String terfogat() {
        String s = "Terfogatok:";
        for (AbstractIdom idom : idomok){
            s += "\nV = " + idom.terfogat();
        }
        return s;
    }

}
