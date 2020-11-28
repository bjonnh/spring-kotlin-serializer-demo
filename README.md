A simple demo to explain on a forum how to use KotlinX serialization with Spring Boot.

Start it and try

[http://127.0.0.1:8099/]
[http://127.0.0.1:8099/withvalue]
[http://127.0.0.1:8099/withvalue?value=hey]

To test the serialization:
```shell
curl --header "Content-Type: application/json" -X POST --data '{"data":"It works"}' http://127.0.0.1:8099/serializer
```
