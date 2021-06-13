package net.no;

import java.io.IOException;
import net.no.s8;

public class sy implements net.n2.k {
   private int x;
   private String a;
   private net.cb.t u;
   private int X;
   private int R;

   public sy() {
   }

   public sy(int var1, String var2, net.cb.t var3) {
      this(var1, var2, var3, 0);
   }

   public sy(int var1, String var2, net.cb.t var3, int var4) {
      this.x = var1;
      this.a = var2;
      this.u = var3;
      this.X = var4;
   }

   public sy(int var1, String var2, net.cb.t var3, int var4, int var5) {
      this(var1, var2, var3, var4);
      this.R = var5;
   }

   public void j(net.x.t var1) {
      var1.H(this);
   }

   public void E(net.n2.h var1) throws IOException {
      s8.x();
      this.x = var1.readUnsignedByte();
      this.a = var1.Z(32);
      this.u = var1.g();
      this.X = var1.readUnsignedByte();
      if(this.a.equals("EntityHorse")) {
         this.R = var1.readInt();
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.Y();
      var1.writeByte(this.x);
      var1.R(this.a);
      var1.p(this.u);
      var1.writeByte(this.X);
      if(this.a.equals("EntityHorse")) {
         var1.writeInt(this.R);
      }

   }

   public int r() {
      return this.x;
   }

   public String Q() {
      return this.a;
   }

   public net.cb.t j() {
      return this.u;
   }

   public int T() {
      return this.X;
   }

   public int d() {
      return this.R;
   }

   public boolean U() {
      int var1 = s8.Y();
      return this.X > 0;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
