package com.realdolmen.spring.repositories;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FoodRepositoryImpl implements FoodRepository {
    private Map<Class<? extends Animal>, Food> classFoodMap;

    @Override
    public void addFoodForAnimalType(Class<? extends Animal> clazz, Food food) {
        if (classFoodMap == null) {
            classFoodMap = new HashMap<>();
        }
        classFoodMap.put(clazz, food);
    }

    @Override
    public Food findFoodAnimalType(Class<? extends Animal> clazz) {
        return classFoodMap.get(clazz);
    }
}
