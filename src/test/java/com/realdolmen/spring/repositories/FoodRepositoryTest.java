package com.realdolmen.spring.repositories;

import com.realdolmen.spring.ApplicationConfiguration;
import com.realdolmen.spring.domain.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class FoodRepositoryTest {

    @Autowired
    private FoodRepository foodRepository;

    @Test
    public void findFoodAnimalTypeMeatySuccess() {
        Food food = foodRepository.findFoodAnimalType(Tiger.class);
        Assert.assertNotNull(food);
        Assert.assertTrue(food instanceof MeatyFood);
    }

    @Test
    public void findFoodAnimalTypeVeggieSuccess() {
        Food food = foodRepository.findFoodAnimalType(Elephant.class);
        Assert.assertNotNull(food);
        Assert.assertTrue(food instanceof VegiFood);
    }

}
