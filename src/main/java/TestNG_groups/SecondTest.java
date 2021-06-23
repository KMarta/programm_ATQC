package TestNG_groups;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTest {

    @Test
    @Parameters({"New functionality"})
    public void test(@Optional String functionality) {
        System.out.println("New functionality is:  " + functionality);
    }

    {
        System.out.println("Opening browser");
    }

    @Test(groups = {"windows regression"})
    public void windows() {
        System.out.println("Search functionality test");
    }

    @Test(groups = {"linux regression"})
    public void linux() {
        System.out.println("closing browser");
    }


}
