package hu.elte.restaurant.controller;

import hu.elte.restaurant.model.Food;
import hu.elte.restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Food>> getAll()
    {
        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }
}
