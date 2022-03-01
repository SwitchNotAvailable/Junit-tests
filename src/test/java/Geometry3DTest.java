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
        assertEquals(155.52, Geometry3D.volumeSquarePyramid(7.2f, 9), 0.1);
    }

    @Test
    void surfaceSquarePyramid() {
        assertEquals(744.84, Geometry3D.surfaceSquarePyramid(13.4f, 20), 0.1);
    }

    @Test
    void volumeTetrahedron() {
    }

    @Test
    void surfaceTetrahedron() {
    }
}