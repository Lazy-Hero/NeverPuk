package net.no;

import java.io.IOException;
import java.util.Collection;
import net.no.s8;

public class u implements net.n2.k {
   private int r;
   private byte h;
   private boolean p;
   private net.cg.n[] i;
   private int k;
   private int R;
   private int s;
   private int m;
   private byte[] q;

   public u() {
   }

   public u(int var1, byte var2, boolean var3, Collection var4, byte[] var5, int var6, int var7, int var8, int var9) {
      this.r = var1;
      this.h = var2;
      this.p = var3;
      this.i = (net.cg.n[])var4.toArray(new net.cg.n[var4.size()]);
      this.k = var6;
      this.R = var7;
      this.s = var8;
      this.m = var9;
      this.q = new byte[var8 * var9];

      for(int var10 = 0; var10 < var8; ++var10) {
         for(int var11 = 0; var11 < var9; ++var11) {
            this.q[var10 + var11 * var8] = var5[var6 + var10 + (var7 + var11) * 128];
         }
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.r = var1.q();
      this.h = var1.readByte();
      this.p = var1.readBoolean();
      this.i = new net.cg.n[var1.q()];

      for(int var2 = 0; var2 < this.i.length; ++var2) {
         short var3 = (short)var1.readByte();
         this.i[var2] = new net.cg.n(net.cg.n.V((byte)(var3 >> 4 & 15)), var1.readByte(), var1.readByte(), (byte)(var3 & 15));
      }

      this.s = var1.readUnsignedByte();
      if(this.s > 0) {
         this.m = var1.readUnsignedByte();
         this.k = var1.readUnsignedByte();
         this.R = var1.readUnsignedByte();
         this.q = var1.J();
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.r);
      var1.writeByte(this.h);
      s8.Y();
      var1.writeBoolean(this.p);
      var1.a(this.i.length);
      net.cg.n[] var3 = this.i;
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         net.cg.n var6 = var3[var5];
         var1.writeByte((var6.Y() & 15) << 4 | var6.h() & 15);
         var1.writeByte(var6.k());
         var1.writeByte(var6.A());
         ++var5;
      }

      var1.writeByte(this.s);
      if(this.s > 0) {
         var1.writeByte(this.m);
         var1.writeByte(this.k);
         var1.writeByte(this.R);
         var1.Z(this.q);
      }

   }

   public void S(net.x.t var1) {
      var1.G(this);
   }

   public int S() {
      return this.r;
   }

   public void X(net.cg.s var1) {
      var1.J = this.h;
      var1.i = this.p;
      var1.Q.clear();

      for(int var2 = 0; var2 < this.i.length; ++var2) {
         net.cg.n var3 = this.i[var2];
         var1.Q.put("icon-" + var2, var3);
      }

      for(int var4 = 0; var4 < this.s; ++var4) {
         for(int var5 = 0; var5 < this.m; ++var5) {
            var1.E[this.k + var4 + (this.R + var5) * 128] = this.q[var4 + var5 * this.s];
         }
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
