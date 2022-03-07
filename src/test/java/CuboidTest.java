import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void volume() {
        assertEquals(453.6, Geometry3D.volumeCuboid(9, 8.4f, 6), 0.1);
    }

    @Test
    void surfaceArea() {
    }
}