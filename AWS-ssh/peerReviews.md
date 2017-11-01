# Design/Code Review 2

## Project: scheduler

### Developer: NIKO

#### Reviewer: Mack

|Item |Criteria|Rating | Comments/Suggestions|
|--------|---------|---------------|---|
||| Use the following scale:<br> 1= It needs more work<br>  2 = Somewhat<br> 3 = Yes it is great|Reviewer comments and suggestions go here. Each item should have *at least* one "kudos" and two suggestions for improvement|3 | pro: you have all the tests done and a generic dao which is awesome. 2 cons: 1. needs to get an add user working. and 2. you still need to get the jquery to load the correct time and dates, and save the state of the chore or not. |
|**Application Functionality**|1. At least 25% of the application's target functionality has been built and is working. </br>2. In comments/suggestions field list and evaluate the functionality that has been implemented.  | 2 | pro: your coverage meets what you want but... 2 cons: 1. the code coverage could be bettere and you said you would work on it. and 2. you have some of the right annotations but not all that were listed, so work on that.
|**Unit Tests**|1. Code coverage stats meets or exceeds the developer's code coverage goal. <br> 2. Unit tests are meaningful - they test the business logic and data access aspects of the application (simple methods like getters and setters are not tested) </br> 3. In comments/suggestions field list the code coverage goal and actual current coverage percentage. <br>4. @Before/@BeforeClass/@After/@AfterClass used to reduce redundant code, like creation of entities.<br>5. A test database is used for unit testing and data is cleaned up/reset before or after the tests, so that the tests are re-runnable without developer intervention/cleanup. | 2 | pro: he has the tests for the generic dao which is hard to do. 2 cons: 1. you dont use all the annotations that are listed and might want to think about using them. 2. you might want to think about just doing the add method after the delete and so on
|**JSPs**|1. Templating is used to eliminate rundandant code(for example, header.jsp, footer.jsp, etc.) <br> 2. CSS or a CSS framework has been implemented to give the site a professional look and feel<br> 3. There is not any embedded java code in the JSPs (EL and JSTL is used appropriately).| 3 | pro: the jsps you have are colorful and very vibrant. 2 cons: 1. the font might be a little light and hard to see when looking at your webpage. and 2. the content is kinda small for the webpage and might want to make it bigger.
|**Code quality**|1. Methods are single-purpose<br> 2. Classes appropriately-sized classes (no monster classes). </br > 3. Methods do not contain many branches or loops that could be simplified or broken up into smaller methods. <br /> 4. The same lines of code are not repeated at all <br> 5. Uses interfaces/super/subclass relationships rather than repeating functionality in multiple classes? For example, using a generic/abstract dao. <br />6. Code does not contain any hard-coded values that should be in a properties file </br> 7. Appropriate logging levels are used. Info, debug, error, etc. </br> 8. There are not any System.out.println() or printStackTrace() statements in the code </br> 9. Package, class, method and variable names are descriptive and meaningful. <br/>10. Include in the comments section what technique you used to evaluate the items above. Using a code quality plug-in is highly recommended as a starting point for code quality reviews. | 2 | pro: the code actualy is clean and easy to read. not jumbled. 2 cons: 1. you might want to think about using javadoc and that would be smart to have and read. and 2. uswe indintation the right way. when you indent, use 4 not 2 spaces because it will clean it up a lot. |
|**Web Service/API integration**|1. Web service/api has been identified in the project problem statement/list of technologies. </br> 2. Web Service integration has been built. <br /> 3. Web Service integration has been unit tested. | 1 | pro: you have an idea of what you want to do con: you dont have anything written yet |
|**Independent research topic**| 1. Topic has been identified in the project problem statement/list of technologies. </br> 2. Topic research is complete and documented. <br /> 3. Topic has been implemented in the project| 1 | pro: you have an idea of what you want to do con: nothing is implemented.|  
|**Key takeaways**|List at least 3 things you learned while reviewing this project that will help you in your own project.| 69 | 1. i hvae seen that generic dao is doable to implement. 2. using jquery to update things in the front end is not as hard as it sounds. and 3. colorful front end really catches your eye.

  
  
  

# Design/Code Review 2

## Project: choretracker

### Developer: Sam Soper

#### Reviewer: Mack

|Item |Criteria|Rating | Comments/Suggestions|
|--------|---------|---------------|---|
||| Use the following scale:<br> 1= It needs more work<br>  2 = Somewhat<br> 3 = Yes it is great|Reviewer comments and suggestions go here. Each item should have *at least* one "kudos" and two suggestions for improvement|  |  |
|**Application Functionality**|1. At least 25% of the application's target functionality has been built and is working. </br>2. In comments/suggestions field list and evaluate the functionality that has been implemented.  | 2 | pro: you have a good start but... 2 cons: 1. you need to do more, but its coming together! and 2. you have auth working, but mainly thats it, so i would get more done soon
|**Unit Tests**|1. Code coverage stats meets or exceeds the developer's code coverage goal. <br> 2. Unit tests are meaningful - they test the business logic and data access aspects of the application (simple methods like getters and setters are not tested) </br> 3. In comments/suggestions field list the code coverage goal and actual current coverage percentage. <br>4. @Before/@BeforeClass/@After/@AfterClass used to reduce redundant code, like creation of entities.<br>5. A test database is used for unit testing and data is cleaned up/reset before or after the tests, so that the tests are re-runnable without developer intervention/cleanup. | 1 | pro: you have one test for the user dao, but thats it. 2 cons: 1. you only 1 of your 5 tests done and 2. your test dont run multiple times becasue you don't recreate after deleting.
|**JSPs**|1. Templating is used to eliminate rundandant code(for example, header.jsp, footer.jsp, etc.) <br> 2. CSS or a CSS framework has been implemented to give the site a professional look and feel<br> 3. There is not any embedded java code in the JSPs (EL and JSTL is used appropriately).| 1 | pro: you have a working page that show data from the database. 2 cons: 1. you dont have anything else, and might want to get that done. and 2. you have jstl working, but only for one page, i would get more working.
|**Code quality**|1. Methods are single-purpose<br> 2. Classes appropriately-sized classes (no monster classes). </br > 3. Methods do not contain many branches or loops that could be simplified or broken up into smaller methods. <br /> 4. The same lines of code are not repeated at all <br> 5. Uses interfaces/super/subclass relationships rather than repeating functionality in multiple classes? For example, using a generic/abstract dao. <br />6. Code does not contain any hard-coded values that should be in a properties file </br> 7. Appropriate logging levels are used. Info, debug, error, etc. </br> 8. There are not any System.out.println() or printStackTrace() statements in the code </br> 9. Package, class, method and variable names are descriptive and meaningful. <br/>10. Include in the comments section what technique you used to evaluate the items above. Using a code quality plug-in is highly recommended as a starting point for code quality reviews. | 2 | pro: your code quality is good for what is there, its clean. cons: 1. you dont have much code overall, and not much there. and 2. the code there doesnt have javadoc, so i would think about adding it. |
|**Web Service/API integration**|1. Web service/api has been identified in the project problem statement/list of technologies. </br> 2. Web Service integration has been built. <br /> 3. Web Service integration has been unit tested. | 1  | pro: you have something picked out. con: you dont have any of it implemented. |
|**Independent research topic**| 1. Topic has been identified in the project problem statement/list of technologies. </br> 2. Topic research is complete and documented. <br /> 3. Topic has been implemented in the project| 1 | pro: you have something picked con: ypou havent implemented anything at all |  
|**Key takeaways**|List at least 3 things you learned while reviewing this project that will help you in your own project.| 12 | 1. i have seen some good code quality that i should be using. 2. you database has the right set up for the user and user roles and i should be keeping that up to date. 3. you have all the tests passing for the one test you wrote and i need to get that done and fixed.

  
  
  

