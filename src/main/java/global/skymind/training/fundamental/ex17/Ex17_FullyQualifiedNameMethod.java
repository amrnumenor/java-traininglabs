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
package global.skymind.training.fundamental.ex17;

/**
    1. We can access the declared classes of different packages without having to use
       the import statement when we apply the fully qualified name.
    2. However, you need to apply fully qualified name every time to access the class
       or interface from different packages.
    3. This technique is commonly used when two packages have the same class name,
       such as when the class Date that present in both java.util and java.sql packages.
 */

public class Ex17_FullyQualifiedNameMethod {

    public static void main(String args[])
    {
        /*
            Ex1. Fully Qualified Name Method
            a. Please use fully qualified name to access the class of different package
               and create obj instance from MyClass to print
            b. The MyClass file is located at global.skymind.util
         */

        // Initializing the String variable with a value
        String name = "This packages is using Fully-Qualified Method";

        // Creating an instance of class MyClass from another package.
        //Write your code here

    }
}
