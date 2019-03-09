package com.commons.utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @author shengri
 * @date 3/7/19
 */
public final class IpUtils {
    private IpUtils() {
    }

    public static void getIp(){
//        NetworkInterface.getNetworkInterfaces();
    }

    public static void main(String[] args) throws SocketException, UnknownHostException {
        NetworkInterface.getNetworkInterfaces();

        System.out.println(InetAddress.getLocalHost().getHostAddress());
        System.out.println(InetAddress.getLocalHost().getHostName());
        System.out.println(InetAddress.getLocalHost());
    }

}
