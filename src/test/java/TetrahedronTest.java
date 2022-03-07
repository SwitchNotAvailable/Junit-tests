import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TetrahedronTest {

    @Test
    void volume() { //Test for Volume of a Tetrahedron
        assertEquals(558.81, Geometry3D.volumeTetrahedron(16.8f), 0.1);
    }
}