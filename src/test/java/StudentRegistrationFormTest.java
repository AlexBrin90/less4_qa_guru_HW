import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegistrationFormTest {

    @BeforeAll
    static void setUpSetting() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void studentRegistrationFormTest() {

        // 1. Перейти на страницу https://demoqa.com/automation-practice-form
        open("https://demoqa.com/automation-practice-form");

        // 2. Заполнить поле Name (ввод текста)
        $("#firstName").setValue("Alex");

        // 3. Заполнить поле Name (ввод текста)
        $("#lastName").setValue("Urse");

        // 4. Заполнить поле Email (ввод текста)
        $("#userEmail").setValue("alex@urse.net");

        // 5. Заполнить поле Gender (радиобаттон)

        // 6. Заполнить поле Mobile (только цифры)
        $("#userNumber").setValue("1234567890");

        // 7. Заполнить поле Date of Birth (?????????)
        $("#dateOfBirthInput").setValue("18 Nov 2000").pressEnter();

        // 8. Заполнить поле Subjects (?????????)
        $("#subjectsInput").setValue("English").pressEnter().setValue("Arts").pressEnter();

        // 9. Заполнить поле Hobbies (Sports и Music)

        // 10. Заполнить поле Picture (??????????)

        // 11. Заполнить поле Current Address (ввод текста)
        $("#currentAddress").setValue("Moscow, Gerc str., 8, Moscow, Glagol str., 12");

        // 12. Заполнить поле State and City (???????????)

        // 13. Нажать кнопку Submit
        $("#submit").click();
    }
}
