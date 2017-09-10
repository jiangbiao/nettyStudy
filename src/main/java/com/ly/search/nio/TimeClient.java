package com.ly.search.nio;

/**
 * Created by jb28755 on 2017/9/10.
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length != 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                port = 8080;
            }
        }

        new Thread(new TimeClientHandler("127.0.0.1" , 8080), "TimeClient-001").start();

    }
}
