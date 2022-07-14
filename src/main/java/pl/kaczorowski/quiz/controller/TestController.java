package pl.kaczorowski.quiz.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test" )
@AllArgsConstructor
public class TestController {


    @GetMapping
    public String test() {
        return "test";
    }
}
