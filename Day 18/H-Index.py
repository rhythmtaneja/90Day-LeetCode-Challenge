class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int [] arr = new int[n+1];

        for (int c: citations)
        {
            if (c > n){
                arr[n]++ ;// if 6 is there with last index 5, then increase 5;
            }
            else arr[c]++;
        }

        int count = 0;
        for (int i=n; i>= 0; i--){
            count += arr[i];
            if (count >= i){
                return i;
            }
        }
        return 0;
    }
}
