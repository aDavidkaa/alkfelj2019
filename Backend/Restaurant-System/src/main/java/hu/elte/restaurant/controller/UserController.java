package hu.elte.restaurant.controller;

import hu.elte.restaurant.model.Food;
import hu.elte.restaurant.model.User;
import hu.elte.restaurant.repository.UserRepository;
import hu.elte.restaurant.security.AuthenticatedUser;
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

    @Autowired
    private AuthenticatedUser authenticatedUser;

    @GetMapping("")
    public ResponseEntity<Iterable<User>> getAll(){
        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("/logoff")
    public ResponseEntity logoff() {
        authenticatedUser.setUser(null);
        return ResponseEntity.ok(0);
    }
}
