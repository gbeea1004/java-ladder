package ladder;

import ladder.domain.Line;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    public void 라인수체크() throws Exception{
        Line t1 = new Line(3);
       // assertThat(t1.points.size()).isEqualTo(2);
    }
}
