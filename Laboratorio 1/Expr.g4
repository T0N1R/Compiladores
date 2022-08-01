grammar Expr; 
prog:    (expr)* ;
expr:    INT
    ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;