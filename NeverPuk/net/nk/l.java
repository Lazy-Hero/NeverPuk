package net.nk;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.nk.n;
import net.no.i1;
import net.yz.m_;

public class l extends net.nk.z {
   public l(net.yv.r var1) {
      super(var1);
      this.S(this.h9 * 2.35F, this.m * 2.35F);
      this.gz();
      if(this.U_ != null) {
         this.U_.d(400);
      }

   }

   protected void W() {
      super.W();
      this.t(net.ne.d.G).t(0.30000001192092896D);
      this.t(net.ne.d.S).t(8.0D);
      this.t(net.ne.d.C).t(80.0D);
   }

   public static void N(net.c0.d var0) {
      net.ne.y.J(var0, l.class);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.T;
   }

   public int X() {
      return 60;
   }

   public void H() {
      this.Uq = 1.0F;
      this.Uv = this.Uq;
   }

   protected net.yz.a T() {
      return this.p()?net.nb.l.Ks:net.nb.l.K0;
   }

   protected net.yz.a m(net.yz.z var1) {
      return this.p()?net.nb.l.Cp:net.nb.l.PK;
   }

   protected net.yz.a r() {
      return this.p()?net.nb.l.wt:net.nb.l.K7;
   }

   protected net.yz.a A() {
      return net.nb.l.K2;
   }

   protected void T() {
      n.o.y();
      super.T();
      boolean var10000 = true;
      if((this.x + this.G()) % 1200 == 0) {
         net.n_.f var3 = net.nb.b.o;
         List var4 = this.hl.R(net.r.h.class, new Predicate() {
            public boolean g(@Nullable net.r.h var1) {
               net.u.d[] var2 = n.o.y();
               return Double.compare(l.this.F(var1), 2500.0D) < 0 && var1.tA.I();
            }

            private static xn a(xn var0) {
               return var0;
            }
         });
         var10000 = true;
         var10000 = true;
         var10000 = true;
         Iterator var8 = var4.iterator();
         if(var8.hasNext()) {
            net.r.h var9 = (net.r.h)var8.next();
            if(!var9.J(var3) || var9.b((net.n_.f)var3).d() < 2 || var9.b((net.n_.f)var3).S() < 1200) {
               var9.t1.h((net.n2.k)(new i1(10, 0.0F)));
               var9.o(new net.n_.i(var3, 6000, 2));
            }
         }
      }

      if(!this.DM()) {
         this.y(new net.u.j(this), 16);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
