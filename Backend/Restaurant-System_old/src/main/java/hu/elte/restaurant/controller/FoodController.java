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
@RequestMapping("food")
public class FoodController
{
    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @GetMapping("")
    public ResponseEntity<Iterable<Food>> getAll()
    {
        return new ResponseEntity<>(foodRepository.findAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/id/{id}")
    public ResponseEntity<Food> get(@PathVariable Long id)
    {
        return new ResponseEntity(foodRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Iterable<Food>> getByName(@PathVariable String name)
    {
        return new ResponseEntity(foodRepository.findByNameContainingIgnoreCase(name), HttpStatus.OK);
    }

    /*@PostMapping("")
    public ResponseEntity<Food> update(@RequestBody Food entity)
    {
        Optional<Food> baseEntity = foodRepository.findById(entity.);

        if(baseEntity.isPresent())
        {
            foodRepository.save(entity);
            return new ResponseEntity(foodRepository.findById(entity.getId()), HttpStatus.OK) ;
        }

        return ResponseEntity.notFound().build();
    }*/

    @GetMapping("createdby/{id}")
    public ResponseEntity<Food> getByCreatedUser(@PathVariable Long id)
    {
        return new ResponseEntity(
                foodRepository.findAllByCreatedBy(
                        userRepository.findById(id).get()
                ),
                HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Food> create(@RequestBody Food entity)
    {
        foodRepository.save(entity);
        return new ResponseEntity(foodRepository.findById(entity.getId()), HttpStatus.OK) ;

    }
}
