import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ListClientExampleTest {

    @Test
    @DisplayName("구현체를 LinkedList에서 ArrayList로 변경한다.")
    void testListClientExample() {
        ListClientExample lce = new ListClientExample();
        @SuppressWarnings("rawtypes")
        List list = lce.getList();
        assertThat(list).isInstanceOf(ArrayList.class);
    }
}
