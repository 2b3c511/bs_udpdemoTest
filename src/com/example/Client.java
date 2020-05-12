package com.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.IOException;
import java.io.Writer;
import java.net.*;
import java.util.Scanner;

/**
 * @author Xiamuzi
 * @version 1.0
 * @date 2020/5/1 21:28
 */
public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String info = "111111111";
        DatagramPacket dp = new DatagramPacket(info.getBytes(),info.length(),InetAddress.getByName("121.199.28.87"),8800);
        socket.send(dp);
        socket.close();
    }
}
