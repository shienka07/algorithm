class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int num = t.length() - p.length();
        int pass = 0;

        for(int i = 0; i <= num; i++) {
            pass = t.substring(i, i + p.length()).compareTo(p);
            if(pass <= 0){
                answer++;
            }
        }
        
        return answer;
    }
}