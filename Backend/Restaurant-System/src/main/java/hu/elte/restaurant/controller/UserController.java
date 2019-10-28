package hu.elte.restaurant.controller;

import hu.elte.restaurant.model.Food;
import hu.elte.restaurant.model.User;
import hu.elte.restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<User>> All()
    {
        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }
    
    @PutMapping("")
    public ResponseEntity<User> create(@RequestBody User entity)
    {
        userRepository.save(entity);
        return new ResponseEntity(userRepository.findById(entity.getId()), HttpStatus.OK) ;

    }
}
