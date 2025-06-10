class TimeMap {
    HashMap<String,TreeMap<Integer,String>> mpp;
    public TimeMap() {
        mpp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mpp.containsKey(key)){
            mpp.put(key, new TreeMap<>());
        }
        TreeMap<Integer, String> treeMap = mpp.get(key);
        treeMap.put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if (!mpp.containsKey(key)){
            return "";
        }
        TreeMap<Integer,String> treeMap = mpp.get(key);

        Integer smallTimeStamp = treeMap.floorKey(timestamp);
         if(smallTimeStamp  == null)
         //Integer because int can't hold null values, will give NullPointerException 
        {
            return "";
        }
        return treeMap.get(smallTimeStamp);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
