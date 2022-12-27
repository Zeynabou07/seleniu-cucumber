@suite_de_test1
Feature: Je souhaite verifier la page de la deconnexion
  
  En tant que utilisateur je souhaite verifier la page de  deconnexion

  Background: 
    Given Je me connecte sur l application NopCommerce
    When Je saisis le admin_email "admin@yourstore.com"
    And Je saisis le admin_password "admin"
    And Je clique sur le bouton Login

  @deconnexion
  Scenario: Je souhaite verifier la deconnexion
    Given Je clique sur le bouton logout
    Then Je suis deconnecte de la page "Welcome, please sign in!"
