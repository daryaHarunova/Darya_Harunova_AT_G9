//- у пузырька должен быть обьем, газовый состав
//- он должен уметь лопаться с выводом в консоль «Cramp!»
//- обьем пузырька постоянный и равен 0.3 мм2,
//- газовый состав переменный в зависимости от образующего газа и задается в конструкторе класса

package project;

public class Bubble {
    private final double volume = 0.3;
    private String gas;

    public Bubble(String newGas) {
        this.gas = newGas;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public double getVolume(){
        return volume;
    }
}


// Bubble [] bubble = new Bubble [1000];
//   for (int i = 0; i <= bubble.length; i++)