# Java sample project maven

## Execute main class

```
mvn exec:java
```

or 

```
mvn exec:java -Dexec.mainClass=com.example.Example -Dexec.args='a b c'
```

## Create executable jar

```
mvn package
java -jar target/my-app-1.0-SNAPSHOT-jar-with-dependencies.jar
```
