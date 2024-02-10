//- у пузырька должен быть обьем, газовый состав
//- он должен уметь лопаться с выводом в консоль «Cramp!»
//- обьем пузырька постоянный и равен 0.3 мм2,
//- газовый состав переменный в зависимости от образующего газа и задается в конструкторе класса

package project;

public class SparklingWater extends Water {
    private Bubble[] bubbles;

    public void pump(Bubble[] newBubbles) {
        this.bubbles = newBubbles;
    }

    public void degas() {
        for (Bubble bubble : bubbles) {
            bubble.cramp();
        }
    }
}


