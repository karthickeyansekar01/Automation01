
describe('Verify page title', ()=>{
  it('login validation test 1', ()=>{
  cy.visit('https://opensource-demo.orangehrmlive.com/')
  cy.get(':nth-child(2) > .oxd-input-group > :nth-child(2) > .oxd-input').type('Admin')
  cy.get(':nth-child(3) > .oxd-input-group > :nth-child(2) > .oxd-input').type('admin123')
  cy.get('.oxd-button').click()
  cy.get('.oxd-userdropdown-tab > .oxd-icon').click()
  cy.get(':nth-child(4) > .oxd-userdropdown-link').click()
  
  })
  
    
     
 }) 