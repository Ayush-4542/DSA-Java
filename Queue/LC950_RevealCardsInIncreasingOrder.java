class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> dq = new LinkedList<>();
        Arrays.sort(deck);
        for(int i=deck.length-1;i>=0;i--){
            if(i==deck.length-1 || i==deck.length-2){
                dq.addFirst(deck[i]);
                continue;
            }
            dq.addFirst(dq.removeLast());
            dq.addFirst(deck[i]);
        }
        int[] ans = new int[deck.length];
        int i=0;
        while(!dq.isEmpty()){
            ans[i]= dq.removeFirst();
            i++;
        }
        return ans ;
        
    }
}
