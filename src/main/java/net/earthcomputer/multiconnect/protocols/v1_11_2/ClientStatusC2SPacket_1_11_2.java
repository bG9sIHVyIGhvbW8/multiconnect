package net.earthcomputer.multiconnect.protocols.v1_11_2;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ServerPlayPacketListener;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;

import java.io.IOException;

public class ClientStatusC2SPacket_1_11_2 implements Packet<ServerPlayPacketListener> {

    private Mode mode;

    public ClientStatusC2SPacket_1_11_2() {
    }

    public ClientStatusC2SPacket_1_11_2(Mode mode) {
        this.mode = mode;
    }

    public ClientStatusC2SPacket_1_11_2(ClientStatusC2SPacket other) {
        this.mode = Mode.values()[other.getMode().ordinal()];
    }

    @Override
    public void read(PacketByteBuf buf) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void write(PacketByteBuf buf) throws IOException {
        buf.writeEnumConstant(mode);
    }

    @Override
    public void apply(ServerPlayPacketListener listener) {
        throw new UnsupportedOperationException();
    }

    public enum Mode {
        PERFORM_RESPAWN, REQUEST_STATS, OPEN_INVENTORY_ACHIEVEMENT
    }
}
