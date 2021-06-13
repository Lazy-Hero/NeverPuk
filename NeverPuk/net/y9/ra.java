package net.y9;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.lk;
import net.y9.rj;
import net.y9.ru;
import net.y9.zm;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public class ra extends ru {
   public static final net.yr.o o = net.yr.o.k("extended");
   protected static final net.u.e R = new net.u.e(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 1.0D);
   protected static final net.u.e M = new net.u.e(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e F = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D);
   protected static final net.u.e W = new net.u.e(0.0D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e E = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D);
   protected static final net.u.e A = new net.u.e(0.0D, 0.25D, 0.0D, 1.0D, 1.0D, 1.0D);
   private final boolean H;

   public ra(boolean var1) {
      super(net.y1.l.a);
      this.r(this.b.T().s(n, aq.NORTH).s(o, Boolean.valueOf(false)));
      this.H = var1;
      this.i(lk.P);
      this.r(0.5F);
      this.f(net.ys.r.i);
   }

   public boolean e(net.yw.n var1) {
      return !((Boolean)var1.i(o)).booleanValue();
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      if(((Boolean)var1.i(o)).booleanValue()) {
         switch(null.B[((aq)var1.i(n)).ordinal()]) {
         case 1:
            return A;
         case 2:
         default:
            return E;
         case 3:
            return W;
         case 4:
            return F;
         case 5:
            return M;
         case 6:
            return R;
         }
      } else {
         return I;
      }
   }

   public boolean L(net.yw.n var1) {
      return !((Boolean)var1.i(o)).booleanValue() || var1.i(n) == aq.DOWN;
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      F(var3, var4, var5, var1.q(var2, var3));
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      var1.k(var2, var3.s(n, aq.i(var2, var4)), 2);
      if(!var1.x) {
         this.i(var1, var2, var3);
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.x) {
         this.i(var2, var3, var1);
      }

   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!var1.x && var1.L(var2) == null) {
         this.i(var1, var2, var3);
      }

   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(n, aq.i(var2, var8)).s(o, Boolean.valueOf(false));
   }

   private void i(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      aq var4 = (aq)var3.i(n);
      boolean var5 = this.w(var1, var2, var4);
      if(!((Boolean)var3.i(o)).booleanValue()) {
         if((new net.yw.c(var1, var2, var4, true)).I()) {
            var1.x(var2, this, 0, var4.w());
         }
      } else if(((Boolean)var3.i(o)).booleanValue()) {
         var1.x(var2, this, 1, var4.w());
      }

   }

   private boolean w(net.yv.r var1, net.u.j var2, aq var3) {
      for(aq var7 : aq.values()) {
         if(var7 != var3 && var1.z(var2.C(var7), var7)) {
            return true;
         }
      }

      if(var1.z(var2, aq.DOWN)) {
         return true;
      } else {
         net.u.j var9 = var2.h();

         for(aq var8 : aq.values()) {
            if(var8 != aq.DOWN && var1.z(var9.C(var8), var8)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean T(net.yw.n var1, net.yv.r var2, net.u.j var3, int var4, int var5) {
      aq var6 = (aq)var1.i(n);
      if(!var2.x) {
         boolean var7 = this.w(var2, var3, var6);
         if(var4 == 1) {
            var2.k(var3, var1.s(o, Boolean.valueOf(true)), 2);
            return false;
         } else {
            return false;
         }
      } else if(!this.y(var2, var3, var6, true)) {
         return false;
      } else {
         var2.k(var3, var1.s(o, Boolean.valueOf(true)), 3);
         var2.M((net.r.r)null, var3, net.nb.l.KO, net.yz.p.BLOCKS, 0.5F, var2.G.nextFloat() * 0.25F + 0.6F);
         return true;
      }
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   @Nullable
   public static aq c(int var0) {
      int var1 = var0 & 7;
      return var1 > 5?null:aq.l(var1);
   }

   public static boolean i(net.yw.n var0, net.yv.r var1, net.u.j var2, aq var3, boolean var4, aq var5) {
      l var6 = var0.Q();
      if(var6 == net.nb.f.c) {
         return false;
      } else if(!var1.T().U(var2)) {
         return false;
      } else if(var2.h() >= 0 && (var3 != aq.DOWN || var2.h() != 0)) {
         if(var2.h() <= var1.Z() - 1 && (var3 != aq.UP || var2.h() != var1.Z() - 1)) {
            if(var6 != net.nb.f.TP && var6 != net.nb.f.oG) {
               if(var0.s(var1, var2) == -1.0F) {
                  return false;
               }

               switch(null.g[var0.b().ordinal()]) {
               case 1:
                  return false;
               case 2:
                  return var4;
               case 3:
                  return var3 == var5;
               }
            } else if(((Boolean)var0.i(o)).booleanValue()) {
               return false;
            }

            return !var6.W();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean y(net.yv.r var1, net.u.j var2, aq var3, boolean var4) {
      int[] var5 = g3.v.w();
      if(!var4) {
         var1.J(var2.C(var3));
      }

      net.yw.c var6 = new net.yw.c(var1, var2, var3, var4);
      if(!var6.I()) {
         return false;
      } else {
         List var7 = var6.I();
         ArrayList var8 = Lists.newArrayList();
         int var9 = 0;
         if(var9 < var7.size()) {
            net.u.j var10 = (net.u.j)var7.get(var9);
            var8.add(var1.Z(var10).J(var1, var10));
            ++var9;
         }

         List var18 = var6.t();
         int var19 = var7.size() + var18.size();
         net.yw.n[] var11 = new net.yw.n[var19];
         int var13 = var18.size() - 1;
         net.u.j var14 = (net.u.j)var18.get(var13);
         net.yw.n var15 = var1.Z(var14);
         var15.Q().N(var1, var14, var15, 0);
         var1.k(var14, net.nb.f.ou.p(), 4);
         --var19;
         var11[var19] = var15;
         --var13;
         var13 = var7.size() - 1;
         var14 = (net.u.j)var7.get(var13);
         var15 = var1.Z(var14);
         var1.k(var14, net.nb.f.ou.p(), 2);
         var14 = var14.C(var3);
         var1.k(var14, net.nb.f.dK.p().s(n, var3), 4);
         var1.Z(var14, zm.z((net.yw.n)var8.get(var13), var3, var4, false));
         --var19;
         var11[var19] = var15;
         --var13;
         net.u.j var27 = var2.C(var3);
         if(var4) {
            rj.n var30 = this.H?rj.n.STICKY:rj.n.DEFAULT;
            var15 = net.nb.f.dZ.p().s(rj.n, var3).s(rj.Y, var30);
            net.yw.n var16 = net.nb.f.dK.p().s(zm.c, var3).s(zm.f, this.H?rj.n.STICKY:rj.n.DEFAULT);
            var1.k(var27, var16, 4);
            var1.Z(var27, zm.z(var15, var3, true, true));
         }

         int var31 = var18.size() - 1;
         var1.b((net.u.j)var18.get(var31), var11[var19++].Q(), false);
         --var31;
         var31 = var7.size() - 1;
         var1.b((net.u.j)var7.get(var31), var11[var19++].Q(), false);
         --var31;
         if(var4) {
            var1.b(var27, net.nb.f.dZ, false);
         }

         return true;
      }
   }

   public net.yw.n D(int var1) {
      return this.p().s(n, c(var1)).s(o, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(n)).w();
      if(((Boolean)var1.i(o)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(n, var2.d((aq)var1.i(n)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(n)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n, o});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      var2 = this.v(var2, var1, var3);
      return var2.i(n) != var4.f() && ((Boolean)var2.i(o)).booleanValue()?net.yw.g.UNDEFINED:net.yw.g.SOLID;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
