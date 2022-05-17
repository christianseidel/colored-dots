package project.Colors;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;

@Data
@AllArgsConstructor
public class GivenColorsDTO {

    private Collection<String> givenColors;
    private Collection<String> randomColors;
}

    public enum GivenColor {

    }

    public String randomColor() {
        getRandomColor();

        return color;
    }


    // Using the Netscape Color Scheme:
    private String getColor() {
        int x = randomNumber(12);
        String color = "";
        switch(x) {
            case 1:
                color = "#FF0000";
                break;
            case 2:
                color = "#00FF00";
                break;
            case 3:
                color = "#0000FF";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                color = getRandomColor();
        }
        return color;
    }

    private String getRandomColor() {
        String color = "#";
        for (int i = 0; i <= 2; i++) {
            color = color + getColorByte();
        }
        return color;
    }

    private String getColorByte() {
        String hex = "";
        int c = randomNumber(6);
        switch(c) {
            case 1:
                hex = "00";
                break;
            case 2:
                hex = "33";
                break;
            case 3:
                hex = "66";
                break;
            case 4:
                hex = "99";
                break;
            case 5:
                hex = "CC";
                break;
            case 6:
                hex = "FF";
                break;
        }
        return hex;
    }

    private int randomNumber(int n) {
        int x = (int)((Math.random() * n) + 1);
        return x;
    }
}
