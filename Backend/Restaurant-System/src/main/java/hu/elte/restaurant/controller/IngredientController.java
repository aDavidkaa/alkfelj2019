package hu.elte.restaurant.controller;

import hu.elte.restaurant.model.Ingredient;
import hu.elte.restaurant.repository.IngredientRepository;
import hu.elte.restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("ingredients")
public class IngredientController 
{
    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Ingredient>> getAll(){
        return new ResponseEntity(ingredientRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingredient> get(@PathVariable Long id){
        Optional<Ingredient> ingredient = ingredientRepository.findById(id);
        if(!ingredient.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ingredient.get());
    }

    @PostMapping("")
    public ResponseEntity<Ingredient> post(@RequestBody Ingredient ingredient){
        return ResponseEntity.ok(ingredientRepository.save(ingredient));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ingredient> update(@PathVariable Long id, @RequestBody Ingredient ingredient){
        Optional<Ingredient> oIngredient = ingredientRepository.findById(id);
        if(oIngredient.isPresent()){
            ingredient.setId(id);
        }
        return ResponseEntity.ok(ingredientRepository.save(ingredient));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Ingredient> delete(@PathVariable Long id) {
        Optional<Ingredient> issue = ingredientRepository.findById(id);
        if (!issue.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        ingredientRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("createdby/{id}")
    public ResponseEntity<Ingredient> getByCreatedUser(@PathVariable Long id){
        return new ResponseEntity(
                ingredientRepository.findAllByCreatedBy(
                        userRepository.findById(id).get()
                ),
                HttpStatus.OK);
    }
}
