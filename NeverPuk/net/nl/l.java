package net.nl;

import java.util.List;
import java.util.Random;
import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.yp;
import net.nl.o;
import net.nl.v;
import net.nl.z1;
import net.nl.zc;
import net.nl.zq;

public class l extends v {
   public z1 T;
   private final net.yv.r h;
   private final net.u.j j;
   private final Random t;
   public int G;
   public int[] q;
   public int[] d;
   public int[] v;

   public l(net.r.i var1, net.yv.r var2) {
      this(var1, var2, net.u.j.V);
   }

   public l(net.r.i var1, net.yv.r var2, net.u.j var3) {
      this.T = new zq("Enchant", true, 2) {
         public int m() {
            return 64;
         }

         public void W() {
            super.W();
            l.this.d(this);
         }
      };
      this.t = new Random();
      this.q = new int[3];
      this.d = new int[]{-1, -1, -1};
      this.v = new int[]{-1, -1, -1};
      this.h = var2;
      this.j = var3;
      this.G = var1.v.X();
      this.U(new o(this.T, 0, 15, 47) {
         public boolean s(ks var1) {
            return true;
         }

         public int t() {
            return 1;
         }
      });
      this.U(new o(this.T, 1, 35, 47) {
         public boolean s(ks var1) {
            int var2 = v.N();
            return var1.Z() == net.nb.j.n && kw.q(var1.n()) == kw.BLUE;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      byte var4 = 0;
      int var5 = 0;

      while(true) {
         this.U(new o(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         ++var5;
      }
   }

   protected void L(zc var1) {
      var1.A(this, 0, this.q[0]);
      var1.A(this, 1, this.q[1]);
      var1.A(this, 2, this.q[2]);
      var1.A(this, 3, this.G & -16);
      var1.A(this, 4, this.d[0]);
      var1.A(this, 5, this.d[1]);
      var1.A(this, 6, this.d[2]);
      var1.A(this, 7, this.v[0]);
      var1.A(this, 8, this.v[1]);
      var1.A(this, 9, this.v[2]);
   }

   public void w(zc var1) {
      super.w(var1);
      this.L(var1);
   }

   public void u() {
      super.u();

      for(int var1 = 0; var1 < this.E.size(); ++var1) {
         zc var2 = (zc)this.E.get(var1);
         this.L(var2);
      }

   }

   public void k(int var1, int var2) {
      if(var1 <= 2) {
         this.q[var1] = var2;
      } else if(var1 == 3) {
         this.G = var2;
      } else if(var1 >= 4 && var1 <= 6) {
         this.d[var1 - 4] = var2;
      } else if(var1 >= 7 && var1 <= 9) {
         this.v[var1 - 7] = var2;
      } else {
         super.k(var1, var2);
      }

   }

   public void d(z1 var1) {
      int var2 = v.N();
      if(var1 == this.T) {
         ks var3 = var1.A(0);
         if(!var3.B() && var3.d()) {
            if(this.h.x) {
               return;
            }

            int var4 = 0;
            int var5 = -1;
            int var6 = -1;
            if(this.h.y(this.j.F(var6, 0, var5)) && this.h.y(this.j.F(var6, 1, var5))) {
               if(this.h.Z(this.j.F(var6 * 2, 0, var5 * 2)).Q() == net.nb.f.W) {
                  ++var4;
               }

               if(this.h.Z(this.j.F(var6 * 2, 1, var5 * 2)).Q() == net.nb.f.W) {
                  ++var4;
               }

               if(this.h.Z(this.j.F(var6 * 2, 0, var5)).Q() == net.nb.f.W) {
                  ++var4;
               }

               if(this.h.Z(this.j.F(var6 * 2, 1, var5)).Q() == net.nb.f.W) {
                  ++var4;
               }

               if(this.h.Z(this.j.F(var6, 0, var5 * 2)).Q() == net.nb.f.W) {
                  ++var4;
               }

               if(this.h.Z(this.j.F(var6, 1, var5 * 2)).Q() == net.nb.f.W) {
                  ++var4;
               }
            }

            ++var6;
            ++var5;
            this.t.setSeed((long)this.G);
            var5 = 0;
            this.q[var5] = net.c1.y.B(this.t, var5, var4, var3);
            this.d[var5] = -1;
            this.v[var5] = -1;
            if(this.q[var5] < var5 + 1) {
               this.q[var5] = 0;
            }

            ++var5;
            var5 = 0;
            if(this.q[var5] > 0) {
               List var16 = this.z(var3, var5, this.q[var5]);
               if(!var16.isEmpty()) {
                  net.c1.x var7 = (net.c1.x)var16.get(this.t.nextInt(var16.size()));
                  this.d[var5] = net.c1.c.g(var7.r);
                  this.v[var5] = var7.o;
               }
            }

            ++var5;
            this.u();
         }

         int var8 = 0;
         this.q[var8] = 0;
         this.d[var8] = -1;
         this.v[var8] = -1;
         ++var8;
      }

   }

   public boolean A(net.r.r var1, int var2) {
      ks var3 = this.T.A(0);
      ks var4 = this.T.A(1);
      int var5 = var2 + 1;
      if((var4.B() || var4.U() < var5) && !var1.a6.V) {
         return false;
      } else if(this.q[var2] > 0 && !var3.B() && (var1.aX >= var5 && var1.aX >= this.q[var2] || var1.a6.V)) {
         if(!this.h.x) {
            List var6 = this.z(var3, var2, this.q[var2]);
            if(!var6.isEmpty()) {
               var1.E(var3, var5);
               boolean var7 = var3.Z() == net.nb.j.Yv;
               var3 = new ks(net.nb.j.r);
               this.T.S(0, var3);

               for(int var8 = 0; var8 < var6.size(); ++var8) {
                  net.c1.x var9 = (net.c1.x)var6.get(var8);
                  yp.n(var3, var9);
               }

               if(!var1.a6.V) {
                  var4.H(var5);
                  if(var4.B()) {
                     this.T.S(1, ks.a);
                  }
               }

               var1.S(net.v.q.p);
               if(var1 instanceof net.r.h) {
                  b2.I.n((net.r.h)var1, var3, var5);
               }

               this.T.W();
               this.G = var1.X();
               this.d(this.T);
               this.h.M((net.r.r)null, this.j, net.nb.l.D5, net.yz.p.BLOCKS, 1.0F, this.h.G.nextFloat() * 0.1F + 0.9F);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private List z(ks var1, int var2, int var3) {
      this.t.setSeed((long)(this.G + var2));
      List var4 = net.c1.y.X(this.t, var1, var3, false);
      if(var1.Z() == net.nb.j.Yv && var4.size() > 1) {
         var4.remove(this.t.nextInt(var4.size()));
      }

      return var4;
   }

   public int A() {
      ks var1 = this.T.A(1);
      return var1.B()?0:var1.U();
   }

   public void K(net.r.r var1) {
      super.K(var1);
      if(!this.h.x) {
         this.o(var1, var1.hl, this.T);
      }

   }

   public boolean N(net.r.r var1) {
      return this.h.Z(this.j).Q() != net.nb.f.TZ?false:var1.o((double)this.j.t() + 0.5D, (double)this.j.h() + 0.5D, (double)this.j.y() + 0.5D) <= 64.0D;
   }

   public ks a(net.r.r var1, int var2) {
      ks var3 = ks.a;
      o var4 = (o)this.e.get(var2);
      if(var4.T()) {
         ks var5 = var4.y();
         var3 = var5.s();
         if(!this.V(var5, 2, 38, true)) {
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

   private static xn a(xn var0) {
      return var0;
   }
}
