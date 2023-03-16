package onboard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        answer.add(sum/5);  // 평균

        Collections.sort(numbers);
        numbers.toString();

        answer.add(numbers.get(2)); // 중앙값

        return answer;
    }
}
