package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();

        if (minute >= 45) {     // 입력받은 분이 45분보다 크거나 같은 경우
            minute -= 45;
        }
        else {                  // 입력받은 분이 45분보다 작은 경우
            minute += 15;
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
        }

        answer.add(hour);
        answer.add(minute);

        return answer;
    }
}
