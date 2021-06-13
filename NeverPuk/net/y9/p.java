package net.y9;

import com.google.common.cache.LoadingCache;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.yv;
import net.nk.f2;
import net.y9.f;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.ac;
import net.yz.ai;
import net.yz.aq;

public class p extends f {
   public static final net.yr.w E = net.yr.w.g("axis", aq.l.class, new aq.l[]{aq.l.X, aq.l.Z});
   protected static final net.u.e d = new net.u.e(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D);
   protected static final net.u.e R = new net.u.e(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D);
   protected static final net.u.e W = new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D);

   public p() {
      super(net.y1.l.s, false);
      this.r(this.b.T().s(E, aq.l.X));
      this.R(true);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.r[((aq.l)var1.i(E)).ordinal()]) {
      case 1:
         return d;
      case 2:
      default:
         return W;
      case 3:
         return R;
      }
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      super.P(var1, var2, var3, var4);
      if(var1.F.Z() && var1.N().b("doMobSpawning") && var4.nextInt(2000) < var1.k().L()) {
         int var5 = var2.h();

         net.u.j var6;
         for(var6 = var2; !var1.Z(var6).z() && var6.h() > 0; var6 = var6.b()) {
            ;
         }

         if(!var1.Z(var6.h()).i()) {
            net.ne.l var7 = yv.E(var1, net.ne.v.P(f2.class), (double)var6.t() + 0.5D, (double)var6.h() + 1.1D, (double)var6.y() + 0.5D);
            var7.hH = var7.S();
         }
      }

   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public static int a(aq.l var0) {
      return var0 == aq.l.X?1:(var0 == aq.l.Z?2:0);
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean b(net.yv.r var1, net.u.j var2) {
      p.w var3 = new p.w(var1, var2, aq.l.X);
      if(var3.i() && var3.c == 0) {
         var3.q();
         return true;
      } else {
         p.w var4 = new p.w(var1, var2, aq.l.Z);
         if(var4.i() && var4.c == 0) {
            var4.q();
            return true;
         } else {
            return false;
         }
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      aq.l var6 = (aq.l)var1.i(E);
      if(var6 == aq.l.X) {
         p.w var7 = new p.w(var2, var3, aq.l.X);
         if(!var7.i() || var7.c < var7.u * var7.D) {
            var2.U(var3, net.nb.f.ou.p());
         }
      } else if(var6 == aq.l.Z) {
         p.w var8 = new p.w(var2, var3, aq.l.Z);
         if(!var8.i() || var8.c < var8.u * var8.D) {
            var2.U(var3, net.nb.f.ou.p());
         }
      }

   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      var3 = var3.C(var4);
      aq.l var5 = null;
      if(var1.Q() == this) {
         var5 = (aq.l)var1.i(E);
         return false;
      } else {
         if(var2.Z(var3.H()).Q() == this && var2.Z(var3.O(2)).Q() != this) {
            boolean var14 = true;
         } else {
            boolean var10000 = false;
         }

         if(var2.Z(var3.g()).Q() == this && var2.Z(var3.i(2)).Q() != this) {
            boolean var16 = true;
         } else {
            boolean var15 = false;
         }

         if(var2.Z(var3.D()).Q() == this && var2.Z(var3.E(2)).Q() != this) {
            boolean var18 = true;
         } else {
            boolean var17 = false;
         }

         if(var2.Z(var3.d()).Q() == this && var2.Z(var3.H(2)).Q() != this) {
            boolean var20 = true;
         } else {
            boolean var19 = false;
         }

         boolean var10 = var5 == aq.l.X;
         boolean var11 = var5 == aq.l.Z;
         return var4 == aq.WEST?true:(var4 == aq.EAST?true:(var4 == aq.NORTH?true:var4 == aq.SOUTH));
      }
   }

   public int T(Random var1) {
      return 0;
   }

   public ac k() {
      return ac.TRANSLUCENT;
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      if(!var4.M() && !var4.t() && var4.S()) {
         var4.k(var2);
      }

   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      if(var4.nextInt(100) == 0) {
         var2.m((double)var3.t() + 0.5D, (double)var3.h() + 0.5D, (double)var3.y() + 0.5D, net.nb.l.g, net.yz.p.BLOCKS, 0.5F, var4.nextFloat() * 0.4F + 0.8F, false);
      }

      int var5 = 0;

      while(true) {
         double var6 = (double)((float)var3.t() + var4.nextFloat());
         double var8 = (double)((float)var3.h() + var4.nextFloat());
         double var10 = (double)((float)var3.y() + var4.nextFloat());
         double var12 = ((double)var4.nextFloat() - 0.5D) * 0.5D;
         double var14 = ((double)var4.nextFloat() - 0.5D) * 0.5D;
         double var16 = ((double)var4.nextFloat() - 0.5D) * 0.5D;
         int var18 = var4.nextInt(2) * 2 - 1;
         if(var2.Z(var3.H()).Q() != this && var2.Z(var3.g()).Q() != this) {
            var6 = (double)var3.t() + 0.5D + 0.25D * (double)var18;
            var12 = (double)(var4.nextFloat() * 2.0F * (float)var18);
         } else {
            var10 = (double)var3.y() + 0.5D + 0.25D * (double)var18;
            var16 = (double)(var4.nextFloat() * 2.0F * (float)var18);
         }

         var2.n(ai.PORTAL, var6, var8, var10, var12, var14, var16, new int[0]);
         ++var5;
      }
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return ks.a;
   }

   public net.yw.n D(int var1) {
      return this.p().s(E, (var1 & 3) == 2?aq.l.Z:aq.l.X);
   }

   public int d(net.yw.n var1) {
      return a((aq.l)var1.i(E));
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      switch(null.K[var2.ordinal()]) {
      case 1:
      case 2:
         switch(null.r[((aq.l)var1.i(E)).ordinal()]) {
         case 1:
            return var1.s(E, aq.l.Z);
         case 3:
            return var1.s(E, aq.l.X);
         default:
            return var1;
         }
      default:
         return var1;
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{E});
   }

   public net.cw.t I(net.yv.r var1, net.u.j var2) {
      g3.v.w();
      aq.l var4 = aq.l.Z;
      p.w var5 = new p.w(var1, var2, aq.l.X);
      LoadingCache var6 = net.cw.t.q(var1, true);
      if(!var5.i()) {
         var4 = aq.l.X;
         var5 = new p.w(var1, var2, aq.l.Z);
      }

      if(!var5.i()) {
         return new net.cw.t(var2, aq.NORTH, aq.UP, var6, 1, 1, 1);
      } else {
         int[] var7 = new int[aq.n.values().length];
         aq var8 = var5.x.i();
         net.u.j var9 = var5.i.J(var5.u() - 1);
         aq.n[] var10 = aq.n.values();
         int var11 = var10.length;
         int var12 = 0;
         if(var12 < var11) {
            aq.n var13 = var10[var12];
            net.cw.t var14 = new net.cw.t(var8.i() == var13?var9:var9.a(var5.x, var5.e() - 1), aq.B(var13, var4), aq.UP, var6, var5.e(), var5.u(), 1);
            int var15 = 0;
            if(var15 < var5.e()) {
               int var16 = 0;
               if(var16 < var5.u()) {
                  net.yw.w var17 = var14.v(var15, var16, 1);
                  if(var17.J() != null && var17.J().n() != net.y1.l.q) {
                     ++var7[var13.ordinal()];
                  }

                  ++var16;
               }

               ++var15;
            }

            ++var12;
         }

         aq.n var18 = aq.n.POSITIVE;
         aq.n[] var19 = aq.n.values();
         var12 = var19.length;
         int var22 = 0;
         if(var22 < var12) {
            aq.n var24 = var19[var22];
            if(var7[var24.ordinal()] < var7[var18.ordinal()]) {
               var18 = var24;
            }

            ++var22;
         }

         return new net.cw.t(var8.i() == var18?var9:var9.a(var5.x, var5.e() - 1), aq.B(var18, var4), aq.UP, var6, var5.e(), var5.u(), 1);
      }
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static class w {
      private final net.yv.r e;
      private final aq.l d;
      private final aq x;
      private final aq W;
      private int c;
      private net.u.j i;
      private int D;
      private int u;

      public w(net.yv.r var1, net.u.j var2, aq.l var3) {
         this.e = var1;
         this.d = var3;
         if(var3 == aq.l.X) {
            this.W = aq.EAST;
            this.x = aq.WEST;
         } else {
            this.W = aq.NORTH;
            this.x = aq.SOUTH;
         }

         for(net.u.j var4 = var2; var2.h() > var4.h() - 21 && var2.h() > 0 && this.r(var1.Z(var2.b()).Q()); var2 = var2.b()) {
            ;
         }

         int var5 = this.X(var2, this.W) - 1;
         this.i = var2.a(this.W, var5);
         this.u = this.X(this.i, this.x);
         if(this.u < 2 || this.u > 21) {
            this.i = null;
            this.u = 0;
         }

         if(this.i != null) {
            this.D = this.N();
         }

      }

      protected int X(net.u.j var1, aq var2) {
         int var3 = 0;

         while(true) {
            net.u.j var4 = var1.a(var2, var3);
            if(!this.r(this.e.Z(var4).Q()) || this.e.Z(var4.b()).Q() != net.nb.f.c) {
               l var5 = this.e.Z(var1.a(var2, var3)).Q();
               return var5 == net.nb.f.c?var3:0;
            }

            ++var3;
         }
      }

      public int u() {
         return this.D;
      }

      public int e() {
         return this.u;
      }

      protected int N() {
         g3.v.w();
         this.D = 0;
         if(this.D < 21) {
            int var2 = 0;
            if(var2 < this.u) {
               net.u.j var3 = this.i.a(this.x, var2).J(this.D);
               l var4 = this.e.Z(var3).Q();
               if(!this.r(var4)) {
                  ;
               }

               if(var4 == net.nb.f.uJ) {
                  ++this.c;
               }

               var4 = this.e.Z(var3.C(this.W)).Q();
               if(var4 != net.nb.f.c && var2 == this.u - 1) {
                  var4 = this.e.Z(var3.C(this.x)).Q();
                  if(var4 != net.nb.f.c) {
                     ;
                  }
               }

               ++var2;
            }

            ++this.D;
         }

         int var6 = 0;
         if(var6 < this.u) {
            if(this.e.Z(this.i.a(this.x, var6).J(this.D)).Q() != net.nb.f.c) {
               this.D = 0;
            }

            ++var6;
         }

         if(this.D <= 21 && this.D >= 3) {
            return this.D;
         } else {
            this.i = null;
            this.u = 0;
            this.D = 0;
            return 0;
         }
      }

      protected boolean r(l var1) {
         return var1.C == net.y1.l.q || var1 == net.nb.f.g || var1 == net.nb.f.uJ;
      }

      public boolean i() {
         return this.i != null && this.u >= 2 && this.u <= 21 && this.D >= 3 && this.D <= 21;
      }

      public void q() {
         for(int var1 = 0; var1 < this.u; ++var1) {
            net.u.j var2 = this.i.a(this.x, var1);

            for(int var3 = 0; var3 < this.D; ++var3) {
               this.e.k(var2.J(var3), net.nb.f.uJ.p().s(p.E, this.d), 2);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
