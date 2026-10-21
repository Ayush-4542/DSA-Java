class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                if(st.peek() == ch){
                    st.pop();
                    continue;
                }
            }
            st.push(ch);

        }
        StringBuilder sb = new StringBuilder();
        /*
        for(char ch: st){
        sb.append(ch);
        }
        return sb.toString();
        */
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();

    }
}
         
        
