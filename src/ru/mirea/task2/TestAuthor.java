package ru.mirea.task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Sam", "wetlihg@gnail.com", 'm');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        a1.setEmail("12123@gmail.com");
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        System.out.println(a1);
    }
}
