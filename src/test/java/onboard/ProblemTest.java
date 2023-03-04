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
            Long hour = 10L;
            Long minute = 10L;
            List<Long> answer = List.of(9L, 25L);
            assertThat(Problem1.solution(hour, minute)).isEqualTo(answer);
        }
        @Test
        void case2(){
            Long hour = 0L;
            Long minute = 30L;
            List<Long> answer = List.of(23L, 45L);
            assertThat(Problem1.solution(hour, minute)).isEqualTo(answer);
        }
        @Test
        void case3(){
            Long hour = 23L;
            Long minute = 40L;
            List<Long> answer = List.of(22L, 55L);
            assertThat(Problem1.solution(hour, minute)).isEqualTo(answer);
        }
    }

}
