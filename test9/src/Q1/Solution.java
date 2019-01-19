package Q1;

import java.util.Arrays;

public class Solution{
    public int[] solution(int T, int[] requiredTime){
        Arrays.sort(requiredTime);
        int[] result = {0, 0};
        int tmp = 0;

        for (int time : requiredTime) {
            tmp += time;
            if (tmp > T) return result;
            result[0]++;
            result[1] = result[1] + tmp;
        }

        return result;
    }
}
