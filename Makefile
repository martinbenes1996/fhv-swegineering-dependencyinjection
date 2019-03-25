
.PHONY: all
all:
	@echo "Compiling.";\
	javac -cp "src/" -d "cls/" src/app/FuzzyCalculator.java

.PHONY: ioc
ioc:
	@echo "Compiling IoC.";\
	javac -cp "src/:spring-framework-5.1.5.RELEASE/libs/*" -d "cls/" src/app/FuzzyCalculator_IoC.java


.PHONY: run
run:
	@printf "";\
	java -classpath "cls/ " app.FuzzyCalculator


.PHONY: clean
clean:
	@echo "Cleaning.";\
	rm -rf cls/fuzzy/* cls/ifce/* > /dev/null 2> /dev/null
