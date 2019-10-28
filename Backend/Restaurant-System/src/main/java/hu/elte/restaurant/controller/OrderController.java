package hu.elte.restaurant.controller;

import hu.elte.restaurant.model.Food;
import hu.elte.restaurant.model.Ingredient;
import hu.elte.restaurant.model.Order;
import hu.elte.restaurant.repository.OrderRepository;
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
@RequestMapping("orders")
public class OrderController
{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    //@CrossOrigin
    @GetMapping("")
    public ResponseEntity<Iterable<Order>> getAll()
    {
        return new ResponseEntity<>(orderRepository.findAll(), HttpStatus.OK);
    }
    
    @PutMapping("")
    public ResponseEntity<Order> create(@RequestBody Order entity)
    {
        orderRepository.save(entity);
        return new ResponseEntity(orderRepository.findById(entity.getId()), HttpStatus.OK) ;

    }
}
