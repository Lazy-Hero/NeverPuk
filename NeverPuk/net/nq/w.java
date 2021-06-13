package net.nq;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.cg.h;
import net.nj.f;
import net.nq.c;
import net.nq.d;
import net.nq.x;
import net.u.j;
import net.y9.l;
import net.y9.r9;
import net.yv.r;
import net.yw.n;
import net.yz.aq;

public class w extends h {
   private r H;
   private final List e = Lists.newArrayList();
   private final List a = Lists.newArrayList();
   private final List c = Lists.newArrayList();
   private int y;

   public w(String var1) {
      super(var1);
   }

   public w(r var1) {
      super(j(var1.F));
      this.H = var1;
      this.f();
   }

   public void e(r var1) {
      this.H = var1;

      for(d var3 : this.c) {
         var3.H(var1);
      }

   }

   public void M(j var1) {
      if(this.e.size() <= 64 && !this.x(var1)) {
         this.e.add(var1);
      }

   }

   public void N() {
      ++this.y;

      for(d var2 : this.c) {
         var2.N(this.y);
      }

      this.x();
      this.C();
      this.p();
      if(this.y % 400 == 0) {
         this.f();
      }

   }

   private void x() {
      Iterator var1 = this.c.iterator();

      while(var1.hasNext()) {
         d var2 = (d)var1.next();
         if(var2.P()) {
            var1.remove();
            this.f();
         }
      }

   }

   public List M() {
      return this.c;
   }

   public d s(j var1, int var2) {
      d var3 = null;
      double var4 = 3.4028234663852886E38D;

      for(d var7 : this.c) {
         double var8 = var7.w().n(var1);
         if(var8 < var4) {
            float var10 = (float)(var2 + var7.T());
            if(var8 <= (double)(var10 * var10)) {
               var3 = var7;
               var4 = var8;
            }
         }
      }

      return var3;
   }

   private void C() {
      if(!this.e.isEmpty()) {
         this.g((j)this.e.remove(0));
      }

   }

   private void p() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         c var2 = (c)this.a.get(var1);
         d var3 = this.s(var2.a(), 32);
         var3 = new d(this.H);
         this.c.add(var3);
         this.f();
         var3.j(var2);
      }

      this.a.clear();
   }

   private void g(j var1) {
      boolean var10000 = true;
      var10000 = true;
      var10000 = true;
      byte var5 = -16;
      byte var6 = -4;
      int var7 = -16;

      while(true) {
         j var8 = var1.F(var5, var6, var7);
         if(this.h(var8)) {
            c var9 = this.e(var8);
            this.u(var8);
         }

         ++var7;
      }
   }

   @Nullable
   private c e(j var1) {
      x.R();
      Iterator var3 = this.a.iterator();
      if(var3.hasNext()) {
         c var4 = (c)var3.next();
         if(var4.a().t() == var1.t() && var4.a().y() == var1.y() && Math.abs(var4.a().h() - var1.h()) <= 1) {
            return var4;
         }
      }

      var3 = this.c.iterator();
      if(var3.hasNext()) {
         d var7 = (d)var3.next();
         c var5 = var7.C(var1);
         if(var5 != null) {
            return var5;
         }
      }

      return null;
   }

   private void u(j var1) {
      aq var2 = r9.n(this.H, var1);
      aq var3 = var2.f();
      int var4 = this.h(var1, var2, 5);
      int var5 = this.h(var1, var3, var4 + 1);
      if(var4 != var5) {
         this.a.add(new c(var1, var4 < var5?var2:var3, this.y));
      }

   }

   private int h(j var1, aq var2, int var3) {
      int var4 = 0;
      int var5 = 1;

      while(true) {
         if(this.H.V(var1.a(var2, var5))) {
            ++var4;
            if(var4 >= var3) {
               return var4;
            }
         }

         ++var5;
      }
   }

   private boolean x(j var1) {
      for(j var3 : this.e) {
         if(var3.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   private boolean h(j var1) {
      n var2 = this.H.Z(var1);
      l var3 = var2.Q();
      return var3 instanceof r9?var2.n() == net.y1.l.S:false;
   }

   public void I(f var1) {
      this.y = var1.P("Tick");
      net.nj.h var2 = var1.A("Villages", 10);

      for(int var3 = 0; var3 < var2.z(); ++var3) {
         f var4 = var2.i(var3);
         d var5 = new d();
         var5.r(var4);
         this.c.add(var5);
      }

   }

   public f v(f var1) {
      var1.r("Tick", this.y);
      net.nj.h var2 = new net.nj.h();

      for(d var4 : this.c) {
         f var5 = new f();
         var4.A(var5);
         var2.m(var5);
      }

      var1.K("Villages", var2);
      return var1;
   }

   public static String j(net.yv.c var0) {
      return "villages" + var0.L().E();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
