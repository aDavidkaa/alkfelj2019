package hu.elte.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "foods")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Food
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer calories;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FoodStatus status;

    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(updatable = false, nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @JoinColumn(updatable = false, nullable = false)
    @ManyToOne(fetch =FetchType.EAGER, targetEntity = User.class)
    private User createdBy;

    @JoinColumn(updatable = false, nullable = false)
    @ManyToOne(fetch =FetchType.EAGER,targetEntity = User.class)
    private User updatedBy;

    @ManyToMany(fetch =FetchType.EAGER, targetEntity = Ingredient.class)
    private List<Ingredient> ingredient;

}
