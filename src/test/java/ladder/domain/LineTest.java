package ladder.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    public void 라인이_만들어지는가() throws Exception{
        Line line = new Line(3);
        assertThat(line.value(0)).isNotNull();
        assertThat(line.value(1)).isNotNull();
//        assertThat(line.value(2)).isNotNull();
    }

    @Test
    public void 중복된_선이_있는가() throws Exception{
        boolean[] persons = {true, true, false};
        Line line = new Line(persons);
        assertThat(line.value(0)).isEqualTo(true);
        assertThat(line.value(1)).isEqualTo(true);

    }
}
