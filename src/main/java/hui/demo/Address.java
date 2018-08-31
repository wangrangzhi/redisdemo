package hui.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;

public class Address {
    @Id
    @Indexed
    private String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }
}
