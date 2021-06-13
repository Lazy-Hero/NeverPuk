package net.yv;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import net.xn;
import net.no.sj;
import net.yv.of;
import net.yv.r;

public class o6 extends of {
   private final Set J = Sets.newHashSet();
   private final Set U;
   private boolean d;

   public o6(net.cb.t var1, of.y var2, of.f var3) {
      super(net.u.t.C(), var1, var2, var3);
      this.U = Collections.unmodifiableSet(this.J);
      this.d = true;
   }

   public void n(float var1) {
      if(var1 != this.w) {
         super.n(var1);
         this.F(sj.k.UPDATE_PCT);
      }

   }

   public void A(of.y var1) {
      if(var1 != this.r) {
         super.A(var1);
         this.F(sj.k.UPDATE_STYLE);
      }

   }

   public void Y(of.f var1) {
      if(var1 != this.g) {
         super.Y(var1);
         this.F(sj.k.UPDATE_STYLE);
      }

   }

   public of u(boolean var1) {
      if(var1 != this.G) {
         super.u(var1);
         this.F(sj.k.UPDATE_PROPERTIES);
      }

      return this;
   }

   public of O(boolean var1) {
      if(var1 != this.K) {
         super.O(var1);
         this.F(sj.k.UPDATE_PROPERTIES);
      }

      return this;
   }

   public of C(boolean var1) {
      if(var1 != this.R) {
         super.C(var1);
         this.F(sj.k.UPDATE_PROPERTIES);
      }

      return this;
   }

   public void T(net.cb.t var1) {
      if(!Objects.equal(var1, this.O)) {
         super.T(var1);
         this.F(sj.k.UPDATE_NAME);
      }

   }

   private void F(sj.k var1) {
      net.u.d[] var2 = r.C();
      if(this.d) {
         sj var3 = new sj(var1, this);
         Iterator var4 = this.J.iterator();
         if(var4.hasNext()) {
            net.r.h var5 = (net.r.h)var4.next();
            var5.t1.h((net.n2.k)var3);
         }
      }

   }

   public void k(net.r.h var1) {
      if(this.J.add(var1) && this.d) {
         var1.t1.h((net.n2.k)(new sj(sj.k.ADD, this)));
      }

   }

   public void a(net.r.h var1) {
      if(this.J.remove(var1) && this.d) {
         var1.t1.h((net.n2.k)(new sj(sj.k.REMOVE, this)));
      }

   }

   public void D(boolean var1) {
      net.u.d[] var2 = r.C();
      if(var1 != this.d) {
         this.d = var1;
         Iterator var3 = this.J.iterator();
         if(var3.hasNext()) {
            net.r.h var4 = (net.r.h)var3.next();
            var4.t1.h((net.n2.k)(new sj(sj.k.ADD, this)));
         }
      }

   }

   public Collection C() {
      return this.U;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
