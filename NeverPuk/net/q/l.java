package net.q;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.cr.s;
import net.n0.ks;
import net.nn.j;
import net.q.o;
import net.y.t;
import net.y.u1;
import net.z.g;
import net.z.tu;

public class l {
   private s T;
   private final List L = Lists.newArrayList();
   private float t;

   public void d() {
      this.T = null;
      this.L.clear();
      this.t = 0.0F;
   }

   public void u(net.cr.l var1, int var2, int var3) {
      this.L.add(new l.d(var1, var2, var3));
   }

   public l.d o(int var1) {
      return (l.d)this.L.get(var1);
   }

   public int u() {
      return this.L.size();
   }

   @Nullable
   public s W() {
      return this.T;
   }

   public void P(s var1) {
      this.T = var1;
   }

   public void H(j var1, int var2, int var3, boolean var4, float var5) {
      String[] var6 = o.r();
      if(!tu.T()) {
         this.t += var5;
      }

      u1.A();
      net.y.d.i();
      int var7 = 0;
      if(var7 < this.L.size()) {
         l.d var8 = (l.d)this.L.get(var7);
         int var9 = var8.m() + var2;
         int var10 = var8.N() + var3;
         if(var4) {
            g.u(var9 - 4, var10 - 4, var9 + 20, var10 + 20, 822018048);
         }

         g.u(var9, var10, var9 + 16, var10 + 16, 822018048);
         net.y.d.i();
         ks var11 = var8.L();
         t var12 = var1.K();
         var12.g(var1.sf, var11, var9, var10);
         net.y.d.n(516);
         g.u(var9, var10, var9 + 16, var10 + 16, 822083583);
         net.y.d.n(515);
         var12.q(var1.sO, var11, var9, var10);
         net.y.d.K();
         ++var7;
      }

      u1.m();
   }

   private static xn a(xn var0) {
      return var0;
   }

   public class d {
      private final net.cr.l B;
      private final int n;
      private final int c;

      public d(net.cr.l var2, int var3, int var4) {
         this.B = var2;
         this.n = var3;
         this.c = var4;
      }

      public int m() {
         return this.n;
      }

      public int N() {
         return this.c;
      }

      public ks L() {
         ks[] var1 = this.B.x();
         return var1[net.u.t.M(l.this.t / 30.0F) % var1.length];
      }
   }
}
