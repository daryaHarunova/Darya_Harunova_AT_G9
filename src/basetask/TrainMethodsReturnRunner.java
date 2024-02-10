package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn train = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + train.returnNewInt(5));
        System.out.println("метод returnNewLong вернул " + train.returnNewLong(5));
        System.out.println("метод returnNewChar вернул " + train.returnNewChar('r'));
        System.out.println("метод returnNewFloat вернул " + train.returnNewFloat(5));
        System.out.println("метод returnNewDouble вернул " + train.returnNewDouble(5));
        System.out.println("метод returnNewShort вернул " + train.returnNewShort((short) 5));
        System.out.println("метод returnNewByte вернул " + train.returnNewByte((byte) 5));
        System.out.println("метод returnNewBoolean вернул " + train.returnNewBoolean(true));
    }
}
