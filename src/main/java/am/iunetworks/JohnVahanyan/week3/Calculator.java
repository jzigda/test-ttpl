package am.iunetworks.JohnVahanyan.week3;

public class Calculator {

    public static void main(String[] args) {
        String expresion = "5+4*(2+1-3)";
        int result = solve(expresion);
        System.out.println(result);
    }

    private static int getHowImportant(char character) {
        switch (character) {
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            default:
                return -1;
        }
    }

    private static int solve(String exp) {
        while (true) {
            int firstInd = exp.lastIndexOf('(');
            if (firstInd == -1) {
                break;
            }
            int secondInd = exp.indexOf(')', firstInd + 1);
            exp = exp.substring(0, firstInd)
                    .concat(String.valueOf(solve(exp.substring(firstInd + 1, secondInd))))
                    .concat(exp.substring(secondInd + 1));
        }
        int firstDigit = exp.charAt(0) - 48, secondDigit = exp.charAt(2) - 48;
        char symbol = exp.charAt(1);
        for (int i = 3; i < exp.length(); i += 2) {
            char currentSymbol = exp.charAt(i);
            if (getHowImportant(currentSymbol) > getHowImportant(symbol)) {
                secondDigit = calculate(secondDigit, exp.charAt(i + 1) - 48, currentSymbol);
            } else {
                firstDigit = calculate(firstDigit, secondDigit, symbol);
                secondDigit = exp.charAt(i + 1) - 48;
                symbol = currentSymbol;
            }
        }
        return calculate(firstDigit, secondDigit, symbol);
    }

    private static int calculate(int first, int second, char symbol) {
        switch (symbol) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                return first / second;
            default:
                throw new IllegalArgumentException("symbol is not supported");
        }
    }

}
