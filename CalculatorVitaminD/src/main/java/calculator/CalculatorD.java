package calculator;

public class CalculatorD {
    private static final int standardNorm = 75;
    private static final int minNorm = 30;
    private static final int maxNorm = 50;

    public static int analysisResult(int data) {
        return standardNorm - data;
    }

    public static int requiredDose(int data) {
        return (analysisResult(data) / 25) * 1000;
    }

    public static String compareResult(int data) {
        if (data < minNorm) {
            return "Уровень витамина D ниже рекомендованного диапазона\n" +
                    "Норма: от " + minNorm + " пг/мл до " + maxNorm + " пг/мл\n\n" +
                    "Необходимая доза: " + requiredDose(data) + " МЕ";
        } else if (data > maxNorm) {
            return "Превышение витамина D\n" +
                    "Норма: от " + minNorm + " пг/мл до " + maxNorm + " пг/мл\n";
        } else {
            return "Уровень витамина D находится в пределах нормы\n";
        }
    }
}
