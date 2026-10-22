class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s = operations[i];
            if(s.equals("D")){
                st.push(2*st.peek());
            }else if(s.equals("C")){
                st.pop();
            }else if(s.equals("+")){
                int sum =st.peek();
                int temp = st.pop();
                sum+=st.peek();
                st.push(temp);
                st.push(sum);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int ans =0;
        for(int i: st){
            ans+=i;
        }
        return ans;
        
    }
}
