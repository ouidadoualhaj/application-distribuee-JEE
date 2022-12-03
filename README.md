la mise en place d’une application distribuée en utilisant une variété des technologies centrées sur EJB3.

ETAPE 1: Installez le plugin Jboss AS en tapant sur le marketplace d’eclipse le mot clé «JBoss Tools» , puis installez WildFly via le Wizard.

image

image

ETAPE 2: Créez une base de données sous le nom Getudiants avec une table étudiant sous le SGBD MYSQL, la table doit contenir les champs suivant (id_etudiant, nom , prénom , cne , adresse , niveau).

image

ETAPE 3: Créez un projet EJB avec un EJB module supérieur à 3 puis créez le fichier persistence.xml dans le répertoire META-INF.

image

ETAPE 4: Configuration du server wildfly en suivant ce tutoriel :

https://medium.com/@hasnat.saeed/install-and-configure-mysql-jdbc-driver-on-jboss-wildfly-e751a3be60d3

Si la configuration est bien faite alors la connexion avec le data Source doit être établie !

image

ETAPE 4: Créez la class persistante Etudiant en utilisant les annotations JPA.

image

ETAPE 5: Créez une EJB de type SessionBean avec une interface Remote cette SessionBean doit contenir tous les méthodes CRUD de l’étudiant en Utilisant

image

ETAPE 6: Créez un projet web dynamique avec un web module 4 et JSF 2.x qui va consommer les méthodes du projet EJB « CRUD Etudiant ».

image

Pour lier le projet web (jsf) à notre EJB il faut : -l'Injection de dépendance par l’utilisation de l’annotation @Remote au niveau de l'interface remote (EtudiantTraitementRemote) -l'Injection de dépendance par l’utilisation de l’annotation @EJB au niveau de la classe EtudiantBean.java
