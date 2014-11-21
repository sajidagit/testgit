/**
 * Created by HashmiS on 21/11/14.
 */

import cucumber.api.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@Cucumber.Options(format={"pretty", "html:target/cucumber"},features="src/test/resources/search.feature")
@Cucumber.Options(tags = {"@login"}, format={"pretty", "html:target/cucumber"})


public class RunCukeTest {

}
