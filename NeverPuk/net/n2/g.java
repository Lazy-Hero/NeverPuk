package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;
import net.n2.x;

public class g extends MessageToByteEncoder {
   private final x I;

   public g(Cipher var1) {
      this.I = new x(var1);
   }

   protected void I(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      this.I.r(var2, var3);
   }
}
