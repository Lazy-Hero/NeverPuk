package net.no;

import java.io.IOException;
import net.no.s8;
import net.yv.o9;

public class s5 implements net.n2.k {
   private int u;
   private boolean X;
   private o9 B;
   private int s;
   private net.yv.l h;
   private int P;
   private net.yv.j L;
   private boolean A;

   public s5() {
   }

   public s5(int var1, o9 var2, boolean var3, int var4, net.yv.l var5, int var6, net.yv.j var7, boolean var8) {
      this.u = var1;
      this.s = var4;
      this.h = var5;
      this.B = var2;
      this.P = var6;
      this.X = var3;
      this.L = var7;
      this.A = var8;
   }

   public void E(net.n2.h var1) throws IOException {
      this.u = var1.readInt();
      s8.Y();
      int var3 = var1.readUnsignedByte();
      this.X = (var3 & 8) == 8;
      var3 = var3 & -9;
      this.B = o9.M(var3);
      this.s = var1.readInt();
      this.h = net.yv.l.w(var1.readUnsignedByte());
      this.P = var1.readUnsignedByte();
      this.L = net.yv.j.X(var1.Z(16));
      if(this.L == null) {
         this.L = net.yv.j.R;
      }

      this.A = var1.readBoolean();
   }

   public void O(net.n2.h var1) throws IOException {
      s8.Y();
      var1.writeInt(this.u);
      int var3 = this.B.x();
      if(this.X) {
         var3 |= 8;
      }

      var1.writeByte(var3);
      var1.writeInt(this.s);
      var1.writeByte(this.h.L());
      var1.writeByte(this.P);
      var1.R(this.L.H());
      var1.writeBoolean(this.A);
   }

   public void l(net.x.t var1) {
      var1.J(this);
   }

   public int k() {
      return this.u;
   }

   public boolean s() {
      return this.X;
   }

   public o9 X() {
      return this.B;
   }

   public int g() {
      return this.s;
   }

   public net.yv.l j() {
      return this.h;
   }

   public int f() {
      return this.P;
   }

   public net.yv.j L() {
      return this.L;
   }

   public boolean j() {
      return this.A;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
