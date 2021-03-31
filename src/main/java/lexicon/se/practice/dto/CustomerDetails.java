package lexicon.se.practice.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.UUID;

public class CustomerDetails {
    @Null(message = "Filed id is required and unique")
    private UUID DetailsId;
    @NotNull
    private String street;
    @NotNull
    @Size(min = 6)
    private String zipCode;
    @NotNull
    private String city;
    @NotNull
    @Size(max = 10)
    private String homePhone;
    @NotNull
    @Size(max = 10)
    private String cellPhone;

    public CustomerDetails() {
    }

    public CustomerDetails(UUID detailsId, String street, String zipCode, String city, String homePhone, String cellPhone) {
        DetailsId = detailsId;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
    }

    public UUID getDetailsId() {
        return DetailsId;
    }

    public void setDetailsId(UUID detailsId) {
        DetailsId = detailsId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "DetailsId=" + DetailsId +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }
}
