# projectMackArnold

problem Statement - 

Commuter Application

For quite some time now people have always had bussiness trips and communtes
and now i want to make an application that basically you can log into and 
you can save your cars onto the site and then choose the car you 
are driving and then using google maps you can track how far you are driving.
Hopefully you will know how many or you can look up how many highway miles you use and
how many city miles you use, and the application will tell you from gas prices and milage,
how much the company owes you and then it will email them the recipt or you can print it out.

Some of the services I was thinking about using were things like google maps for
mapping out where you went and how far you went, and another one I was thinking about was edmunds, 
edmunds is an API that you use to get all vehicle information, from pictures to gas mileage.

### Project Technologies/Techniques 

* Security/Authentication
  * Admin role: create/read/update/delete (crud) of all data
  * User role: submit Commuter reports
  * All: quick view to see what the site does
* Database (MySQL and Hibernate)
  * Store users and roles
  * Store trail information
* Web Services or APIs
  * Google Maps for Commuter Travels
  * Edmunds for car information
* Logging
  * Configurable logging using Log4J. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting. 
* Site and database hosted on AWS
* Unit Testing
  * JUnit tests to achieve 80% code coverage 
  
  ### [Project Plan](projectPlan.md)
  
  ### [Time Log](timelog.md) 
  ### [Journal](journal.md)