package onboard;

import java.util.Arrays;
import java.util.Collections;

public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;

        String num = Integer.toString(number);

        String[] arr = new String[num.length()];

        for (int i=0; i<num.length(); i++) {
            arr[i] = String.valueOf(num.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        String joinArr = "";
        for (int i=0; i<num.length(); i++) {
            joinArr = String.join("", joinArr, arr[i]);
        }

        answer = Integer.parseInt(joinArr);

        return answer;
    }
}
