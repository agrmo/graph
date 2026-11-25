package graph.kanteverteilung;

import graph.Graph;
import druck.graph.tgf.GraphTGF;
import graph.erdosreyni.Erdosreyni;
import liste.Liste;
import java.util.Random;

public class Main {

    // Kanteverteilung eines bestimmten Graphen
    public static void beispieleins() {
        int[][] paare = {{1,2},{2,0}};
        int groesse = 3;
        Graph g = new Graph(paare, groesse);

        int[][] verteilung = Kanteverteilung.kanteVerteilung(g);
        String verteilungString = Liste.nehmeStringVonArrayArray(verteilung);
        System.out.println(verteilungString);	
    }

    // Kanteverteilung eines Erdosreynien
    public static void beispielzwei() {
        Random r = new Random();
        Graph g = Erdosreyni.mache(r, 500, 0.01);

        // System.out.println(GraphTGF.macheGephiTGF(g));

        int[][] verteilung = Kanteverteilung.kanteVerteilung(g);
        String verteilungString = Liste.nehmeStringVonArrayArray(verteilung);
        System.out.println(verteilungString);
    }

    public static void main(String[] args) {
        beispielzwei();
    }
}

