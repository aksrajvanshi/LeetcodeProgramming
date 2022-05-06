class HitCounter {

    // We will be using a Queue to store the timestamps. peek() method 
    Queue<Integer> q;
    
    public HitCounter() {
        q = new LinkedList<Integer>();
    }
    
    public void hit(int timestamp) {
        this.q.add(timestamp);
    }
    
    public int getHits(int timestamp) {
        
        while(!this.q.isEmpty()){
            int timeStampDiff = timestamp - q.peek();
            if(timeStampDiff >= 300){
                this.q.remove();
            }
            else{
                break;
            }
        }
        
        return q.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */