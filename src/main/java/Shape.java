public abstract class Shape {
    private float length;
    private float width;
    private float height;

    public Shape(float length, float width, float height) { //Constructor for shape class
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //Getter and setters for Shape class
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    abstract float volume(); //abstract class for volume to be inherited by subclasses

    abstract float surfaceArea(); //abstract class for Surface Area to be inherited by the subclasses

    abstract String description(); //abstract class for Description to be inherited by the subclasses

}
