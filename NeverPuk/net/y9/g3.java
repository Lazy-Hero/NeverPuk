package net.y9;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.y9.l;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.au;

public abstract class g3 extends l {
   protected static final net.u.e n = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);
   protected static final net.u.e E = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
   protected final boolean a;

   public static boolean g(net.yv.r var0, net.u.j var1) {
      return B(var0.Z(var1));
   }

   public static boolean B(net.yw.n var0) {
      l var1 = var0.Q();
      return var1 == net.nb.f.uU || var1 == net.nb.f.uR || var1 == net.nb.f.dw || var1 == net.nb.f.j;
   }

   protected g3(boolean var1) {
      super(net.y1.l.c);
      this.a = var1;
      this.f(net.ys.r.Y);
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      g3.v var4 = var1.Q() == this?(g3.v)var1.i(this.J()):null;
      return var4.i()?E:n;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2.b()).z();
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!var1.x) {
         var3 = this.Z(var1, var2, var3, true);
         if(this.a) {
            var3.q(var1, var2, this, var2);
         }
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      int[] var6 = g3.v.l;
      if(!var2.x) {
         g3.v var7 = (g3.v)var1.i(this.J());
         boolean var8 = !var2.Z(var3.b()).z();
         if(var7 == g3.v.ASCENDING_EAST && !var2.Z(var3.g()).z()) {
            var8 = true;
         }

         if(var7 == g3.v.ASCENDING_WEST && !var2.Z(var3.H()).z()) {
            var8 = true;
         }

         if(var7 == g3.v.ASCENDING_NORTH && !var2.Z(var3.D()).z()) {
            var8 = true;
         }

         if(var7 == g3.v.ASCENDING_SOUTH && !var2.Z(var3.d()).z()) {
            var8 = true;
         }

         this.A(var1, var2, var3, var4);
      }

   }

   protected void A(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4) {
   }

   protected net.yw.n Z(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      return var1.x?var3:(new g3.g(var1, var2, var3)).I(var1.B(var2), var4).B();
   }

   public net.y1.v T(net.yw.n var1) {
      return net.y1.v.NORMAL;
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.V(var1, var2, var3);
      if(((g3.v)var3.i(this.J())).i()) {
         var1.b(var2.h(), this, false);
      }

      if(this.a) {
         var1.b(var2, this, false);
         var1.b(var2.b(), this, false);
      }

   }

   public abstract net.yr.h J();

   private static xn b(xn var0) {
      return var0;
   }

   public class g {
      private final net.yv.r n;
      private final net.u.j f;
      private final g3 I;
      private net.yw.n l;
      private final boolean w;
      private final List V = Lists.newArrayList();

      public g(net.yv.r var2, net.u.j var3, net.yw.n var4) {
         this.n = var2;
         this.f = var3;
         this.l = var4;
         this.I = (g3)var4.Q();
         g3.v var5 = (g3.v)var4.i(this.I.J());
         this.w = this.I.a;
         this.I(var5);
      }

      public List q() {
         return this.V;
      }

      private void I(g3.v var1) {
         this.V.clear();
         switch(null.k[var1.ordinal()]) {
         case 1:
            this.V.add(this.f.D());
            this.V.add(this.f.d());
            break;
         case 2:
            this.V.add(this.f.H());
            this.V.add(this.f.g());
            break;
         case 3:
            this.V.add(this.f.H());
            this.V.add(this.f.g().h());
            break;
         case 4:
            this.V.add(this.f.H().h());
            this.V.add(this.f.g());
            break;
         case 5:
            this.V.add(this.f.D().h());
            this.V.add(this.f.d());
            break;
         case 6:
            this.V.add(this.f.D());
            this.V.add(this.f.d().h());
            break;
         case 7:
            this.V.add(this.f.g());
            this.V.add(this.f.d());
            break;
         case 8:
            this.V.add(this.f.H());
            this.V.add(this.f.d());
            break;
         case 9:
            this.V.add(this.f.H());
            this.V.add(this.f.D());
            break;
         case 10:
            this.V.add(this.f.g());
            this.V.add(this.f.D());
         }

      }

      private void W() {
         for(int var1 = 0; var1 < this.V.size(); ++var1) {
            g3.g var2 = this.O((net.u.j)this.V.get(var1));
            if(var2.b(this)) {
               this.V.set(var1, var2.f);
            } else {
               this.V.remove(var1--);
            }
         }

      }

      private boolean s(net.u.j var1) {
         return g3.g(this.n, var1) || g3.g(this.n, var1.h()) || g3.g(this.n, var1.b());
      }

      @Nullable
      private g3.g O(net.u.j var1) {
         net.yw.n var2 = this.n.Z(var1);
         if(g3.B(var2)) {
            g3 var8 = g3.this;
            g3.this.getClass();
            return var8.new g(this.n, var1, var2);
         } else {
            net.u.j var3 = var1.h();
            var2 = this.n.Z(var3);
            if(g3.B(var2)) {
               g3 var7 = g3.this;
               g3.this.getClass();
               return var7.new g(this.n, var3, var2);
            } else {
               var3 = var1.b();
               var2 = this.n.Z(var3);
               g3.g var10000;
               if(g3.B(var2)) {
                  g3 var10002 = g3.this;
                  g3.this.getClass();
                  var10000 = var10002.new g(this.n, var3, var2);
               } else {
                  var10000 = null;
               }

               return var10000;
            }
         }
      }

      private boolean b(g3.g var1) {
         return this.P(var1.f);
      }

      private boolean P(net.u.j var1) {
         for(int var2 = 0; var2 < this.V.size(); ++var2) {
            net.u.j var3 = (net.u.j)this.V.get(var2);
            if(var3.t() == var1.t() && var3.y() == var1.y()) {
               return true;
            }
         }

         return false;
      }

      protected int l() {
         int var1 = 0;

         for(aq var3 : aq.u.HORIZONTAL) {
            if(this.s(this.f.C(var3))) {
               ++var1;
            }
         }

         return var1;
      }

      private boolean X(g3.g var1) {
         return this.b(var1) || this.V.size() != 2;
      }

      private void b(g3.g var1) {
         this.V.add(var1.f);
         net.u.j var2 = this.f.D();
         net.u.j var3 = this.f.d();
         net.u.j var4 = this.f.H();
         net.u.j var5 = this.f.g();
         boolean var6 = this.P(var2);
         boolean var7 = this.P(var3);
         boolean var8 = this.P(var4);
         boolean var9 = this.P(var5);
         g3.v var10 = null;
         var10 = g3.v.NORTH_SOUTH;
         var10 = g3.v.EAST_WEST;
         if(!this.w) {
            var10 = g3.v.SOUTH_EAST;
            var10 = g3.v.SOUTH_WEST;
            var10 = g3.v.NORTH_WEST;
            var10 = g3.v.NORTH_EAST;
         }

         if(var10 == g3.v.NORTH_SOUTH) {
            if(g3.g(this.n, var2.h())) {
               var10 = g3.v.ASCENDING_NORTH;
            }

            if(g3.g(this.n, var3.h())) {
               var10 = g3.v.ASCENDING_SOUTH;
            }
         }

         if(var10 == g3.v.EAST_WEST) {
            if(g3.g(this.n, var5.h())) {
               var10 = g3.v.ASCENDING_EAST;
            }

            if(g3.g(this.n, var4.h())) {
               var10 = g3.v.ASCENDING_WEST;
            }
         }

         var10 = g3.v.NORTH_SOUTH;
         this.l = this.l.s(this.I.J(), var10);
         this.n.k(this.f, this.l, 3);
      }

      private boolean l(net.u.j var1) {
         g3.g var2 = this.O(var1);
         return false;
      }

      public g3.g I(boolean var1, boolean var2) {
         net.u.j var4 = this.f.D();
         g3.v.l;
         net.u.j var5 = this.f.d();
         net.u.j var6 = this.f.H();
         net.u.j var7 = this.f.g();
         boolean var8 = this.l(var4);
         boolean var9 = this.l(var5);
         boolean var10 = this.l(var6);
         boolean var11 = this.l(var7);
         g3.v var12 = null;
         if((var8 || var9) && !var10 && !var11) {
            var12 = g3.v.NORTH_SOUTH;
         }

         if((var10 || var11) && !var8 && !var9) {
            var12 = g3.v.EAST_WEST;
         }

         if(!this.w) {
            if(var9 && var11 && !var8 && !var10) {
               var12 = g3.v.SOUTH_EAST;
            }

            if(var9 && var10 && !var8 && !var11) {
               var12 = g3.v.SOUTH_WEST;
            }

            if(var8 && var10 && !var9 && !var11) {
               var12 = g3.v.NORTH_WEST;
            }

            if(var8 && var11 && !var9 && !var10) {
               var12 = g3.v.NORTH_EAST;
            }
         }

         if(var12 == null) {
            if(var8 || var9) {
               var12 = g3.v.NORTH_SOUTH;
            }

            if(var10 || var11) {
               var12 = g3.v.EAST_WEST;
            }

            if(!this.w) {
               label458: {
                  if(var1) {
                     if(var9 && var11) {
                        var12 = g3.v.SOUTH_EAST;
                     }

                     if(var10 && var9) {
                        var12 = g3.v.SOUTH_WEST;
                     }

                     if(var11 && var8) {
                        var12 = g3.v.NORTH_EAST;
                     }

                     if(!var8 || !var10) {
                        break label458;
                     }

                     var12 = g3.v.NORTH_WEST;
                  }

                  if(var8 && var10) {
                     var12 = g3.v.NORTH_WEST;
                  }

                  if(var11 && var8) {
                     var12 = g3.v.NORTH_EAST;
                  }

                  if(var10 && var9) {
                     var12 = g3.v.SOUTH_WEST;
                  }

                  if(var9 && var11) {
                     var12 = g3.v.SOUTH_EAST;
                  }
               }
            }
         }

         if(var12 == g3.v.NORTH_SOUTH) {
            if(g3.g(this.n, var4.h())) {
               var12 = g3.v.ASCENDING_NORTH;
            }

            if(g3.g(this.n, var5.h())) {
               var12 = g3.v.ASCENDING_SOUTH;
            }
         }

         if(var12 == g3.v.EAST_WEST) {
            if(g3.g(this.n, var7.h())) {
               var12 = g3.v.ASCENDING_EAST;
            }

            if(g3.g(this.n, var6.h())) {
               var12 = g3.v.ASCENDING_WEST;
            }
         }

         if(var12 == null) {
            var12 = g3.v.NORTH_SOUTH;
         }

         this.I(var12);
         this.l = this.l.s(this.I.J(), var12);
         if(var2 || this.n.Z(this.f) != this.l) {
            this.n.k(this.f, this.l, 3);
            int var13 = 0;
            if(var13 < this.V.size()) {
               g3.g var14 = this.O((net.u.j)this.V.get(var13));
               if(var14 != null) {
                  var14.W();
                  if(var14.X(this)) {
                     var14.b(this);
                  }
               }

               ++var13;
            }
         }

         if(net.u.d.y() == null) {
            g3.v.l = new int[3];
         }

         return this;
      }

      public net.yw.n B() {
         return this.l;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static enum v implements au {
      NORTH_SOUTH,
      EAST_WEST,
      ASCENDING_EAST,
      ASCENDING_WEST,
      ASCENDING_NORTH,
      ASCENDING_SOUTH,
      SOUTH_EAST,
      SOUTH_WEST,
      NORTH_WEST,
      NORTH_EAST;

      private static final g3.v[] u;
      private final int G;
      private final String h;
      private static int[] l;

      private v(int var3, String var4) {
         this.G = var3;
         this.h = var4;
      }

      public int a() {
         return this.G;
      }

      public String toString() {
         return this.h;
      }

      public boolean i() {
         int[] var1 = w();
         return this == ASCENDING_NORTH || this == ASCENDING_EAST || this == ASCENDING_SOUTH || this == ASCENDING_WEST;
      }

      public static g3.v z(int var0) {
         if(var0 >= u.length) {
            var0 = 0;
         }

         return u[var0];
      }

      public String f() {
         return this.h;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      public static void f(int[] var0) {
         l = var0;
      }

      public static int[] w() {
         return l;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
