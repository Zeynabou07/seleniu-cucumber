@suite_de_test1
Feature: Je souhaite verifier la page customer
  
  En tant que utilisateur je souhaite verifier la page customer

  Background: 
    Given Je me connecte sur l application NopCommerce
    When Je saisis le admin_email "admin@yourstore.com"
    And Je saisis le admin_password "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @customer_Add_Customer
  Scenario: Je souhaite ajouter un utilisateur
    Given Le bouton customers est visible
    When Je clique sur le bouton customers1
    And Je clique sur le bouton customers2
    And Je clique sur le bouton Add new
    And Je saisis le adresse email "zeynab@gmail.com"
    And je coche la case femelle
    And Je choisis la date de naissance "12/24/2022"
    And Je clique sur le bouton save
    Then Le message d ajout d utilisateur s'affiche "The new customer has been added successfully."

  @customer_Add_Role_Customer
  Scenario: Je souhaite ajouter un role utilisateur
    #  Given Le bouton customers est visible
    When Je clique sur le bouton customers1
    And Je clique sur le bouton customer_roles
    And La page custumer role s affiche "Customer roles"
    And Je clique sur le bouton Add new
    And La page d ajout s affiche "Add a new customer role"
    And Je saisis le nom "Zeynab"
    And Je coche la case free shipping
    And Je clique sur le bouton choose a product
    Then La page du choix du produit s affiche "choose a product"

  #And Je clique sur le bouton select du champ Build your own computer
  #And Le produit est ajoute "Build your own computer"
  #And Je clique sur le bouton save
  #Then Le message d ajout role s affiche "The new customer role has been added successfully."
  @customer_Update_Adress
  Scenario: Je souhaite modifier l adresse
    # Given Le bouton customers est visible
    When Je clique sur le bouton customers1
    And Le bouton online customers s affiche "Customer roles"
    And Je clique sur le bouton online customers
    And La page online customers s affiche "Online customers"
    And Je clique sur le client Guest
    And La page de detail s affiche "Customer info"
    And Je clique sur le bouton adresse
    And Les informations s affiche "Add new address"
    And Je clique sur le bouton Add new Adress
    And Le formulaire  a modifier s affiche "Add a new address"
    And Je choisis un pays
    And Je choisis la ville
    And je clique sur le bouton save
    Then La page de modification d adresse s affiche "The new address has been added successfully."

  @customer_search
  Scenario: Je souhaite verifier la recherche de customers
    When Je clique sur le bouton customers1
    #And Une liste deroulante s affiche "customers"
    And Je clique sur le bouton customers2
    And La page customers s affiche "Search"
    And Je saisis l email "admin@yourStore.com"
    And Je clique sur le bouton search
    Then Les informations recherchee s affiche "John Smith"

  @customer_ActivityLog
  Scenario: Je souhaite verifier le journal d activity
    When Je clique sur le bouton customers1
    #And Une liste deroulante s affiche "customers"
    And Je clique sur Activity log
    And La page du detail des logs s affiche "Activity log"
    And Je saisis dans le champ created from "12/19/2022"
    And Je clique sur search
    Then La liste des logs s affiche "12/19/2022"
