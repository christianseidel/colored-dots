package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DotsServiceTest {

    @Test
    void shouldCreateColour() {

        // given
        DotsService service = new DotsService();

        // when
        String[] setOfColours = service.getListOfColors();

        String firstColor = setOfColours[0];
        char firstCharacter = firstColor.charAt(0);

        int lenghtOfList = setOfColours.length;

        String lastColor = setOfColours[(lenghtOfList-1)];

        // then
        assertEquals(7, firstColor.length());
        assertEquals('#', firstCharacter);
        assertTrue(lenghtOfList > 0 || lenghtOfList < 1000);
        assertEquals(7, lastColor.length());
    }

}