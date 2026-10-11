# graph

Various graph algorithms.

## independent-set

The naive solution to the independent set problem.

> Find the largest independent set of the given undirected graph.

The naive solution iterates through all combinations of graphs of decreasing size. This is apparently the best you can do with no additional information about the graph. All other implementations exploit some known structure about the graph.

### algorithm

```
1. for int i = (size of graph); i > 0; i -= 1:

  2. Enumerate all possible combinations of graphics
     with cardinality i.
     
  3. For each combination
  
    4. Is every node not directly connected to all other nodes?

       5. If true, an independent set is found.

6. An independent set is not found. 
```

### example

Graph:

```
[[1, 2],
[2, 3, 4],
[5, 6],
[6],
[6],
[6],
[]]

       0--------1
      /  _____// \
     / _/    /    \
    /_/     /      \
   2----   3        4
    \   \   \       /
     \   \   \_    /
      \   \____\  /
       5---------6
```

```
Looking for independent set size 7.
Checking subset: {0, 1, 2, 3, 4, 5, 6}
Looking for independent set size 6.
Checking subset: {0, 1, 2, 3, 4, 5}
Checking subset: {0, 1, 2, 3, 4, 6}
Checking subset: {0, 1, 2, 3, 5, 6}
Checking subset: {0, 1, 2, 4, 5, 6}
Checking subset: {0, 1, 3, 4, 5, 6}
Checking subset: {0, 2, 3, 4, 5, 6}
Checking subset: {1, 2, 3, 4, 5, 6}
Looking for independent set size 5.
Checking subset: {0, 1, 2, 3, 4}
Checking subset: {0, 1, 2, 3, 5}
Checking subset: {0, 1, 2, 4, 5}
Checking subset: {0, 1, 3, 4, 5}
Checking subset: {0, 2, 3, 4, 5}
Checking subset: {1, 2, 3, 4, 5}
Checking subset: {0, 1, 2, 3, 6}
Checking subset: {0, 1, 2, 4, 6}
Checking subset: {0, 1, 3, 4, 6}
Checking subset: {0, 2, 3, 4, 6}
Checking subset: {1, 2, 3, 4, 6}
Checking subset: {0, 1, 2, 5, 6}
Checking subset: {0, 1, 3, 5, 6}
Checking subset: {0, 2, 3, 5, 6}
Checking subset: {1, 2, 3, 5, 6}
Checking subset: {0, 1, 4, 5, 6}
Checking subset: {0, 2, 4, 5, 6}
Checking subset: {1, 2, 4, 5, 6}
Checking subset: {0, 3, 4, 5, 6}
Checking subset: {1, 3, 4, 5, 6}
Checking subset: {2, 3, 4, 5, 6}
Looking for independent set size 4.
Checking subset: {0, 1, 2, 3}
Checking subset: {0, 1, 2, 4}
Checking subset: {0, 1, 3, 4}
Checking subset: {0, 2, 3, 4}
Checking subset: {1, 2, 3, 4}
Checking subset: {0, 1, 2, 5}
Checking subset: {0, 1, 3, 5}
Checking subset: {0, 2, 3, 5}
Checking subset: {1, 2, 3, 5}
Checking subset: {0, 1, 4, 5}
Checking subset: {0, 2, 4, 5}
Checking subset: {1, 2, 4, 5}
Checking subset: {0, 3, 4, 5}
Largest independent set of Graph: {0, 3, 4, 5}
```

## gale-shapely

The typical Gale-Shapely algorithm.

> Given a bipartite graph and a preference list for each node, return a list of bipartite pairs such that all nodes are matched.

Constraints:

- The bipartite graph has an equal number of nodes.
- Each preference list is complete, that is, contains a full list of nodes in the other graph.

### example

```
Vorschlagen Mann 0 und Frau 0
Die Frau 0 ist frei.
Verlobung ist [[0, 0]]
Vorschlag fertig. Vorschlag ist {0=[0]}
[[0, 0]]
Vorschlagen Mann 1 und Frau 0
Die Frau 0 ist nicht frei.
Der Mann, mit ihm sie in einem Paar schon steht ist 0
Der Mann 1 steht höher. Tauschen.
Verlobung ist [[1, 0]]
Vorschlag fertig. Vorschlag ist {0=[0], 1=[0]}
[[1, 0]]
Vorschlagen Mann 0 und Frau 2
Die Frau 2 ist frei.
Verlobung ist [[1, 0], [0, 2]]
Vorschlag fertig. Vorschlag ist {0=[0, 2], 1=[0]}
[[1, 0], [0, 2]]
Vorschlagen Mann 2 und Frau 2
Die Frau 2 ist nicht frei.
Der Mann, mit ihm sie in einem Paar schon steht ist 0
Der Mann 2 steht höher. Tauschen.
Verlobung ist [[1, 0], [2, 2]]
Vorschlag fertig. Vorschlag ist {0=[0, 2], 1=[0], 2=[2]}
[[1, 0], [2, 2]]
Vorschlagen Mann 0 und Frau 1
Die Frau 1 ist frei.
Verlobung ist [[1, 0], [2, 2], [0, 1]]
Vorschlag fertig. Vorschlag ist {0=[0, 1, 2], 1=[0], 2=[2]}
[[1, 0], [2, 2], [0, 1]]
```
