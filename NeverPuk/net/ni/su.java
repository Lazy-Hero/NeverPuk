package net.ni;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.ni.v;
import net.ni.w;
import net.y9.ra;
import net.y9.rj;
import net.yv.o8;
import net.yz.aq;

public class su extends v implements net.yz.i {
   private net.yw.n C;
   private aq j;
   private boolean c;
   private boolean e;
   private static final ThreadLocal x = new ThreadLocal() {
      protected aq I() {
         return null;
      }
   };
   private float s;
   private float t;

   public su() {
   }

   public su(net.yw.n var1, aq var2, boolean var3, boolean var4) {
      this.C = var1;
      this.j = var2;
      this.c = var3;
      this.e = var4;
   }

   public net.yw.n w() {
      return this.C;
   }

   public net.nj.f e() {
      return this.b(new net.nj.f());
   }

   public int B() {
      return 0;
   }

   public boolean l() {
      return this.c;
   }

   public aq z() {
      return this.j;
   }

   public boolean Z() {
      return this.e;
   }

   public float t(float var1) {
      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return this.t + (this.s - this.t) * var1;
   }

   public float Q(float var1) {
      return (float)this.j.v() * this.n(this.t(var1));
   }

   public float N(float var1) {
      return (float)this.j.z() * this.n(this.t(var1));
   }

   public float A(float var1) {
      return (float)this.j.P() * this.n(this.t(var1));
   }

   private float n(float var1) {
      return this.c?var1 - 1.0F:1.0F - var1;
   }

   public net.u.e a(o8 var1, net.u.j var2) {
      return this.J(var1, var2, this.s).Z(this.J(var1, var2, this.t));
   }

   public net.u.e J(o8 var1, net.u.j var2, float var3) {
      var3 = this.n(var3);
      net.yw.n var4 = this.a();
      return var4.q(var1, var2).w((double)(var3 * (float)this.j.v()), (double)(var3 * (float)this.j.z()), (double)(var3 * (float)this.j.P()));
   }

   private net.yw.n a() {
      return !this.l() && this.Z()?net.nb.f.dZ.p().s(rj.Y, this.C.Q() == net.nb.f.oG?rj.n.STICKY:rj.n.DEFAULT).s(rj.n, this.C.i(ra.n)):this.C;
   }

   private void h(float var1) {
      int[] var2 = w.C();
      aq var3 = this.c?this.j:this.j.f();
      double var4 = (double)(var1 - this.s);
      ArrayList var6 = Lists.newArrayList();
      this.a().T(this.J, net.u.j.V, new net.u.e(net.u.j.V), var6, (net.ne.l)null, true);
      if(!var6.isEmpty()) {
         net.u.e var7 = this.W(this.o(var6));
         List var8 = this.J.u((net.ne.l)null, this.C(var7, var3, var4).Z(var7));
         if(!var8.isEmpty()) {
            boolean var9 = this.C.Q() == net.nb.f.di;
            int var10 = 0;
            if(var10 < var8.size()) {
               net.ne.l var11 = (net.ne.l)var8.get(var10);
               if(var11.J() != net.y1.v.IGNORE) {
                  double var12 = 0.0D;
                  int var14 = 0;
                  if(var14 < var6.size()) {
                     net.u.e var15 = this.C(this.W((net.u.e)var6.get(var14)), var3, var4);
                     net.u.e var16 = var11.i();
                     if(var15.O(var16)) {
                        var12 = Math.max(var12, this.A(var15, var3, var16));
                        if(var12 >= var4) {
                           ;
                        }
                     }

                     ++var14;
                  }

                  Double.compare(var12, 0.0D);
               }

               ++var10;
            }
         }
      }

   }

   private net.u.e o(List var1) {
      double var2 = 0.0D;
      double var4 = 0.0D;
      double var6 = 0.0D;
      double var8 = 1.0D;
      double var10 = 1.0D;
      double var12 = 1.0D;

      for(net.u.e var15 : var1) {
         var2 = Math.min(var15.n, var2);
         var4 = Math.min(var15.u, var4);
         var6 = Math.min(var15.N, var6);
         var8 = Math.max(var15.d, var8);
         var10 = Math.max(var15.c, var10);
         var12 = Math.max(var15.r, var12);
      }

      return new net.u.e(var2, var4, var6, var8, var10, var12);
   }

   private double A(net.u.e var1, aq var2, net.u.e var3) {
      switch(null.D[var2.r().ordinal()]) {
      case 1:
         return O(var1, var2, var3);
      case 2:
      default:
         return Y(var1, var2, var3);
      case 3:
         return K(var1, var2, var3);
      }
   }

   private net.u.e W(net.u.e var1) {
      double var2 = (double)this.n(this.s);
      return var1.w((double)this.S.t() + var2 * (double)this.j.v(), (double)this.S.h() + var2 * (double)this.j.z(), (double)this.S.y() + var2 * (double)this.j.P());
   }

   private net.u.e C(net.u.e var1, aq var2, double var3) {
      double var5 = var3 * (double)var2.i().q();
      double var7 = Math.min(var5, 0.0D);
      double var9 = Math.max(var5, 0.0D);
      switch(null.L[var2.ordinal()]) {
      case 1:
         return new net.u.e(var1.n + var7, var1.u, var1.N, var1.n + var9, var1.c, var1.r);
      case 2:
         return new net.u.e(var1.d + var7, var1.u, var1.N, var1.d + var9, var1.c, var1.r);
      case 3:
         return new net.u.e(var1.n, var1.u + var7, var1.N, var1.d, var1.u + var9, var1.r);
      case 4:
      default:
         return new net.u.e(var1.n, var1.c + var7, var1.N, var1.d, var1.c + var9, var1.r);
      case 5:
         return new net.u.e(var1.n, var1.u, var1.N + var7, var1.d, var1.c, var1.N + var9);
      case 6:
         return new net.u.e(var1.n, var1.u, var1.r + var7, var1.d, var1.c, var1.r + var9);
      }
   }

   private void F(net.ne.l var1, aq var2, double var3) {
      net.u.e var5 = var1.i();
      net.u.e var6 = net.y9.l.I.c(this.S);
      if(var5.O(var6)) {
         aq var7 = var2.f();
         double var8 = this.A(var6, var7, var5) + 0.01D;
         double var10 = this.A(var6, var7, var5.c(var6)) + 0.01D;
         if(Math.abs(var8 - var10) < 0.01D) {
            var8 = Math.min(var8, var3) + 0.01D;
            x.set(var2);
            var1.N(net.ne.f.PISTON, var8 * (double)var7.v(), var8 * (double)var7.z(), var8 * (double)var7.P());
            x.set((Object)null);
         }
      }

   }

   private static double O(net.u.e var0, aq var1, net.u.e var2) {
      return var1.i() == aq.n.POSITIVE?var0.d - var2.n:var2.d - var0.n;
   }

   private static double Y(net.u.e var0, aq var1, net.u.e var2) {
      return var1.i() == aq.n.POSITIVE?var0.c - var2.u:var2.c - var0.u;
   }

   private static double K(net.u.e var0, aq var1, net.u.e var2) {
      return var1.i() == aq.n.POSITIVE?var0.r - var2.N:var2.r - var0.N;
   }

   public void u() {
      if(this.t < 1.0F && this.J != null) {
         this.s = 1.0F;
         this.t = this.s;
         this.J.j(this.S);
         this.Z();
         if(this.J.Z(this.S).Q() == net.nb.f.dK) {
            this.J.k(this.S, this.C, 3);
            this.J.H(this.S, this.C.Q(), this.S);
         }
      }

   }

   public void m() {
      this.t = this.s;
      if(this.t >= 1.0F) {
         this.J.j(this.S);
         this.Z();
         if(this.J.Z(this.S).Q() == net.nb.f.dK) {
            this.J.k(this.S, this.C, 3);
            this.J.H(this.S, this.C.Q(), this.S);
         }
      } else {
         float var1 = this.s + 0.5F;
         this.h(var1);
         this.s = var1;
         if(this.s >= 1.0F) {
            this.s = 1.0F;
         }
      }

   }

   public static void h(net.c0.d var0) {
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.C = net.y9.l.I(var1.P("blockId")).D(var1.P("blockData"));
      this.j = aq.l(var1.P("facing"));
      this.s = var1.S("progress");
      this.t = this.s;
      this.c = var1.i("extending");
      this.e = var1.i("source");
   }

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.r("blockId", net.y9.l.h(this.C.Q()));
      var1.r("blockData", this.C.Q().d(this.C));
      var1.r("facing", this.j.w());
      var1.d("progress", this.t);
      var1.c("extending", this.c);
      var1.c("source", this.e);
      return var1;
   }

   public void c(net.yv.r var1, net.u.j var2, net.u.e var3, List var4, @Nullable net.ne.l var5) {
      if(!this.c && this.e) {
         this.C.s(ra.o, Boolean.valueOf(true)).T(var1, var2, var3, var4, var5, false);
      }

      aq var6 = (aq)x.get();
      if((double)this.s >= 1.0D || var6 != (this.c?this.j:this.j.f())) {
         int var7 = var4.size();
         net.yw.n var8;
         if(this.Z()) {
            var8 = net.nb.f.dZ.p().s(rj.n, this.j).s(rj.Q, Boolean.valueOf(this.c != 1.0F - this.s < 0.25F));
         } else {
            var8 = this.C;
         }

         float var9 = this.n(this.s);
         double var10 = (double)((float)this.j.v() * var9);
         double var12 = (double)((float)this.j.z() * var9);
         double var14 = (double)((float)this.j.P() * var9);
         var8.T(var1, var2, var3.w(-var10, -var12, -var14), var4, var5, true);

         for(int var16 = var7; var16 < var4.size(); ++var16) {
            var4.set(var16, ((net.u.e)var4.get(var16)).w(var10, var12, var14));
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
