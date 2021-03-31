package lexicon.se.practice.dto;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.UUID;

public class Customer {
    @NotNull(message = " filed id is unique")
    private UUID customerId;
    @Email(message = " filed email Should be a well formed")
    private String email;
    @NotNull(message = " filed user was registered")
    @PastOrPresent
    private LocalDate regDate;
    @AssertTrue(message = "Check if the customer is active or not")
    private boolean active;
    @NotNull
    @Size(min = 5, max = 16)
    private CustomerDetails details;

    public Customer() {
    }

    public Customer(UUID customerId, String email, LocalDate regDate, boolean active, CustomerDetails details) {
        this.customerId = customerId;
        this.email = email;
        this.regDate = regDate;
        this.active = active;
        this.details = details;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public CustomerDetails getDetails() {
        return details;
    }

    public void setDetails(CustomerDetails details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", email='" + email + '\'' +
                ", regDate=" + regDate +
                ", active=" + active +
                ", details=" + details +
                '}';
    }
}
