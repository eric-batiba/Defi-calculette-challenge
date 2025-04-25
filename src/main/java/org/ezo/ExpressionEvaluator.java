package org.ezo;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.text.DecimalFormat;
import java.util.logging.Logger;

public class ExpressionEvaluator {
    private static final Logger LOGGER = Logger.getLogger(ExpressionEvaluator.class.getName());
    private static final String ERROR_RESULT = "Erreur";

    private final ScriptEngine engine;
    private final DecimalFormat decimalFormat;

    public ExpressionEvaluator() {
        this.engine = new ScriptEngineManager().getEngineByName("JavaScript");
        this.decimalFormat = new DecimalFormat("#.########");
    }

    public  String evaluate(String preprocessedExpression) {
        try {
            Object result = engine.eval(preprocessedExpression);

            if (result instanceof Double r && (Double.isNaN(r) || Double.isInfinite(r))) {
                return ERROR_RESULT;
            }

            if (result instanceof Double r) {
                return decimalFormat.format(r);
            }
            return result.toString();

        } catch (ScriptException e) {
            LOGGER.warning(()-> String.format("Failed to evaluate expression: %s", e.getMessage()));
            return ERROR_RESULT;
        }
    }
}
