package stepDefinition;

import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class discountSteps {

    leftNav lv = new leftNav();

    @Given("^Click on Discount$")
    public void click_on_Discount() throws Throwable {
        lv.clickOnDiscounts();
    }

    @Given("^Type in the Description \"(.*?)\"$")
    public void type_in_the_Description(String arg1) throws Throwable {

    }

    @Given("^Type in the IntegrationCode \"(.*?)\"$")
    public void type_in_the_IntegrationCode(String arg1) throws Throwable {

    }

    @Given("^Type in the priority \"(.*?)\"$")
    public void type_in_the_priority(String arg1) throws Throwable {

    }

}
