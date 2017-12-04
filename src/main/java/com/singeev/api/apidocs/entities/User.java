package com.singeev.api.apidocs.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Set<UserRole> userRoles = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
