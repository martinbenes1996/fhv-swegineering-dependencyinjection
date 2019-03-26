
.PHONY: all
all:
	@echo "Compiling.";\
	javac -cp "src/" -d "cls/" src/app/FuzzyCalculator.java

.PHONY: glue
glue:
	@echo "Compiling.";\
	javac -cp "src/" -d "cls/" src/app/FuzzyCalculator_Glue.java > /dev/null
	@printf "";\
	mkdir build/ 2> /dev/null
	@printf "";\
	$(MAKE) glue -C cls/ -s

.PHONY: fuzzy
fuzzy: 
	@echo "Compiling.";\
	javac -cp "src/" -d "cls/" src/fuzzy/StandardNegator.java src/fuzzy/Main.java
	@printf "";\
	mkdir build/ 2> /dev/null	
	@printf "";\
	$(MAKE) -C cls/ -s

.PHONY: spring
spring:
	@echo "Compiling Spring.";\
	javac -cp "src/" -d "cls/" src/app_spring/FuzzyCalculator_Spring.java


.PHONY: run
run:
	@printf "";\
	java -cp ".:build/fuzzy.jar" -classpath "cls/" app.FuzzyCalculator

.PHONY: gluerun
gluerun:
	@printf "";\
	java -jar build/glue.jar


.PHONY: clean
clean:
	@echo "Cleaning.";\
	rm -rf cls/*/*.class build/*.jar > /dev/null 2> /dev/null
