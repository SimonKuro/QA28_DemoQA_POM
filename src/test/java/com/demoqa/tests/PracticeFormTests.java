package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm().hideIframes();
    }

    @Test
    public void registerNewStudentTest(){
        new PracticeFormPage(driver).enterPersonalData("Connor", "Wolfenstein", "connorwolf@gmail.com", "12345678901")
                .selectGender("Male")
                .enterDate("16 Aug 1991")
                .selectSubjects(new String[]{"Maths", "English", "Chemistry"})
                .selectHobbies(new String[]{"Sports", "Reading", "Music"})
                .uploadFile("C:/Tools/1.png")
                .selectState("NCR")
                .selectCity("Delhi")
                .submit();

    }

    @Test
    public void registerNewStudentWithChooseDateTest(){
        new PracticeFormPage(driver).enterPersonalData("Connor", "Wolfenstein", "connorwolf@gmail.com", "12345678901")
                .selectGender("Male")
                .chooseDate("December", "1988", "16")
                .selectSubjects(new String[]{"Maths", "English", "Chemistry"})
                .selectHobbies(new String[]{"Sports", "Reading", "Music"})
                .uploadFile("C:/Tools/1.png")
                .selectState("NCR")
                .selectCity("Delhi")
                .submit();

    }


}
