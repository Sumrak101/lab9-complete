package org.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Муму", "Тургенев");
        Librarian1 librarian1 = new Librarian1("Влад Ревин");
        Administrator1 administrator1 = new Administrator1("Кортез");
        User user1 = new User("Шамшот","Аркамов");
        Supplier1 supplier1 = new Supplier1("Серега");


        librarian1.issueBook(book, user1);
        supplier1.supply(book);
        librarian1.overdueNotification(user1);
    }
}