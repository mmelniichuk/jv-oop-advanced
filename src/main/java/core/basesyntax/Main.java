package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int Max = 10;

        Figure[] figures = new Figure[new Random().nextInt(Max)];

        for (Figure randomFigure : figures) {
            randomFigure = new FigureSupplier().get();
            randomFigure.drawFigure();
        }
    }
}
