package org.example.tests;

import org.example.pages.ChallengingDomPage;
import org.example.utils.NavigationHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChallengingDomTest extends tests.BaseTest {

    @Test
    public void testChallengingDomPage() {
        NavigationHelper navigator = new NavigationHelper(driver);
        navigator.navigateTo("/challenging_dom");

        ChallengingDomPage page = new ChallengingDomPage(driver);

        Assert.assertTrue(page.isTableDisplayed());
        page.clickFirstButton();
    }

}
