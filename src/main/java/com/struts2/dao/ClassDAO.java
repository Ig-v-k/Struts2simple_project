package com.struts2.dao;

import java.util.ArrayList;
import java.util.Map;

public interface ClassDAO<S ,T extends Integer, U> {
    Map<S, U> getAllDB();
    ArrayList<U> returnAllUsers();
    U getUser();
    T get_Number_of_User();
    boolean check_User();
    void insertUser();
    void deleteUser();
    void updateUser();
}
