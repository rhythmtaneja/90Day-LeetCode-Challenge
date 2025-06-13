class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        int [][] cars = new int [n][2]; //n rows, 2 cols(position and speed)
        for (int i=0; i<n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars,(a,b) -> Integer.compare(b[0], a[0]));
        // to keep in descending order

        Stack<Double> stack = new Stack<>();

        for (int[] car : cars){
            int pos = car[0];
            int spd = car[1];
            double timeTaken = (double)(target - pos)/spd;

            if (stack.isEmpty() || timeTaken > stack.peek()){
                stack.push(timeTaken);
            }
        }
        return stack.size();
    }
}
