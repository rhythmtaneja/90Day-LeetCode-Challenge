class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int a = nums[i];
            freqMap.put(a, freqMap.getOrDefault(a, 0) + 1);
            }
             PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
                minHeap.offer(entry);
                 if (minHeap.size() > k) {
        minHeap.poll();  // Remove the one with the smallest frequency
    }
            }
            int[] result = new int[k];
            int i = 0;
            while (!minHeap.isEmpty()){
                result[i++]= minHeap.poll().getKey(); // poll removes the top element from the heap, getkey gives the key in the array
            }
                  return result;

        }
    
    }
