package net.n1;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.c0.d;
import net.k.n;
import net.k.v;
import net.n0.ks;
import net.n1.o;
import net.n1.p;
import net.n_.i;
import net.u.e;
import net.yv.r;
import net.yz.aq;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class g extends p {
   private static final v dy = n.q(g.class, net.k.y.k);
   private static final Logger dd = LogManager.getLogger();
   public static final Predicate d4 = new Predicate() {
      public boolean u(@Nullable net.ne.a var1) {
         return g.J(var1);
      }
   };

   public g(r var1) {
      super(var1);
   }

   public g(r var1, net.ne.a var2, ks var3) {
      super(var1, var2);
      this.f(var3);
   }

   public g(r var1, double var2, double var4, double var6, ks var8) {
      super(var1, var2, var4, var6);
      if(!var8.B()) {
         this.f(var8);
      }

   }

   protected void g() {
      this.A().r(dy, ks.a);
   }

   public ks i() {
      ks var1 = (ks)this.A().a(dy);
      if(var1.Z() != net.nb.j.YD && var1.Z() != net.nb.j.Wg) {
         if(this.hl != null) {
            dd.error("ThrownPotion entity {} has no item?!", Integer.valueOf(this.G()));
         }

         return new ks(net.nb.j.YD);
      } else {
         return var1;
      }
   }

   public void f(ks var1) {
      this.A().d(dy, var1);
      this.A().r(dy);
   }

   protected float v() {
      return 0.05F;
   }

   protected void I(net.u.m var1) {
      if(!this.hl.x) {
         ks var2 = this.i();
         net.n_.b var3 = net.n_.y.h(var2);
         List var4 = net.n_.y.y(var2);
         boolean var5 = var3 == net.nb.w.d && var4.isEmpty();
         if(var1.v == net.u.m.BLOCK) {
            net.u.j var6 = var1.j().C(var1.d);
            this.A(var6, var1.d);

            for(aq var8 : aq.u.HORIZONTAL) {
               this.A(var6.C(var8), var8);
            }
         }

         this.d();
         int var9 = var3.F()?2007:2002;
         this.hl.s(var9, new net.u.j(this), net.n_.y.N(var2));
         this.B();
      }

   }

   private void d() {
      e var1 = this.i().f(4.0D, 2.0D, 4.0D);
      List var2 = this.hl.L(net.ne.a.class, var1, d4);
      if(!var2.isEmpty()) {
         for(net.ne.a var4 : var2) {
            double var5 = this.F(var4);
            if(var5 < 16.0D && J(var4)) {
               var4.H(net.yz.z.N, 1.0F);
            }
         }
      }

   }

   private void y(net.u.m var1, List var2) {
      e var4 = this.i().f(4.0D, 2.0D, 4.0D);
      o.s.H();
      List var5 = this.hl.p(net.ne.a.class, var4);
      if(!var5.isEmpty()) {
         Iterator var6 = var5.iterator();
         if(var6.hasNext()) {
            net.ne.a var7 = (net.ne.a)var6.next();
            if(var7.U()) {
               double var8 = this.F(var7);
               if(var8 < 16.0D) {
                  double var10 = 1.0D - Math.sqrt(var8) / 4.0D;
                  if(var7 == var1.e) {
                     var10 = 1.0D;
                  }

                  Iterator var12 = var2.iterator();
                  if(var12.hasNext()) {
                     i var13 = (i)var12.next();
                     net.n_.f var14 = var13.i();
                     if(var14.u()) {
                        var14.C(this, this.D(), var7, var13.d(), var10);
                     }

                     int var15 = (int)(var10 * (double)var13.S() + 0.5D);
                     if(var15 > 20) {
                        var7.o(new i(var14, var15, var13.d(), var13.b(), var13.q()));
                     }
                  }
               }
            }
         }
      }

   }

   private void g(ks var1, net.n_.b var2) {
      net.ne.w var3 = new net.ne.w(this.hl, this.b, this.hS, this.hr);
      var3.L(this.D());
      var3.h(3.0F);
      var3.O(-0.5F);
      var3.N(10);
      var3.C(-var3.J() / (float)var3.c());
      var3.y(var2);

      for(i var5 : net.n_.y.Z(var1)) {
         var3.Y(new i(var5));
      }

      net.nj.f var6 = var1.o();
      if(var6.K("CustomPotionColor", 99)) {
         var3.Q(var6.P("CustomPotionColor"));
      }

      this.hl.S(var3);
   }

   private boolean K() {
      return this.i().Z() == net.nb.j.Wg;
   }

   private void A(net.u.j var1, aq var2) {
      if(this.hl.Z(var1).Q() == net.nb.f.g) {
         this.hl.Q((net.r.r)null, (net.u.j)var1.C(var2), var2.f());
      }

   }

   public static void b(d var0) {
      p.O(var0, "ThrownPotion");
      var0.U(net.c0.q.ENTITY, new net.ng.c(g.class, new String[]{"Potion"}));
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      ks var2 = new ks(var1.o("Potion"));
      if(var2.B()) {
         this.B();
      } else {
         this.f(var2);
      }

   }

   public void I(net.nj.f var1) {
      super.I(var1);
      ks var2 = this.i();
      if(!var2.B()) {
         var1.K("Potion", var2.Z(new net.nj.f()));
      }

   }

   private static boolean J(net.ne.a var0) {
      return var0 instanceof net.nk.u || var0 instanceof net.nk.x;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
