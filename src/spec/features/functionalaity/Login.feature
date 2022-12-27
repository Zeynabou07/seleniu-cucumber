@suite_de_test1
Feature: Je souhaite verifier la page de la connexion
  
  En tant que utilisateur je souhaite verifier la page de la connexion afin de m authentifier

  @connexion
  Scenario: Je souhaite verifier la connexion avec identifiants et de passe correct
    Given Je me connecte sur l application NopCommerce
    When Je saisis le admin_email "admin@yourstore.com"
    And Je saisis le admin_password "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home "Dashboard"
