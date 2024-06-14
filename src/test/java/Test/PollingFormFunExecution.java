package Test;

import com.pages.*;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PollingFormFunExecution extends LaunchBrowser {

    public PollingFormFunExecution() throws FileNotFoundException {
    }

    @Test(priority = 1)
    public void LoginTest() throws IOException {

        LoginPage login = new LoginPage(driver);

        login.ClickMainLogin();
        login.setUsername(properties.getDataFromPropertyFile("username"));
        login.setPassword(properties.getDataFromPropertyFile("password"));
        login.ClickLoginbutton();
    }

    @Test(priority = 2)
    public void pilotPoling() {

        Home_Polling pilot = new Home_Polling(driver);
        pilot.clickResources();
        pilot.clickSRC_Forms();
        pilot.clickPilotPollingForm();
    }

    @Test(priority = 3)
    public void AnswerTheQuestions() throws InterruptedException {
        PilotPollingForm answer = new PilotPollingForm(driver);
        PageScrolling scroll = new PageScrolling(driver);
        answer.selectQuestion1();
        answer.selectQuestion2();
        Thread.sleep(500);
        scroll.setScroll300();
        answer.selectQuestion3();
        answer.selectQuestion4();
        Thread.sleep(500);
        scroll.setScroll300();
        answer.selectQuestion5();
        answer.selectQuestion6();
        Thread.sleep(500);
        scroll.setScroll300();
        answer.selectQuestion7();
        answer.selectQuestion8();
        Thread.sleep(500);
        scroll.setScroll300();
        answer.selectQuestion9();
        answer.selectQuestion10();
        Thread.sleep(500);
        scroll.setScroll300();
        answer.selectQuestion11();
        answer.SetSubmitButton();

    }
    @Test(priority = 4)
    public void verifySubmitted() throws IOException {
        PilotPollingForm assertion = new PilotPollingForm(driver);
        assertion.VerifyMessage();
    }

}
