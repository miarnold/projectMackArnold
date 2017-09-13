# projectMackArnold

problem Statement - 

Commuter Application

Right now, the common theme for people commuting would be they would do the commuting and they would track the miles 
for where ever you are going and back, and most people would have to fill out an exspense report to get the money back.
and this would never take into account the gas prices that sometimes can sky-rocket and can also be an all-time low, but 
the gas prices can affect how much your paying for commuting that wont be paid back. Another problem that can cause money not being paid back
problems is the actual mpg your current car gets.

My service will have a google map to track how far you actually went and you can count highway vs city miles,
and it will take into account the current gas prices you remember. its going to calculate the actual amount of money
your company owes you, not the base rate. 

Some of the services I was thinking about using were things like google maps for
mapping out where you went and how far you went. Another one I was thinking about was edmunds, 
edmunds is an API that you use to get all vehicle information, from pictures to gas mileage. And if I have time
I will look into a gas prices API that tells you the current gas prices and your can use that in the report.

### Project Technologies/Techniques 

* Security/Authentication
  * Admin role: create/read/update/delete (crud) of all data
  * User role: submit Commuter reports
  * All: quick view to see what the site does
* Database (MySQL and Hibernate)
  * Store users and roles
  * Store commuting information
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