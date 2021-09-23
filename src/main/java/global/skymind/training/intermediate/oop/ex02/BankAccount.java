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
package global.skymind.training.intermediate.oop.ex02;

/* In this program, we will implement a simple bank account class with
 * some typical account operations.
 *
 * TO-DO:
 * 1. Declare instance variables to store name of account holder, their unique account ID, qnd their balance
 * 2. Implement suitable setters and getters
 * 3. Write methods withdraw and deposit which is able to decrease/increase account balance by an amount
 * 4. EXTRA: Write a method that warns users if their balance is 10 away from the minimum amount of RM50
 *
 * */

import java.util.ArrayList;

public class BankAccount {
    private String name;
    private int id;
    private double balance;

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    public void withdraw(double amount) {
        if(this.getBalance() - amount >= 50.00)
            setBalance(this.getBalance() - amount);
        else
            System.out.println("Cannot withdraw! Reached minimum savings amount!");
        if(this.getBalance() == 60.00) System.out.println("Your account is RM10 away from the minimum amount");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("Mira", 100, 100);
        BankAccount accountB = new BankAccount("Hiro", 101, 40);
        BankAccount accountC = new BankAccount("Jong-Kook", 102, 55);

        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(accountA);
        list.add(accountB);
        list.add(accountC);

        accountA.deposit(20);
        accountB.deposit(5);
        accountC.deposit(10);

        // Display variables
        list.forEach((e) -> System.out.println(e.toString()));

        accountA.withdraw(60);
        accountB.withdraw(10);
        accountC.withdraw(20);

        // Display variables
        list.forEach((e) -> System.out.println(e.toString()));
    }
}
