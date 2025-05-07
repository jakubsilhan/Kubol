# Kubol
Kubol is a custom language based on a combination of languages. The project focuses on creating the frontend of language compilation.

## How to run
First you need to obtain a correct jar file. Either through compilation using command line or an IDE.  
**The jar is also available in this directory for immediate use.**

Afterwards you just need to write your code into a `.kb` file and give that `.kb` file to the used jar. This can be accomplished by this command:  
`java -jar ./Language_Kubol.jar ./input.kb ./output.txt`

The output file contains all imagined(printed) data and errors.

## Documentation
> Warning: This language supports only integer values

### Keywords
> Warning: All keywords are written in uppercase

#### Basics
Assignment/Declaration:  
`<variable> IS <value>`

> Info: Value is interchangeable with a variable
#### Operators
Addition:  
`<value> ADD <value>`  
Product:  
`<value> MULTIPLY <value>`  
Less than:  
`<value> LESSER <value>`  
Greater than:  
`<value> GREATER <value>`  
Equal:  
`<value> EQUAL <value>`  
Not equal:  
`<value> NONEQUAL <value>`

> Info: Value is interchangeable with a variable
#### Structures
Conditional statement:  
```
DETERMINE(<condition>)
<statements>
END_DETERMINE
```
Cycle statement:
```
THRU(<variable> IS <value>; <variable> <comparison_operator> <value>; <variable> <calculation_operator> <value>)
<statements>
END_THRU
```

Print statement:
```
IMAGINE(<value>/<equation>/<variable>)
```

### Variables
> Warning: Variables are required to be written in lowercase  

Sample declaration:
```
sample IS 3
```