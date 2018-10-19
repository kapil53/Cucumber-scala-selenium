package stepdefs

import java.util.concurrent.TimeUnit

import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{FluentWait, Wait}
import org.scalatest.Matchers

class MyFirstCucumberTest extends ScalaDsl with EN with Matchers {

  val driver = new ChromeDriver()

  val fluentWait: Wait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(6, TimeUnit.SECONDS)
    .pollingEvery(1, TimeUnit.SECONDS)

  Given( """^I have navigated to google$""") { () =>
    driver.navigate().to("http://www.google.com")
  }
}
