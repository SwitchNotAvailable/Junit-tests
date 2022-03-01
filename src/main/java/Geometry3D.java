public class Geometry3D {
    public static float volumeCuboid(float length, float width, float height) {
        float volume = length * width * height; //formula of volume of a Cuboid
        return volume; //return volume of a cuboid
    }

    public static float surfaceCuboid(float length, float width, float height) {
        float surfaceCuboid = (2*length*width) + (2*length*height) + (2*height*width);
        return surfaceCuboid;
    }

}
