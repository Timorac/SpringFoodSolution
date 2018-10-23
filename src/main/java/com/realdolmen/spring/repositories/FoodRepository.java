package com.realdolmen.spring.repositories;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;

public interface FoodRepository {

    void addFoodForAnimalType(Class<? extends Animal> clazz, Food food);
    Food findFoodAnimalType(Class<? extends Animal> clazz);

}
