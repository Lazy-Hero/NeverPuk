package net.ns;

import java.util.Random;
import net.xn;
import net.ns.i;
import net.ns.i9;
import net.w.fb;
import net.y9.rv;
import net.y9.zu;

public class f extends i {
   private static final net.w.t h = new net.w.t();
   private static final net.w.h u = new net.w.h(false);
   private static final net.w.c R = new net.w.c(false, false);
   private static final net.w.c o = new net.w.c(false, true);
   private static final net.w.z s = new net.w.z(net.nb.f.T9, 0);
   private final f.r r;

   public f(f.r var1, i.g var2) {
      super(var2);
      this.r = var1;
      this.v.add(new i.w(net.yn.x.class, 8, 4, 4));
      this.v.add(new i.w(net.yn.z.class, 4, 2, 3));
      this.K.E = 10;
      if(var1 != f.r.MEGA && var1 != f.r.MEGA_SPRUCE) {
         this.K.N = 1;
         this.K.z = 1;
      } else {
         this.K.N = 7;
         this.K.P = 1;
         this.K.z = 3;
      }

   }

   public net.w.x q(Random var1) {
      return (net.w.x)((this.r == f.r.MEGA || this.r == f.r.MEGA_SPRUCE) && var1.nextInt(3) == 0?(this.r != f.r.MEGA_SPRUCE && var1.nextInt(13) != 0?R:o):(var1.nextInt(3) == 0?h:u));
   }

   public net.w.f A(Random var1) {
      return var1.nextInt(5) > 0?new fb(zu.i.FERN):new fb(zu.i.GRASS);
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      int[] var4 = i9.M();
      if(this.r == f.r.MEGA || this.r == f.r.MEGA_SPRUCE) {
         int var5 = var2.nextInt(3);
         int var6 = 0;
         if(var6 < var5) {
            int var7 = var2.nextInt(16) + 8;
            int var8 = var2.nextInt(16) + 8;
            net.u.j var9 = var1.A(var3.F(var7, 0, var8));
            s.K(var1, var2, var9);
            ++var6;
         }
      }

      G.o(net.y9.y.FERN);
      int var10 = 0;
      int var13 = var2.nextInt(16) + 8;
      int var14 = var2.nextInt(16) + 8;
      int var15 = var2.nextInt(var1.A(var3.F(var13, 0, var14)).h() + 32);
      G.K(var1, var2, var3.F(var13, var15, var14));
      ++var10;
      super.f(var1, var2, var3);
   }

   public void y(net.yv.r var1, Random var2, net.l.o var3, int var4, int var5, double var6) {
      if(this.r == f.r.MEGA || this.r == f.r.MEGA_SPRUCE) {
         this.j = net.nb.f.p.p();
         this.y = net.nb.f.dl.p();
         if(var6 > 1.75D) {
            this.j = net.nb.f.dl.p().s(rv.l, rv.m.COARSE_DIRT);
         } else if(var6 > -0.95D) {
            this.j = net.nb.f.dl.p().s(rv.l, rv.m.PODZOL);
         }
      }

      this.B(var1, var2, var3, var4, var5, var6);
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static enum r {
      NORMAL,
      MEGA,
      MEGA_SPRUCE;
   }
}
