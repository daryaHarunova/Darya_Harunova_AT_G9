package homework.day6;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T arg) {
        System.out.println(String.format("I am an object of %s class.", arg.getClass().getSimpleName()));
    }

    public String genericMethodTwoGenArgs(T first, T second){
        return "We are objects of " + first.getClass().getSimpleName() + " class and " + second.getClass().getSimpleName()+ " class" ;
    }
    public void genericMethodHalfGenArgs(T arg, String arg1) {
        System.out.println("I got an object of " + arg.getClass().getSimpleName() + " class and string with " + arg1 +  " characters");
    }

}
