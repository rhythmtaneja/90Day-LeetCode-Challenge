class Node{
    Node prev, next;
    int key, value;
    Node (int _key, int _value){
        key = _key;
        value = _value;
    } // class that will act as a node
}

class LRUCache {
    Node head = new Node(0,0), tail = new Node(0,0);
    Map <Integer, Node> mpp = new HashMap<>();
    int capacity;

    public LRUCache(int _capacity) {
        capacity = _capacity;
        head.next= tail;
        tail.prev= head;
    }
    
    public int get(int key) {
        if (mpp.containsKey(key)) {
            Node node = mpp.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else{
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            remove(mpp.get(key));
        }
        if (mpp.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    private void remove(Node node){
        mpp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void insert(Node node){
        mpp.put(node.key, node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
