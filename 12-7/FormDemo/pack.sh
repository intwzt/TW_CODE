#!/bin/sh

cp /usr/local/apache-tomcat-9.0.0.M13/lib/servlet-api.jar /Users/ztWang/Desktop/mysql-connector-java-5.1.40/mysql-connector-java-5.1.40-bin.jar web/WEB-INF/lib

sudo javac -classpath "web/WEB-INF/lib/servlet-api.jar":"web/WEB-INF/lib/mysql-connector-java-5.1.40-bin.jar" src/servlet/AcceptUserReg.java src/servlet/User.java -d web/WEB-INF/classes 

cd web

find . -name ".DS*"  | xargs rm -f

jar -cvf FormDemo.war index.jsp WEB-INF/

mv FormDemo.war ../

cd ..


shutdown.sh
startup.sh

cp FormDemo.war /usr/local/apache-tomcat-9.0.0.M13/webapps/
