package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    public void testExternalApi() {

        // Create mock Obj
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Create Service Object
        Service service = new Service(mockApi);

        // Call Method
        String result = service.fetchData();

        // Assert
        assertEquals("Mock Data", result);
    }
}