package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGetMessage() {
        App app = new App();
        assertEquals("Hello, World!", app.getMessage());
    }
}
