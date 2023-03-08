package onboard;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProblemTest {

    @Nested
    class Problem1Test{
        @Test
        void case1(){
            Integer hour = 10;
            Integer minute = 10;
            List<Integer> answer = List.of(9, 25);
            assertThat(Problem1.solution(hour, minute)).isEqualTo(answer);
        }
        @Test
        void case2(){
            Integer hour = 0;
            Integer minute = 3;
            List<Integer> answer = List.of(23, 45);
            assertThat(Problem1.solution(hour, minute)).isEqualTo(answer);
        }
        @Test
        void case3(){
            Integer hour = 23;
            Integer minute = 40;
            List<Integer> answer = List.of(22, 55);
            assertThat(Problem1.solution(hour, minute)).isEqualTo(answer);
        }
    }

    // TODO: List 형태가 아닌 단순 배열 형식으로 풀이하는 방식 고려
    @Nested
    class Problem2Test{
        @Test
        void case1(){
            List<Integer[]> flipCards = new ArrayList<>();
            // TODO: 아래 삽입 과정 깔끔하게 하는 방법 고려
            flipCards.add(new Integer[]{5, 10});
            flipCards.add(new Integer[]{9, 13});
            flipCards.add(new Integer[]{1, 2});
            flipCards.add(new Integer[]{3, 4});
            flipCards.add(new Integer[]{5, 6});
            flipCards.add(new Integer[]{1, 2});
            flipCards.add(new Integer[]{3, 4});
            flipCards.add(new Integer[]{5, 6});
            flipCards.add(new Integer[]{1, 20});
            flipCards.add(new Integer[]{1, 20});
            List<Integer> answer = List.of(1, 2, 3, 4, 10, 9, 8, 7, 13, 12, 11, 5, 6, 14, 15, 16, 17, 18, 19, 20);
            assertThat(Problem2.solution(flipCards)).isEqualTo(answer);
        }
    }

    @Nested
    class Problem3Test{
        @Test
        void case1(){
            List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 40, 30, 60, 30));
            List<Integer> answer = new ArrayList<>(Arrays.asList(34, 40));
            assertThat(Problem3.solution(numbers)).isEqualTo(answer);
        }
    }

    @Nested
    class Problem4Test{
        @Test
        void case1(){
            Integer number = 2143;
            Integer answer = 4321;
            assertThat(Problem4.solution(number)).isEqualTo(answer);
        }
        @Test
        void case2(){
            Integer number = 999998999;
            Integer answer = 999999998;
            assertThat(Problem4.solution(number)).isEqualTo(answer);
        }
        @Test
        void case3(){
            Integer number = 61423;
            Integer answer = 64321;
            assertThat(Problem4.solution(number)).isEqualTo(answer);
        }
        @Test
        void case4(){
            Integer number = 500613009;
            Integer answer = 965310000;
            assertThat(Problem4.solution(number)).isEqualTo(answer);
        }
    }

    @Nested
    class Problem5Test{
        @Test
        void case1(){
            Integer N = 10;
            Integer K = 4200;
            Integer[] values = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
            Integer answer = 6;
            assertThat(Problem5.solution(N, K, values)).isEqualTo(answer);
        }
        @Test
        void case2(){
            Integer N = 10;
            Integer K = 4790;
            Integer[] values = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
            Integer answer = 12;
            assertThat(Problem5.solution(N, K, values)).isEqualTo(answer);
        }
    }
}
