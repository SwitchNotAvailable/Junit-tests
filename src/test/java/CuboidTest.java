import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void volume() { //Test for volume of a cuboid
        assertEquals(453.6, Geometry3D.volumeCuboid(9, 8.4f, 6), 0.1);
    }

    @Test
    void surfaceArea() {
        assertEquals(186.6, Geometry3D.surfaceCuboid(5, 4.1f, 8), 0.1);
    }
}