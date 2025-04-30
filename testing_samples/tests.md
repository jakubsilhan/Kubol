# Testing
This file contains the documentation for code snippets and their expected results

## Test 1 - simple calculation
### Input
```
calc IS 3 ADD (4 MULTIPLY 2)
IMAGINE(calc)
```
### Output
```
11
```

## Test 2 - simple calculation (priority test)
### Input
```
calc IS 3 MULTIPLY (4 ADD 2)
IMAGINE(calc)
```
### Output
```
18
```

## Test 3 - simple condition (Equal test)
### Input
```
tested IS 5
DETERMINE(tested EQUAL 5)
    IMAGINE(0)
END_DETERMINE

DETERMINE(tested LESSER 5)
    IMAGINE(-1)
END_DETERMINE

DETERMINE(tested GREATER 5)
    IMAGINE(1)
END_DETERMINE
```
### Output
```
0
```

## Test 4 - simple condition (Less than test)
### Input
```
tested IS 4
DETERMINE(tested EQUAL 5)
    IMAGINE(0)
END_DETERMINE

DETERMINE(tested LESSER 5)
    IMAGINE(-1)
END_DETERMINE

DETERMINE(tested GREATER 5)
    IMAGINE(1)
END_DETERMINE
```
### Output
```
-1
```

## Test 5 - simple condition (Greater than test)
### Input
```
tested IS 6
DETERMINE(tested EQUAL 5)
    IMAGINE(0)
END_DETERMINE

DETERMINE(tested LESSER 5)
    IMAGINE(-1)
END_DETERMINE

DETERMINE(tested GREATER 5)
    IMAGINE(1)
END_DETERMINE
```
### Output
```
1
```

## Test 6 - simple cycle test
### Input
```
THRU (i IS 0; i LESSER 5; i ADD 1)
    IMAGINE(i)
END_THRU
IMAGINE()
THRU (i IS 5; i GREATER 0; i ADD -1)
    IMAGINE(i)
END_THRU
IMAGINE()
THRU(i IS 0; i LESSER 5; i ADD 1)
    IMAGINE(i)
    i IS 6
END_THRU
```
### Output
```
0
1
2
3
4

5
4
3
2
1

0
```

## Test 7 - All in one
### Input
```
THRU(i IS 0; i GREATER -1; i ADD 1)
    IMAGINE(i MULTIPLY i)
    DETERMINE(i GREATER 9)
        i IS -2
    END_DETERMINE
END_THRU
```
### Output
```
0
1
4
9
16
25
36
49
64
81
100
```

## Test 8 - Print test
### Input
```
print IS 10
IMAGINE()
IMAGINE(5)
IMAGINE(2 ADD 2)
IMAGINE(print)
```
### Output
```

5
4
10
```

## Test 9 - Syntax error
### Input
```
IMAGINE("test")
```
### Output
```
Syntax error at line 1:8 token recognition error at: '"'
```

## Test 10 - Undeclared variable error
### Input
```
IMAGINE(test)
```
### Output
```
line 1:8 Cannot find variable: test
```

## Test 11 - Empty line
### Input
```
IMAGINE(1)

IMAGINE(2)
```

### Output
```
1
2
```
