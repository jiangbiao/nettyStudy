package com.ly.search;

/**
 * Created by jb28755 on 2017/9/10.
 */
public class TimeServer {

    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length != 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                port = 8080;
            }
        }

        MultiplexerTimeServer timeserver = new MultiplexerTimeServer(port);
        new Thread(timeserver, "NIO-MultiplexerTimeServer-001").start();

    }
}
