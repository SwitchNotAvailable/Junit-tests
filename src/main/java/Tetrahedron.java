public abstract class Tetrahedron extends Shape {
    public Tetrahedron(float length, float width, float height) {
        super(length, width, height);
    }

    public static float volume(float length) { // Formula for calculating volume of a tetrahedron.
        return (float) ((Math.pow(length, 3)) / (6 * Math.sqrt(2)));
    }
    public static float surfaceArea(float length) { // Formula for calculating Surface Area of a tetrahedron
        return (float) ((Math.sqrt(3)) * (Math.pow(length, 2)));
    }
}
