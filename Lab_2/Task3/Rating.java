package com.company.Task3;

public class Rating {
    private String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Rating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return rating;
    }
}
