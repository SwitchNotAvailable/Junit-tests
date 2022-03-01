import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Geometry3DTest {

    @Test
    void volumeCuboid() {
        assertEquals(453.6, Geometry3D.volumeCuboid(9, (float) 8.4, 6), 0.1);
    }

    @Test
    void surfaceCuboid() {
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