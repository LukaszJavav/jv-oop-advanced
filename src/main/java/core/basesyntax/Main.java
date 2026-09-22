package core.basesyntax;

public class Main {
    public static void main(String[] args) {
    final int FIGURES_NUMBER = 6;
   Figure[] figures = new Figure[FIGURES_NUMBER];

   FigureSupplier figuresSupplier = new FigureSupplier();
   int half = FIGURES_NUMBER/2;

   for(int i = 0; i < FIGURES_NUMBER; i++) {
    if(i<half){
        figures[i] = figuresSupplier.getRandomFigure();
    } else {
        figures[i] = figuresSupplier.getDefaultFigure();
    }
   }
   for (Figure f: figures) {
    f.draw();
   }
}
}

