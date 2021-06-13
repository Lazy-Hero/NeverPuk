package net.nm;

import com.google.common.base.Optional;
import javax.annotation.Nullable;
import net.xn;
import net.k.y;
import net.nm.w;

public class j extends net.ne.l {
   private static final net.k.v a9 = net.k.n.q(j.class, y.I);
   private static final net.k.v ab = net.k.n.q(j.class, y.f);
   public int ad;

   public j(net.yv.r var1) {
      super(var1);
      this.a = true;
      this.S(2.0F, 2.0F);
      this.ad = this.p.nextInt(100000);
   }

   public j(net.yv.r var1, double var2, double var4, double var6) {
      this(var1);
      this.t(var2, var4, var6);
   }

   protected boolean k() {
      return false;
   }

   protected void g() {
      this.A().r(a9, Optional.absent());
      this.A().r(ab, Boolean.valueOf(true));
   }

   public void A() {
      w.h.u();
      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      ++this.ad;
      if(!this.hl.x) {
         net.u.j var2 = new net.u.j(this);
         if(this.hl.F instanceof net.yv.k && this.hl.Z(var2).Q() != net.nb.f.g) {
            this.hl.U(var2, net.nb.f.g.p());
         }
      }

   }

   protected void I(net.nj.f var1) {
      if(this.u() != null) {
         var1.K("BeamTarget", net.nj.e.b(this.u()));
      }

      var1.c("ShowBottom", this.N());
   }

   protected void o(net.nj.f var1) {
      if(var1.K("BeamTarget", 10)) {
         this.x(net.nj.e.L(var1.o("BeamTarget")));
      }

      if(var1.K("ShowBottom", 1)) {
         this.a(var1.i("ShowBottom"));
      }

   }

   public boolean w() {
      return true;
   }

   public boolean H(net.yz.z var1, float var2) {
      boolean var3 = w.h.u();
      if(this.w(var1)) {
         return false;
      } else if(var1.v() instanceof net.a.t) {
         return false;
      } else {
         if(!this.Z && !this.hl.x) {
            this.B();
            if(!this.hl.x) {
               if(!var1.e()) {
                  this.hl.B((net.ne.l)null, this.b, this.hS, this.hr, 6.0F, true);
               }

               this.R(var1);
            }
         }

         return true;
      }
   }

   public void L() {
      this.R(net.yz.z.P);
      super.L();
   }

   private void R(net.yz.z var1) {
      if(this.hl.F instanceof net.yv.k) {
         net.yv.k var2 = (net.yv.k)this.hl.F;
         net.yd.y var3 = var2.C();
         var3.B(this, var1);
      }

   }

   public void x(@Nullable net.u.j var1) {
      this.A().d(a9, Optional.fromNullable(var1));
   }

   @Nullable
   public net.u.j u() {
      return (net.u.j)((Optional)this.A().a(a9)).orNull();
   }

   public void a(boolean var1) {
      this.A().d(ab, Boolean.valueOf(var1));
   }

   public boolean N() {
      return ((Boolean)this.A().a(ab)).booleanValue();
   }

   public boolean p(double var1) {
      return super.p(var1) || this.u() != null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
