package club.nullbyte3.kodiak.module2.library;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;
    private List<String> reviews;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public int getReviewCount() {
        return reviews.size();
    }
}