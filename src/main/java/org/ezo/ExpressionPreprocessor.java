package org.ezo;

public class ExpressionPreprocessor {

    public static String preprocess(String expression) {
        String expr = expression.replaceAll("\\s+", "");
        expr = expr.replaceAll("sqrt\\(([^)]+)\\)", "Math.sqrt($1)");
        expr = expr.replaceAll("(\\d+(?:\\.\\d+)?)\\^(-?\\d+(?:\\.\\d+)?)", "Math.pow($1,$2)");
        expr = expr.replace("--", "+"); // -1--1 => -1+1
        return expr;

    }

}
