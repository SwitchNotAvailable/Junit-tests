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

    public static float volume(float baseArea, float height) {
        return (float) ((Math.pow(baseArea, 2)) * (height/3));
    }

    public static float surfaceArea(float baseArea, float height) {
        return (float) ((Math.pow(baseArea, 2)) + 2 * baseArea * (Math.sqrt(Math.pow(baseArea, 2)/4 + (Math.pow(height, 2)))));
    }
}
