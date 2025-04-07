import { test, expect } from '@playwright/test';

test('Handle alerts and popups', async ({ page }) => {
    await page.goto('https://the-internet.herokuapp.com/javascript_alerts');

    page.on('dialog', async (dialog) => {
        console.log(`Dialog message: ${dialog.message()}`);
        await dialog.accept();
    });

    await page.click('button:has-text("Click for JS Alert")');
    await expect(page.locator('#result')).toContainText('You successfully clicked an alert');
});