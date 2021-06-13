package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;
import net.n2.x;

public class y extends MessageToMessageDecoder {
   private final x t;

   public y(Cipher var1) {
      this.t = new x(var1);
   }

   protected void p(ChannelHandlerContext var1, ByteBuf var2, List var3) throws Exception {
      var3.add(this.t.o(var1, var2));
   }
}
