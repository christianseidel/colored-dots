package project;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@CrossOrigin
public class DotsController {

    DotsService dotsService = new DotsService();

    @GetMapping(path="/dots", produces="text/plain")
    public String defineDots() {
        return dotsService.getColor();
    }
}
