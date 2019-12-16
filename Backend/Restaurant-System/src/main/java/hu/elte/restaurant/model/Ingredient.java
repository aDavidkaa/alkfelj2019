package hu.elte.restaurant.model;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ingredients")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Ingredient extends BaseWithCreationInfo
{
    @Column(nullable = false)
    private String name;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, targetEntity = Food.class, mappedBy = "ingredient")
    private List<Food> food;
    
}
