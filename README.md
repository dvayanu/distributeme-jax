distributeme-jax
================

Test project for JAX-RS Generation Feature of DistributeMe


================

This is a test project for testing of JAX-RS Support of DistributeMe.  

If you want to test it, obtain distributeme-2.1.2-SNAPSHOT (for example build it locally from distributeme on github or use sonatype repository)
build the project: 

mvn clean package  

copy dimejaxrs.war into your tomcat (or jetty, or whatever)  

run your servlet container    

you should now be able to send requests with postman (via POST):  

http://{{url}}:{{port}}/{{app}}/rest/FirstService/printHelloWorld

