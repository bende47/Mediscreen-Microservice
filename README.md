# MEDISCREEN 

Mediscreen est une application Spring Boot permettant de dépister les risques de maladies(Diabète) des patients.   

## Getting Started

Ces instructions vous permettront d'obtenir une copie du projet sur votre ordinateur local à des fins de développement et de test. Voir déploiement pour des notes sur la façon de déployer le projet sur un système en direct.

### Prerequisites

De quoi avez-vous besoin pour installer le logiciel et comment les installer

- Java 1.8
- Maven 3.6.2
- Mysql 8.0.17
- MongoDB 3.6

### Installing

Une série d'exemples étape par étape qui vous expliquent comment lancer un env de développement:

1.Installation Java:

https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html

2.Installation Maven:

https://maven.apache.org/install.html

3.Installation MySql:

https://dev.mysql.com/downloads/mysql/

Après avoir téléchargé le programme d'installation de mysql 8 et l'avoir installé, 
il vous sera demandé de configurer le mot de passe pour le compte root par défaut. 
Ce code utilise le compte root par défaut pour se connecter et le mot de passe peut être défini comme rootroot. 
Si vous ajoutez un autre utilisateur / informations d'identification, assurez-vous de les changer dans la base de code.

4.Installation MongoDB:

https://docs.mongodb.com/manual/administration/install-community/


### Running App

- Importer chacun des services dans un IDE de votre choix. 
- Executer la commande mvn clean install
- Faire un Clique droit sur le projet -> Run as -> Spring boot App

## Docker
- Creation d'image : docker build -t nomImage . (Ex: docker build -t mediscreen-patient .)
- Lancement de l'application : docker run -p porthote:portcontainer nomImage (docker run -p 8090:8090 mediscreen-patient)
- Lister les images créées : docker image ls
- Lister les conteneurs: docker container ls

### Testing

Pour exécuter les tests à partir de maven, accédez au dossier qui contient le fichier pom.xml et exécutez la commande ci-dessous.

mvn test


