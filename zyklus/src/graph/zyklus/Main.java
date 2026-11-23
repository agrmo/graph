package graph.zyklus;

import graph.Graph;
import graph.Doppelgraph;

public class Main {
    public static void beispieleins() {
        int[][] paare = {{1,2},{2,0}};
        int groesse = 3;
        Graph g = new Graph(paare, groesse);
        System.out.println(Zyklus.hatzyklus(g));
    }

    public static void beispielzwei() {

        //
        //      1
        //     / \
        //    2---0
        //

        int[][] paare = {{1,2},{2,0},{1,0}};
        int groesse = 3;
        Graph g = new Graph(paare, groesse);
        Doppelgraph dg = new Doppelgraph(g);
        System.out.println(Zyklus.hatzyklus(g));
    }

    public static void main(String[] args) {
        beispielzwei();
    }
}
