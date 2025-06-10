import java.util.*;

class RandomizedSet {
      ArrayList<Integer> list;
      HashMap<Integer, Integer> mpp;

    public RandomizedSet() {
        list = new ArrayList<>();
        mpp = new HashMap<>();
    }

    public boolean insert(int val) {
        // if value is present
        //return false
        if (mpp.containsKey(val)) {
            return false;
        } else {
            list.add(val);
            mpp.put(val, list.size() - 1);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!mpp.containsKey(val)) {
            return false;
        } else {
            int index = mpp.get(val);
            list.set(index, list.get(list.size() - 1));
            mpp.put(list.get(index), index);
            list.remove(list.size() - 1);
            mpp.remove(val);
            return true;
        }

    }

    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
