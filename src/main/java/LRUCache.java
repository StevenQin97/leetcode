import java.util.HashMap;

public class LRUCache {

    private HashMap<Integer, Integer> map;

    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        return map.get(key);
    }

    public void put(int key, int value) {

    }

    private void checkCapacity() {
        if (map.size() > capacity) {

        }
    }

    private void removeData() {

    }
}
