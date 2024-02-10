//- у пузырька должен быть обьем, газовый состав
//- он должен уметь лопаться с выводом в консоль «Cramp!»
//- обьем пузырька постоянный и равен 0.3 мм2,
//- газовый состав переменный в зависимости от образующего газа и задается в конструкторе класса

package project;

public class Bubble {
    private final double VOLUME = 0.3;
    private String gasComposition;

    public Bubble(String newGasComposition) {
        this.gasComposition = newGasComposition;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }
}


// Bubble [] bubble = new Bubble [1000];
//   for (int i = 0; i <= bubble.length; i++)