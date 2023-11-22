package org.example.domain.enums;

import lombok.Getter;
import org.example.domain.entities.Client;

@Getter
public enum DefaultClient {
    CLIENT_1("John Doe", "123 Main St", "555-1234"),
    CLIENT_2("Jane Smith", "456 Oak St", "555-5678"),
    CLIENT_3("Bob Johnson", "789 Pine St", "555-9012"),
    CLIENT_4("Alice Williams", "987 Elm St", "555-3456"),
    CLIENT_5("Eva Brown", "654 Birch St", "555-7890"),
    CLIENT_6("Carlos Rodriguez", "321 Cedar St", "555-2345"),
    CLIENT_7("Sara Kim", "876 Maple St", "555-6789"),
    CLIENT_8("Mike Davis", "543 Spruce St", "555-0123"),
    CLIENT_9("Isabel Chen", "210 Walnut St", "555-4567"),
    CLIENT_10("David Lee", "879 Fir St", "555-8901");

    private final String name;
    private final String direction;
    private final String cellphoneNumber;

    DefaultClient(String name, String direction, String cellphoneNumber) {
        this.name = name;
        this.direction = direction;
        this.cellphoneNumber = cellphoneNumber;
    }

    public Client createClient(){
        return new Client(name,direction,cellphoneNumber);
    }

}
