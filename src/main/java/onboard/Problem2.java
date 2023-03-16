package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i=0; i<20; i++) {
            answer[i] = i;
        }

        for (int i=0; i<flipCards.length; i++) {
            Integer[] arr = flipCards[i];

            int a = arr[0];
            int b = arr[1];

            for (int j=a; j<b-a+1; j++) {
                for (int k=b; k>=j; k--)
                answer[j-1] = answer[k-1];
            }
        }

        return answer;
    }
}
