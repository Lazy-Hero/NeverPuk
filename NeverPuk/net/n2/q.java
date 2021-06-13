package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import net.n2.h;

public class q extends ByteToMessageDecoder {
   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) throws Exception {
      var2.markReaderIndex();
      h.w();
      byte[] var5 = new byte[3];
      byte var6 = 0;
      int var10001 = var5.length;
      if(!var2.isReadable()) {
         var2.resetReaderIndex();
      } else {
         var5[var6] = var2.readByte();
         var10001 = var5[var6];
         h var7 = new h(Unpooled.wrappedBuffer(var5));
         int var8 = var7.q();
         if(var2.readableBytes() >= var8) {
            var3.add(var2.readBytes(var8));
            var7.release();
         } else {
            var2.resetReaderIndex();
            var7.release();
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
