package Q2;

public class Solution{
    public int solution(int N, int[] s){
        int sum = 0;
        int result = 0;
        for (int n : s) {
            sum += n;
        }
        sum += N;
        result = sum - (N * s.length);
        return result < 0 ? 0 : result;
    }
}