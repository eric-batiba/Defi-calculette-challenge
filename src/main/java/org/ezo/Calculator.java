package org.ezo;

public class Calculator {
    private final ExpressionEvaluator  evaluator = new ExpressionEvaluator();

    public String calculate(String expression) {
        String preprocessedExpression = ExpressionPreprocessor.preprocess(expression);
        return evaluator.evaluate(preprocessedExpression);
    }
}
