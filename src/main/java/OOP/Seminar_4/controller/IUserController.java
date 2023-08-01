package OOP.Seminar_4.controller;

import OOP.Seminar_4.data.User;

public interface IUserController <T extends User> {
    void create(String firstName, String secondName);
}
