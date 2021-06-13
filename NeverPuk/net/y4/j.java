package net.y4;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.xn;
import net.nk.f_;
import net.ns.i;
import net.y4.a;
import net.y4.h;
import net.y4.p;
import net.y4.s;

public class j extends a {
   private static final List D = Arrays.asList(new i[]{net.nb.x.m, net.nb.x.H, net.nb.x.e, net.nb.x.w, net.nb.x.dQ, net.nb.x.F, net.nb.x.L});
   private final List d;
   private int e;
   private final int J;

   public j() {
      this.d = Lists.newArrayList();
      this.e = 32;
      this.J = 8;
      this.d.add(new i.w(f_.class, 1, 1, 1));
   }

   public j(Map var1) {
      this();

      for(Entry var3 : var1.entrySet()) {
         if(((String)var3.getKey()).equals("distance")) {
            this.e = net.u.t.B((String)var3.getValue(), this.e, 9);
         }
      }

   }

   public String O() {
      return "Temple";
   }

   protected boolean Y(int var1, int var2) {
      p.d();
      int var4 = var1;
      int var5 = var2;
      if(var1 < 0) {
         var1 -= this.e - 1;
      }

      if(var2 < 0) {
         var2 -= this.e - 1;
      }

      int var6 = var1 / this.e;
      int var7 = var2 / this.e;
      Random var8 = this.Q.Y(var6, var7, 14357617);
      var6 = var6 * this.e;
      var7 = var7 * this.e;
      var6 = var6 + var8.nextInt(this.e - 8);
      var7 = var7 + var8.nextInt(this.e - 8);
      if(var4 == var6 && var5 == var7) {
         i var9 = this.Q.V().b(new net.u.j(var4 * 16 + 8, 0, var5 * 16 + 8));
         return false;
      } else {
         return false;
      }
   }

   public net.u.j h(net.yv.r var1, net.u.j var2, boolean var3) {
      this.Q = var1;
      return O(var1, this, var2, this.e, 8, 14357617, false, 100, var3);
   }

   protected s z(int var1, int var2) {
      return new j.o(this.Q, this.N, var1, var2);
   }

   public boolean w(net.u.j var1) {
      s var2 = this.L(var1);
      if(var2 instanceof j.o && !var2.J.isEmpty()) {
         p var3 = (p)var2.J.get(0);
         return var3 instanceof h.e;
      } else {
         return false;
      }
   }

   public List o() {
      return this.d;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class o extends s {
      public o() {
      }

      public o(net.yv.r var1, Random var2, int var3, int var4) {
         this(var1, var2, var3, var4, var1.P(new net.u.j(var3 * 16 + 8, 0, var4 * 16 + 8)));
      }

      public o(net.yv.r var1, Random var2, int var3, int var4, i var5) {
         label0: {
            p.d();
            super(var3, var4);
            if(var5 != net.nb.x.e && var5 != net.nb.x.w) {
               if(var5 == net.nb.x.dQ) {
                  h.e var7 = new h.e(var2, var3 * 16, var4 * 16);
                  this.J.add(var7);
               }

               if(var5 != net.nb.x.m && var5 != net.nb.x.H) {
                  if(var5 != net.nb.x.F && var5 != net.nb.x.L) {
                     break label0;
                  }

                  h.z var8 = new h.z(var2, var3 * 16, var4 * 16);
                  this.J.add(var8);
               }

               h.o var9 = new h.o(var2, var3 * 16, var4 * 16);
               this.J.add(var9);
            }

            h.l var10 = new h.l(var2, var3 * 16, var4 * 16);
            this.J.add(var10);
         }

         this.O();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
