class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R'){
                q1.offer(i);
            }else{
                q2.offer(i);
            }
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            int a = q1.poll();
            int b = q2.poll();
            if(a<b){
                q1.offer(a+senate.length());
            }else{
                q2.offer(b+senate.length());
            }
        }
        return q1.isEmpty() ? "Dire" : "Radiant";
        
    }
}
