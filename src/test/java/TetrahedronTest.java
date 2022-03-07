import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TetrahedronTest {

    @Test
    void volume() { //Test for Volume of a Tetrahedron
        assertEquals(558.81, Tetrahedron.volume(16.8f), 0.1);
    }

    @Test
    void surfaceArea() { //test for surface area of a tetrahedron
        assertEquals(1611.24, Tetrahedron.surfaceArea(30.5f), 0.1);
    }
}