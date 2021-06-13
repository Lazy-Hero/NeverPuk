package net.cn;

import net.xn;
import net.cn.w;
import net.yz.m_;

public class p {
   private final int C;
   private net.yw.n P;
   private int t;
   private int g;

   public p(int var1, net.y9.l var2) {
      this(3, var1, var2);
   }

   public p(int var1, int var2, net.y9.l var3) {
      this.t = 1;
      this.C = var1;
      this.t = var2;
      this.P = var3.p();
   }

   public p(int var1, int var2, net.y9.l var3, int var4) {
      this(var1, var2, var3);
      this.P = var3.D(var4);
   }

   public int Q() {
      return this.t;
   }

   public net.yw.n N() {
      return this.P;
   }

   private net.y9.l y() {
      return this.P.Q();
   }

   private int l() {
      return this.P.Q().d(this.P);
   }

   public int T() {
      return this.g;
   }

   public void s(int var1) {
      this.g = var1;
   }

   public String toString() {
      int var1 = w.S();
      if(this.C >= 3) {
         m_ var3 = (m_)net.y9.l.m.t(this.y());
         String var2 = var3 == null?"null":var3.toString();
         if(this.t > 1) {
            (new StringBuilder()).append(this.t).append("*").append(var2).toString();
         }
      }

      String var4 = Integer.toString(net.y9.l.h(this.y()));
      if(this.t > 1) {
         var4 = this.t + "x" + var4;
      }

      int var6 = this.l();
      var4 = var4 + ":" + var6;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
