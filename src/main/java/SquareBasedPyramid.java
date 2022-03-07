public abstract class SquareBasedPyramid extends Shape {

    private float baseArea;

    public SquareBasedPyramid(float length, float width, float height, float baseArea) {
        super(length, width, height);
        this.baseArea = baseArea;
    }

    public float getBaseArea() {
        return baseArea;
    }

    public void setBaseArea(float baseArea) {
        this.baseArea = baseArea;
    }

    public float volume(float baseArea, float height) {
        return (float) ((Math.pow(baseArea, 2)) * (height/3));
    }
}
