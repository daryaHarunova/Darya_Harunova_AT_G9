package homework.day2.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int number) {
        return number * 3;
    }

    public int returnNewLong(int number) {
        return number - 4;
    }

    public String returnNewChar(char symbol) {
        return String.valueOf(symbol) + symbol;
    }

    public float returnNewFloat(float number) {
        return number / 2;
    }

    public double returnNewDouble(double number) {
        return number + 8;
    }

    public short returnNewShort(short number) {
        return (short) (number - 1);
    }

    public byte returnNewByte(byte number) {
        return (byte) (number * 2);
    }

    public boolean returnNewBoolean(boolean value) {
        if (value = true) {
            return false;
        } else {
            return true;
        }
    }


}
