package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;

        for (int i=N-1; i>0; i--) {
            if ((K / values[i]) > 0) {
                answer += (K / values[i]);  // K원을 만드는 데 values[i] 종류의 동전이 몇 개 필요한지 구하고
                                            // 지금까지 구한 필요한 동전 개수에 더하기
                K = K - ((K / values[i]) * values[i]);
            }
        }

        return answer;
    }
}
