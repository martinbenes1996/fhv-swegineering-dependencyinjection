

.PHONY: fuzzy
fuzzy:
	@echo "Compressing $@.";\
	jar cvfm ../build/fuzzy.jar fuzzy/manifest.txt fuzzy/*

.PHONY: glue
glue:
	@echo "Compressing $@.";\
	jar cvfm ../build/glue.jar app/manifest_glue.txt app/* fuzzy/* ifce/* > /dev/null
