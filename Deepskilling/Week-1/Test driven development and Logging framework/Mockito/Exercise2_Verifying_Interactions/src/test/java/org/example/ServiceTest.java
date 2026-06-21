package org.example;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create Mock Obj
        ExternalApi mockApi = mock(ExternalApi.class);

        // Arrange
        Service service = new Service(mockApi);

        // Act
        service.fetchData();

        // Assert
        verify(mockApi).getData();
    }
}