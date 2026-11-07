class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        while(q.size()!=1){
            int count =1;
            while(count<k){
                int top = q.poll();
                q.offer(top);
                count++;
            }
            q.poll();
        }
        return q.peek();
    }
}
