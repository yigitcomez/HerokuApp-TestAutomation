package org.example.tests;

import org.example.pages.AddRemoveElementsPage;
import org.example.utils.NavigationHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void testNoElementsInitially() {
        new NavigationHelper(driver).navigateTo("/add_remove_elements/");
        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);
        Assert.assertEquals(page.getDeleteButtonsCount(), 0, "Should start with no Delete buttons");
    }

    @Test
    public void testAddSingleElement() {
        new NavigationHelper(driver).navigateTo("/add_remove_elements/");
        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);
        page.clickAddElement();
        Assert.assertEquals(page.getDeleteButtonsCount(), 1);
    }

    @Test
    public void testAddMultipleElements() {
        new NavigationHelper(driver).navigateTo("/add_remove_elements/");
        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);
        page.clickAddElement();
        page.clickAddElement();
        page.clickAddElement();
        Assert.assertEquals(page.getDeleteButtonsCount(), 3);
    }

    @Test
    public void testRemoveSingleElement() {
        new NavigationHelper(driver).navigateTo("/add_remove_elements/");
        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);
        page.clickAddElement();
        page.clickAddElement();
        page.clickDeleteButton(0);
        Assert.assertEquals(page.getDeleteButtonsCount(), 1);
    }

    @Test
    public void testRemoveAllElements() {
        new NavigationHelper(driver).navigateTo("/add_remove_elements/");
        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);
        page.clickAddElement();
        page.clickAddElement();
        while (page.getDeleteButtonsCount() > 0) {
            page.clickDeleteButton(0);
        }
        Assert.assertEquals(page.getDeleteButtonsCount(), 0, "All elements should be removed");
    }
}
