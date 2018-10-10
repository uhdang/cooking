# HowTo
## Build
$ mvn install

## Run
$ mvn spring-boot:run

## Compile
$ mvn compile

## Compile Java code, run any tests, and finish by packaging the code up in a JAR file within the _target_ directory.
$ mvn package

## Install project's JAR file to that local repository
$ mvn install

## Kill port
$ sudo kill `sudo lsof -t -i:8080`

## Check port
$ lsof -i :8080

## Run MySQL DBS
$ docker run --name cooking-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=cooking-db-root-pw -d mysql:8.0

## Connect to DBS
$ docker exec -it [DBNAME] bash
$ mysql -u [USERNAME] -p

## Create dataabase
mysql> create database [DATABASE]; 

## Create a user + give privileges to the new user
mysql> create user 'springuser'@'localhost' identified by 'ThePassword';
mysql> grant all on db_example.* to 'springuser'@'localhost';


## Build an executable JAR
- Building a single executable JAR file that contains all necessary dependencies, classes, and resources makes it easy to ship, version, and deploy the service as an application throughout the development lifecycle, across different environments, and so forth.

### Maven Command
- run the application
$ ./mvnw spring-boot:run 

OR

- build the JAR file with
$ ./mvnw clean package
- then run JAR file
$ java -jar target/[NAME OF JAR FILE]



## Reference
https://medium.com/@benjaminliu_42474/how-to-setup-spring-boot-with-reactjs-and-webpack-9b190edeb0c8
