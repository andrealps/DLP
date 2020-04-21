package codegenerator;

import ast.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {
    private PrintWriter out;

    public CodeGenerator(String input, String output) {
        try {
            this.out = new PrintWriter(new File(output));
            commentInfo("source " + '"' + input + '"');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * MANIPULACIÓN DE LA PILA
     **/

    public void pushBP() {
        out.println("\tpush\tbp");
        out.flush();
    }

    public void pushaBP() {
        out.println("\tpusha\tbp");
        out.flush();
    }

    public void push(char charV) {
        out.println("\tpushb\t" + (int) charV);
        out.flush();
    }

    public void push(int intV) {
        out.println("\tpushi\t" + intV);
        out.flush();
    }

    public void push(double doubleV) {
        out.println("\tpushf\t" + doubleV);
        out.flush();
    }

    public void pusha(int direction) {
        out.println("\tpusha\t" + direction);
        out.flush();
    }

    public void pop(Type type) {
        out.println("\tpop" + type.suffix());
        out.flush();
    }

    public void load(Type type) {
        out.println("\tload" + type.suffix());
        out.flush();
    }

    public void store(Type type) {
        out.println("\tstore" + type.suffix());
        out.flush();
    }

    /**
     * ARITMÉTICAS
     **/

    public void arithmetic(String operator, Type type) {
        switch (operator) {
            case "+":
                add(type);
                break;
            case "-":
                sub(type);
                break;
            case "*":
                mul(type);
                break;
            case "/":
                div(type);
                break;
            case "%":
                mod(type);
                break;
        }
    }

    public void add(Type type) {
        out.println("\tadd" + type.suffix());
        out.flush();
    }

    public void sub(Type type) {
        out.println("\tsub" + type.suffix());
        out.flush();
    }

    public void mul(Type type) {
        out.println("\tmul" + type.suffix());
        out.flush();
    }

    public void div(Type type) {
        out.println("\tdiv" + type.suffix());
        out.flush();
    }

    public void mod(Type type) {
        out.println("\tmod" + type.suffix());
        out.flush();
    }

    /**
     * COMPARACIONES
     **/

    public void comparison(String operator, Type type) {
        switch (operator) {
            case ">": {
                gt(type);
                break;
            }
            case ">=": {
                ge(type);
                break;
            }
            case "<": {
                lt(type);
                break;
            }
            case "<=": {
                le(type);
                break;
            }
            case "!=": {
                ne(type);
                break;
            }
            case "==": {
                eq(type);
                break;
            }
        }
    }

    public void gt(Type type) {
        out.println("\tgt" + type.suffix());
        out.flush();
    }

    public void ge(Type type) {
        out.println("\tge" + type.suffix());
        out.flush();
    }

    public void lt(Type type) {
        out.println("\tlt" + type.suffix());
        out.flush();
    }

    public void le(Type type) {
        out.println("\tle" + type.suffix());
        out.flush();
    }

    public void ne(Type type) {
        out.println("\tne" + type.suffix());
        out.flush();
    }

    public void eq(Type type) {
        out.println("\teq" + type.suffix());
        out.flush();
    }

    /**
     * LÓGICAS
     **/

    public void logical(String operator) {
        switch (operator) {
            case "&&": {
                and();
                break;
            }
            case "||": {
                or();
                break;
            }
            case "!=": {
                not();
                break;
            }
        }
    }

    public void and() {
        out.println("\tand");
        out.flush();
    }

    public void or() {
        out.println("\tor");
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }

    /**
     * E/S
     **/

    public void in(Type type) {
        out.println("\tin" + type.suffix());
        out.flush();
    }

    public void out(Type type) {
        out.println("\tout" + type.suffix());
        out.flush();
    }

    /**
     * CONVERSIONES
     **/

    public void cast(Type from, Type to) {
        if (from.equals(to))
            return;

        // From = int
        if (from.equals(IntType.getInstance())) {
            if (to.equals(CharType.getInstance())) {
                i2b();
            } else if (to.equals(DoubleType.getInstance())) {
                i2f();
            }
            // From = double
        } else if (from.equals(DoubleType.getInstance())) {
            if (to.equals(CharType.getInstance())) {
                f2i();
                i2b();
            } else if (to.equals(IntType.getInstance())) {
                f2i();
            }
            // From = char
        } else {
            if (to.equals(IntType.getInstance())) {
                b2i();
            } else if (to.equals(DoubleType.getInstance())) {
                b2i();
                i2f();
            }
        }
    }

    public void i2b() {
        out.println("\ti2b");
        out.flush();
    }

    public void i2f() {
        out.println("\ti2f");
        out.flush();
    }

    public void f2i() {
        out.println("\tf2i");
        out.flush();
    }

    public void b2i() {
        out.println("\tb2i");
        out.flush();
    }

    /**
     * FUNCIONES
     **/

    public void call(String functionName) {
        out.println("call " + functionName);
        out.flush();
    }

    public void ret(int bytesRet, int bytesLocal, int bytesParam) {
        out.println("\tret " + bytesRet + ", " + bytesLocal + ", " + bytesParam);
        out.flush();
    }

    public void enter(int locals) {
        out.println("\tenter\t" + locals);
        out.flush();
    }

    /**
     * OTRAS
     **/

    public void halt() {
        out.println("halt");
        out.flush();
    }

    public void nop() {
        out.println("\tnop");
        out.flush();
    }

    /**
     * COMENTARIOS
     **/

    public void commentInfo(String text) {
        out.println("#" + text);
        out.flush();
    }

    public void comment(String text) {
        out.println("\t" + "' " + text);
        out.flush();
    }

    public void commentLine(String text) {
        comment("* " + text);
    }

    public void commentVariable(VarDefinition varDefinition) {
        commentLine(varDefinition.getInfo());
    }

    public void printName(String name) {
        out.println(" " + name + ":");
        out.flush();
    }

    public void println() {
        out.println();
        out.flush();
    }
}
