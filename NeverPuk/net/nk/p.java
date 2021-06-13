package net.nk;

import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.kw;
import net.nk.b;
import net.nk.n;
import net.nk.t;
import net.y_.o8;
import net.y_.of;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.yz.m_;

public class p extends n {
   private net.yn.b l6;

   public p(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 1.95F);
      this.p0 = 10;
   }

   protected void D() {
      n.o.y();
      super.D();
      this.p_.X(0, new op(this));
      this.p_.X(1, new p.b());
      this.p_.X(2, new net.y_.n(this, net.r.r.class, 8.0F, 0.6D, 1.0D));
      this.p_.X(4, new p.l());
      this.p_.X(5, new p.q());
      this.p_.X(6, new p.f());
      this.p_.X(8, new of(this, 0.6D));
      this.p_.X(9, new ok(this, net.r.r.class, 3.0F, 1.0F));
      this.p_.X(10, new ok(this, net.ne.y.class, 8.0F));
      this.pM.X(1, new oo(this, true, new Class[]{p.class}));
      this.pM.X(2, (new o8(this, net.r.r.class, true)).g(300));
      this.pM.X(3, (new o8(this, net.yn.s.class, false)).g(300));
      this.pM.X(3, new o8(this, b.class, false));
      net.u.d.h(new net.u.d[3]);
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.G).t(0.5D);
      this.t(net.ne.d.L).t(12.0D);
      this.t(net.ne.d.C).t(24.0D);
   }

   protected void g() {
      super.g();
   }

   public static void d(net.c0.d var0) {
      net.ne.y.J(var0, p.class);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
   }

   protected m_ N() {
      return net.y7.p.M;
   }

   protected void T() {
      super.T();
   }

   public void A() {
      super.A();
   }

   public boolean M(net.ne.l var1) {
      net.u.d[] var2 = n.o.y();
      return var1 == null?false:(var1 == this?true:(super.M(var1)?true:(var1 instanceof t?this.M(((t)var1).c()):(var1 instanceof net.ne.a && ((net.ne.a)var1).g() == net.ne.u.ILLAGER?this.f() == null && var1.f() == null:false))));
   }

   protected net.yz.a T() {
      return net.nb.l.ws;
   }

   protected net.yz.a r() {
      return net.nb.l.DS;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.MX;
   }

   private void i(@Nullable net.yn.b var1) {
      this.l6 = var1;
   }

   @Nullable
   private net.yn.b V() {
      return this.l6;
   }

   protected net.yz.a d() {
      return net.nb.l.PT;
   }

   private static xn e(xn var0) {
      return var0;
   }

   class b extends n.h {
      private b() {
         super();
      }

      public void E() {
         net.u.d[] var1 = n.o.y();
         if(p.this.M() != null) {
            p.this.E().n(p.this.M(), (float)p.this.v(), (float)p.this.w());
         }

         if(p.this.V() != null) {
            p.this.E().n(p.this.V(), (float)p.this.v(), (float)p.this.w());
         }

      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   public class f extends n.o {
      final Predicate q = new Predicate() {
         public boolean W(net.yn.b var1) {
            return var1.n() == kw.BLUE;
         }

         private static xn a(xn var0) {
            return var0;
         }
      };

      public f() {
         super();
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         if(p.this.M() != null) {
            return false;
         } else if(p.this.k8()) {
            return false;
         } else if(p.this.x < this.r) {
            return false;
         } else if(!p.this.hl.N().b("mobGriefing")) {
            return false;
         } else {
            List var2 = p.this.hl.L(net.yn.b.class, p.this.i().f(16.0D, 4.0D, 16.0D), this.q);
            if(var2.isEmpty()) {
               return false;
            } else {
               p.this.i((net.yn.b)var2.get(p.this.p.nextInt(var2.size())));
               return true;
            }
         }
      }

      public boolean X() {
         return p.this.V() != null && this.x > 0;
      }

      public void C() {
         super.C();
         p.this.i((net.yn.b)null);
      }

      protected void Q() {
         net.yn.b var1 = p.this.V();
         if(var1.P()) {
            var1.S(kw.RED);
         }

      }

      protected int g() {
         return 40;
      }

      protected int h() {
         return 60;
      }

      protected int T() {
         return 140;
      }

      protected net.yz.a H() {
         return net.nb.l.DE;
      }

      protected n.a K() {
         return n.a.WOLOLO;
      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   class l extends n.o {
      private l() {
         super();
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         if(!super.f()) {
            return false;
         } else {
            int var2 = p.this.hl.p(t.class, p.this.i().x(16.0D)).size();
            return p.this.p.nextInt(8) + 1 > var2;
         }
      }

      protected int h() {
         return 100;
      }

      protected int T() {
         return 340;
      }

      protected void Q() {
         n.o.y();
         int var2 = 0;
         net.u.j var3 = (new net.u.j(p.this)).F(-2 + p.this.p.nextInt(5), 1, -2 + p.this.p.nextInt(5));
         t var4 = new t(p.this.hl);
         var4.L(var3, 0.0F, 0.0F);
         var4.t(p.this.hl.G(var3), (net.ne.g)null);
         var4.T((net.ne.y)p.this);
         var4.f(var3);
         var4.f(20 * (30 + p.this.p.nextInt(90)));
         p.this.hl.S(var4);
         ++var2;
      }

      protected net.yz.a H() {
         return net.nb.l.PM;
      }

      protected n.a K() {
         return n.a.SUMMON_VEX;
      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   class q extends n.o {
      private q() {
         super();
      }

      protected int h() {
         return 40;
      }

      protected int T() {
         return 100;
      }

      protected void Q() {
         net.ne.a var2 = p.this.M();
         double var3 = Math.min(var2.hS, p.this.hS);
         double var5 = Math.max(var2.hS, p.this.hS) + 1.0D;
         n.o.y();
         float var7 = (float)net.u.t.V(var2.hr - p.this.hr, var2.b - p.this.b);
         if(Double.compare(p.this.F(var2), 9.0D) < 0) {
            int var8 = 0;
            float var9 = var7 + (float)var8 * 3.1415927F * 0.4F;
            this.r(p.this.b + (double)net.u.t.m(var9) * 1.5D, p.this.hr + (double)net.u.t.A(var9) * 1.5D, var3, var5, var9, 0);
            ++var8;
            var8 = 0;
            var9 = var7 + (float)var8 * 3.1415927F * 2.0F / 8.0F + 1.2566371F;
            this.r(p.this.b + (double)net.u.t.m(var9) * 2.5D, p.this.hr + (double)net.u.t.A(var9) * 2.5D, var3, var5, var9, 3);
            ++var8;
         }

         int var15 = 0;
         double var18 = 1.25D * (double)(var15 + 1);
         int var11 = 1 * var15;
         this.r(p.this.b + (double)net.u.t.m(var7) * var18, p.this.hr + (double)net.u.t.A(var7) * var18, var3, var5, var7, var11);
         ++var15;
      }

      private void r(double var1, double var3, double var5, double var7, float var9, int var10) {
         net.u.j var11 = new net.u.j(var1, var7, var3);
         boolean var12 = false;
         double var13 = 0.0D;

         while(true) {
            if(!p.this.hl.E(var11, true) && p.this.hl.E(var11.b(), true)) {
               if(!p.this.hl.y(var11)) {
                  net.yw.n var15 = p.this.hl.Z(var11);
                  net.u.e var16 = var15.D(p.this.hl, var11);
                  var13 = var16.c;
               }

               var12 = true;
               break;
            }

            var11 = var11.b();
            if(var11.h() < net.u.t.L(var5) - 1) {
               break;
            }
         }

         net.n1.j var18 = new net.n1.j(p.this.hl, var1, (double)var11.h() + var13, var3, var9, var10, p.this);
         p.this.hl.S(var18);
      }

      protected net.yz.a H() {
         return net.nb.l.q;
      }

      protected n.a K() {
         return n.a.FANGS;
      }

      private static xn c(xn var0) {
         return var0;
      }
   }
}
