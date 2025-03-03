import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {

    @Test
    void successfulLogin() {
        open("https://auth.niffler.qa.guru/login");
        $("[name=username]").setValue("Alina");
        $("[name=password]").setValue("kovralina");
        $("[type=submit]").click();

        $("[id=spendings]").shouldHave(text("History of Spendings"));

    }
