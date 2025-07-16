class Solution {
    public static int floor(Node root, int x) {
       int floor = -1;
       while (root!= null){
           if (root.data == x){
               floor = x;
               return floor;
           }
           if (root.data > x){
               root = root.left;
           }
           else {
               floor = root.data;
               root = root.right;
           }
       }
       return floor;
    }
}
