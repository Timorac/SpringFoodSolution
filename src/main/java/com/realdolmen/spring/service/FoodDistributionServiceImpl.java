package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodDistributionServiceImpl implements FoodDistributionService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public void feedAnimalsByType(List<Animal> animals) {
        animals.forEach(a -> {
            a.setFood(foodRepository.findFoodAnimalType(a.getClass()));
            System.out.println("Feeding " + a + " the delicious dish of " + foodRepository.findFoodAnimalType(a.getClass()));
        });
    }
}
