package hu.elte.restaurant.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseWithUpdateInfo extends BaseWithCreationInfo {
    @Column(updatable = false, nullable = false)
    private LocalDateTime updatedAt;

    @JoinColumn(updatable = false, nullable = false)
    @ManyToOne(targetEntity = User.class)
    private User updatedBy;

}

