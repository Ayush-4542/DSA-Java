class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.offer(new int[]{tickets[i],i});
        }
        int count =0;
        while(!q.isEmpty()){
            int[] ticket = q.poll();
            count++;
            ticket[0]--;
            if(ticket[0]>0){
                q.offer(ticket);
            }
            if(ticket[1]==k && ticket[0]==0){
                return count ;
            }

        }
        return -1;
        
    }
}
