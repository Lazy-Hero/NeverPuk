package net.q;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.cr.s;
import net.nn.j;
import net.q.d;
import net.q.k;
import net.q.m;
import net.q.o;
import net.q.y;
import net.v.c;
import net.y.u1;
import net.z.te;

public class a {
   private final List v = Lists.newArrayListWithCapacity(20);
   private y o;
   private final m N = new m();
   private j B;
   private final List l = Lists.newArrayList();
   private List c;
   private te W;
   private te p;
   private int E;
   private int Q;
   private c u;
   private s I;
   private o K;

   public a() {
      int var1 = 0;

      while(true) {
         this.v.add(new y());
         ++var1;
      }
   }

   public void c(j var1, int var2, int var3) {
      this.B = var1;
      this.u = var1.sf.m();

      for(int var4 = 0; var4 < this.v.size(); ++var4) {
         ((y)this.v.get(var4)).x(var2 + 11 + 25 * (var4 % 5), var3 + 31 + 25 * (var4 / 5));
      }

      this.W = new te(0, var2 + 93, var3 + 137, 12, 17, false);
      this.W.G(1, 208, 13, 18, d.y);
      this.p = new te(0, var2 + 38, var3 + 137, 12, 17, true);
      this.p.G(1, 208, 13, 18, d.y);
   }

   public void Y(d var1) {
      this.l.remove(var1);
      this.l.add(var1);
   }

   public void Q(List var1, boolean var2) {
      this.c = var1;
      this.E = (int)Math.ceil((double)var1.size() / 20.0D);
      if(this.E > this.Q) {
         ;
      }

      this.Q = 0;
      this.P();
   }

   private void P() {
      int var1 = 20 * this.Q;

      for(int var2 = 0; var2 < this.v.size(); ++var2) {
         y var3 = (y)this.v.get(var2);
         if(var1 + var2 < this.c.size()) {
            o var4 = (o)this.c.get(var1 + var2);
            var3.u(var4, this, this.u);
            var3.F = true;
         } else {
            var3.F = false;
         }
      }

      this.h();
   }

   private void h() {
      this.W.F = this.E > 1 && this.Q < this.E - 1;
      this.p.F = this.E > 1 && this.Q > 0;
   }

   public void R(int var1, int var2, int var3, int var4, float var5) {
      if(this.E > 1) {
         String var6 = this.Q + 1 + "/" + this.E;
         int var7 = this.B.sO.r(var6);
         this.B.sO.v(var6, (float)(var1 - var7 / 2 + 73), (float)(var2 + 141), -1);
      }

      u1.m();
      this.o = null;

      for(y var9 : this.v) {
         var9.Z(this.B, var3, var4, var5);
         if(var9.F && var9.Z()) {
            this.o = var9;
         }
      }

      this.p.Z(this.B, var3, var4, var5);
      this.W.Z(this.B, var3, var4, var5);
      this.N.K(var3, var4, var5);
   }

   public void o(int var1, int var2) {
      if(this.B.s5 != null && this.o != null && !this.N.m()) {
         this.B.s5.U(this.o.I(this.B.s5), var1, var2);
      }

   }

   @Nullable
   public s j() {
      return this.I;
   }

   @Nullable
   public o j() {
      return this.K;
   }

   public void l() {
      this.N.M(false);
   }

   public boolean Q(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      o.r();
      this.I = null;
      this.K = null;
      if(this.N.m()) {
         if(this.N.L(var1, var2, var3)) {
            this.I = this.N.m();
            this.K = this.N.B();
         }

         this.N.M(false);
         return true;
      } else if(this.W.X(this.B, var1, var2) && var3 == 0) {
         this.W.i(this.B.n());
         ++this.Q;
         this.P();
         return true;
      } else if(this.p.X(this.B, var1, var2) && var3 == 0) {
         this.p.i(this.B.n());
         --this.Q;
         this.P();
         return true;
      } else {
         Iterator var9 = this.v.iterator();
         if(var9.hasNext()) {
            y var10 = (y)var9.next();
            if(var10.X(this.B, var1, var2)) {
               var10.i(this.B.n());
               if(var3 == 0) {
                  this.I = var10.T();
                  this.K = var10.d();
               }

               if(!this.N.m() && !var10.G()) {
                  this.N.t(this.B, var10.d(), var10.D, var10.R, var4 + var6 / 2, var5 + 13 + var7 / 2, (float)var10.h(), this.u);
               }

               return true;
            }
         }

         if(net.u.d.y() == null) {
            o.x(new String[5]);
         }

         return false;
      }
   }

   public void G(List var1) {
      for(k var3 : this.l) {
         var3.a(var1);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
