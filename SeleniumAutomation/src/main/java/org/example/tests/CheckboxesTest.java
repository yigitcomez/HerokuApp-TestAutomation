package org.example.tests;

import org.example.pages.CheckboxesPage;
import org.example.utils.NavigationHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends tests.BaseTest {

    @Test
    public void testDefaultCheckboxStates() {
        NavigationHelper navigator = new NavigationHelper(driver);
        navigator.navigateTo("/checkboxes");

        CheckboxesPage page = new CheckboxesPage(driver);
        Assert.assertFalse(page.isCheckbox1Selected(), "Checkbox 1 should be unchecked by default");
        Assert.assertTrue(page.isCheckbox2Selected(), "Checkbox 2 should be checked by default");
    }

    @Test
    public void testSelectFirstCheckbox() {
        NavigationHelper navigator = new NavigationHelper(driver);
        navigator.navigateTo("/checkboxes");

        CheckboxesPage page = new CheckboxesPage(driver);
        if (!page.isCheckbox1Selected()) {
            page.toggleCheckbox1();
        }
        Assert.assertTrue(page.isCheckbox1Selected(), "Checkbox 1 should be checked after selection");
    }

    @Test
    public void testDeselectSecondCheckbox() {
        NavigationHelper navigator = new NavigationHelper(driver);
        navigator.navigateTo("/checkboxes");

        CheckboxesPage page = new CheckboxesPage(driver);
        if (page.isCheckbox2Selected()) {
            page.toggleCheckbox2();
        }
        Assert.assertFalse(page.isCheckbox2Selected(), "Checkbox 2 should be unchecked after deselection");
    }
}
