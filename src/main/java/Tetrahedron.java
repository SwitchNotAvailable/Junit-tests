public abstract class Tetrahedron extends Shape {
    public Tetrahedron(float length, float width, float height) {
        super(length, width, height);
    }

    public static float volume(float length) {
        return (float) ((Math.pow(length, 3)) / (6 * Math.sqrt(2)));
    }

}
