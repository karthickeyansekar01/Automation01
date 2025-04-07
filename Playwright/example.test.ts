import { test, expect } from '@playwright/test';

test('Open a website and take a screenshot', async ({ page }) => {
    await page.goto('https://www.google.org/');
    await page.screenshot({ path: 'screenshot.png' });
    console.log('Screenshot taken');
});