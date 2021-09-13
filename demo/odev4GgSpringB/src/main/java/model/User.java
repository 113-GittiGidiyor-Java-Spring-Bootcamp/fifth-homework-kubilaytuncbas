package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;

@Data
@MappedSuperclass
@Table(name="users")
@EntityListeners(AuditingEntityListener.class)
public abstract class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private  int id;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;
    @CreatedDate
    @Column(name = "created_date", nullable = false)
    @JsonIgnore
    private Instant createdDate = Instant.now();

    @LastModifiedDate
    @Column(name = "last_modified_date")
    @JsonIgnore
    private Instant lastModifiedDate = Instant.now();

}
