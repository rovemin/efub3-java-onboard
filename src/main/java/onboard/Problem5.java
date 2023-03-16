package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;

        for (int i=N-1; i>0; i--) {
            if ((K / values[i]) > 0) {
                answer += (K / values[i]);
                K = K - ((K / values[i]) * values[i]);
            }
        }

        return answer;
    }
}
