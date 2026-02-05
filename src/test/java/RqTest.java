import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RqTest {

    @Test
    @DisplayName(value = "rq.getActionName()")
    void t1() {

        Rq rq = new Rq("삭제?id=1");
        String actionName = rq.getActionName();
        assertThat(actionName).isEqualTo("삭제");
    }
}
