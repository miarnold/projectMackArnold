# Application Flow


### User Sign up

1. User chooses sign up on the menu (available on all pages, unless the user 
is signed in already).
1. User fills out the sign up form and submits.
1. Request goes to sign up servlet.
1. Servlet creates a user object and then creates user in the database.
1. Response to user confirming addition (show a message on the jsp)

### User Sign In

1. User chooses sign in on the menu (available on all pages, unless the user 
is signed in already).
1. User enters username and password on form and submits. 
1. If user is authenticated, the server will handle allowing access to edit 
pages.  JDBCRealm used for authentication (users, users_roles, and roles table).
1. If authentication fails, show error message/page.

### User Routes

1. User can see there the past routes they have done on the site
(if they are signed in already)
1. Users can click the route and view the route they chose

### Dashboard

1. this is the main webpage and this will have the nav side menu
where you can access everything.
1. this will have past routes in the middle, nav menu on the side
and to the right it will list out your cars
1. you will also have the choice to edit profile.

### google maps page

1. this page will have a google maps so you can trace outand 
measur how far you actually went and for how long
1. 

### Your cars page

1. this page will list out your cars from the edmunds api, and you can delete
the cars from yore profile or add cars right there.
1. to delete the car there will be an X near it and you can delete it and it will give a confirm 
message before you do.
1. will also give you an option to search the api for cars and add one if 
you got a new car or something.