#!/bin/bash

docker run --rm -v "${PWD}":/docs sphinxdoc/sphinx-latexpdf make clean latexpdf

cp build/latex/swingjavabuilder.pdf SwingJavaBuilder.pdf
