package hu.elte.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order")
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
    private String orderer;

    @Column(nullable = false)
    private String destination;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String foods;

    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
}
