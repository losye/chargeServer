package chargedot.server.handler;

import chargedot.domain.Session;
import chargedot.protocal.DataPacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author zhengye.zhang
 */
public class ProtocolEncoder extends MessageToByteEncoder<DataPacket> {

    private Session session;

    public ProtocolEncoder(Session session) {
        this.session = session;
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, DataPacket msg, ByteBuf out) throws Exception {

    }
}
