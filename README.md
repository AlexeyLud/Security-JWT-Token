# Security-JWT-Token
A simple application for authorization (registered users) and authentication 
by roles[ROLE_USER, ROLE_MODERATOR, ROLE_ADMIN] using JWT token[jwtSecret + jwtExpirationMs].

#First comes the registration:
1. Login
2. Password
3. Post
4. Role
If the registration is successful, a JWT token is generated.

#Further authorization:
1. Login
2. Password
If the authorization was successful, the user is returned (displayed) his token.

#And at the end, depending on the user's role, it makes an access request for different APIs:
1. Admin - only admin has access
2. Moderator - admin and moderator have access
3. User - all roles have access
4. All - public access
At this point, authentication takes place. If the token and role are suitable for the selected API, then the user gets access to it.

In this application, I have used Java11, Maven, Spring Boot, Spring Data JPA, MySQL, Spring Security and JWT.
