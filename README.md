# TP-N-4-Mise-en-oeuvre-d-un-micro-service
#### Objectives:
   1.Créer un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok
   
   2.Créer l'entité JPA Compte
   
   3.Créer l'interface CompteRepository basée sur Spring Data
   
   4.Tester la couche DAO
   
   5.Créer le Web service Restfull qui permet de gérer des comptes
   
   6.Tester le web micro-service en utilisant un client REST comme Postman
   
   7.Générer et tester le documentation Swagger de des API Rest du Web service
   
   8.Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections
   
   9.Créer les DTOs et Mappers
   
   10.Créer la couche Service (métier) et du micro service
   
   11.Créer un Web service GraphQL pour ce micro-service
   
   #### 1.Projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok pour gérer les comptes bancaires:
   
   la liste des comptes dans la BD:
   
   <img width="524" alt="2" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/6e5bebe1-bf5d-40d3-be02-afdc6f3bd294">

   la liste des bankaccounts:
   <img width="950" alt="11_web_service 1" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/b48c53ed-2efe-4cce-8dd8-cf23d36548ae">
   
  Le Web Service restful communique avec le monde exterieur via un rest API : Le Test avec Postman usant le Id :
  
  <img width="490" alt="10_web service 1" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/175f6013-1137-4936-8012-1afd976a4f4b">
  
  ### 7.Générer et tester le documentation Swagger:
  la liste des comptes:
  
  <img width="607" alt="7" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/8495aad7-0bea-422a-9047-c4d357799d49">
  
  Tester un compte avec un id:
  
  <img width="371" alt="8" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/8955e735-ffd1-4697-903b-b8df9702c472">
  
  Creation d'un account en utilisant post:
  
  <img width="780" alt="9" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/cde05fca-5be2-4396-9999-4e236ce4f79e">
  
  ### 8. Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections:
  En donnant les link pour chaque account:
  
  <img width="948" alt="3" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/41b24d4e-f723-490e-986e-4e0aed57b9b1">
  
  Rechercher tous les comptes par rapport a son type :
  
  <img width="952" alt="12" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/6b62c9d4-3881-4f66-9301-e1c590fb8483">
  
  La projection:
  
  <img width="822" alt="13_projection" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/ea64af67-c5ae-429a-8620-981c134a8c57">
  
  ### 11. Créer un Web service GraphQL pour ce micro-service :
  
          liste de compte utilisant l'identifiant, le solde, la devise, le type et requête pour récupérer une liste de comptes:
          
 <img width="944" alt="22_bestgraphql" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/f8462a39-44b6-454f-bcaf-7efef6dc6e7e">
          
          Recuperer un compte sachant que l' Id:
          
  <img width="800" alt="26_UpdateGrapheQl" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/20040870-65ea-4882-85f8-3f1cf85d9ba9">

           Exception handeler:
           
   <img width="800" alt="24_notfound" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/f3b2e353-8e8d-43de-b361-4902ea405f9a">

           
           Ajouter un compte en utilisant la mutation :
   <img width="868" alt="25_ADDAcountGraphql" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/ce5372de-38d3-4233- 809d34a20a982387">
           
           Mettre à jour le compte en utilisant l'identifiant :
           
<img width="896" alt="26_UpdateGrapheQl" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/6c66bea3-7259-439b-9fb7-baf1aa788d56">
           
           Supprimer l'account :
      <img width="876" alt="27_Delete" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/e3111604-6c6d-4067-9300-546977a2204b">
           
           la Base de donnée Customer :
           
   <img width="404" alt="29_customer" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/825b8088-bba4-4e0f-9571-88adfa928809">
           
           la Base de données bankAccount on ajoute customer_ID:
           
           <img width="632" alt="28" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/629e7d77-8a31-4063-a876-80cde8d6774e">
           
           Rechercher par nom de client :
           <img width="893" alt="30" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/1f8a9bb1-1725-48dc-8efe-cdedf6e93fa5">
           


           


  













   
   
