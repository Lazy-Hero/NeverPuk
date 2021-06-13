package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;
import net.n2.h;

public class m extends MessageToByteEncoder {
   private final byte[] p = new byte[8192];
   private final Deflater M;
   private int x;

   public m(int var1) {
      this.x = var1;
      this.M = new Deflater();
   }

   protected void v(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      h.X();
      int var5 = var2.readableBytes();
      h var6 = new h(var3);
      if(var5 < this.x) {
         var6.a(0);
         var6.writeBytes(var2);
      }

      byte[] var7 = new byte[var5];
      var2.readBytes(var7);
      var6.a(var7.length);
      this.M.setInput(var7, 0, var5);
      this.M.finish();
      if(!this.M.finished()) {
         int var8 = this.M.deflate(this.p);
         var6.writeBytes((byte[])this.p, 0, var8);
      }

      this.M.reset();
   }

   public void Y(int var1) {
      this.x = var1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
