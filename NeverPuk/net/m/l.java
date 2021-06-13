package net.m;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import net.m.qo;

public class l implements net.n2.k {
   private String Q;
   private net.n2.h h;

   public l() {
   }

   public l(String var1, net.n2.h var2) {
      this.Q = var1;
      this.h = var2;
      if(var2.writerIndex() > 32767) {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   public void E(net.n2.h var1) throws IOException {
      qo.y();
      this.Q = var1.Z(20);
      int var3 = var1.readableBytes();
      if(var3 >= 0 && var3 <= 32767) {
         this.h = new net.n2.h(var1.readBytes(var3));
      }

      throw new IOException("Payload may not be larger than 32767 bytes");
   }

   public void O(net.n2.h var1) throws IOException {
      var1.R(this.Q);
      var1.writeBytes((ByteBuf)this.h);
   }

   public void U(net.x.x var1) {
      qo.y();
      var1.h(this);
      if(this.h != null) {
         this.h.release();
      }

   }

   public String x() {
      return this.Q;
   }

   public net.n2.h S() {
      return this.h;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
