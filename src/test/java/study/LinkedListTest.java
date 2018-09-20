package study;

import org.junit.Test;

import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListTest {
    @Test
    public void study() throws Exception{
        LinkedList<String> list = new LinkedList<String>();
        list.add("first");
        list.add("second");

        assertThat(list.size()).isEqualTo(2);
        assertThat(list.get(0)).isEqualTo("first");
        assertThat(list.contains("first")).isEqualTo(true);
        assertThat(list.remove(0)).isEqualTo("first");
        assertThat(list.contains("first")).isEqualTo(false);
    }
}
