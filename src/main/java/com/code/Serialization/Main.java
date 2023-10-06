package com.code.Serialization;
import java.io.FileOutputStream;
import java.io.*;
//1. Your object class should implement Serializable interface
//2. add import java.io.Serializable;
//3. FileOutPutStream fileOut = new FileOutPutStream(file path)
//4. objectOutPutStream out = new ObjectOutPutStream(fileOut)
//5. out.writeObject(objectName)
//6. out.close(); fileOut.close();
//.......................................................................................................

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.name ="Bro";
        user.password = "I<3Pizza";

        FileOutputStream fileOut = new FileOutputStream(("userInfo.ser"));
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println("Object info saved! :");
    }
}
