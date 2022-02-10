# I use [vim-tex](https://github.com/lervag/vimtex) to compile,
# which uses latexmk, which recompiles the file when it detects changes.
# I'll just use pdflatex here but you can use other tools as well.

NAME="MA1521-AY2122S1-Test-3"

pdflatex $NAME.tex
rm $NAME.aux $NAME.log

