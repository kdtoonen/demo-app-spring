package com.bluemorphost.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RaceController {
    @RequestMapping("/race")
    public Race race(@RequestParam(value="id") String id){
        return new Race(id);
    }
}
