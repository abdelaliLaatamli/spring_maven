# configre spring web to be like sping boot by maven

- fisrt when create maven project select ```maven-archetype-webapp``` [Run Maven Java Web Application in Tomcat Maven Plugin
  ](https://o7planning.org/10133/run-maven-java-web-application-in-tomcat-maven-plugin)
- then embed tomcat in project maven by adding this build pluging ````  <plugin>
  <groupId>org.apache.tomcat.maven</groupId>
  <artifactId>tomcat7-maven-plugin</artifactId>
  <version>2.2</version>
  <configuration>
  <port>9090</port>
  <ignorePackaging>true</ignorePackaging>
  </configuration>
  </plugin>```` [Embedding Tomcat Server in Maven Project](https://www.geeksforgeeks.org/embedding-tomcat-server-in-maven-project/)
- add pring mvc to project and servletto dispatch project [Spring MVC Tutorial
  ](https://www.javatpoint.com/spring-mvc-tutorial)