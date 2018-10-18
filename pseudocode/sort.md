
# Sort

## Insertion Sort

```<b>tag</b>
INSERTION-SORT(A)
for j = 2 to A.length
  key = A[j]
  i = j - 1
  while i > 0 and A[i] > key
    A[i+1] = A[i]
    i = i - 1
  A[i+1] = key
```

## Mergesort

```<b>tag</b>
MERGE-SORT(A, p, r)
  if p < r
    q = [(p+r)/2]
    MERGE-SORT(A, p, q)
    MERGE-SORT(A, p+1, r)
    MERGE(A, p, q, r)

MERGE(A, p, q, r)
  n = q - p + 1
  m = r - q
  let L[1..n+1] and R[1..m+1] be new arrays
  for i = 1 to n
    L[i] = A[p+i-1]
  for j = 1 to m
    R[j] = A[q+j]
  L[n+1] = +inf
  L[m+1] = +inf
  i = 1
  j = 1
  for k = p to r
    if L[i] <= R[j]
      A[k] = L[i]
      i = i + 1
    else
      A[k] = R[j]
      j = j + 1
```

## Heapsort

```<b>tag</b>
BUILD-MAX-HEAP(A)
for i = A.length downto 2
  exchangeA[1] with A[i]
  A.heap-size = A.heap-size - 1
  MAX-HEAPIFY(A, 1)
```

## Quicksort

```<b>tag</b>
QUICKSORT(A, p, r)
  if p < R
    q = PARTITION(A, p, r)
    QUICKSORT(A, p, q-1)
    QUICKSORT(A, q+1, r)

PARTITION(A, p, r)
  x = A[r]
  i = p - 1
  for j = p to r - 1
    if A[j] <= x
      i = i + 1
      exchange A[i] with A[j]
  exchange A[i+1] with A[r]
  return i + 1

RANDOMIZED-PARTITION(A, p, r)
  i = RANDOM(p, r)
  exchange A[r] with A[i]
  return PARTITION(A, p, r)


```

## Counting Sort

```<b>tag</b>
let C[0..k] be a new array
for i = 0 to k
  C[i] = 0
for j = 1 to A.length
  C[A[j]] = C[A[j]] + 1
for i = 1 to k
  C[i] = C[i] + C[i-1]
for j = A.length downto 1
  B[C[A[j]]] = A[j]
  C[A[j]] = C[A[j]] - 1
```

## Radix Sort

```<b>tag</b>
RADIX_SORT(A, d)
for i = 1 to d
  use a stable sort to sort array A on digit i
```