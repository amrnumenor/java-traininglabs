/*
 * Copyright (c) 2020-2021 Skymind Education Group Sdn. Bhd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.

 * SPDX-License-Identifier: Apache-2.0
 */
package global.skymind.training.intermediate.oop.ex01;

public class Book {
    /**
     * Implement a Book class which should have the following instance variables:
     * bookTitle, author, isFiction and numOfPages. (You should identify the appropriate data types)
     *
     * Additionally, the class must have a custom constructor to initialize the variables.
     *
     * You should also test this Book class to see if it works.
     *
     * Extra:
     * Implement a method taking a % value, which is the proportion of the book that has been read
     * by a person. Based on the %, this method should return the number of pages left to read.
     * */

    private String bookTitle, author;
    private boolean isFiction;
    private int numOfPages;

    public Book(String bookTitle, String author, boolean isFiction, int numOfPages) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isFiction = isFiction;
        this.numOfPages = numOfPages;
    }

    public Book(String bookTitle, boolean isFiction, int numOfPages) {
        this(bookTitle, "NA", isFiction, numOfPages);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isFiction() {
        return isFiction;
    }

    public void setFiction(boolean fiction) {
        isFiction = fiction;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String progress(int percent) {
        double pagesRead = (percent / 100.0) * this.numOfPages;
        return (int)(this.numOfPages - pagesRead) + " pages left";
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", isFiction=" + isFiction +
                ", numOfPages=" + numOfPages +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "JK Rowling", false, 450);
        System.out.println(book.toString());
        book.setFiction(true);
        System.out.println(book.progress(50));
        System.out.println(book.toString());

    }
}
