package project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DotsController {

    DotsService dotsService = new DotsService();

    @GetMapping(path="/dots", produces="text/plain")
    public String defineDots() {
        return dotsService.getColor();
    }
}
