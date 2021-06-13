package net.y9;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.r2;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.ax;

public class lw extends l {
   public static final net.yr.o H = net.yr.o.k("up");
   public static final net.yr.o A = net.yr.o.k("north");
   public static final net.yr.o f = net.yr.o.k("east");
   public static final net.yr.o J = net.yr.o.k("south");
   public static final net.yr.o R = net.yr.o.k("west");
   public static final net.yr.o[] a = new net.yr.o[]{H, A, J, R, f};
   protected static final net.u.e r = new net.u.e(0.0D, 0.9375D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e l = new net.u.e(0.0D, 0.0D, 0.0D, 0.0625D, 1.0D, 1.0D);
   protected static final net.u.e h = new net.u.e(0.9375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e o = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.0625D);
   protected static final net.u.e u = new net.u.e(0.0D, 0.0D, 0.9375D, 1.0D, 1.0D, 1.0D);

   public lw() {
      super(net.y1.l.Y);
      this.r(this.b.T().s(H, Boolean.valueOf(false)).s(A, Boolean.valueOf(false)).s(f, Boolean.valueOf(false)).s(J, Boolean.valueOf(false)).s(R, Boolean.valueOf(false)));
      this.R(true);
      this.f(net.ys.r.X);
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      var1 = var1.J(var2, var3);
      int var4 = 0;
      net.u.e var10000 = I;
      if(((Boolean)var1.i(H)).booleanValue()) {
         var10000 = r;
         ++var4;
      }

      if(((Boolean)var1.i(A)).booleanValue()) {
         var10000 = o;
         ++var4;
      }

      if(((Boolean)var1.i(f)).booleanValue()) {
         var10000 = h;
         ++var4;
      }

      if(((Boolean)var1.i(J)).booleanValue()) {
         var10000 = u;
         ++var4;
      }

      if(((Boolean)var1.i(R)).booleanValue()) {
         var10000 = l;
         ++var4;
      }

      return I;
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      net.u.j var4 = var3.h();
      return var1.s(H, Boolean.valueOf(var2.Z(var4).B(var2, var4, aq.DOWN) == net.yw.g.SOLID));
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean X(o8 var1, net.u.j var2) {
      return true;
   }

   public boolean C(net.yv.r var1, net.u.j var2, aq var3) {
      return var3 != aq.DOWN && var3 != aq.UP && this.K(var1, var2, var3);
   }

   public boolean K(net.yv.r var1, net.u.j var2, aq var3) {
      l var4 = var1.Z(var2.h()).Q();
      return this.q(var1, var2.C(var3.f()), var3) && (var4 == net.nb.f.ou || var4 == net.nb.f.To || this.q(var1, var2.h(), aq.UP));
   }

   private boolean q(net.yv.r var1, net.u.j var2, aq var3) {
      net.yw.n var4 = var1.Z(var2);
      return var4.B(var1, var2, var3) == net.yw.g.SOLID && !G(var4.Q());
   }

   protected static boolean G(l var0) {
      return var0 instanceof r2 || var0 == net.nb.f.uB || var0 == net.nb.f.dh || var0 == net.nb.f.Tm || var0 == net.nb.f.T5 || var0 == net.nb.f.TP || var0 == net.nb.f.oG || var0 == net.nb.f.dZ || var0 == net.nb.f.or;
   }

   private boolean Q(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.yw.n var4 = var3;

      for(aq var6 : aq.u.HORIZONTAL) {
         net.yr.o var7 = F(var6);
         if(((Boolean)var3.i(var7)).booleanValue() && !this.K(var1, var2, var6.f())) {
            net.yw.n var8 = var1.Z(var2.h());
            if(var8.Q() != this || !((Boolean)var8.i(var7)).booleanValue()) {
               var3 = var3.s(var7, Boolean.valueOf(false));
            }
         }
      }

      if(u(var3) == 0) {
         return false;
      } else {
         if(var4 != var3) {
            var1.k(var2, var3, 2);
         }

         return true;
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.x && !this.Q(var2, var3, var1)) {
         this.N(var2, var3, var1, 0);
         var2.J(var3);
      }

   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(!var1.x && var1.G.nextInt(4) == 0) {
         boolean var10000 = true;
         int var7 = 5;
         boolean var8 = false;
         int var9 = -4;
         int var10 = -4;
         int var11 = -1;
         if(var1.Z(var2.F(var9, var11, var10)).Q() == this) {
            --var7;
            var8 = true;
         }

         ++var11;
         ++var10;
         ++var9;
         aq var23 = aq.k(var4);
         net.u.j var25 = var2.h();
         if(var23 == aq.UP && var2.h() < 255 && var1.y(var25)) {
            net.yw.n var27 = var3;
            Iterator var12 = aq.u.HORIZONTAL.iterator();
            if(var12.hasNext()) {
               aq var13 = (aq)var12.next();
               if(var4.nextBoolean() && this.K(var1, var25, var13.f())) {
                  var27 = var3.s(F(var13), Boolean.valueOf(true));
               }

               var27 = var27.s(F(var13), Boolean.valueOf(false));
            }

            if(((Boolean)var27.i(A)).booleanValue() || ((Boolean)var27.i(f)).booleanValue() || ((Boolean)var27.i(J)).booleanValue() || ((Boolean)var27.i(R)).booleanValue()) {
               var1.k(var25, var27, 2);
            }
         }

         if(var23.r().P() && !((Boolean)var3.i(F(var23))).booleanValue()) {
            net.u.j var28 = var2.C(var23);
            net.yw.n var30 = var1.Z(var28);
            l var32 = var30.Q();
            if(var32.C == net.y1.l.q) {
               aq var14 = var23.R();
               aq var15 = var23.i();
               boolean var16 = ((Boolean)var3.i(F(var14))).booleanValue();
               boolean var17 = ((Boolean)var3.i(F(var15))).booleanValue();
               net.u.j var18 = var28.C(var14);
               net.u.j var19 = var28.C(var15);
               if(var16 && this.K(var1, var18.C(var14), var14)) {
                  var1.k(var28, this.p().s(F(var14), Boolean.valueOf(true)), 2);
               }

               if(var17 && this.K(var1, var19.C(var15), var15)) {
                  var1.k(var28, this.p().s(F(var15), Boolean.valueOf(true)), 2);
               }

               if(var16 && var1.y(var18) && this.K(var1, var18, var23)) {
                  var1.k(var18, this.p().s(F(var23.f()), Boolean.valueOf(true)), 2);
               }

               if(var17 && var1.y(var19) && this.K(var1, var19, var23)) {
                  var1.k(var19, this.p().s(F(var23.f()), Boolean.valueOf(true)), 2);
               }
            }

            if(var30.B(var1, var28, var23) == net.yw.g.SOLID) {
               var1.k(var2, var3.s(F(var23), Boolean.valueOf(true)), 2);
            }
         }

         if(var2.h() > 1) {
            net.u.j var29 = var2.b();
            net.yw.n var31 = var1.Z(var29);
            l var33 = var31.Q();
            if(var33.C == net.y1.l.q) {
               net.yw.n var34 = var3;
               Iterator var36 = aq.u.HORIZONTAL.iterator();
               if(var36.hasNext()) {
                  aq var38 = (aq)var36.next();
                  if(var4.nextBoolean()) {
                     var34 = var3.s(F(var38), Boolean.valueOf(false));
                  }
               }

               if(((Boolean)var34.i(A)).booleanValue() || ((Boolean)var34.i(f)).booleanValue() || ((Boolean)var34.i(J)).booleanValue() || ((Boolean)var34.i(R)).booleanValue()) {
                  var1.k(var29, var34, 2);
               }
            }

            if(var33 == this) {
               net.yw.n var35 = var31;
               Iterator var37 = aq.u.HORIZONTAL.iterator();
               if(var37.hasNext()) {
                  aq var39 = (aq)var37.next();
                  net.yr.o var40 = F(var39);
                  if(var4.nextBoolean() && ((Boolean)var3.i(var40)).booleanValue()) {
                     var35 = var31.s(var40, Boolean.valueOf(true));
                  }
               }

               if(((Boolean)var35.i(A)).booleanValue() || ((Boolean)var35.i(f)).booleanValue() || ((Boolean)var35.i(J)).booleanValue() || ((Boolean)var35.i(R)).booleanValue()) {
                  var1.k(var29, var35, 2);
               }
            }
         }
      }

   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      net.yw.n var9 = this.p().s(H, Boolean.valueOf(false)).s(A, Boolean.valueOf(false)).s(f, Boolean.valueOf(false)).s(J, Boolean.valueOf(false)).s(R, Boolean.valueOf(false));
      return var3.r().P()?var9.s(F(var3.f()), Boolean.valueOf(true)):var9;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.SL;
   }

   public int T(Random var1) {
      return 0;
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      if(!var1.x && var6.Z() == net.nb.j.W5) {
         var2.S(net.v.q.i(this));
         e(var1, var3, new ks(net.nb.f.To, 1, 0));
      } else {
         super.U(var1, var2, var3, var4, var5, var6);
      }

   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(J, Boolean.valueOf((var1 & 1) > 0)).s(R, Boolean.valueOf((var1 & 2) > 0)).s(A, Boolean.valueOf((var1 & 4) > 0)).s(f, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      if(((Boolean)var1.i(J)).booleanValue()) {
         var2 |= 1;
      }

      if(((Boolean)var1.i(R)).booleanValue()) {
         var2 |= 2;
      }

      if(((Boolean)var1.i(A)).booleanValue()) {
         var2 |= 4;
      }

      if(((Boolean)var1.i(f)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{H, A, f, J, R});
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      switch(null.z[var2.ordinal()]) {
      case 1:
         return var1.s(A, var1.i(J)).s(f, var1.i(R)).s(J, var1.i(A)).s(R, var1.i(f));
      case 2:
         return var1.s(A, var1.i(f)).s(f, var1.i(J)).s(J, var1.i(R)).s(R, var1.i(A));
      case 3:
         return var1.s(A, var1.i(R)).s(f, var1.i(A)).s(J, var1.i(f)).s(R, var1.i(J));
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      switch(null.o[var2.ordinal()]) {
      case 1:
         return var1.s(A, var1.i(J)).s(J, var1.i(A));
      case 2:
         return var1.s(f, var1.i(R)).s(R, var1.i(f));
      default:
         return super.P(var1, var2);
      }
   }

   public static net.yr.o F(aq var0) {
      switch(null.X[var0.ordinal()]) {
      case 1:
         return H;
      case 2:
         return A;
      case 3:
         return J;
      case 4:
         return R;
      case 5:
         return f;
      default:
         throw new IllegalArgumentException(var0 + " is an invalid choice");
      }
   }

   public static int u(net.yw.n var0) {
      int var1 = 0;

      for(net.yr.o var5 : a) {
         if(((Boolean)var0.i(var5)).booleanValue()) {
            ++var1;
         }
      }

      return var1;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
