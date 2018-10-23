package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.repositories.FoodRepository;
import com.realdolmen.spring.repositories.FoodRepositoryImpl;
import com.realdolmen.spring.service.PairiDaiza;
import com.realdolmen.spring.service.Zoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cda5732 on 25/03/2015.
 */
@Configuration
public class ZooConfig {
    @Bean
    public Zoo zoo() {
        Zoo zoo = new PairiDaiza("Pairi Daiza");
        zoo.addAnimal(new Tiger("Bengal Tiger"));
        zoo.addAnimal(new Elephant("Indian Elephant"));
        zoo.addAnimal(new Bear("Brown Bear"));
        return zoo;
    }
    // TODO Configure the FoodRepository

    @Bean
    public FoodRepository foodRepository(){

        FoodRepository foodRepository = new FoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Tiger.class, new MeatyFood());
        foodRepository.addFoodForAnimalType(Bear.class, new MeatyFood());
        foodRepository.addFoodForAnimalType(Elephant.class, new VegiFood());
        return foodRepository;
    }
}
