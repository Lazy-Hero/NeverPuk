package net.yv;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Random;
import net.xn;
import net.yv.d;
import net.yv.r;
import net.yz.aq;

public class n {
   private final d V;
   private final Random w;
   private final Long2ObjectMap l = new Long2ObjectOpenHashMap(4096);

   public n(d var1) {
      this.V = var1;
      this.w = new Random(var1.a());
   }

   public void R(net.ne.l var1, float var2) {
      if(this.V.F.L().M() == 1) {
         int var3 = net.u.t.L(var1.b);
         int var4 = net.u.t.L(var1.hS) - 1;
         int var5 = net.u.t.L(var1.hr);
         boolean var10000 = true;
         var10000 = false;
         byte var8 = -2;
         byte var9 = -2;
         int var10 = -1;

         while(true) {
            int var11 = var3 + var9 * 1 + var8 * 0;
            int var12 = var4 + var10;
            int var13 = var5 + var9 * 0 - var8 * 1;
            boolean var14 = true;
            this.V.U(new net.u.j(var11, var12, var13), net.nb.f.c.p());
            ++var10;
         }
      }

      if(!this.t(var1, var2)) {
         this.l(var1);
         this.t(var1, var2);
      }

   }

   public boolean t(net.ne.l var1, float var2) {
      boolean var10000 = true;
      double var4 = -1.0D;
      int var6 = net.u.t.L(var1.b);
      int var7 = net.u.t.L(var1.hr);
      var10000 = true;
      net.u.j var33 = net.u.j.V;
      long var10 = net.u.p.M(var6, var7);
      if(!this.l.containsKey(var10)) {
         net.u.j var31 = new net.u.j(var1);
         byte var13 = -128;
         int var15 = -128;

         while(true) {
            net.u.j var14;
            for(net.u.j var16 = var31.F(var13, this.V.d() - 1 - var31.h(), var15); var16.h() >= 0; var16 = var14) {
               var14 = var16.b();
               if(this.V.Z(var16).Q() == net.nb.f.uJ) {
                  for(var14 = var16.b(); this.V.Z(var14).Q() == net.nb.f.uJ; var14 = var14.b()) {
                     var16 = var14;
                  }

                  double var17 = var16.n(var31);
                  double var37;
                  int var36 = (var37 = var4 - 0.0D) == 0.0D?0:(var37 < 0.0D?-1:1);
                  var4 = var17;
               }
            }

            ++var15;
         }
      }

      n.t var12 = (n.t)this.l.get(var10);
      var4 = 0.0D;
      var12.I = this.V.y();
      int var34 = 0;
      double var38;
      var34 = (var38 = var4 - 0.0D) == 0.0D?0:(var38 < 0.0D?-1:1);
      return false;
   }

   public boolean l(net.ne.l var1) {
      int var10000 = 16;
      r.C();
      double var4 = -1.0D;
      int var6 = net.u.t.L(var1.b);
      int var7 = net.u.t.L(var1.hS);
      int var8 = net.u.t.L(var1.hr);
      int var9 = var6;
      int var10 = var7;
      int var11 = var8;
      int var12 = 0;
      int var13 = this.w.nextInt(4);
      net.u.j var14 = new net.u.j();
      int var15 = var6 - 16;
      if(var15 <= var6 + 16) {
         double var16 = (double)var15 + 0.5D - var1.b;
         int var18 = var8 - 16;
         if(var18 <= var8 + 16) {
            double var19 = (double)var18 + 0.5D - var1.hr;
            int var21 = this.V.d() - 1;
            if(this.V.y(var14.V(var15, var21, var18))) {
               if(var21 > 0 && this.V.y(var14.V(var15, var21 - 1, var18))) {
                  --var21;
               }

               if(var13 < var13 + 4) {
                  int var23 = var13 % 2;
                  int var24 = 1 - var23;
                  if(var13 % 4 >= 2) {
                     var23 = -var23;
                     var24 = -var24;
                  }

                  int var25 = 0;
                  int var26 = 0;
                  int var27 = -1;
                  int var28 = var15 + (var26 - 1) * var23 + var25 * var24;
                  int var29 = var21 + var27;
                  int var30 = var18 + (var26 - 1) * var24 - var25 * var23;
                  var14.V(var28, var29, var30);
                  if(this.V.Z(var14).n().B()) {
                     ++var27;
                     ++var26;
                     ++var25;
                     double var69 = (double)var21 + 0.5D - var1.hS;
                     double var83 = var16 * var16 + var69 * var69 + var19 * var19;
                     Double.compare(var4, 0.0D);
                     var4 = var83;
                     var9 = var15;
                     var10 = var21;
                     var11 = var18;
                     var12 = var13 % 4;
                     int var22 = var13 + 1;
                  }
               }
            }

            --var21;
            ++var18;
         }

         ++var15;
      }

      Double.compare(var4, 0.0D);
      var15 = var6 - 16;
      if(var15 <= var6 + 16) {
         double var35 = (double)var15 + 0.5D - var1.b;
         int var37 = var8 - 16;
         if(var37 <= var8 + 16) {
            double var40 = (double)var37 + 0.5D - var1.hr;
            int var45 = this.V.d() - 1;
            if(var45 >= 0) {
               if(this.V.y(var14.V(var15, var45, var37))) {
                  if(var45 > 0 && this.V.y(var14.V(var15, var45 - 1, var37))) {
                     --var45;
                  }

                  if(var13 < var13 + 2) {
                     int var58 = var13 % 2;
                     int var64 = 1 - var58;
                     int var70 = 0;
                     int var77 = -1;
                     int var84 = var15 + (var70 - 1) * var58;
                     int var88 = var45 + var77;
                     int var89 = var37 + (var70 - 1) * var64;
                     var14.V(var84, var88, var89);
                     if(this.V.Z(var14).n().B()) {
                        ++var77;
                        ++var70;
                        double var72 = (double)var45 + 0.5D - var1.hS;
                        double var85 = var35 * var35 + var72 * var72 + var40 * var40;
                        Double.compare(var4, 0.0D);
                        var4 = var85;
                        var9 = var15;
                        var10 = var45;
                        var11 = var37;
                        var12 = var13 % 2;
                        int var51 = var13 + 1;
                     }
                  }
               }

               --var45;
            }

            ++var37;
         }

         ++var15;
      }

      int var39 = var12 % 2;
      int var41 = 1 - var39;
      var10000 = var12 % 4;
      Double.compare(var4, 0.0D);
      var10 = net.u.t.g(var10, 70, this.V.d() - 10);
      int var20 = -1;
      int var47 = 1;
      int var52 = -1;
      int var59 = var9 + (var47 - 1) * var39 + var20 * var41;
      int var65 = var10 + var52;
      int var73 = var11 + (var47 - 1) * var41 - var20 * var39;
      int var79 = 1;
      this.V.U(new net.u.j(var59, var65, var73), net.nb.f.c.p());
      ++var52;
      ++var47;
      ++var20;
      net.yw.n var43 = net.nb.f.uJ.p().s(net.y9.p.E, aq.l.Z);
      var47 = 0;
      var52 = 0;
      var59 = -1;
      var65 = var9 + (var52 - 1) * var39;
      var73 = var10 + var59;
      var79 = var11 + (var52 - 1) * var41;
      boolean var86 = true;
      this.V.k(new net.u.j(var65, var73, var79), net.nb.f.c.p(), 2);
      ++var59;
      ++var52;
      var52 = 0;
      var59 = -1;
      var65 = var9 + (var52 - 1) * var39;
      var73 = var10 + var59;
      var79 = var11 + (var52 - 1) * var41;
      net.u.j var87 = new net.u.j(var65, var73, var79);
      this.V.b(var87, this.V.Z(var87).Q(), false);
      ++var59;
      ++var52;
      ++var47;
      return true;
   }

   public void z(long var1) {
      if(var1 % 100L == 0L) {
         long var3 = var1 - 300L;
         ObjectIterator var5 = this.l.values().iterator();

         while(var5.hasNext()) {
            n.t var6 = (n.t)var5.next();
            if(var6.I < var3) {
               var5.remove();
            }
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public class t extends net.u.j {
      public long I;

      public t(net.u.j var2, long var3) {
         super(var2.t(), var2.h(), var2.y());
         this.I = var3;
      }
   }
}
