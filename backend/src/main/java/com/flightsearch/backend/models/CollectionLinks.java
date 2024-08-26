package com.flightsearch.backend.models;

public class CollectionLinks {
    private String self;
    private String next;
    private String previous;
    private String last;
    private String first;
    private String up;

    public CollectionLinks() {
    }

    public CollectionLinks(String self,
                           String next,
                           String previous,
                           String last,
                           String first,
                           String up) {
        this.self = self;
        this.next = next;
        this.previous = previous;
        this.last = last;
        this.first = first;
        this.up = up;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }
}
