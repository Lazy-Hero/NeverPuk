package net.nl;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.n0.ks;
import net.nl.c;
import net.nl.o;
import net.nl.s;
import net.nl.z1;
import net.nl.zc;
import net.nl.ze;

public abstract class v {
   public net.yz.w N = net.yz.w.T();
   public List e = Lists.newArrayList();
   public int S;
   private short x;
   private int V = -1;
   private int H;
   private final Set a = Sets.newHashSet();
   protected List E = Lists.newArrayList();
   private final Set R = Sets.newHashSet();
   private static int k;

   protected o U(o var1) {
      var1.d = this.e.size();
      this.e.add(var1);
      this.N.add(ks.a);
      return var1;
   }

   public void w(zc var1) {
      if(this.E.contains(var1)) {
         throw new IllegalArgumentException("Listener already listening");
      } else {
         this.E.add(var1);
         var1.R(this, this.j());
         this.u();
      }
   }

   public void T(zc var1) {
      this.E.remove(var1);
   }

   public net.yz.w j() {
      net.yz.w var1 = net.yz.w.T();

      for(int var2 = 0; var2 < this.e.size(); ++var2) {
         var1.add(((o)this.e.get(var2)).y());
      }

      return var1;
   }

   public void u() {
      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         ks var2 = ((o)this.e.get(var1)).y();
         ks var3 = (ks)this.N.get(var1);
         if(!ks.D(var3, var2)) {
            var3 = var2.B()?ks.a:var2.s();
            this.N.set(var1, var3);

            for(int var4 = 0; var4 < this.E.size(); ++var4) {
               ((zc)this.E.get(var4)).b(this, var1, var3);
            }
         }
      }

   }

   public boolean A(net.r.r var1, int var2) {
      return false;
   }

   @Nullable
   public o m(z1 var1, int var2) {
      for(int var3 = 0; var3 < this.e.size(); ++var3) {
         o var4 = (o)this.e.get(var3);
         if(var4.e(var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   public o f(int var1) {
      return (o)this.e.get(var1);
   }

   public ks a(net.r.r var1, int var2) {
      o var3 = (o)this.e.get(var2);
      return var3.y();
   }

   public ks p(int var1, int var2, c var3, net.r.r var4) {
      Q();
      ks var6 = ks.a;
      net.r.i var7 = var4.a8;
      if(var3 == c.QUICK_CRAFT) {
         int var8 = this.H;
         this.H = A(var2);
         if((var8 != 1 || this.H != 2) && var8 != this.H) {
            this.P();
         }

         if(var7.j().B()) {
            this.P();
         }

         if(this.H == 0) {
            this.V = Z(var2);
            if(U(this.V, var4)) {
               this.H = 1;
               this.a.clear();
            }

            this.P();
         }

         if(this.H == 1) {
            o var9 = (o)this.e.get(var1);
            ks var10 = var7.j();
            if(var9 != null && n(var9, var10, true) && var9.s(var10) && (this.V == 2 || var10.U() > this.a.size()) && this.V(var9)) {
               this.a.add(var9);
            }
         }

         if(this.H == 2) {
            if(!this.a.isEmpty()) {
               ks var22 = var7.j().s();
               int var27 = var7.j().U();
               Iterator var11 = this.a.iterator();
               if(var11.hasNext()) {
                  o var12 = (o)var11.next();
                  ks var13 = var7.j();
                  if(var12 != null && n(var12, var13, true) && var12.s(var13) && (this.V == 2 || var13.U() >= this.a.size()) && this.V(var12)) {
                     ks var14 = var22.s();
                     int var15 = var12.T()?var12.y().U():0;
                     P(this.a, this.V, var14, var15);
                     int var16 = Math.min(var14.j(), var12.v(var14));
                     if(var14.U() > var16) {
                        var14.u(var16);
                     }

                     var27 -= var14.U() - var15;
                     var12.e(var14);
                  }
               }

               var22.u(var27);
               var7.F(var22);
            }

            this.P();
         }

         this.P();
      }

      if(this.H != 0) {
         this.P();
      }

      if(var3 != c.PICKUP && var3 != c.QUICK_MOVE || var2 != 0 && var2 != 1) {
         if(var3 == c.SWAP && var2 >= 0 && var2 < 9) {
            o var18 = (o)this.e.get(var1);
            ks var23 = var7.A(var2);
            ks var28 = var18.y();
            if(!var23.B() || !var28.B()) {
               label1026: {
                  if(var23.B()) {
                     if(!var18.I(var4)) {
                        break label1026;
                     }

                     var7.S(var2, var28);
                     var18.p(var28.U());
                     var18.e(ks.a);
                     var18.H(var4, var28);
                  }

                  if(var28.B()) {
                     if(!var18.s(var23)) {
                        break label1026;
                     }

                     int var30 = var18.v(var23);
                     if(var23.U() > var30) {
                        var18.e(var23.w(var30));
                     }

                     var18.e(var23);
                     var7.S(var2, ks.a);
                  }

                  if(var18.I(var4) && var18.s(var23)) {
                     label1246: {
                        int var31 = var18.v(var23);
                        if(var23.U() > var31) {
                           var18.e(var23.w(var31));
                           var18.H(var4, var28);
                           if(var7.D(var28)) {
                              break label1246;
                           }

                           var4.Y(var28, true);
                        }

                        var18.e(var23);
                        var7.S(var2, var28);
                        var18.H(var4, var28);
                     }
                  }
               }
            }
         }

         if(var3 == c.CLONE && var4.a6.V && var7.j().B() && var1 >= 0) {
            o var19 = (o)this.e.get(var1);
            if(var19 != null && var19.T()) {
               ks var24 = var19.y().s();
               var24.u(var24.j());
               var7.F(var24);
            }
         }

         if(var3 == c.THROW && var7.j().B() && var1 >= 0) {
            o var20 = (o)this.e.get(var1);
            if(var20 != null && var20.T() && var20.I(var4)) {
               ks var25 = var20.h(var2 == 0?1:var20.y().U());
               var20.H(var4, var25);
               var4.Y(var25, true);
            }
         }

         if(var3 == c.PICKUP_ALL) {
            o var21 = (o)this.e.get(var1);
            ks var26 = var7.j();
            if(!var26.B() && (var21 == null || !var21.T() || !var21.I(var4))) {
               int var29 = var2 == 0?0:this.e.size() - 1;
               int var32 = var2 == 0?1:-1;
               int var33 = 0;
               if(var29 < this.e.size() && var26.U() < var26.j()) {
                  o var35 = (o)this.e.get(var29);
                  if(var35.T() && n(var35, var26, true) && var35.I(var4) && this.g(var26, var35)) {
                     ks var36 = var35.y();
                     if(var36.U() != var36.j()) {
                        int var37 = Math.min(var26.j() - var26.U(), var36.U());
                        ks var17 = var35.h(var37);
                        var26.A(var37);
                        if(var17.B()) {
                           var35.e(ks.a);
                        }

                        var35.H(var4, var17);
                     }
                  }

                  int var10000 = var29 + var32;
               }

               ++var33;
            }

            this.u();
         }
      } else {
         if(var1 == -999) {
            if(var7.j().B()) {
               return var6;
            }

            if(var2 == 0) {
               var4.Y(var7.j(), true);
               var7.F(ks.a);
            }

            if(var2 != 1) {
               return var6;
            }

            var4.Y(var7.j().w(1), true);
         }

         if(var3 == c.QUICK_MOVE) {
            return ks.a;
         }

         return ks.a;
      }

      return var6;
   }

   public boolean g(ks var1, o var2) {
      return true;
   }

   public void K(net.r.r var1) {
      net.r.i var2 = var1.a8;
      if(!var2.j().B()) {
         var1.Y(var2.j(), false);
         var2.F(ks.a);
      }

   }

   protected void o(net.r.r var1, net.yv.r var2, z1 var3) {
      if(!var1.P() || var1 instanceof net.r.h && ((net.r.h)var1)._r()) {
         for(int var5 = 0; var5 < var3.e(); ++var5) {
            var1.Y(var3.S(var5), false);
         }
      } else {
         for(int var4 = 0; var4 < var3.e(); ++var4) {
            var1.a8.D(var2, var3.S(var4));
         }
      }

   }

   public void d(z1 var1) {
      this.u();
   }

   public void e(int var1, ks var2) {
      this.f(var1).e(var2);
   }

   public void U(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.f(var2).e((ks)var1.get(var2));
      }

   }

   public void k(int var1, int var2) {
   }

   public short H(net.r.i var1) {
      ++this.x;
      return this.x;
   }

   public boolean D(net.r.r var1) {
      return !this.R.contains(var1);
   }

   public void r(net.r.r var1, boolean var2) {
      this.R.remove(var1);
   }

   public abstract boolean N(net.r.r var1);

   protected boolean V(ks var1, int var2, int var3, boolean var4) {
      boolean var5 = false;
      int var6 = var3 - 1;
      if(var1.y()) {
         for(; !var1.B() && var6 >= var2; --var6) {
            o var7 = (o)this.e.get(var6);
            ks var8 = var7.y();
            if(!var8.B() && var8.Z() == var1.Z() && (!var1.z() || var1.n() == var8.n()) && ks.a(var1, var8)) {
               int var9 = var8.U() + var1.U();
               if(var9 <= var1.j()) {
                  var1.u(0);
                  var8.u(var9);
                  var7.y();
                  var5 = true;
               } else if(var8.U() < var1.j()) {
                  var1.H(var1.j() - var8.U());
                  var8.u(var1.j());
                  var7.y();
                  var5 = true;
               }
            }
         }
      }

      if(!var1.B()) {
         for(var6 = var3 - 1; var6 >= var2; --var6) {
            o var11 = (o)this.e.get(var6);
            ks var12 = var11.y();
            if(var12.B() && var11.s(var1)) {
               if(var1.U() > var11.t()) {
                  var11.e(var1.w(var11.t()));
               } else {
                  var11.e(var1.w(var1.U()));
               }

               var11.y();
               var5 = true;
               break;
            }
         }
      }

      return var5;
   }

   public static int Z(int var0) {
      return var0 >> 2 & 3;
   }

   public static int A(int var0) {
      return var0 & 3;
   }

   public static int V(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   public static boolean U(int var0, net.r.r var1) {
      return true;
   }

   protected void P() {
      this.H = 0;
      this.a.clear();
   }

   public static boolean n(@Nullable o var0, ks var1, boolean var2) {
      boolean var3 = !var0.T();
      return var1.g(var0.y()) && ks.a(var0.y(), var1)?var0.y().U() + 0 <= var1.j():var3;
   }

   public static void P(Set var0, int var1, ks var2, int var3) {
      switch(var1) {
      case 0:
         var2.u(net.u.t.M((float)var2.U() / (float)var0.size()));
         break;
      case 1:
         var2.u(1);
         break;
      case 2:
         var2.u(var2.Z().E());
      }

      var2.A(var3);
   }

   public boolean V(o var1) {
      return true;
   }

   public static int D(@Nullable net.ni.v var0) {
      return var0 instanceof z1?e((z1)var0):0;
   }

   public static int e(@Nullable z1 var0) {
      return 0;
   }

   protected void u(net.yv.r var1, net.r.r var2, ze var3, s var4) {
      if(!var1.x) {
         net.r.h var5 = (net.r.h)var2;
         ks var6 = ks.a;
         net.cr.s var7 = net.cr.n.m(var3, var1);
         if(var7.c() || !var1.N().b("doLimitedCrafting") || var5.y().Q(var7)) {
            var4.p(var7);
            var6 = var7.h(var3);
         }

         var4.S(0, var6);
         var5.t1.h((net.n2.k)(new net.no.r(this.S, 0, var6)));
      }

   }

   public static void L(int var0) {
      k = var0;
   }

   public static int N() {
      return k;
   }

   public static int Q() {
      int var0 = N();
      return 79;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      L(0);
   }
}
