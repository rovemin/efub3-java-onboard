package onboard;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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

}
