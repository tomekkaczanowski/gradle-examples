package pl.kaczanowscy.gradle.selenium.testng;

import org.testng.annotations.*;

@Test
public class TestNGSeleniumTest {

    @BeforeClass(alwaysRun = true)
    public void serverSetUp() {

    }

    public void googleShouldFindMyBlog() {

    }

    @AfterClass(alwaysRun = true)
public void setupAfterSuite() {
  selenium.stop();
  server.stop();
}
}