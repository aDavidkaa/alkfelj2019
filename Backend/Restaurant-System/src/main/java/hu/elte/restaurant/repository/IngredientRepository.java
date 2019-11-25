package hu.elte.restaurant.repository;

import  hu.elte.restaurant.model.User;
import hu.elte.restaurant.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long>
{
    Iterable<Ingredient> findAllByCreatedBy (User user);
}
