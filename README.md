# Dependency Injection #
This projects presents dependency injection. Java and framework Spring is used.

## Compilation & Running ##

### Without any dependency linking ###
* $ make
* $ make run

### With explicit glue dependency linking ###
* $ make glue
* $ make gluerun

## Directories ##
* *src/* - source codes
  * *src/ifce* - interfaces
  * *src/fuzzy* - component implementing the interface src/ifce
  * *src/app* - the app
  * *src/app_spring* - the app implemented using Spring framework
* *cls/* - generated class files
* *build/* - generated jar runnable files

