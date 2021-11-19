package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser(" Чарли ", " Вильямс ", (byte) 25);
        userService.saveUser(" Джек ", " Петерс ", (byte) 26);
        userService.saveUser(" Гарри ", " Гибсон ", (byte) 27);
        userService.saveUser(" Джейкоб ", " Мартин ", (byte) 28);
        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();

    }
}
