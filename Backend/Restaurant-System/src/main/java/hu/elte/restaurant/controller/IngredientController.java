package hu.elte.restaurant.controller;

import hu.elte.restaurant.model.Ingredient;
import hu.elte.restaurant.repository.IngredientRepository;
import hu.elte.restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ingredients")
public class IngredientController 
{
    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private UserRepository userRepository;

    //@CrossOrigin
    @GetMapping("")
    public ResponseEntity<Iterable<Ingredient>> getAll()
    {
        return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.OK);
    }
    
    @PutMapping("")
    public ResponseEntity<Ingredient> create(@RequestBody Ingredient entity)
    {
        ingredientRepository.save(entity);
        return new ResponseEntity(ingredientRepository.findById(entity.getId()), HttpStatus.OK) ;

    }
}
