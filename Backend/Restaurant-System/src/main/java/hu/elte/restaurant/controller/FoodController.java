package hu.elte.restaurant.controller;

import hu.elte.restaurant.model.Food;
import hu.elte.restaurant.repository.FoodRepository;
import hu.elte.restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("foods")
public class FoodController
{
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Food>> getAll(){
        return new ResponseEntity(foodRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> get(@PathVariable Long id){
        Optional<Food> issue = foodRepository.findById(id);
        if (!issue.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(issue.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> update(@PathVariable Long id, @RequestBody Food food) {
        Optional<Food> oFood = foodRepository.findById(id);
        if (oFood.isPresent()) {
            food.setId(id);
            return ResponseEntity.ok(foodRepository.save(food));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("")
    public ResponseEntity<Food> post(@RequestBody Food food) {
        return ResponseEntity.ok(foodRepository.save(food));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Food> delete(@PathVariable Long id) {
        Optional<Food> food = foodRepository.findById(id);
        if (!food.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        foodRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("createdby/{id}")
    public ResponseEntity<Food> getByCreatedUser(@PathVariable Long id){
        return new ResponseEntity(
                foodRepository.findAllByCreatedBy(
                        userRepository.findById(id).get()
                ),
        HttpStatus.OK);
    }
}
