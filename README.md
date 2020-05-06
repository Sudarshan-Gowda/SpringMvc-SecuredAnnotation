# SpringMvc-SecuredAnnotation
Method Security with @Secured Annotations based on User Role

### Steps to run the application:

1. Download or Clone this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/SpringMvc-SecuredAnnotation.git
```

2) Use the below command to run the application locally. Before that make sure you have maven plugin installed in your machine.
``
mvn tomcat7:run-war
``

3) Once the application launched up successfully, Use the below credentails to login into system.
   Currenlty two users are maintained in the system and each one having different role.
   <ol>
     <li>Username - user, password - password, role - ROLE_USER </li>
     <li>Username - admin, password - password, role - ROLE_ADMIN </li>
   </ol>
  
4) Here the method is secured with @Secured annotation based on the roles of the user, So each user will be having different access rights to the specific url or the screen.

5) Find the below code snippet for the configuration and usage of @Secured annotation in method level,

       @Secured("ROLE_USER")
     	 int placeOrder(TechnologyDetails order);

	     @Secured("ROLE_ADMIN")
	     List<TechnologyDetails> getOrderList();
      
      
 6)  You can also configure the multiple role access to same function as below,
            
      @Secured({"ROLE_USER","ROLE_ADMIN"})
      
      
