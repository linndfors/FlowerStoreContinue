package com.example.demo.Controlers;


import com.example.demo.Items.CactusFlower;
import com.example.demo.Items.Flower;
import com.example.demo.Items.RomashkaFlower;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.demo.Items.FlowerColor.BLUE;
import static com.example.demo.Items.FlowerColor.RED;

@RestController
@RequestMapping(path = "/flowers")
public class FlowerController {
    @GetMapping
    public List<String> getFlowers(){
        Flower flower_one = new RomashkaFlower();
        flower_one.setDescription("This is the most beautiful romashka in the whole world");
        flower_one.setPrice(102);
        flower_one.setColor(BLUE);
        flower_one.setSepalLength(204);
        System.out.println(flower_one);

        Flower flower_two = new CactusFlower();
        flower_two.setDescription("Just red cactus :)");
        flower_two.setPrice(99);
        flower_two.setColor(RED);
        flower_two.setSepalLength(1);

        return List.of(flower_one.toString(), flower_two.toString());
    }
}
