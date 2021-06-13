package net.no;

import java.io.IOException;
import net.no.s8;
import net.yv.o9;

public class p implements net.n2.k {
   private int H;
   private net.yv.l O;
   private o9 e;
   private net.yv.j L;

   public p() {
   }

   public p(int var1, net.yv.l var2, net.yv.j var3, o9 var4) {
      this.H = var1;
      this.O = var2;
      this.e = var4;
      this.L = var3;
   }

   public void a(net.x.t var1) {
      var1.h(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.H = var1.readInt();
      s8.Y();
      this.O = net.yv.l.w(var1.readUnsignedByte());
      this.e = o9.M(var1.readUnsignedByte());
      this.L = net.yv.j.X(var1.Z(16));
      if(this.L == null) {
         this.L = net.yv.j.R;
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeInt(this.H);
      var1.writeByte(this.O.L());
      var1.writeByte(this.e.x());
      var1.R(this.L.H());
   }

   public int W() {
      return this.H;
   }

   public net.yv.l j() {
      return this.O;
   }

   public o9 Y() {
      return this.e;
   }

   public net.yv.j c() {
      return this.L;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
