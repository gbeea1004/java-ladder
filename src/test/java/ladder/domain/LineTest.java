package ladder.domain;

import ladder.domain.Line;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    public void 라인이_만들어지는가() throws Exception{
        Line line = new Line(3);
        assertThat(line.getLine().size()).isEqualTo(2);
        assertThat(line.getLine().get(0)).isEqualTo(false);
        assertThat(line.getLine().get(1)).isEqualTo(false);
    }

    @Test
    public void 중복된_선이_있는가() throws Exception{
        boolean[] persons = {true, true, false};
        Line line = new Line(persons);
        assertThat(line.getLine().get(0)).isEqualTo(true);
        assertThat(line.getLine().get(1)).isEqualTo(true);
    }
}
