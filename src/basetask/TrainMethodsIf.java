package basetask;

public class TrainMethodsIf {
    public int returnNewInt(int number) {
        if (number < 8) {
            return number * 7;
        } else {
            return number / 4;
        }
    }

    public long returnNewLong(long number) {
        if (number > 300) {
            return number - 300;
        } else {
            return number + 20;
        }
    }

    public String returnNewChar(char symbol) {
        if (symbol == 'g') {
            return "go";
        } else {
            return "o" + symbol;
        }
    }

    public float returnNewFloat(float number) { // ERROR
        if (number == 0.67) {
            return number;
        } else {
            return number * 2;
        }
    }

    public double returnNewDouble(double number) {
        if (number > 30 && number < 80) {
            return number + 87;
        } else if (number > 80 && number < 400) {
            return number - 87;
        } else if (number > 400) {
            return number / 4;
        } else {
            return number * 2;
        }
    }

    public void returnNewBoolean(boolean value) {
        if (value == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }

    }
}