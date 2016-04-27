import java.util.ArrayList;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("CD list!");
  }

  @Test
  public void CdIsCreatedTest(){
    goTo("http://localhost:4567/");
    fill("#cdName").with("Thank Your Lucky Stars");
    fill("#artistName").with("Beach House");
    submit(".btn");
    assertThat(pageSource()).contains("has been saved.");
  }
  //
  // @Test
  // public void CdIsDisplayedTest() {
  //   goTo("http://localhost:4567/");
  //   fill("#cdName").with("Thank Your Lucky Stars");
  //   submit(".btn");
  //   click("a", withText("Go Back"));
  //   assertThat(pageSource()).contains("Thank Your Lucky Stars");
  // }
  //
  //
  // @Test
  // public void multiplePlacesAreDisplayedTest() {
  //   goTo("http://localhost:4567/");
  //   fill("#cdName").with("Thank Your Lucky Stars");
  //   submit(".btn");
  //   click("a", withText("Go Back"));
  //   fill("#cdName").with("Istanbul");
  //   submit(".btn");
  //   click("a", withText("Go Back"));
  //   assertThat(pageSource()).contains("Thank Your Lucky Stars");
  //   assertThat(pageSource()).contains("Istanbul");
  // }
}
