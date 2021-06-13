package net.z;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.d1;
import net.gn;
import net.xn;
import net.yv.o9;
import net.z.g;
import net.z.tk;

public class ty extends g {
   public static Ordering h = Ordering.from(new ty.o());
   private final net.nn.j Q;
   private final tk f;
   private net.cb.t J;
   private net.cb.t t;
   private long K;
   private boolean n;

   public ty(net.nn.j var1, tk var2) {
      this.Q = var1;
      this.f = var2;
   }

   public static String G(net.yp.b var0) {
      return var0.F() != null?var0.F().c():net.nc.y.s(var0.L(), var0.J().getName());
   }

   public void B(boolean var1) {
      if(!this.n) {
         this.K = net.nn.j.E();
      }

      this.n = var1;
   }

   public void U(int var1, net.nc.b var2, @Nullable net.nc.l var3) {
      g.B();
      net.yp.v var5 = this.Q.sf.x3;
      List var6 = h.sortedCopy(var5.B());
      int var7 = 0;
      int var8 = 0;
      Iterator var9 = var6.iterator();
      if(var9.hasNext()) {
         net.yp.b var10 = (net.yp.b)var9.next();
         int var11 = this.Q.sO.r(G(var10));
         var7 = Math.max(var7, var11);
         if(var3 != null && var3.t() != net.nc.u.HEARTS) {
            var11 = this.Q.sO.r(" " + var2.p(var10.J().getName(), var3).W());
            var8 = Math.max(var8, var11);
         }
      }

      var6 = var6.subList(0, Math.min(var6.size(), 80));
      int var36 = var6.size();
      int var37 = var36;
      int var39 = 1;
      if(var36 > 20) {
         ++var39;
         var37 = (var36 + var39 - 1) / var39;
      }

      if(!this.Q.w() && !this.Q.d().q().o()) {
         boolean var55 = false;
      } else {
         boolean var10000 = true;
      }

      if(var3 != null && var3.t() == net.nc.u.HEARTS) {
         boolean var13 = true;
      }

      byte var40 = 0;
      int var14 = Math.min(var39 * (9 + var7 + var40 + 13), var1 - 50) / var39;
      int var15 = var1 / 2 - (var14 * var39 + (var39 - 1) * 5) / 2;
      int var16 = 10;
      int var17 = var14 * var39 + (var39 - 1) * 5;
      List var18 = null;
      if(this.t != null) {
         var18 = this.Q.sO.m(this.t.c(), var1 - 50);
         Iterator var19 = var18.iterator();
         if(var19.hasNext()) {
            String var20 = (String)var19.next();
            var17 = Math.max(var17, this.Q.sO.r(var20));
         }
      }

      List var42 = null;
      if(this.J != null) {
         var42 = this.Q.sO.m(this.J.c(), var1 - 50);
         Iterator var43 = var42.iterator();
         if(var43.hasNext()) {
            String var21 = (String)var43.next();
            var17 = Math.max(var17, this.Q.sO.r(var21));
         }
      }

      if(var18 != null) {
         u(var1 / 2 - var17 / 2 - 1, var16 - 1, var1 / 2 + var17 / 2 + 1, var16 + var18.size() * this.Q.sO.R, Integer.MIN_VALUE);
         Iterator var44 = var18.iterator();
         if(var44.hasNext()) {
            String var48 = (String)var44.next();
            int var22 = this.Q.sO.r(var48);
            this.Q.sO.U(var48, (float)(var1 / 2 - var22 / 2), (float)var16, -1);
            var16 += this.Q.sO.R;
         }

         ++var16;
      }

      u(var1 / 2 - var17 / 2 - 1, var16 - 1, var1 / 2 + var17 / 2 + 1, var16 + var37 * 9, Integer.MIN_VALUE);
      int var45 = 0;
      if(var45 < var36) {
         int var49 = var45 / var37;
         int var51 = var45 % var37;
         int var23 = var15 + var49 * var14 + var49 * 5;
         int var24 = var16 + var51 * 9;
         u(var23, var24, var23 + var14, var24 + 8, 553648127);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.m();
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
         if(var45 < var6.size()) {
            net.yp.b var25 = (net.yp.b)var6.get(var45);
            GameProfile var26 = var25.J();
            String var27 = G(var25);
            if(gn.Q.j.d(d1.class).v()) {
               if(d1.v.Q() && !var27.contains(this.Q.sf.Q())) {
                  var27 = "§aProtected";
               }

               if(gn.Q.j.d(d1.class).v() && d1.u.Q()) {
                  var27 = var27.replace(this.Q.sf.Q(), ChatFormatting.GREEN + "Protected");
               }
            }

            net.r.r var28 = this.Q.s8.W((UUID)var26.getId());
            if(var28 == null || !var28.o(net.r.j.CAPE) || !"Dinnerbone".equals(var26.getName()) && !"Grumm".equals(var26.getName())) {
               boolean var57 = false;
            } else {
               boolean var56 = true;
            }

            this.Q.n().E(var25.R());
            int var30 = 8 + 0;
            int var31 = 8 * 1;
            g.v(var23, var24, 8.0F, (float)var30, 8, var31, 8, 8, 64.0F, 64.0F);
            if(var28 != null && var28.o(net.r.j.HAT)) {
               int var32 = 8 + 0;
               int var33 = 8 * 1;
               g.v(var23, var24, 40.0F, (float)var32, 8, var33, 8, 8, 64.0F, 64.0F);
            }

            var23 = var23 + 9;
            if(var25.K() == o9.SPECTATOR) {
               this.Q.sO.U(net.cb.z.ITALIC + var27, (float)var23, (float)var24, -1862270977);
            }

            this.Q.sO.U(var27, (float)var23, (float)var24, -1);
            if(var25.K() != o9.SPECTATOR) {
               int var54 = var23 + var7 + 1;
               int var29 = var54 + var40;
               if(var29 - var54 > 5) {
                  this.d(var3, var24, var26.getName(), var54, var29, var25);
               }
            }

            this.h(var14, var23 - 9, var24, var25);
         }

         ++var45;
      }

      if(var42 != null) {
         var16 = var16 + var37 * 9 + 1;
         u(var1 / 2 - var17 / 2 - 1, var16 - 1, var1 / 2 + var17 / 2 + 1, var16 + var42.size() * this.Q.sO.R, Integer.MIN_VALUE);
         Iterator var47 = var42.iterator();
         if(var47.hasNext()) {
            String var50 = (String)var47.next();
            int var52 = this.Q.sO.r(var50);
            this.Q.sO.U(var50, (float)(var1 / 2 - var52 / 2), (float)var16, -1);
            int var58 = var16 + this.Q.sO.R;
         }
      }

   }

   protected void h(int var1, int var2, int var3, net.yp.b var4) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.Q.n().E(e);
      boolean var10000 = false;
      byte var6;
      if(var4.g() < 0) {
         var6 = 5;
      } else if(var4.g() < 150) {
         var6 = 0;
      } else if(var4.g() < 300) {
         var6 = 1;
      } else if(var4.g() < 600) {
         var6 = 2;
      } else if(var4.g() < 1000) {
         var6 = 3;
      } else {
         var6 = 4;
      }

      d += 100.0F;
      this.g(var2 + var1 - 11, var3, 0, 176 + var6 * 8, 10, 8);
      d -= 100.0F;
   }

   private void d(net.nc.l var1, int var2, String var3, int var4, int var5, net.yp.b var6) {
      int var7 = var1.J().p(var3, var1).W();
      if(var1.t() == net.nc.u.HEARTS) {
         this.Q.n().E(e);
         if(this.K == var6.k()) {
            if(var7 < var6.S()) {
               var6.n(net.nn.j.E());
               var6.Y((long)(this.f.n() + 20));
            } else if(var7 > var6.S()) {
               var6.n(net.nn.j.E());
               var6.Y((long)(this.f.n() + 10));
            }
         }

         if(net.nn.j.E() - var6.G() > 1000L || this.K != var6.k()) {
            var6.H(var7);
            var6.e(var7);
            var6.n(net.nn.j.E());
         }

         var6.x(this.K);
         var6.H(var7);
         int var8 = net.u.t.Y((float)Math.max(var7, var6.z()) / 2.0F);
         int var9 = Math.max(net.u.t.Y((float)(var7 / 2)), Math.max(net.u.t.Y((float)(var6.z() / 2)), 10));
         if(var6.H() > (long)this.f.n() && (var6.H() - (long)this.f.n()) / 3L % 2L == 1L) {
            boolean var18 = true;
         } else {
            boolean var10000 = false;
         }

         float var11 = Math.min((float)(var5 - var4 - 4) / (float)var9, 9.0F);
         if(var11 > 3.0F) {
            for(int var12 = var8; var12 < var9; ++var12) {
               l((float)var4 + (float)var12 * var11, (float)var2, 25, 0, 9, 9);
            }

            for(int var16 = 0; var16 < var8; ++var16) {
               l((float)var4 + (float)var16 * var11, (float)var2, 25, 0, 9, 9);
               if(var16 * 2 + 1 < var6.z()) {
                  l((float)var4 + (float)var16 * var11, (float)var2, 70, 0, 9, 9);
               }

               if(var16 * 2 + 1 == var6.z()) {
                  l((float)var4 + (float)var16 * var11, (float)var2, 79, 0, 9, 9);
               }

               if(var16 * 2 + 1 < var7) {
                  l((float)var4 + (float)var16 * var11, (float)var2, 52, 0, 9, 9);
               }

               if(var16 * 2 + 1 == var7) {
                  l((float)var4 + (float)var16 * var11, (float)var2, 61, 0, 9, 9);
               }
            }
         } else {
            float var17 = net.u.t.T((float)var7 / 20.0F, 0.0F, 1.0F);
            int var13 = (int)((1.0F - var17) * 255.0F) << 16 | (int)(var17 * 255.0F) << 8;
            String var14 = "" + (float)var7 / 2.0F;
            if(var5 - this.Q.sO.r(var14 + "hp") >= var4) {
               var14 = var14 + "hp";
            }

            this.Q.sO.U(var14, (float)((var5 + var4) / 2 - this.Q.sO.r(var14) / 2), (float)var2, var13);
         }
      } else {
         String var15 = net.cb.z.YELLOW + "" + var7;
         this.Q.sO.U(var15, (float)(var5 - this.Q.sO.r(var15)), (float)var2, 16777215);
      }

   }

   public void Q(@Nullable net.cb.t var1) {
      this.J = var1;
   }

   public void j(@Nullable net.cb.t var1) {
      this.t = var1;
   }

   public void V() {
      this.t = null;
      this.J = null;
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static class o implements Comparator {
      public int w(net.yp.b var1, net.yp.b var2) {
         g.B();
         net.nc.y var4 = var1.L();
         net.nc.y var5 = var2.L();
         return ComparisonChain.start().compareTrueFirst(var1.K() != o9.SPECTATOR, var2.K() != o9.SPECTATOR).compare(var4 != null?var4.D():"", var5 != null?var5.D():"").compare(var1.J().getName(), var2.J().getName()).result();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
