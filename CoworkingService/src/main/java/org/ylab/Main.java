package org.ylab;

import org.ylab.dao.DaoUser;

import org.ylab.out.Welcome;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        Welcome.hello();

        DaoUser user = new DaoUser();
        user.switchControl();

    }

}