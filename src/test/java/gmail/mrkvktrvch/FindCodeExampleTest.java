package gmail.mrkvktrvch;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class FindCodeExampleTest {

    @Test
    void shouldBeCodeExampleForJunit5 () {

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box").$(withText("more pages")).click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions")).$(byText("SoftAssertions"))
                .click();
        $("ol").shouldHave(text("JUnit5 extension - com.codeborne.selenide.junit5." +
                "SoftAssertsExtension"));

    }

}
