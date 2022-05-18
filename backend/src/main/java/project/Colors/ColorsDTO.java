package project.Colors;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;

@Data
@AllArgsConstructor
public class ColorsDTO {

    private Collection<String> givenColors;
    private Collection<String> randomColors;
}

/*
    public enum GivenColor {

    }

    public String randomColor() {
        getRandomColor();

        return color;
    }

*/
