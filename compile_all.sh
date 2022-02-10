#! /bin/bash

for d in */; do
    cd $d
    [[ -e *.pdf ]] && rm *.pdf
    [[ -e compile.sh ]] && ./compile.sh
    cd ..
done
