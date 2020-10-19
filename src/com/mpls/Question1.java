package com.mpls;

public class Question1 {
    String cheese;
    String[] toppings;
    boolean fresh;

    public Pizza(String cheese, String[] toppings, boolean fresh) {
        this.cheese = cheese;
        this.toppings = toppings;
        this.fresh = fresh;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
}
