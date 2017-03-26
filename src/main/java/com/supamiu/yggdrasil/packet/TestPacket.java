package com.supamiu.yggdrasil.packet;

import io.ygg.common.Session;
import io.ygg.packet.Packet;
import io.ygg.packet.PacketOpcode;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * @author Supamiu.
 *         <p>
 *         <Description>
 */
@PacketOpcode(10)
public class TestPacket extends Packet{

    public void decodeTcp(Session session) throws IOException {
        System.out.println("Received packet");
    }

    public void decodeUdp(Session session, ByteBuffer byteBuffer) throws IOException {
    }
}
