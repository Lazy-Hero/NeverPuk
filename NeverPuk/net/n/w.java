package net.n;

import net.xn;
import net.n.y;
import net.n0.k3;
import net.n0.ks;
import net.n0.q;
import net.nl.z1;
import net.no.s3;
import net.no.sq;
import net.y1.l;
import net.y9.rh;
import net.y9.z_;
import net.y9.zc;
import net.yv.d;
import net.yv.o9;
import net.yz.ad;
import net.yz.am;
import net.yz.aq;

public class w {
   public net.yv.r B;
   public net.r.h q;
   private o9 c = o9.NOT_SET;
   private boolean O;
   private int Z;
   private net.u.j V = net.u.j.V;
   private int G;
   private boolean X;
   private net.u.j W = net.u.j.V;
   private int F;
   private int d = -1;

   public w(net.yv.r var1) {
      this.B = var1;
   }

   public void T(o9 var1) {
      this.c = var1;
      var1.M(this.q.a6);
      this.q.m();
      this.q.t9.c().U(new s3(s3.n.UPDATE_GAME_MODE, new net.r.h[]{this.q}));
      this.B.U();
   }

   public o9 V() {
      return this.c;
   }

   public boolean I() {
      return this.c.a();
   }

   public boolean x() {
      return this.c.U();
   }

   public void s(o9 var1) {
      if(this.c == o9.NOT_SET) {
         this.c = var1;
      }

      this.T(this.c);
   }

   public void A() {
      ++this.G;
      if(this.X) {
         int var1 = this.G - this.F;
         net.yw.n var2 = this.B.Z(this.W);
         if(var2.n() == l.q) {
            this.X = false;
         } else {
            float var3 = var2.Y(this.q, this.q.hl, this.W) * (float)(var1 + 1);
            int var4 = (int)(var3 * 10.0F);
            if(var4 != this.d) {
               this.B.i(this.q.G(), this.W, var4);
               this.d = var4;
            }

            if(var3 >= 1.0F) {
               this.X = false;
               this.W(this.W);
            }
         }
      } else if(this.O) {
         net.yw.n var5 = this.B.Z(this.V);
         if(var5.n() == l.q) {
            this.B.i(this.q.G(), this.V, -1);
            this.d = -1;
            this.O = false;
         } else {
            int var6 = this.G - this.Z;
            float var7 = var5.Y(this.q, this.q.hl, this.W) * (float)(var6 + 1);
            int var8 = (int)(var7 * 10.0F);
            if(var8 != this.d) {
               this.B.i(this.q.G(), this.V, var8);
               this.d = var8;
            }
         }
      }

   }

   public void M(net.u.j var1, aq var2) {
      if(this.x()) {
         if(!this.B.Q((net.r.r)null, (net.u.j)var1, var2)) {
            this.W(var1);
         }
      } else {
         net.yw.n var3 = this.B.Z(var1);
         net.y9.l var4 = var3.Q();
         if(this.c.p()) {
            if(this.c == o9.SPECTATOR) {
               return;
            }

            if(!this.q.VK()) {
               ks var5 = this.q.S();
               if(var5.B()) {
                  return;
               }

               if(!var5.q(var4)) {
                  return;
               }
            }
         }

         this.B.Q((net.r.r)null, (net.u.j)var1, var2);
         this.Z = this.G;
         float var7 = 1.0F;
         if(var3.n() != l.q) {
            var4.w((net.yv.r)this.B, (net.u.j)var1, (net.r.r)this.q);
            var7 = var3.Y(this.q, this.q.hl, var1);
         }

         if(var3.n() != l.q) {
            float var8;
            int var10000 = (var8 = var7 - 1.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
            this.W(var1);
         } else {
            this.O = true;
            this.V = var1;
            int var6 = (int)(var7 * 10.0F);
            this.B.i(this.q.G(), var1, var6);
            this.d = var6;
         }
      }

   }

   public void g(net.u.j var1) {
      if(var1.equals(this.V)) {
         int var2 = this.G - this.Z;
         net.yw.n var3 = this.B.Z(var1);
         if(var3.n() != l.q) {
            float var4 = var3.Y(this.q, this.q.hl, var1) * (float)(var2 + 1);
            if(var4 >= 0.7F) {
               this.O = false;
               this.B.i(this.q.G(), var1, -1);
               this.W(var1);
            } else if(!this.X) {
               this.O = false;
               this.X = true;
               this.W = var1;
               this.F = this.Z;
            }
         }
      }

   }

   public void U() {
      this.O = false;
      this.B.i(this.q.G(), this.V, -1);
   }

   private boolean I(net.u.j var1) {
      net.yw.n var2 = this.B.Z(var1);
      var2.Q().X(this.B, var1, var2, this.q);
      boolean var3 = this.B.J(var1);
      var2.Q().N(this.B, var1, var2);
      return var3;
   }

   public boolean W(net.u.j var1) {
      if(this.c.U() && !this.q.S().B() && this.q.S().Z() instanceof k3) {
         return false;
      } else {
         net.yw.n var2 = this.B.Z(var1);
         net.ni.v var3 = this.B.L(var1);
         net.y9.l var4 = var2.Q();
         if((var4 instanceof zc || var4 instanceof rh) && !this.q.Vm()) {
            this.B.V(var1, var2, var2, 3);
            return false;
         } else {
            if(this.c.p()) {
               if(this.c == o9.SPECTATOR) {
                  return false;
               }

               if(!this.q.VK()) {
                  ks var5 = this.q.S();
                  if(var5.B()) {
                     return false;
                  }

                  if(!var5.q(var4)) {
                     return false;
                  }
               }
            }

            this.B.N(this.q, 2001, var1, net.y9.l.m(var2));
            boolean var9 = this.I(var1);
            if(this.x()) {
               this.q.t1.h((net.n2.k)(new sq(this.B, var1)));
            } else {
               ks var6 = this.q.S();
               ks var7 = var6.B()?ks.a:var6.s();
               boolean var8 = this.q.R(var2);
               if(!var6.B()) {
                  var6.h(this.B, var2, var1, this.q);
               }

               var2.Q().U(this.B, this.q, var1, var2, var3, var7);
            }

            return var9;
         }
      }
   }

   public ad Y(net.r.r var1, net.yv.r var2, ks var3, net.yz.k var4) {
      if(this.c == o9.SPECTATOR) {
         return ad.PASS;
      } else if(var1.H().E(var3.Z())) {
         return ad.PASS;
      } else {
         int var5 = var3.U();
         int var6 = var3.n();
         am var7 = var3.N(var2, var1, var4);
         ks var8 = (ks)var7.G();
         if(var8 == var3 && var8.U() == var5 && var8.o() <= 0 && var8.n() == var6) {
            return var7.r();
         } else if(var7.r() == ad.FAIL && var8.o() > 0 && !var1.F()) {
            return var7.r();
         } else {
            var1.e(var4, var8);
            if(this.x()) {
               var8.u(var5);
               if(var8.M()) {
                  var8.d(var6);
               }
            }

            if(var8.B()) {
               var1.e(var4, ks.a);
            }

            if(!var1.F()) {
               ((net.r.h)var1).J(var1.aW);
            }

            return var7.r();
         }
      }
   }

   public ad f(net.r.r var1, net.yv.r var2, ks var3, net.yz.k var4, net.u.j var5, aq var6, float var7, float var8, float var9) {
      int[] var10 = y.c();
      if(this.c == o9.SPECTATOR) {
         net.ni.v var16 = var2.L(var5);
         if(var16 instanceof net.yv.x) {
            net.y9.l var17 = var2.Z(var5).Q();
            net.yv.x var18 = (net.yv.x)var16;
            if(var18 instanceof net.ni.k && var17 instanceof z_) {
               var18 = ((z_)var17).p(var2, var5);
            }

            if(var18 != null) {
               var1.n(var18);
               return ad.SUCCESS;
            }
         }

         if(var16 instanceof z1) {
            var1.n((z1)var16);
            return ad.SUCCESS;
         } else {
            return ad.PASS;
         }
      } else {
         if(!var1.Q() || var1.S().B() && var1.L().B()) {
            net.yw.n var11 = var2.Z(var5);
            if(var11.Q().N(var2, var5, var11, var1, var4, var6, var7, var8, var9)) {
               return ad.SUCCESS;
            }
         }

         if(var3.B()) {
            return ad.PASS;
         } else if(var1.H().E(var3.Z())) {
            return ad.PASS;
         } else {
            if(var3.Z() instanceof q && !var1.Vm()) {
               net.y9.l var14 = ((q)var3.Z()).o();
               if(var14 instanceof zc || var14 instanceof rh) {
                  return ad.FAIL;
               }
            }

            if(this.x()) {
               int var15 = var3.n();
               int var12 = var3.U();
               ad var13 = var3.o(var1, var2, var5, var4, var6, var7, var8, var9);
               var3.d(var15);
               var3.u(var12);
               return var13;
            } else {
               return var3.o(var1, var2, var5, var4, var6, var7, var8, var9);
            }
         }
      }
   }

   public void A(d var1) {
      this.B = var1;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
