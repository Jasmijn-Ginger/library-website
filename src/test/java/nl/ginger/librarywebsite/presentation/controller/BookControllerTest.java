package nl.ginger.librarywebsite.presentation.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookControllerTest {

    @Autowired
    private BookController controller;

    @Test
    void controllerNotEmpty() throws Exception{
        Assertions.assertThat(controller).isNotNull();
    }
}