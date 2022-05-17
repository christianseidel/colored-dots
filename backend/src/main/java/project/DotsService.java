package project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DotsService {

    public String[] getListOfColors() {
        int numberOfDots = randomNumber(1000);
        String[] listOfColors = new String[numberOfDots];
        for (int i = 0; i < numberOfDots; i++) {
            listOfColors[i] = getColor();
        }
        return listOfColors;
    }

}