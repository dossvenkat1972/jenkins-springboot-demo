
package com.example.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloControllerTest {

    @Test
    void applicationStartsSuccessfully() {
        System.out.println("Spring Boot test passed!");
    }
}
