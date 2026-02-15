/*
Concept:
De - Serialize User Object.
*/

import java.io.*;

class SerializeUser {
    public static void main(String[] args) throws Exception {
        User u = new User("admin", "1234");

        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("user.ser"));

        out.writeObject(u);
        out.close();
    }
}
