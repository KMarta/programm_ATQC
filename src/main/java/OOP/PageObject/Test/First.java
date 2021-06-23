package OOP.PageObject.Test;

import org.junit.jupiter.api.Test;

public class First extends TestBase {

    @Test
    public void firstTest() {
        main.goTo();
        main.chooseTask("Tutorials");
        taskOne.checkPageIsCorrect();
    }
}
