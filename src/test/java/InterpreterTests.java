import org.example.visitors.MyVisitor;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class InterpreterTests {

    private String runInterpreter(String input) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        try {
            new MyVisitor().interpret(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return output.toString().strip(); // Strip trailing newline
    }

    @Test
    public void testSimpleCalculation() {
        String input = """
                calc IS 3 ADD (4 MULTIPLY 2)
                IMAGINE(calc)
                """;
        String expected = "11";
        assertEquals(expected, runInterpreter(input));
    }

    @Test
    public void testPriorityCalculation(){
        String input = """
                calc IS 3 MULTIPLY (4 ADD 2)
                IMAGINE(calc)
                """;
        String expected = "18";
        assertEquals(expected, runInterpreter(input));
    }
    
    @Test
    public void testEqualCondition() {
        String input = """
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
        """;
        String expected = "0";
        assertEquals(expected, runInterpreter(input));
    }

    @Test
    public void testLesserCondition() {
        String input = """
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
        """;
        String expected = "-1";
        assertEquals(expected, runInterpreter(input));
    }

    @Test
    public void testGreaterCondition() {
        String input = """
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
        """;
        String expected = "1";
        assertEquals(expected, runInterpreter(input));
    }

    @Test
    public void testCycleLoop() {
        String input = """
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
        """;
        String expected = """
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
        """.replace("\n", "\r\n").strip();
        assertEquals(expected, runInterpreter(input));
    }

    @Test
    public void testAllInOne() {
        String input = """
        THRU(i IS 0; i GREATER -1; i ADD 1)
            IMAGINE(i MULTIPLY i)
            DETERMINE(i GREATER 9)
                i IS -2
            END_DETERMINE
        END_THRU
        """;
        String expected = """
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
        """.replace("\n", "\r\n").strip();
        assertEquals(expected, runInterpreter(input));
    }

    @Test
    public void testPrintVariants() {
        String input = """
        print IS 10
        IMAGINE()
        IMAGINE(5)
        IMAGINE(2 ADD 2)
        IMAGINE(print)
        """;
        String expected = """

        5
        4
        10
        """.replace("\n", "\r\n").strip();
        assertEquals(expected, runInterpreter(input));
    }

    @Test
    public void testSyntaxErrorMessage() {
        String input = """
        IMAGINE("test")
        """;
        String output = runInterpreter(input);
        String expected = "Syntax error at line 1:8 token recognition error at: '\"'";
        assertEquals(expected, output);
    }

    @Test
    public void testUndeclaredVariableError() {
        String input = """
        IMAGINE(test)
        """;
        String output = runInterpreter(input);
        String expected = "line 1:8 Cannot find variable: test";
        assertEquals(expected, output);
    }

    @Test
    public void testEmptyLine(){
        String input = """
                IMAGINE(1)
                
                IMAGINE(2)
                """;
        String expected = """
                1
                2
                """.replace("\n", "\r\n").strip();;
        assertEquals(expected, runInterpreter(input));
    }
}
