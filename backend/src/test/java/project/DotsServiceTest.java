package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DotsServiceTest {

    @Test
    void shouldCreateColour() {

        // given
        DotsService service = new DotsService();

        // when
        String myColour = service.getColor();

        // then
        assertEquals(6, myColour.length());
        System.out.println(myColour);
    }

}