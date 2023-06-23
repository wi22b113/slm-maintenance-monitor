package at.fhtw.slmmaintenancemonitor.Controller;

import at.fhtw.slmmaintenancemonitor.Monitor.Monitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MaintenanceControllerTest {
    @Test
    void getMessage() {
        //Arrange
        MaintenanceController mc = new MaintenanceController();
        String expected = "Everything works as expected";

        //Act
        String result = mc.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void setMessage() {
        //Arrange
        MaintenanceController mc = new MaintenanceController();
        String expected = "Service checks: No power until 5:00 pm";

        //Act
        mc.setMessage(expected);
        String result = mc.getMessage();

        //Assert
        assertEquals(expected,result);

    }
}