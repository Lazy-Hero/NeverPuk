package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToByteEncoder;
import net.n2.h;

@Sharable
public class v extends MessageToByteEncoder {
   protected void g(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      int var10000 = h.w();
      int var5 = var2.readableBytes();
      int var6 = h.c(var5);
      int var4 = var10000;
      if(var6 > 3) {
         throw new IllegalArgumentException("unable to fit " + var5 + " into " + 3);
      } else {
         h var7 = new h(var3);
         var7.ensureWritable(var6 + var5);
         var7.a(var5);
         var7.writeBytes(var2, var2.readerIndex(), var5);
         if(net.u.d.y() == null) {
            ++var4;
            h.h(var4);
         }

      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
