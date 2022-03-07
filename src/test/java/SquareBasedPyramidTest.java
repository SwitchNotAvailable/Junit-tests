import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareBasedPyramidTest {

    @Test
    void volume() { //test for volume of a Square Based Pyramid
        assertEquals(155.52, SquareBasedPyramid.volume(7.2f, 9), 0.1);
    }

    @Test
    void surfaceArea() { //Test for Surface Area of a Square Based Pyramid
        assertEquals(744.84, SquareBasedPyramid.surfaceArea(13.4f, 20), 0.1);
    }
}