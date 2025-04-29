package org.example;

import org.example.visitors.MyVisitor;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File inFile = null;
        File outFile = null;
        if (args.length < 2){
            System.err.println("Invalid arguments, proper usage: java Main <infile> <outfile>");
            System.exit(1);
        }

        inFile = new File(args[0]);
        outFile = new File(args[1]);

        StringBuilder sb = new StringBuilder();

        try(
            BufferedReader br = new BufferedReader(new FileReader(inFile));
            PrintStream fileOut = new PrintStream(outFile);
        ){
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
            System.setOut(fileOut);
            String input = sb.toString();

            MyVisitor visitor = new MyVisitor();
            try{
                visitor.interpret(input);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } catch (IOException e){
            System.err.println("IO Error: " + e.getMessage());
            System.exit(1);
        }
    }
}