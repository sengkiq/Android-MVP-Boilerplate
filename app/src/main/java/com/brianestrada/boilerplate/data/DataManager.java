package com.brianestrada.boilerplate.data;


import com.brianestrada.boilerplate.models.User;

import java.util.List;

public interface DataManager {
    void saveUser(User user);

    void saveUsers(List<User> userList);

    List<User> getUsers();
}
