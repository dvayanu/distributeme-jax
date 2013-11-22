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

http://{{url}}:{{port}}/dimejaxrs/rest/FirstService/printHelloWorld
prints hello world to your console  


http://{{url}}:{{port}}/dimejaxrs/rest/FirstService/getMessageBack
sends the message back (json message)

http://{{url}}:{{port}}/dimejaxrs/rest/FirstService/callWithParameter
with json:
{"value": "Howdy"}

============

=== Why

DistributeMe JAXRS Support allows you to create REST Resources out of JavaInterfaces by simply adding one annotation. This allows you to distribute your application in a very easy way

