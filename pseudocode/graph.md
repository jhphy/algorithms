# Graph

## BFS

```<b>tag</b>
BFS(G, s)
  for each vertex u ∈ G.V - {s}
    u.color = WHITE
    u.d = INF
    u.π = NIL
  s.color = GREY
  s.d = 0
  s.π = NIL
  Q = ∅
  ENQUEUE(Q, s)
  while Q != ∅
    u = DEQUEUE(Q)
    for each v ∈ G.Adj[u]
      if v.color == WHITE
        v.color = GREY
        v.d = u.d + 1
        v.π = u
        ENQUEUE(Q, v)
    u.color = BLACK
```

## DFS

```<b>tag</b>
DFS(G)
  for each vertex u ∈ G.V
    u.color = WHITE
    u.π = NIL
  time = 0
  for each vertex u ∈ G.V
    if u.color = WHITE
    DFS-VISIT(G, u)

DFS-VISIT(G, u)
  time = time + 1
  u.d = time
  u.color = GRAY
  for each v ∈ G.Adj[u]
    if v.color == WHITE
      v.π = u
      DFS-VISIT(G, v)
  u.color = BLACK
  time = time + 1
  u.f = time
```

## Minimum Spanning Trees

```<b>tag</b>
GENERIC-MST(G, w)
  A = ∅
  while A does not form a spanning tree
    find an edge (u, v) that is safe for A
    A = A ∪ {(u, v)}
  return A
```

### Kruskal's algorithm

### Prim's algorithm

## Single-Source Shortest paths

### Relaxation

```<b>tag</b>
INITIALIZE-SINGLE-SOURCE(G, s)
  for each vertex v ∈ G.V
    u.d = INF
    u.π = NIL
  s.d = 0

RELAX(u, v, w)
  if v.d > u.d + w(u, v)
    v.d = u.d + w(u, v)
    v.π = u
```

### Bellman-Ford algorithm

```<b>tag</b>
BELLMAN-FORD(G, w, s)
  INITIALIZE-SINGLE-SOURCE(G, s)
  for i = 1 to |G.V| - 1
    for each edge(u, v) ∈ G.E
      RELEX(u, v, w)
    for each edge(u, v) ∈ G.E
      if v.d > u.d + w(u, v)
        return FALSE
  return TRUE
```

### Dijkstra's algorithm

```<b>tag</b>
DIJKSTRA(G, w, s)
  INITIALIZE-SINGLE-SOURCE(G, s)
  S = ∅
  Q = G.V
  while Q != ∅
    u = EXTRACT-MIN(Q)
    S = S ∪ {u}
    for each v ∈ G.Adj[u]
      RELEX(u, v, w)
```
