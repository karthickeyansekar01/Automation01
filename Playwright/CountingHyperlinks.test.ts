import { test, expect } from '@playwright/test';

test('Count hyperlinks on a page', async ({ page }) => {
    await page.goto('https://www.wikipedia.org/');

    const linksCount: number = await page.locator('a').count();
    console.log(`Total hyperlinks on the page: ${linksCount}`);

    expect(linksCount).toBeGreaterThan(0);
});
