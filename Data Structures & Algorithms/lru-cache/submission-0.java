class LRUCache {
    class Node
    {
        int key;
        int value;
        Node next;
        Node prev;
        Node(int key , int value)
        {
            this.key = key;
            this.value = value;
            this.next = this.prev = null;
        }
    }
        Node head = new Node(-1,-1);
        Node tail = new Node(-1,-1); 
        HashMap<Integer , Node> map = new HashMap<>();
        int limit; 

    public LRUCache(int capacity) {
        limit = capacity;
        //empty list
        head.next = tail;
        tail.prev = head;
    }
    // ✅ addNode using newNode and oldNext
    public void addNode(Node newNode) {
        Node oldNext     = head.next;   // save current first node
        head.next        = newNode;     // HEAD    → newNode
        newNode.prev     = head;        // HEAD    ← newNode
        newNode.next     = oldNext;     // newNode → oldNext
        oldNext.prev     = newNode;     // newNode ← oldNext
    }

    public void deleteNode(Node node) {
        node.prev.next = node.next;     // skip node forward
        node.next.prev = node.prev;     // skip node backward
    }
    public void put(int key, int value) {

        // Key exists → update and move to front
        if (map.containsKey(key)) {
            Node newNode   = map.get(key);
            newNode.value  = value;
            deleteNode(newNode);
            addNode(newNode);
            return;
        }

        // Cache full → evict LRU (node before tail)
        if (map.size() == limit) {
            Node lruNode = tail.prev;
            deleteNode(lruNode);
            map.remove(lruNode.key);
        }

        // Insert new node at front
        Node newNode = new Node(key, value);
        addNode(newNode);
        map.put(key, newNode);
    }
    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node newNode = map.get(key);  // treat found node as newNode
        deleteNode(newNode);
        addNode(newNode);             // move to front

        return newNode.value;
    }


}
