package be.vdab.halloheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HalloherokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(HalloherokuApplication.class, args);
    }

}

@Controller
@RequestMapping("/")
class IndexControler {
    @GetMapping
    public String index() {
        return "index";
    }
}
