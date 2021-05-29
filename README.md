# **Hello everyone, welcome to my main repository with various Java related projects/exercises accomplished during a year long Junior Developer Course within Green Fox Academy**

In project phase (last module of bootcamp) we trained creating Spring Boot REST applications. The output were basically 2 projects - individual project, a kind of "refreshing" exercise before final exam, where we could individually practice a lot of techniques we learned from the main project. Main project was a bigger Spring Boot application which was developed in a team (by 4 of us), read about it bellow.

- **GreenBay application** - my own small REST API application, a simple eBay clone where you can sell items

https://github.com/Luzkix/FinalExamProject_greenBay - The project was about creating the GreenBay application that is a simple eBay clone. We can login as a user to sell and buy items. It is Spring JSON based Web API application (REST API). It uses Spring security and token based authentication, it is connected to SQL database (it uses Flyway versioning system) and also deployed to Heroku. It uses Junit for testing (Integration and Unit tests). For detailed specification please see the README file in the project folder.

The application is deployed on Heroku: https://greenbay-app-exercise.herokuapp.com/ , so you can play with it using e.g. Postman. For basic description of implemented API and what you can do with endpoints please check "REST API documentation for greenBay app.pdf" located in project folder. 

- **RPG game backend application** - main team project in project phase, RESTfull application, where players have their kingdoms, buildings...

https://github.com/Luzkix/alcool-tribes-backend (currently only private access) - the app is a result of 3-4 months of work of 4 developers (including me). There was like 40-50 user stories to be implemented, often overlaping so we could also learn from others. We worked in 2-week sprints. We used git branches, did mutual code reviews, trying to simulate work as if we worked in company. 

The app itself is a backend RESTful app simulating a very basic RPG game, which have players, kingdoms, various buildings(townhall, farm, mine, academy), troops, resources (gold, food), etc. We implemented Spring Security based on bearer token authentication (JWT tokens), database versioning based on Flyway, players need to verify their email address, events on all endpoints are automatically logged into console using Interceptors, player´s avatar (picture - MultipartFile) can be uploaded to/downloaded from predefined project folder, resources are automatically updated based on the last update time, 2 kingdoms can battle each other, factories were used for creation of testing objects, etc.

**Other mini projects:**

- **Reddit application** - a small spring app with frontend using Thymeleaf templates

https://github.com/Luzkix/reddit-app-exercise - add your own posts and like/dislike posts from others! This miniapp focuses especially on html part, mainly on practicing with Thymeleaf templates, so it has a basic frontend implemented. Main backend business logic lies in voting system, so you can give just one like/dislike to each post (not own ofcourse). Posts are than saved in database. There is no spring security or any advanced stuff, but it is a fun to play with. So try it here! https://reddit-app-exercise.herokuapp.com/ 

- **Mini Web Gallery** - last exercise in the list will redirect you to a beautiful web gallery (html/css/javascript)

https://luzkix.github.io - Before I started with the full course I participated on a month lenght Green Fox coding camp which focused on html and basics of JavaSript. The link actually represents a web presentation of exercises completed within StayHome coding camp. Final project was to develop simple web photo presentation using html/css/javascript. If you are interested in actual code, you can find it here: https://github.com/Luzkix/luzkix.github.io

**Other:**

https://github.com/Luzkix/Luzkix - the repo contains various week by week homeworks as i progressed throw the first 2 phases of Green Fox Academy Junior Developer Course 
