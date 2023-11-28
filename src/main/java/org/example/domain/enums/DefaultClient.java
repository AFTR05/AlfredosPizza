package org.example.domain.enums;

import lombok.Getter;
import org.example.domain.entities.Client;

@Getter
public enum DefaultClient {
    CLIENT_1("John Doe"),
    CLIENT_2("Jane Smith"),
    CLIENT_3("Bob Johnson"),
    CLIENT_4("Alice Williams"),
    CLIENT_5("Eva Brown"),
    CLIENT_6("Carlos Rodriguez"),
    CLIENT_7("Sara Kim"),
    CLIENT_8("Mike Davis"),
    CLIENT_9("Isabel Chen"),
    CLIENT_10("David Lee");
    private final String name;
    DefaultClient(String name) {
        this.name = name;
    }

    public Client createClient(){
        return new Client(name);
    }

}
