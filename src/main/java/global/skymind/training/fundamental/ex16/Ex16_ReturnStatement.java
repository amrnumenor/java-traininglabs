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
package global.skymind.training.fundamental.ex16;

import java.util.Arrays;
import java.util.Random;

public class Ex16_ReturnStatement {

    public static void main(String[] args) {

        /*
        We learnt about break and continue statements previously and used it to manipulate loops.
        For giving responses to the user, we use System.out.println() in previous examples.
        Now what if we want the method to return some values to use it in other parts of the program?
        That's where return statement comes in.
         */

        int[] randArray = createRandArray(); // here, we call the static method and it returns an object of type int[]
        System.out.println(Arrays.toString(randArray)); // let's print out and see the numbers in the array

        int firstEvenNumber = getFirstEvenNumber(randArray); // let's call the method which helps us find the first even number
        System.out.println("The first even number in the array is: " + firstEvenNumber);

    }

    private static int[] createRandArray() {

        // Here, we write a program to generate a 10-element array with random numbers

        Random random = new Random(); // instantiating a Random object
        int[] arr = new int[10]; // initialise an array of size 10

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // put each randomly generated number into the array
        }

        return arr; // return the array object
    }

    private static int getFirstEvenNumber(int[] arr) {

        // Here, we write an program which returns the first even number if it exists, else it returns -1

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // do you know what is happening here?
                return arr[i];
            }
        }
        return -1; /* REMOVE arr.length AND ENTER YOUR CODE HERE */
    }


}
