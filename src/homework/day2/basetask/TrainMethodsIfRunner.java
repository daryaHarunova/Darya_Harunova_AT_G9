package homework.day2.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf train = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + train.returnNewInt(10));
        System.out.println("метод returnNewLong вернул " + train.returnNewLong(10));
        System.out.println("метод returnNewChar вернул " + train.returnNewChar('n'));
        System.out.println("метод returnNewFloat вернул " + train.returnNewFloat(10));
        System.out.println("метод returnNewDouble вернул " + train.returnNewDouble(10));
        train.returnNewBoolean(false);
    }
}
