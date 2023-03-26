package racingCar;

import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class RacingCarMain {
    public static void main(String[] args) {
        SpringApplication.run(RacingCarMain.class, args);

    }

    @PostMapping("/racingcar")
    public ArrayList<RacingMember> racing(@RequestBody RacingMember RacingMember) {
        RacingCar racingCar = new RacingCar(RacingMember.name);
        racingCar.setTrial(RacingMember.count);
        racingCar.run();
        racingCar.showWinner();
        return racingCar.putCas();
    }
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}

