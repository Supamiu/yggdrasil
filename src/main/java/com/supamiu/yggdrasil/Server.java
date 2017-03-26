package com.supamiu.yggdrasil;

import com.supamiu.yggdrasil.packet.TestPacket;
import io.ygg.packet.Packet;
import io.ygg.tcp.TcpServer;

import java.io.IOException;

/**
 * @author Supamiu.
 *         <p>
 *         <Description>
 */
public class Server {

    public static void main(String[] args) throws IOException {
        Packet.add(new TestPacket());

        TcpServer tcpServer = new TcpServer(58008, false);
    }
}
