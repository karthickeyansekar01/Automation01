describe('Simple Cypress Test', () => {
  it('Visits the Example Site and Checks Title', () => {
    cy.visit('https://www.google.com'); // Visit Google  site
    cy.title().should('include', 'Google'); // Assert title contains "Google"
  });
});