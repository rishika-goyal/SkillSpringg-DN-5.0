package com.example;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



public class MyServiceTest {



@Test
public void testExternalApi(){



    // Arrange
    ExternalApi mockApi =
            Mockito.mock(ExternalApi.class);



    when(mockApi.getData())
            .thenReturn("Mock Data");



    MyService service =
            new MyService(mockApi);



    // Act
    String result =
            service.fetchData();



    // Assert
    assertEquals("Mock Data", result);



}



}
