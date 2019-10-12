package hu.elte.restaurant.repository;

import hu.elte.restaurant.model.Food;
import hu.elte.restaurant.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long>
{
    List<Food> findAllByCreatedBy(User user);

    //@Query("select u from Food u where u.name like %?1%")
    List<Food> findByNameContainingIgnoreCase(String name);
}
