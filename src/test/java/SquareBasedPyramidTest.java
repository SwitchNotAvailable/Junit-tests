import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareBasedPyramidTest {

    @Test
    void volume() {
        assertEquals(155.52, Geometry3D.volumeSquarePyramid(7.2f, 9), 0.1);
    }
}