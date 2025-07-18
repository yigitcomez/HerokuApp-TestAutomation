package org.example.tests;

import org.example.pages.ChallengingDomPage;
import org.example.utils.NavigationHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChallengingDomTest extends BaseTest {

    @Test
    public void testChallengingDomPage() {
        NavigationHelper navigator = new NavigationHelper(driver);
        navigator.navigateTo("/challenging_dom");

        ChallengingDomPage page = new ChallengingDomPage(driver);

        Assert.assertTrue(page.isTableDisplayed());
        page.clickFirstButton();

        String cellText = page.getCellData(1, 1);
        Assert.assertFalse(cellText.isEmpty());
    }

}
