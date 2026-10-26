# graph

Various graph algorithms and data structures.

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

## binary-heap

Make a binary heap out of a list. Doesn't have to be in heap-order. I sort of stretch the definition of a heap to simply be a mapping between a list and a binary tree. It's helpful I think.

### example

```
[21,19,17,16,14,18,12,9,6,4,1]
```

generates the binary tree

```
21: [19: [16: [9: [none, none], 6: [none, none]], 14: [4: [none, none], 1: [none, none]]], 17: [18: [none, none], 12: [none, none]]]
```

in other words

```
                                     21
                                     /\
                                    /  \
                                   /    \
                                  /      \
                                 19       17
                                / \      / \
                               /   \    /   \
                              16    14 18   12 
                             / \   / \
                            9  6  4   1
```

## min-heap

A min-heap implementation with add, remove, and reheap-up and reheap-down.

### example

Adding the sequence

```
[21,19,17,16,14,18,12,9,6,4,1]
```

builds the Min-Heap
 
```
                                      1
                                     /\
                                    /  \
                                   /    \
                                  /      \
                                 4        6
                                / \      / \
                               /   \    9  19
                              14   12  
                             / \   / \
                            16 21 17 18
```

and then repeatedly removing index 0 and reheaping downward results in the sorted list

```
[1,4,6,9,12,14,16,17,18,19,21]
```

a.k.a heapsort.

## t-min-heap

A min-heap implementation that keeps track of a partner `<T>` value. Basically a generic priority queue. Useful for maintaining heaps of nodes, edges, etc.

### example

```
[21, 17, 19]
[1, 2, 3]
```

is sorted into

```
[17, 19, 21]
[2, 3, 1]
```

in O(nlogn) time.
