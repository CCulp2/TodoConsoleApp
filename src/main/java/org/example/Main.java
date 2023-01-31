package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoListRepo repo = new TodoListRepo();
        Menu menu = new Menu(repo, sc);
        menu.menuLoop();
    }
}