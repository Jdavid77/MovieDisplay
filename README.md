# MovieDisplay


Full Stack application that displays some movies, and allows the user to give a rating to each movie

Back-end - Spring Boot

![image](https://user-images.githubusercontent.com/49655819/158075163-332419aa-d41f-4935-bc51-55176bf1aa1e.png)

Back-end developed using 3 environments - test , dev and production

Test:

<ul>
  <li> Creation of entities ( Movie, User , Score)</li>
  <li> Creation of layered Architecture ( Controller, Service and Repository)</li>
  <li> Using H2 for database tests </li>
  <li> Using a sql file for database seeding</li>
</ul>

Dev:

<ul>
  <li> Using Docker-Compose to create PostgreSQL database instance</li>
  <li> Creating sql script to seed database</li>
</ul>

Prod:

<ul>
  <li>Using Heroku to deploy backend with Heroku PostgreSQL <li>
</ul>
