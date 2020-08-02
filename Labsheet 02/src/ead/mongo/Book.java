/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead.mongo;


public class Book {

    public String ISBN;
    public String BookTitle;
    public String Author;
    public String Category;
    public double Price;
    public int TotalPages;

    public Book(String ISBN_, String BTitle_, String Author_, String Category_, double Price_, int TPage_) {
        this.Author = Author_;
        this.BookTitle = BTitle_;
        this.Category = Category_;
        this.ISBN = ISBN_;
        this.Price = Price_;
        this.TotalPages = TPage_;
    }

    public Book(String ISBN_) {
        this.ISBN = ISBN_;
    }
}
