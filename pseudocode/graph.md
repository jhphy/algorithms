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
