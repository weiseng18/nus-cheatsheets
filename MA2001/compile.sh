# I use [vim-tex](https://github.com/lervag/vimtex) to compile,
# which uses latexmk, which recompiles the file when it detects changes.
# I'll just use pdflatex here but you can use other tools as well.

NAME="MA2001-AY2122S1-Finals"

pdflatex $NAME.tex
rm $NAME.aux $NAME.log

