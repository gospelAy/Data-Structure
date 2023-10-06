package com.code.DeSerializer;

import java.io.Serializable;

public class User implements Serializable {

//    Steps to Deserializer
//    ..........................................................................................
//    1. Declare your object (don't instantiate)
//    2. Your class should implement serializable interface
//    3. add import java.io.serializable;
//    4. FileInputStream fileIn = new FileInputStream(file path);
//    5. objectInputStream in = new ObjectInputStream(fileIn);
//    6. objectNam = class in.readObject();
//    7. in.close();
//    ...............................................................................................................
    String name;
    String password;

    public void sayHello(){
        System.out.println("Hello " +name);
    }
}
