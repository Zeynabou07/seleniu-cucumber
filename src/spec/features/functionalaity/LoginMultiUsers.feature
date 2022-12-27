@Authentification
Feature: Je souhaite verifier la page de la connexion avec plusieurs users
  
  En tant que utilisateur je souhaite me connecter à l'application NopCommerce

  @connexion_Multiple_User
  Scenario Outline: Je souhaite me connecter avec plusieurs users
    Given Je me connecte sur l application NopCommerce
    When Je redige un admin_email  "<username>"
    And Je redige le  password "<password>"
    And Je clique sur le bouton Login

    Examples: 
      | username            | password     |
      | admin@yourstore.com | admin        |
      | zeynab@gmail.com    | admin        |
      | admin@yourstore.com | secret_sauce |
      | test@gmail.com      | secret_sauce |
