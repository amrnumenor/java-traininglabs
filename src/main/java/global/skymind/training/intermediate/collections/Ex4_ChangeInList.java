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
import java.util.*;
//Java program to change elements in a List

public class Ex4_ChangeInList {
    public static void main(String args[])
    {
        //Creating list
        List<String> vehicle = new ArrayList<>();

        //Adding object in list
        vehicle.add("car");
        vehicle.add("motorcycle");
        vehicle.add("bicycle");
        vehicle.add("bus");
        System.out.println("Before: " + vehicle);

        //Changing elements in list
        vehicle.set(2, "truck");
        System.out.println("After: " + vehicle);
    }
}
