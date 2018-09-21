package ladder.view;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {
    @Test
    public void 최대5글자를출력하는테스트() throws Exception{
        String[] persons = {"A","BBBBB","CCCCCC"};
        assertThat(0).isEqualTo(InputView.personModified(persons, 0));
        assertThat(1).isEqualTo(InputView.personModified(persons, 1));
        assertThat(2).isEqualTo(InputView.personModified(persons, 2));

    }
}
