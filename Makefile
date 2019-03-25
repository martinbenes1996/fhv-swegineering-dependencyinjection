
.PHONY: all
all: fuzzy


.PHONY: fuzzy
fuzzy: standard


.PHONY: standard
standard:
	javac -cp "src/" -d "cls/" src/fuzzy/StandardNegator.java



.PHONY: clean
clean:
	rm -rf cls/fuzzy/* cls/ifce/* > /dev/null 2> /dev/null
