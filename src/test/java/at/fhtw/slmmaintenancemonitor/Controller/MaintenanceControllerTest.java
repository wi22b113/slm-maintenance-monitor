package at.fhtw.slmmaintenancemonitor.Controller;

import at.fhtw.slmmaintenancemonitor.Monitor.Monitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MaintenanceControllerTest {
    @Test
    void getMessage() {
        //Arrange
        Monitor mm = new Monitor();

        //Act
        String result = MaintenanceController.getMessage();

        //Assert
        assertEquals(mm.getMessage(),result);
    }
}