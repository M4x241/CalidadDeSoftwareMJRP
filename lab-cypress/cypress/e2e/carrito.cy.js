describe("Flujo de Carrito - SauceDemo", () => {
  it("Agregar un producto al carrito", () => {
    cy.visit("https://www.saucedemo.com/");
    cy.get("#user-name").type("standard_user");
    cy.get("#password").type("secret_sauce");
    cy.get("#login-button").click();
    cy.url().should("include", "inventory.html");
    cy.get(".btn_inventory").first().click();
    cy.get(".shopping_cart_badge").should("have.text", "1");
    cy.get(".shopping_cart_link").click();
  });
});
