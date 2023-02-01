# quarkus-oidc

This is to test login.
1. config application.properties to set the oidc parameters
2. select a version in gradle.properties
3. access the path /test/login

Result
- 2.11.1.Final, works well
- 2.13.7.Final, /oidc/login-callback path cannot find, 404
- 2.16.1.Final, redirect between /test/login and /oidc/login-callback,   
```Firefox has detected that the server is redirecting the request for this address in a way that will never complete.```
