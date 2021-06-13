package net.ns;

import java.util.Random;
import net.xn;
import net.ns.i;
import net.ns.i9;

public class h extends i {
   protected static final net.w.k R = new net.w.k(false, true);
   protected static final net.w.k x = new net.w.k(false, false);
   protected static final net.w.i o = new net.w.i(false);
   private final h.s U;

   public h(h.s var1, i.g var2) {
      super(var2);
      this.U = var1;
      this.K.E = 10;
      this.K.N = 2;
      if(this.U == h.s.FLOWER) {
         this.K.E = 6;
         this.K.D = 100;
         this.K.N = 1;
         this.v.add(new i.w(net.yn.z.class, 4, 2, 3));
      }

      if(this.U == h.s.NORMAL) {
         this.v.add(new i.w(net.yn.x.class, 5, 4, 4));
      }

      if(this.U == h.s.ROOFED) {
         this.K.E = -999;
      }

   }

   public net.w.x q(Random var1) {
      return (net.w.x)(this.U == h.s.ROOFED && var1.nextInt(3) > 0?o:(this.U != h.s.BIRCH && var1.nextInt(5) != 0?(var1.nextInt(10) == 0?d:V):x));
   }

   public net.y9.n j(Random var1, net.u.j var2) {
      if(this.U == h.s.FLOWER) {
         double var3 = net.u.t.F((1.0D + g.Q((double)var2.t() / 48.0D, (double)var2.y() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
         net.y9.n var5 = net.y9.n.values()[(int)(var3 * (double)net.y9.n.values().length)];
         return var5 == net.y9.n.BLUE_ORCHID?net.y9.n.POPPY:var5;
      } else {
         return super.j(var1, var2);
      }
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      if(this.U == h.s.ROOFED) {
         this.Z(var1, var2, var3);
      }

      int var4 = var2.nextInt(5) - 3;
      if(this.U == h.s.FLOWER) {
         var4 += 2;
      }

      this.b(var1, var2, var3, var4);
      super.f(var1, var2, var3);
   }

   protected void Z(net.yv.r var1, Random var2, net.u.j var3) {
      byte var4 = 0;
      int var5 = 0;

      while(true) {
         int var6 = var4 * 4 + 1 + 8 + var2.nextInt(3);
         int var7 = var5 * 4 + 1 + 8 + var2.nextInt(3);
         net.u.j var8 = var1.A(var3.F(var6, 0, var7));
         if(var2.nextInt(20) == 0) {
            net.w.a var9 = new net.w.a();
            var9.K(var1, var2, var8);
         } else {
            net.w.x var10 = this.q(var2);
            var10.W();
            if(var10.K(var1, var2, var8)) {
               var10.J(var1, var2, var8);
            }
         }

         ++var5;
      }
   }

   protected void b(net.yv.r var1, Random var2, net.u.j var3, int var4) {
      i9.M();
      int var6 = 0;
      if(var6 < var4) {
         int var7 = var2.nextInt(3);
         if(var7 == 0) {
            G.o(net.y9.y.SYRINGA);
         }

         if(var7 == 1) {
            G.o(net.y9.y.ROSE);
         }

         if(var7 == 2) {
            G.o(net.y9.y.PAEONIA);
         }

         int var8 = 0;
         int var9 = var2.nextInt(16) + 8;
         int var10 = var2.nextInt(16) + 8;
         int var11 = var2.nextInt(var1.A(var3.F(var9, 0, var10)).h() + 32);
         if(G.K(var1, var2, new net.u.j(var3.t() + var9, var11, var3.y() + var10))) {
            ;
         }

         ++var8;
         ++var6;
      }

   }

   public Class g() {
      return h.class;
   }

   public int r(net.u.j var1) {
      int var2 = super.r(var1);
      return this.U == h.s.ROOFED?(var2 & 16711422) + 2634762 >> 1:var2;
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static enum s {
      NORMAL,
      FLOWER,
      BIRCH,
      ROOFED;
   }
}
