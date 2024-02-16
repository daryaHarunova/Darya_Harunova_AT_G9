package homework.day5.extra;

public class OutputLettersInAColumn {
    public void output(String string){
        for (int i = 0; i <= string.length() -1; i++){
            System.out.println(string.charAt(i));
        }
    }

    public static void main(String[] args) {
        OutputLettersInAColumn test = new OutputLettersInAColumn();
        test.output("Oliver");
    }
}
