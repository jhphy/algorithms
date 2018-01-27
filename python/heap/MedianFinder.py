from heapq import *


class MedianFinder(object):
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.heaps = [], []

    def addNum(self, num):
        """
        :type num: int
        :rtype: void
        """
        maxHeap, minHeap = self.heaps
        heappush(maxHeap, num)
        val = heappop(maxHeap)
        heappush(minHeap, -val)
        if (len(minHeap) > len(maxHeap)):
            val2 = heappop(minHeap)
            heappush(maxHeap, -val2)

    def findMedian(self):
        """
        :rtype: float
        """
        maxHeap, minHeap = self.heaps
        return float(maxHeap[0]) if len(maxHeap) != len(minHeap) else (maxHeap[0] - minHeap[0]) * 0.5
