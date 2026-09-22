package core.basesyntax;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor(){
        Colors[] colors = Colors.values();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex].name();
    }
}
