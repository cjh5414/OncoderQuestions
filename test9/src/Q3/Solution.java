package test9.Q3;

import java.util.Arrays;

public class Solution{
    public long solution(int[] answers){
        Arrays.sort(answers);

        int i = 0;
        int turn = 0;
        boolean twice = true;
        int twiceCount = 0;
        while (i < answers.length) {
            if (answers[i] != turn) return 0;
            i++;

            if (twice) {
                if (i >= answers.length) break;
                else {
                    if (answers[i] == turn)
                        twiceCount++;
                    else if (answers[i] == turn + 1) {
                        twice = false;
                        turn++;
                    }
                    else return 0;
                }
                i++;
            }

            turn++;
        }

        if (twiceCount * 2 == answers.length)
            return (long)Math.pow(2, twiceCount);
        else
            return (long)Math.pow(2, twiceCount + 1);
    }
}