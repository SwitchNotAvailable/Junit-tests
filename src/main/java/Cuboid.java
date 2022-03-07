public abstract class Cuboid extends Shape {

    public Cuboid(float length, float width, float height) {
        super(length, width, height);
    }

    public static float volume(float length, float width, float height) { //Method for calculating Volume of a cuboid
        return length * width * height; //return volume of a cuboid
    }

    public static float surfaceArea(float length, float width, float height) {
        return (2*length*width) + (2*length*height) + (2*height*width); // return surface area of a cuboid
    }

}