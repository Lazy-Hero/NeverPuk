package net.no;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import net.no.s8;

public class sw implements net.n2.k {
   private String j;
   private net.n2.h n;

   public sw() {
   }

   public sw(String var1, net.n2.h var2) {
      this.j = var1;
      this.n = var2;
      if(var2.writerIndex() > 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   public void E(net.n2.h var1) throws IOException {
      s8.Y();
      this.j = var1.Z(20);
      int var3 = var1.readableBytes();
      if(var3 >= 0 && var3 <= 1048576) {
         this.n = new net.n2.h(var1.readBytes(var3));
      }

      throw new IOException("Payload may not be larger than 1048576 bytes");
   }

   public void O(net.n2.h var1) throws IOException {
      var1.R(this.j);
      var1.writeBytes((ByteBuf)this.n);
   }

   public void r(net.x.t var1) {
      var1.K(this);
   }

   public String q() {
      return this.j;
   }

   public net.n2.h G() {
      return this.n;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
