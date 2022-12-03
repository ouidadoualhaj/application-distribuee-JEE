la mise en place d’une application distribuée en utilisant une variété des technologies centrées sur EJB3.

ETAPE 1: Installez le plugin Jboss AS en tapant sur le marketplace d’eclipse le mot clé «JBoss Tools» , puis installez WildFly via le Wizard.

![image](https://user-images.githubusercontent.com/97354112/205466233-de17ca43-e842-46a1-abc7-1ea59824894c.png)

![image](https://user-images.githubusercontent.com/97354112/205466237-2a0dfe9d-0c31-40f6-aba2-8eacf5c8068e.png)


ETAPE 2: Créez une base de données sous le nom Getudiants avec une table étudiant sous le SGBD MYSQL, la table doit contenir les champs suivant (id_etudiant, nom , prénom , cne , adresse , niveau).

![image](https://user-images.githubusercontent.com/97354112/205466247-53a6c80a-6228-428b-82a4-3a5b52257f3a.png)

ETAPE 3: Créez un projet EJB avec un EJB module supérieur à 3 puis créez le fichier persistence.xml dans le répertoire META-INF.

![image](https://user-images.githubusercontent.com/97354112/205466252-a7912a30-8701-4b6e-a412-9e31fddfb4e2.png)

ETAPE 4: Configuration du server wildfly en suivant ce tutoriel :

https://medium.com/@hasnat.saeed/install-and-configure-mysql-jdbc-driver-on-jboss-wildfly-e751a3be60d3

Si la configuration est bien faite alors la connexion avec le data Source doit être établie !

![image](https://user-images.githubusercontent.com/97354112/205466258-c56a544f-035d-4838-a3fe-c7f692262f68.png)

ETAPE 4: Créez la class persistante Etudiant en utilisant les annotations JPA.

![image](https://user-images.githubusercontent.com/97354112/205466262-c0b4ff76-c213-4b5a-8552-64b3c2d4bb0d.png)

ETAPE 5: Créez une EJB de type SessionBean avec une interface Remote cette SessionBean doit contenir tous les méthodes CRUD de l’étudiant en Utilisant

![image](https://user-images.githubusercontent.com/97354112/205466265-c6ca72a9-1c23-44c4-8ba1-7467d0d53534.png)

ETAPE 6: Créez un projet web dynamique avec un web module 4 et JSF 2.x qui va consommer les méthodes du projet EJB « CRUD Etudiant ».

![image](https://user-images.githubusercontent.com/97354112/205466271-3de4672b-e10d-4fb9-9c2c-1db12af783bc.png)

Pour lier le projet web (jsf) à notre EJB il faut : -l'Injection de dépendance par l’utilisation de l’annotation @Remote au niveau de l'interface remote (EtudiantTraitementRemote) -l'Injection de dépendance par l’utilisation de l’annotation @EJB au niveau de la classe EtudiantBean.java
