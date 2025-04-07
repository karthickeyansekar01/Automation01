describe('Verify page title', ()=>{
  it('form validation', ()=>{
  cy.visit('https://ecommerce-playground.lambdatest.io/index.php?route=account/register')

  cy.get('#input-firstname').type('Test1')
 cy.get('#input-lastname').type('new1')
 cy.get('#input-email').type('test2803@email.com')
 cy.get('#input-telephone').type('0123456789')
 cy.get('#input-password').type('pass2');
 cy.get('#input-confirm').type('pass2');
 cy.get('.col-sm-10 > :nth-child(1) > .custom-control-label').click()
 cy.get('.float-right > .custom-control').click()
 cy.get('.float-right > .btn').click();
 cy.title().should('eq', 'Your Account Has Been Created!')
  
  })
 }) 
