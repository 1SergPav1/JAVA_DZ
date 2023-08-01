package OOP.Seminar_4.view;

import OOP.Seminar_4.data.User;

import java.util.List;

public interface UserViewInterface<T extends User> {
    public void sendOnConsole(List<T> listT);
}

