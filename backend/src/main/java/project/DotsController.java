package project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@CrossOrigin
public class DotsController {

    DotsService dotsService = new DotsService();

    @GetMapping(path="/dots")
    public String[] createListOfColors() {
        return dotsService.getListOfColors();
    }
}
