package lexicon.se.practice.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class CustomerDetails {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String detailsId;

    @NotNull(message = "Name should not be null")
    @Size(min = 2, max = 4, message = "Must be between 2 and 4")
    @Column(nullable = false, length = 4)
    private String street;

    @NotNull
    @Size(max = 5, message = "should be 5 numbers")
    @Column(nullable = false, length = 5)
    private String zipCode;//35263

    @NotNull
    @Column(nullable = false, length = 20)
    private String city;

    @NotNull
    @Column(nullable = false, length = 10)
    private String homePhone;

    @NotNull
    @Column(nullable = false, length = 10)
    private String cellPhone;
}
