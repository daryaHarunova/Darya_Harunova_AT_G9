package homework.day6;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    public String genericMethodGenArgs(X firstArgument) {
        return "I received 1 arguments of type:" + firstArgument.getClass().getSimpleName() + "class";
    }

    public String genericMethodGenArgs(X arg1, Y arg2) {

        return "I received 2 arguments of type: " + arg1.getClass().getSimpleName() + " class and " + arg2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X firstArgument, Y second, String secondArgument) {
        int length = secondArgument.length();
        System.out.printf("I got an object of %s class and %s class and string with %d characters", firstArgument.getClass().getSimpleName(), secondArgument.getClass().getSimpleName(), length).println();
    }

}

