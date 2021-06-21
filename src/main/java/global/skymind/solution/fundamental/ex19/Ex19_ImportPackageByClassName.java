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
package global.skymind.solution.fundamental.ex19;

/**
    1. We can access a specific class package but not the sub-packages by using a
       specific class name after the import statement.
    2. In contrast to the Fully Qualified Name method, the instance of class
       MyClass is created in simplified term and not need to include whole package name.
 */

//Import here
import global.skymind.util.*;

public class Ex19_ImportPackageByClassName {

    public static void main(String args[])
    {
        /*
            Ex3. Import Entire Package Method
            a. Please create obj instance and import MyClass to print
            b. The MyClass file is located at global.skymind.util
         */

        // Initializing the String variable with a value
        String name = "The entire packages is imported by using asterisk *";

        // Creating an instance of class MyClass from another package.
        //Write your code here
        MyClass obj = new MyClass();
        obj.printName(name);
    }
}


