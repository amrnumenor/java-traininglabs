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

package global.skymind.training.intermediate.collections;

public class Ex8_Linked {
    //Set to public so getters & setters aren't needed
    public String bookName;
    public int millionsSold;

    //Reference to next link made in the LinkList
    //Holds the reference to the Link that was created before it set to null until it is connected to other links
    public Ex8_Linked next;
    public Ex8_Linked(String bookName, int millionsSold){
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public void display(){
        System.out.println(bookName + ": " + millionsSold + ",000,000 Sold");
    }

    public String toString(){
        return bookName;
    }

    public static void main(String[] args) {
        Ex8_LinkedList theLinkedList = new Ex8_LinkedList();
        //Insert Link and add a reference to the book Link added just prior to the field next


        System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");

        //Removes the last Link entered
        theLinkedList.removeFirst();
        theLinkedList.display();

        System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found");

        theLinkedList.removeLink("A Tale of Two Cities");
        System.out.println("\nA Tale of Two Cities Removed\n");
        theLinkedList.display();
    }

}
