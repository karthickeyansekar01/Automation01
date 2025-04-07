
describe('Dropdown tests', ()=>{
    beforeEach(()=>{
    cy.visit('https://practice.expandtesting.com/');
    cy.get(':nth-child(11) > :nth-child(3) > .card > .card-body >.card-title > .my-link').click();
    })
    it('Choose an option and verify', ()=>{
    cy.get('#dropdown').select('Option 1');
    cy.get('#country').select('India');
    cy.get('#dropdown').should('have.value', '1');
    cy.get('#country').should('have.value', 'IN');
    })
   })
   