/*
Concept:
transient field is not serialized.
*/

import java.io.*;

class User implements Serializable {
    String username;
    transient String password;

    User(String u, String p) {
        username = u;
        password = p;
    }
}
