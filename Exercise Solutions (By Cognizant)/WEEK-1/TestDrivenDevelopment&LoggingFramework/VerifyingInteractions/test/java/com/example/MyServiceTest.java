package com.example;


import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class MyServiceTest {


    @Test
    public void testVerifyInteraction() {


        // Create mock object

        ExternalApi mockApi =
                Mockito.mock(ExternalApi.class);



        // Create service using mock

        MyService service =
                new MyService(mockApi);



        // Call method

        service.fetchData();



        // Verify method call

        verify(mockApi).getData();


    }

}