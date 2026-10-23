class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
        }
        int i=0;
        while(i<sandwiches.length){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                continue;
            }
            int count =0;
            while(i<sandwiches.length && q.peek()!= sandwiches[i]){
                int student =q.poll();
                q.offer(student);
                count++;
                if(count == q.size()){
                    return count ;
                }
            }
        }
        return q.size();
        
    }
}
