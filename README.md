# Laelith API with Spring Boot Functions
For local deployment for now.
Run with:
``` bash
./gradlew bootRun
```
GET roll with:
``` bash
curl http://localhost:8080/roll/3d6
```
POST roll with:
``` bash
curl -X POST --data '3d6' -H "Content-Type: text/plain"   http://localhost:8080/roll
``` 