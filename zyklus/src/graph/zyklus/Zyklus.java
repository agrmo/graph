package graph.zyklus;

import graph.Graph;
import java.util.ArrayList;
import liste.Liste;
import java.util.HashSet;

// Hat der Graph einen Zyklus?
public class Zyklus {

    public static boolean hatzyklus(Graph g) {
        
        // Nicht notwendig, einen bestimmenten Anfangsknoten zu
        // nehmen. Nehme den ersten Knoten.

        int anfangsknoten = 0;
        HashSet<Integer> gesehen = new HashSet<Integer>();
        ArrayList<Integer> zulaufen = new ArrayList<Integer>();

        zulaufen.add(anfangsknoten);

        while (zulaufen.size() > 0) {
            int naechste = zulaufen.remove(zulaufen.size() - 1);
            gesehen.add(naechste);

            ArrayList<Integer> nachbarn = g.nachbar.get(naechste);

            for (int nachbar : nachbarn) {
                if (gesehen.contains(nachbar)) {
                    return true;
                } else {
                    zulaufen.add(nachbar);
                }
            }
        }

        return false;
    }
}
