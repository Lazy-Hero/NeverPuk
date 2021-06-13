package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import net.n2.h;

public class x {
   private final Cipher L;
   private byte[] a = new byte[0];
   private byte[] H = new byte[0];

   protected x(Cipher var1) {
      this.L = var1;
   }

   private byte[] y(ByteBuf var1) {
      h.w();
      int var3 = var1.readableBytes();
      if(this.a.length < var3) {
         this.a = new byte[var3];
      }

      var1.readBytes(this.a, 0, var3);
      return this.a;
   }

   protected ByteBuf o(ChannelHandlerContext var1, ByteBuf var2) throws ShortBufferException {
      int var3 = var2.readableBytes();
      byte[] var4 = this.y(var2);
      ByteBuf var5 = var1.alloc().heapBuffer(this.L.getOutputSize(var3));
      var5.writerIndex(this.L.update(var4, 0, var3, var5.array(), var5.arrayOffset()));
      return var5;
   }

   protected void r(ByteBuf var1, ByteBuf var2) throws ShortBufferException {
      h.w();
      int var4 = var1.readableBytes();
      byte[] var5 = this.y(var1);
      int var6 = this.L.getOutputSize(var4);
      if(this.H.length < var6) {
         this.H = new byte[var6];
      }

      var2.writeBytes(this.H, 0, this.L.update(var5, 0, var4, this.H));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
