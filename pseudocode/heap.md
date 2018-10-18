# Heaps

## (Binary) Heap

```<b>tag</b>
PARENT(i)
  return [i/2]

LEFT(i)
  return 2i

RIGHT(i)
  return 2i + 1

# max-heap property is that for every node i other than the root,
A[PARENT(i)] >= A[i]
```

```<b>tag</b>
MAX-HEAPIFY(A, i)
  l = LEFT(i)
  r = RIGHT(i)
  if l <= A.heap-size and A[l] > A[i]
    largest = l
  else
    largest = i
  if r <= A.heap-size and A[r] > A[largest]
    largest = r
  if largest != i
    exchange A[i] with A[largest]
    MAX-HEAPIFY(A.largest)
```

```<b>tag</b>
BUILD-MAX-HEAP(A)
  A.heap-size = A.length
  for i = [A.length/2] downto 1
    MAX-HEAPIFY(A, i)
```

## Priority queues

A priority queue is a data structure for maintaining a set S of elements, each with an associated value called a key. A max-priority queue supports the following operations:

INSERT(S, x) inserts the element x into the set S, which is equivalent to the operation S D S [ fxg.

MAXIMUM(S) returns the element of S with the largest key.

EXTRACT-MAX(S) removes and returns the element of S with the largest key.

INCREASE-KEY(S, x, k) increases the value of element x’s key to the new value k, which is assumed to be at least as large as x’s current key value.

```<b>tag</b>
HEAP-MAXIMUM(A)
  return A[1]

HEAP-EXTRACT-MAX(A)
  if A.heap-size < 1
    error "heap underflow"
  max = A[1]
  A[1] = A[A.heap-size]
  A.heap-size = A.heap-size - 1
  MAX-HEAPIFY(A, 1)
  retutn max

HEAP-INCREASE-KEY(S, i, key)
  if key < A[i]
    error "new key is smaller than current key"
  A[i] = key
  while i > 1 and A[PARENT(i)] < A[i]
    exchange A[i] with A[PARENT(i)]
    i = PARENT(i)

MAX-HEAP-INSERT(A, key)
  A.heap-size = A.heap-size + 1
  A[A.heap-size] = -INF
  HEAP-INCREASE-KEY(S, A.heap-size, key)
```
