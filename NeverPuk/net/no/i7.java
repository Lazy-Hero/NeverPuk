package net.no;

import java.io.IOException;
import net.no.s8;

public class i7 implements net.n2.k {
   private String X;
   private String b;
   private net.nc.u L;
   private int Q;

   public i7() {
   }

   public i7(net.nc.l var1, int var2) {
      this.X = var1.e();
      this.b = var1.a();
      this.L = var1.v().I();
      this.Q = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.X = var1.Z(16);
      s8.Y();
      this.Q = var1.readByte();
      if(this.Q == 0 || this.Q == 2) {
         this.b = var1.Z(32);
         this.L = net.nc.u.l(var1.Z(16));
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.x();
      var1.R(this.X);
      var1.writeByte(this.Q);
      if(this.Q == 0 || this.Q == 2) {
         var1.R(this.b);
         var1.R(this.L.e());
      }

   }

   public void S(net.x.t var1) {
      var1.m(this);
   }

   public String c() {
      return this.X;
   }

   public String t() {
      return this.b;
   }

   public int f() {
      return this.Q;
   }

   public net.nc.u Q() {
      return this.L;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
