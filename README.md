# message

A simple app that returns a preconfigured message

## Requirements
To build and run this project requires

1. Java 8
2. [Leiningen](https://leiningen.org/)

## Usage

## Config
MESSAGE - the message to return
PORT - the port to run on (default 3000)

### Run the application locally

`lein ring server`

### Run the tests

`lein test`

### Packaging and running as standalone jar

```
lein do clean, ring uberjar
MESSAGE=blah java -jar target/server.jar
```
