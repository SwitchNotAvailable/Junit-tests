public class Geometry3D {
    public static float volumeCuboid(float length, float width, float height) {
        float volume = length * width * height; //formula of volume of a Cuboid
        return volume; //return volume of a cuboid
    }

    public static float surfaceCuboid(float length, float width, float height) {
        float surfaceCuboid = (2*length*width) + (2*length*height) + (2*height*width);
        return surfaceCuboid;
    }

    public static float volumeSquarePyramid(float baseArea, float height) {
        float volume = (float) ((Math.pow(baseArea, 2)) * (height/3));
        return volume;
    }

    public static float surfaceSquarePyramid(float baseArea, float height) {
        float area = (float) ((Math.pow(baseArea, 2)) + 2 * baseArea * (Math.sqrt(Math.pow(baseArea, 2)/4 + (Math.pow(height, 2)))));
        return area;
    }

    public static float volumeTetrahedron(float length) {
        float volume = (float) ((Math.pow(length, 3)) / (6 * Math.sqrt(2)));
        return volume;
    }

    public static float surfaceTetrahedron(float length) {
        float surfaceArea = (float) ((Math.sqrt(3)) * (Math.pow(length, 3)));
        return surfaceArea;
    }
}
