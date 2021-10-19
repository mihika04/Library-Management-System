# Library-Management-System
A library management system designed for a librarian.

## Installation

Install JDK 11, MySQL Workbench and an IDE(Eclipse/IntelliJ) that supports Spring projects. Configure a Tomcat server in your IDE for a successful run.

## Usage

Create a schema in your workbench with the name "library_mgmt" and update the value of username and password accordingly in dispatcher-servlet.xml that can be found in src/main/webapp/WEB-INF/dispatcher-servlet.xml. 

'''
<bean class="org.springframework.jdbc.datasource.DriverManagerDataSource" 
  name="ds"> 
   <property name="driverClassName" value="com.mysql.cj.jdbc.Driver"></property>
   <property name="url" value="jdbc:mysql://localhost:3306/library_mgmt"></property>
   <property name="username" value="root"></property>
   <property name="password" value="1234"></property> 
 </bean>
'''
Run the project on the server configured in your IDE.



