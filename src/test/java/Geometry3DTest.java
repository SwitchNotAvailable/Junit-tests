import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Geometry3DTest {

    @Test
    void volumeCuboid() {
        assertEquals(453.6, Geometry3D.volumeCuboid(9, 8.4f, 6), 0.1);
    }

    @Test
    void surfaceCuboid() {
        assertEquals(186.6, Geometry3D.surfaceCuboid(5, 4.1f, 8), 0.1);
    }

    @Test
    void volumeSquarePyramid() {
    }

    @Test
    void surfaceSquarePyramid() {
    }

    @Test
    void volumeTetrahedron() {
    }

    @Test
    void surfaceTetrahedron() {
    }
}