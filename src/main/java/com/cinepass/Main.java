package com.cinepass;

import com.cinepass.dao.DatabaseInitializer;
import com.cinepass.dao.UserDao;
import com.cinepass.ui.Authentication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseInitializer.initialize();
        UserDao userDao = new UserDao();
        Scanner scanner = new Scanner(System.in);
        new Authentication(userDao, scanner).start();
        scanner.close();
    }
}
