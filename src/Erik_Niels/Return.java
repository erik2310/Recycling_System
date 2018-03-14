package Erik_Niels;

/**
 * Created by Niels on 13-03-2018.
 */
public class Return {

    private double size_min;
    private double size_max;
    private String type;
    private String material;
    private double value;
    private String name;

    public Return(double size_min, double size_max, String type, String material, double value, String name) {
        this.size_min = size_min;
        this.size_max = size_max;
        this.type = type;
        this.material = material;
        this.value = value;
        this.name = name;
    }

    public double getSize_min() {
        return size_min;
    }

    public double getSize_max() {
        return size_max;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
