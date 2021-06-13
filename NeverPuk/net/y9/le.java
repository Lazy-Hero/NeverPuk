package net.y9;

import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yz.aq;

public class le extends l {
   protected le() {
      super(net.y1.l.S);
      this.f(net.ys.r.X);
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      int[] var10 = g3.v.w();
      if(var1.x) {
         return true;
      } else {
         var4.x((net.yv.z)(new le.t(var1, var2)));
         var4.S(net.v.q.gL);
         return true;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class t implements net.yv.z {
      private final net.yv.r D;
      private final net.u.j C;

      public t(net.yv.r var1, net.u.j var2) {
         this.D = var1;
         this.C = var2;
      }

      public String Q() {
         return "crafting_table";
      }

      public boolean H() {
         return false;
      }

      public net.cb.t b() {
         return new net.cb.h(net.nb.f.uj.j() + ".name", new Object[0]);
      }

      public net.nl.v A(net.r.i var1, net.r.r var2) {
         return new net.nl.m(var1, this.D, this.C);
      }

      public String H() {
         return "minecraft:crafting_table";
      }
   }
}
