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
package global.skymind.training.intermediate.oop.demo.demo02_encapsulation;

/* Encapsulation can be achieved by means of access modifiers typically
 * public and private. Additionally, we have methods that are able to
 * directly interact with variables that are "hidden" from us.
 * Note: Other modifiers are protected and default */

class Student {

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }
}

class Encapsulation {

    public static void main(String args[]){
        Student Student1 = new Student();
        Student1.setName("Maria");
        Student1.setAge(13);

        System.out.println("Name: " + Student1.getName() + "\nAge: " + Student1.getAge());
    }
}
