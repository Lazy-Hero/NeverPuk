package net.y4;

import java.util.Map;
import java.util.Map.Entry;
import net.xn;
import net.ns.i;
import net.y4.a;
import net.y4.p;
import net.y4.s;
import net.y4.x;

public class k extends a {
   private double x = 0.004D;

   public k() {
   }

   public String O() {
      return "Mineshaft";
   }

   public k(Map var1) {
      for(Entry var3 : var1.entrySet()) {
         if(((String)var3.getKey()).equals("chance")) {
            this.x = net.u.t.c((String)var3.getValue(), this.x);
         }
      }

   }

   protected boolean Y(int var1, int var2) {
      return this.N.nextDouble() < this.x && this.N.nextInt(80) < Math.max(Math.abs(var1), Math.abs(var2));
   }

   public net.u.j h(net.yv.r var1, net.u.j var2, boolean var3) {
      boolean var10000 = true;
      p.d();
      int var6 = var2.t() >> 4;
      int var7 = var2.y() >> 4;
      int var8 = 0;
      int var9 = -var8;
      boolean var10 = true;
      int var11 = -var8;
      boolean var10002 = true;
      int var13 = var6 + var9;
      int var14 = var7 + var11;
      this.N.setSeed((long)(var13 ^ var14) ^ var1.a());
      this.N.nextInt();
      if(!this.Y(var13, var14) || var3 && var1.P(var13, var14)) {
         ++var11;
         ++var9;
         ++var8;
         return null;
      } else {
         return new net.u.j((var13 << 4) + 8, 64, (var14 << 4) + 8);
      }
   }

   protected s z(int var1, int var2) {
      i var3 = this.Q.P(new net.u.j((var1 << 4) + 8, 64, (var2 << 4) + 8));
      k.n var4 = var3 instanceof net.ns.w?k.n.MESA:k.n.NORMAL;
      return new x(this.Q, this.N, var1, var2, var4);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum n {
      NORMAL,
      MESA;

      public static k.n i(int var0) {
         int[] var1 = p.d();
         return var0 >= 0 && var0 < values().length?values()[var0]:NORMAL;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
