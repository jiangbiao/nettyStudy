package com.ly.search.file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by jb28755 on 2017/9/14.
 */
public class FileTest {

    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("D:\\github\\nettyStudy\\test.txt", "rw");
        FileChannel channel = randomAccessFile.getChannel();
        String content = "138888888|北京市海淀区|全球通|VIP用户";
        ByteBuffer writeBuffer = ByteBuffer.allocate(128);
        channel.read(writeBuffer);

        System.out.println(channel.write(writeBuffer));
        writeBuffer.put(content.getBytes());
        writeBuffer.flip();
        channel.write(writeBuffer);
        channel.close();
        randomAccessFile.close();
    }
}
