parser grammar KubolParser;
options { tokenVocab=KubolLexer; }

script : statement* EOF;

statement : assignment
         | conditionalStatement
         | cycleStatement
         | printStatement
         ;

assignment : variable IS equation;

equation : calcMember
         | calcMember calcOperator calcMember
         | calcMember calcOperator L_BRACK equation R_BRACK
         ;

calcOperator : ADD | MULTIPLY;

calcMember : value | variable;

conditionalStatement : DETERMINE L_BRACK condition R_BRACK statement + END_DETERMINE;

condition : calcMember comparisonOperator calcMember;

comparisonOperator : EQUAL | LESSER | GREATER | NONEQUAL;

cycleStatement : THRU L_BRACK cycleCondition R_BRACK statement+ END_THRU;

cycleCondition : variable IS value SEP variable comparisonOperator value SEP variable calcOperator value;

printStatement : IMAGINE L_BRACK (variable | value | equation)? R_BRACK;

variable : ID;

value : INT;