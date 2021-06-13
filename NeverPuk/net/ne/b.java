package net.ne;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.n0.ks;
import net.n0.yn;
import net.ne.a;
import net.ne.bk;
import net.ne.d;
import net.ne.l;
import net.ne.o;
import net.ne.w;
import net.nl.z2;
import net.no.id;
import net.no.in;
import net.no.s8;
import net.no.s_;
import net.no.sg;
import net.no.sp;
import net.no.su;
import net.no.sv;
import net.yn.wy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b {
   private static final Logger g = LogManager.getLogger();
   private final l U;
   private final int d;
   private int B;
   private final int m;
   private long S;
   private long a;
   private long z;
   private int P;
   private int O;
   private int V;
   private double A;
   private double Y;
   private double J;
   public int h;
   private double x;
   private double F;
   private double f;
   private boolean q;
   private final boolean N;
   private int H;
   private List i = Collections.emptyList();
   private boolean E;
   private boolean I;
   public boolean j;
   private final Set T = Sets.newHashSet();

   public b(l var1, int var2, int var3, int var4, boolean var5) {
      this.U = var1;
      this.d = var2;
      this.B = var3;
      this.m = var4;
      this.N = var5;
      this.S = bk.n(var1.b);
      this.a = bk.n(var1.hS);
      this.z = bk.n(var1.hr);
      this.P = net.u.t.M(var1.hN * 256.0F / 360.0F);
      this.O = net.u.t.M(var1.V * 256.0F / 360.0F);
      this.V = net.u.t.M(var1.X() * 256.0F / 360.0F);
      this.I = var1.k;
   }

   public boolean equals(Object var1) {
      return var1 instanceof b?((b)var1).U.G() == this.U.G():false;
   }

   public int hashCode() {
      return this.U.G();
   }

   public void P(List var1) {
      d.O();
      this.j = false;
      if(!this.q || this.U.o(this.x, this.F, this.f) > 16.0D) {
         this.x = this.U.b;
         this.F = this.U.hS;
         this.f = this.U.hr;
         this.q = true;
         this.j = true;
         this.T(var1);
      }

      List var3 = this.U.H();
      if(!var3.equals(this.i)) {
         this.i = var3;
         this.n(new net.no.d(this.U));
      }

      if(this.U instanceof net.nm.e && this.h % 10 == 0) {
         net.nm.e var4 = (net.nm.e)this.U;
         ks var5 = var4.I();
         if(var5.Z() instanceof yn) {
            net.cg.s var6 = net.nb.j.WN.t(var5, this.U.hl);
            Iterator var7 = var1.iterator();
            if(var7.hasNext()) {
               net.r.r var8 = (net.r.r)var7.next();
               net.r.h var9 = (net.r.h)var8;
               var6.i(var9, var5);
               net.n2.k var10 = net.nb.j.WN.U(var5, this.U.hl, var9);
               var9.t1.h(var10);
            }
         }

         this.q();
      }

      if(this.h % this.m == 0 || this.U.w || this.U.A().Z()) {
         if(this.U.M()) {
            int var32 = net.u.t.M(this.U.hN * 256.0F / 360.0F);
            int var35 = net.u.t.M(this.U.V * 256.0F / 360.0F);
            if(Math.abs(var32 - this.P) < 1 && Math.abs(var35 - this.O) < 1) {
               boolean var39 = false;
            } else {
               boolean var10000 = true;
            }

            this.n(new s8.q(this.U.G(), (byte)var32, (byte)var35, this.U.k));
            this.P = var32;
            this.O = var35;
            this.S = bk.n(this.U.b);
            this.a = bk.n(this.U.hS);
            this.z = bk.n(this.U.hr);
            this.q();
            this.E = true;
         }

         ++this.H;
         long var33 = bk.n(this.U.b);
         long var36 = bk.n(this.U.hS);
         long var37 = bk.n(this.U.hr);
         int var38 = net.u.t.M(this.U.hN * 256.0F / 360.0F);
         int var11 = net.u.t.M(this.U.V * 256.0F / 360.0F);
         long var12 = var33 - this.S;
         long var14 = var36 - this.a;
         long var16 = var37 - this.z;
         Object var18 = null;
         if(Long.compare(var12 * var12 + var14 * var14 + var16 * var16, 128L) < 0 && this.h % 60 != 0) {
            boolean var41 = false;
         } else {
            boolean var40 = true;
         }

         if(Math.abs(var38 - this.P) < 1 && Math.abs(var11 - this.O) < 1) {
            boolean var43 = false;
         } else {
            boolean var42 = true;
         }

         if(this.h > 0 || this.U instanceof net.n1.o) {
            if(var12 >= -32768L && var12 < 32768L && var14 >= -32768L && var14 < 32768L && var16 >= -32768L && var16 < 32768L && this.H <= 400 && !this.E && this.I == this.U.k) {
               var18 = new s8.i(this.U.G(), var12, var14, var16, (byte)var38, (byte)var11, this.U.k);
            } else {
               this.I = this.U.k;
               this.H = 0;
               this.e();
               var18 = new net.no.q(this.U);
            }
         }

         boolean var21 = this.N;
         if(this.U instanceof a && ((a)this.U).I()) {
            var21 = true;
         }

         if(var21 && this.h > 0) {
            double var22 = this.U.hf - this.A;
            double var24 = this.U.K - this.Y;
            double var26 = this.U.J - this.J;
            double var44 = 0.02D;
            double var30 = var22 * var22 + var24 * var24 + var26 * var26;
            if(var30 > 4.0E-4D || Double.compare(var30, 0.0D) > 0 && this.U.hf == 0.0D && this.U.K == 0.0D && this.U.J == 0.0D) {
               this.A = this.U.hf;
               this.Y = this.U.K;
               this.J = this.U.J;
               this.n(new sp(this.U.G(), this.A, this.Y, this.J));
            }
         }

         this.n((net.n2.k)var18);
         this.q();
         this.S = var33;
         this.a = var36;
         this.z = var37;
         this.P = var38;
         this.O = var11;
         this.E = false;
         int var34 = net.u.t.M(this.U.X() * 256.0F / 360.0F);
         if(Math.abs(var34 - this.V) >= 1) {
            this.n(new sv(this.U, (byte)var34));
            this.V = var34;
         }

         this.U.w = false;
      }

      ++this.h;
      if(this.U.hV) {
         this.k(new sp(this.U));
         this.U.hV = false;
      }

   }

   private void q() {
      net.k.n var1 = this.U.A();
      if(var1.Z()) {
         this.k(new s_(this.U.G(), var1, false));
      }

      if(this.U instanceof a) {
         net.s.w var2 = (net.s.w)((a)this.U).T();
         Set var3 = var2.Q();
         if(!var3.isEmpty()) {
            this.k(new net.no.s(this.U.G(), var3));
         }

         var3.clear();
      }

   }

   public void n(net.n2.k var1) {
      for(net.r.h var3 : this.T) {
         var3.t1.h(var1);
      }

   }

   public void k(net.n2.k var1) {
      this.n(var1);
      if(this.U instanceof net.r.h) {
         ((net.r.h)this.U).t1.h(var1);
      }

   }

   public void h() {
      for(net.r.h var2 : this.T) {
         this.U.Q(var2);
         var2.O(this.U);
      }

   }

   public void J(net.r.h var1) {
      if(this.T.contains(var1)) {
         this.U.Q(var1);
         var1.O(this.U);
         this.T.remove(var1);
      }

   }

   public void Z(net.r.h var1) {
      if(var1 != this.U) {
         if(this.c(var1)) {
            if(!this.T.contains(var1) && (this.r(var1) || this.U.hK)) {
               this.T.add(var1);
               net.n2.k var2 = this.N();
               var1.t1.h(var2);
               if(!this.U.A().d()) {
                  var1.t1.h((net.n2.k)(new s_(this.U.G(), this.U.A(), true)));
               }

               boolean var3 = this.N;
               if(this.U instanceof a) {
                  net.s.w var4 = (net.s.w)((a)this.U).T();
                  Collection var5 = var4.i();
                  if(!var5.isEmpty()) {
                     var1.t1.h((net.n2.k)(new net.no.s(this.U.G(), var5)));
                  }

                  if(((a)this.U).I()) {
                     var3 = true;
                  }
               }

               this.A = this.U.hf;
               this.Y = this.U.K;
               this.J = this.U.J;
               if(!(var2 instanceof net.no.b)) {
                  var1.t1.h((net.n2.k)(new sp(this.U.G(), this.U.hf, this.U.K, this.U.J)));
               }

               if(this.U instanceof a) {
                  for(z2 var7 : z2.values()) {
                     ks var8 = ((a)this.U).U(var7);
                     if(!var8.B()) {
                        var1.t1.h((net.n2.k)(new id(this.U.G(), var7, var8)));
                     }
                  }
               }

               if(this.U instanceof net.r.r) {
                  net.r.r var11 = (net.r.r)this.U;
                  if(var11.L()) {
                     var1.t1.h((net.n2.k)(new su(var11, new net.u.j(this.U))));
                  }
               }

               if(this.U instanceof a) {
                  a var12 = (a)this.U;

                  for(net.n_.i var15 : var12.o()) {
                     var1.t1.h((net.n2.k)(new net.no.v(this.U.G(), var15)));
                  }
               }

               if(!this.U.H().isEmpty()) {
                  var1.t1.h((net.n2.k)(new net.no.d(this.U)));
               }

               if(this.U.M()) {
                  var1.t1.h((net.n2.k)(new net.no.d(this.U.D())));
               }

               this.U.b(var1);
               var1.Z(this.U);
            }
         } else if(this.T.contains(var1)) {
            this.T.remove(var1);
            this.U.Q(var1);
            var1.O(this.U);
         }
      }

   }

   public boolean c(net.r.h var1) {
      double var2 = var1.b - (double)this.S / 4096.0D;
      double var4 = var1.hr - (double)this.z / 4096.0D;
      int var6 = Math.min(this.d, this.B);
      return var2 >= (double)(-var6) && var2 <= (double)var6 && var4 >= (double)(-var6) && var4 <= (double)var6 && this.U.b(var1);
   }

   private boolean r(net.r.h var1) {
      return var1.j().m().G(var1, this.U.Q, this.U.f);
   }

   public void T(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.Z((net.r.h)var1.get(var2));
      }

   }

   private net.n2.k N() {
      if(this.U.Z) {
         g.warn("Fetching addPacket for removed entity");
      }

      if(this.U instanceof net.r.h) {
         return new net.no.e((net.r.r)this.U);
      } else if(this.U instanceof wy) {
         this.V = net.u.t.M(this.U.X() * 256.0F / 360.0F);
         return new net.no.b((a)this.U);
      } else if(this.U instanceof net.nm.l) {
         return new sg((net.nm.l)this.U);
      } else if(this.U instanceof net.nm.i) {
         return new in(this.U, 2, 1);
      } else if(this.U instanceof net.nm.w) {
         net.nm.w var11 = (net.nm.w)this.U;
         return new in(this.U, 10, var11.R().j());
      } else if(this.U instanceof net.nm.b) {
         return new in(this.U, 1);
      } else if(this.U instanceof net.nm.s) {
         return new net.no.m((net.nm.s)this.U);
      } else if(this.U instanceof net.n1.q) {
         net.r.r var10 = ((net.n1.q)this.U).k();
         return new in(this.U, 90, this.U.G());
      } else if(this.U instanceof net.n1.l) {
         l var9 = ((net.n1.l)this.U).kx;
         return new in(this.U, 91, 1 + this.U.G());
      } else if(this.U instanceof net.n1.b) {
         l var8 = ((net.n1.o)this.U).kx;
         return new in(this.U, 60, 1 + this.U.G());
      } else if(this.U instanceof net.n1.x) {
         return new in(this.U, 61);
      } else if(this.U instanceof net.n1.c) {
         return new in(this.U, 68);
      } else if(this.U instanceof net.n1.g) {
         return new in(this.U, 73);
      } else if(this.U instanceof net.nm.h) {
         return new in(this.U, 75);
      } else if(this.U instanceof net.nm.f) {
         return new in(this.U, 65);
      } else if(this.U instanceof net.nm.a) {
         return new in(this.U, 72);
      } else if(this.U instanceof net.nm.n) {
         return new in(this.U, 76);
      } else if(this.U instanceof net.n1.m) {
         net.n1.m var7 = (net.n1.m)this.U;
         in var2 = null;
         byte var3 = 63;
         if(this.U instanceof net.n1.u) {
            var3 = 64;
         } else if(this.U instanceof net.n1.f) {
            var3 = 93;
         } else if(this.U instanceof net.n1.w) {
            var3 = 66;
         }

         if(var7.U0 != null) {
            var2 = new in(this.U, var3, ((net.n1.m)this.U).U0.G());
         } else {
            var2 = new in(this.U, var3, 0);
         }

         var2.x((int)(var7.US * 8000.0D));
         var2.E((int)(var7.UZ * 8000.0D));
         var2.Q((int)(var7.UF * 8000.0D));
         return var2;
      } else if(this.U instanceof net.n1.a) {
         in var6 = new in(this.U, 67, 0);
         var6.x((int)(this.U.hf * 8000.0D));
         var6.E((int)(this.U.K * 8000.0D));
         var6.Q((int)(this.U.J * 8000.0D));
         return var6;
      } else if(this.U instanceof net.n1.s) {
         return new in(this.U, 62);
      } else if(this.U instanceof net.n1.j) {
         return new in(this.U, 79);
      } else if(this.U instanceof net.nm.k) {
         return new in(this.U, 50);
      } else if(this.U instanceof net.nm.j) {
         return new in(this.U, 51);
      } else if(this.U instanceof net.nm.v) {
         net.nm.v var5 = (net.nm.v)this.U;
         return new in(this.U, 70, net.y9.l.m(var5.t()));
      } else if(this.U instanceof net.nm.z) {
         return new in(this.U, 78);
      } else if(this.U instanceof net.nm.e) {
         net.nm.e var4 = (net.nm.e)this.U;
         return new in(this.U, 71, var4.uz.u(), var4.r());
      } else if(this.U instanceof o) {
         o var1 = (o)this.U;
         return new in(this.U, 77, 0, var1.r());
      } else if(this.U instanceof w) {
         return new in(this.U, 3);
      } else {
         throw new IllegalArgumentException("Don\'t know how to add " + this.U.getClass() + "!");
      }
   }

   public void u(net.r.h var1) {
      if(this.T.contains(var1)) {
         this.T.remove(var1);
         this.U.Q(var1);
         var1.O(this.U);
      }

   }

   public l L() {
      return this.U;
   }

   public void G(int var1) {
      this.B = var1;
   }

   public void e() {
      this.q = false;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
