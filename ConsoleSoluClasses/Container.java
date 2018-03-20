package Erik_Niels.ConsoleSoluClasses;

/**
 * Created by Niels on 13-03-2018.
 */
public class Container {
    private double size;
    private String type;
    private String material;

    public Container(double size, String type, String material) {
        this.size = size;
        this.type = type;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }
}
