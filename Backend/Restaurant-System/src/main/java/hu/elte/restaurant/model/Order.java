package hu.elte.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String destination;

    @Column(nullable = false)
    private String description;


    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @OneToMany(targetEntity = Food.class)
    private List<Food> foods;
    
    @OneToOne
    private User orderer;
}
