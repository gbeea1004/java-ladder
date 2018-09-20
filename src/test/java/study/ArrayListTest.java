package study;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListTest {
    @Test
    public void study() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");

        assertThat(list.size()).isEqualTo(2);
        assertThat(list.get(0)).isEqualTo("first");
        assertThat(list.contains("first")).isEqualTo(true);
        assertThat(list.remove(0)).isEqualTo("first");
        assertThat(list.contains("first")).isEqualTo(false);
    }
}
