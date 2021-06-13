package net.nl;

import java.util.Iterator;
import java.util.Map;
import net.xn;
import net.n0.ks;
import net.n0.yp;
import net.nl.o;
import net.nl.s;
import net.nl.v;
import net.nl.z1;
import net.nl.zc;
import net.nl.zq;
import net.y9.r8;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class r extends v {
   private static final Logger f = LogManager.getLogger();
   private final z1 j;
   private final z1 T;
   private final net.yv.r v;
   private final net.u.j I;
   public int M;
   private int y;
   private String P;
   private final net.r.r c;

   public r(net.r.i var1, net.yv.r var2, net.r.r var3) {
      this(var1, var2, net.u.j.V, var3);
   }

   public r(net.r.i var1, final net.yv.r var2, final net.u.j var3, net.r.r var4) {
      this.j = new s();
      this.T = new zq("Repair", true, 2) {
         public void W() {
            super.W();
            r.this.d(this);
         }
      };
      this.I = var3;
      this.v = var2;
      this.c = var4;
      this.U(new o(this.T, 0, 27, 47));
      this.U(new o(this.T, 1, 76, 47));
      this.U(new o(this.j, 2, 134, 47) {
         public boolean s(ks var1) {
            return false;
         }

         public boolean I(net.r.r var1) {
            return (var1.a6.V || var1.aX >= r.this.M) && r.this.M > 0 && this.T();
         }

         public ks H(net.r.r var1, ks var2x) {
            int var3x = v.N();
            if(!var1.a6.V) {
               var1.N(-r.this.M);
            }

            r.this.T.S(0, ks.a);
            if(r.this.y > 0) {
               ks var4 = r.this.T.A(1);
               if(!var4.B() && var4.U() > r.this.y) {
                  var4.H(r.this.y);
                  r.this.T.S(1, var4);
               }

               r.this.T.S(1, ks.a);
            }

            r.this.T.S(1, ks.a);
            r.this.M = 0;
            net.yw.n var6 = var2.Z(var3);
            if(!var1.a6.V && !var2.x && var6.Q() == net.nb.f.uc && Float.compare(var1.Q().nextFloat(), 0.12F) < 0) {
               int var5 = ((Integer)var6.i(r8.F)).intValue();
               ++var5;
               if(var5 > 2) {
                  var2.J(var3);
                  var2.s(1029, var3, 0);
               }

               var2.k(var3, var6.s(r8.F, Integer.valueOf(var5)), 2);
               var2.s(1030, var3, 0);
            }

            if(!var2.x) {
               var2.s(1030, var3, 0);
            }

            return var2x;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      byte var5 = 0;
      int var6 = 0;

      while(true) {
         this.U(new o(var1, var6 + var5 * 9 + 9, 8 + var6 * 18, 84 + var5 * 18));
         ++var6;
      }
   }

   public void d(z1 var1) {
      super.d(var1);
      if(var1 == this.T) {
         this.a();
      }

   }

   public void a() {
      ks var2 = this.T.A(0);
      v.Q();
      this.M = 1;
      int var3 = 0;
      int var4 = 0;
      byte var5 = 0;
      if(var2.B()) {
         this.j.S(0, ks.a);
         this.M = 0;
      }

      ks var6 = var2.s();
      ks var7 = this.T.A(1);
      Map var8 = net.c1.y.n(var6);
      var4 = var4 + var2.X() + (var7.B()?0:var7.X());
      this.y = 0;
      if(!var7.B()) {
         if(var7.Z() == net.nb.j.r && !yp.p(var7).N()) {
            boolean var42 = true;
         } else {
            boolean var10000 = false;
         }

         if(var6.M() && var6.Z().l(var2, var7)) {
            int var10 = Math.min(var6.z(), var6.Z() / 4);
            if(var10 <= 0) {
               this.j.S(0, ks.a);
               this.M = 0;
               return;
            }

            int var11 = 0;
            if(var11 < var7.U()) {
               int var12 = var6.z() - var10;
               var6.d(var12);
               ++var3;
               var10 = Math.min(var6.z(), var6.Z() / 4);
               ++var11;
            }

            this.y = var11;
         }

         if(var6.Z() != var7.Z() || !var6.M()) {
            this.j.S(0, ks.a);
            this.M = 0;
            return;
         }

         if(var6.M()) {
            int var26 = var2.Z() - var2.z();
            int var28 = var7.Z() - var7.z();
            int var31 = var28 + var6.Z() * 12 / 100;
            int var13 = var26 + var31;
            int var14 = var6.Z() - var13;
            if(var14 < 0) {
               var14 = 0;
            }

            if(var14 < var6.n()) {
               var6.d(var14);
               var3 += 2;
            }
         }

         Map var27 = net.c1.y.n(var7);
         boolean var29 = false;
         boolean var32 = false;
         Iterator var33 = var27.keySet().iterator();
         if(var33.hasNext()) {
            net.c1.c var34 = (net.c1.c)var33.next();
            int var15 = var8.containsKey(var34)?((Integer)var8.get(var34)).intValue():0;
            int var16 = ((Integer)var27.get(var34)).intValue();
            var16 = var15 == var16?var16 + 1:Math.max(var16, var15);
            boolean var17 = var34.U(var2);
            if(this.c.a6.V || var2.Z() == net.nb.j.r) {
               var17 = true;
            }

            Iterator var18 = var8.keySet().iterator();
            if(var18.hasNext()) {
               net.c1.c var19 = (net.c1.c)var18.next();
               if(var19 != var34 && !var34.q(var19)) {
                  var17 = false;
                  ++var3;
               }
            }

            var29 = true;
            if(var16 > var34.h()) {
               var16 = var34.h();
            }

            var8.put(var34, Integer.valueOf(var16));
            byte var38 = 0;
            switch(null.O[var34.w().ordinal()]) {
            case 1:
               var38 = 1;
            case 2:
               var38 = 2;
            case 3:
               var38 = 4;
            case 4:
               var38 = 8;
            default:
               var3 += var38 * var16;
               if(var2.U() > 1) {
                  var3 = 40;
               }
            }
         }
      }

      label964: {
         if(StringUtils.isBlank(this.P)) {
            if(!var2.v()) {
               break label964;
            }

            var5 = 1;
            var3 += var5;
            var6.p();
         }

         if(!this.P.equals(var2.j())) {
            var5 = 1;
            var3 += var5;
            var6.m(this.P);
         }
      }

      this.M = var4 + var3;
      var6 = ks.a;
      if(this.M >= 40 && !this.c.a6.V) {
         var6 = ks.a;
      }

      if(!var6.B()) {
         int var9 = var6.X();
         if(!var7.B() && var9 < var7.X()) {
            var9 = var7.X();
         }

         var9 = var9 * 2 + 1;
         var6.J(var9);
         net.c1.y.f(var8, var6);
      }

      this.j.S(0, var6);
      this.u();
   }

   public void w(zc var1) {
      super.w(var1);
      var1.A(this, 0, this.M);
   }

   public void k(int var1, int var2) {
      this.M = var2;
   }

   public void K(net.r.r var1) {
      super.K(var1);
      if(!this.v.x) {
         this.o(var1, this.v, this.T);
      }

   }

   public boolean N(net.r.r var1) {
      return this.v.Z(this.I).Q() != net.nb.f.uc?false:var1.o((double)this.I.t() + 0.5D, (double)this.I.h() + 0.5D, (double)this.I.y() + 0.5D) <= 64.0D;
   }

   public ks a(net.r.r var1, int var2) {
      ks var3 = ks.a;
      o var4 = (o)this.e.get(var2);
      if(var4.T()) {
         ks var5 = var4.y();
         var3 = var5.s();
         if(var2 == 2) {
            if(!this.V(var5, 3, 39, true)) {
               return ks.a;
            }

            var4.q(var5, var3);
         } else if(var2 != 1) {
            if(var2 >= 3 && var2 < 39 && !this.V(var5, 0, 2, false)) {
               return ks.a;
            }
         } else if(!this.V(var5, 3, 39, false)) {
            return ks.a;
         }

         if(var5.B()) {
            var4.e(ks.a);
         } else {
            var4.y();
         }

         if(var5.U() == var3.U()) {
            return ks.a;
         }

         var4.H(var1, var5);
      }

      return var3;
   }

   public void Z(String var1) {
      this.P = var1;
      if(this.f(2).T()) {
         ks var2 = this.f(2).y();
         if(StringUtils.isBlank(var1)) {
            var2.p();
         } else {
            var2.m(this.P);
         }
      }

      this.a();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
