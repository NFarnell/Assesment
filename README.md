# Inventory Management System
I'm creating an inventory management system to give usability into a MySqlDatabase which has already been set up to use. I will have the
ability to create, read , update and delete into all my tables. This will allow a user to manipulate the database without needing full
access too it. I will also be using jenkins to automatically push the code to Sonarqube.
## Getting Started
First you will need to create a MySqlInstance in google cloud platform. Next you will need to pull the code to your eclipse using Git Bash. 
To then use the program you will need to change the ip address within the code to your own database and then run as normal.
### Prerequisites
Eclipse:https://www3.ntu.edu.sg/home/ehchua/programming/howto/EclipseJava_HowTo.html

Java:https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html

Maven:https://howtodoinjava.com/maven/how-to-install-maven-on-windows/

GitBash:https://www.atlassian.com/git/tutorials/install-git

MySql:https://dev.mysql.com/doc/mysql-installation-excerpt/8.0/en/windows-install-archive.html

GoogleCloudPlatform: https://cloud.google.com/sql/docs/mysql/quickstart


### Installing
First: set up the google cloud instance of MySql

Second: pull the reporitory from github using the following commands in GitBash:
git init
git pull https://github.com/NFarnell/Assesment.git

Third: Open the repository into your IDE (Eclipse recommended).


Fourth: Change all the database connection ip addresses to your own. They are located inside Ims and all the DaoMySql classes.
This will make all connections go to there own database.

Fifth: Run the application in Eclipse using ctrl + F11. This will prompt you for a username and password. These are the details of the MySqlServer you are
connecting too. Once entered you will be presented with a List of tables of the database. Select which one you wish to manipulate by
entering the name. This will return you a list of commands Read,Create,Update and Delete all will modify data in there own way
Following the onscreen prompts. For example Read will return all this information from your table and display it in Java.

## Running the tests
To run tests within the program you will need to go to the test classes and run them these will check against the program to make sure
it is all set up correctly by inputting null data and getting example results out.
### Unit Tests




## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
## Versioning
We use [SemVer](http://semver.org/) for versioning.
## Authors
* **Chris Perrins** - *Template* - [christophperrins](https://github.com/christophperrins)
* **Nathan Farnell** -*Main body of work* - [Nathan Farnell] (https://github.com/NFarnell)
## License
This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details
 * Apache License, Version 2.0
   ([LICENSE-APACHE](LICENSE-APACHE) or http://www.apache.org/licenses/LICENSE-2.0)
 * MIT license
   ([LICENSE-MIT](LICENSE-MIT) or http://opensource.org/licenses/MIT)
## Acknowledgments
* Chris with whom it would not of been possible
* Juamal who fixed my jenkins when I broke it

Semantic Versioning
Semantic Versioning 2.0.0
Semantic Versioning spec and website
