package net.z;

import java.util.Arrays;
import net.xn;
import net.z.g;
import net.z.m;
import net.z.tu;
import net.z.tv;
import org.apache.commons.lang3.ArrayUtils;

public class e extends net.z.z {
   private final tv u;
   private final net.nn.j c;
   private final net.z.z[] z;
   private int M;

   public e(tv var1, net.nn.j var2) {
      super(var2, tu.q + 45, tu.V, 63, tu.V - 32, 20);
      g.B();
      this.u = var1;
      this.c = var2;
      net.nr.h[] var4 = (net.nr.h[])ArrayUtils.clone(var2.T.i);
      this.z = new net.z.z[var4.length + net.nr.h.U().size()];
      Arrays.sort(var4);
      int var5 = 0;
      Object var6 = null;
      int var8 = var4.length;
      int var9 = 0;
      if(var9 < var8) {
         net.nr.h var10 = var4[var9];
         String var11 = var10.X();
         if(!var11.equals(var6)) {
            this.z[var5++] = new e.y(var11);
         }

         int var12 = var2.sO.r(net.c9.b.x(var10.g(), new Object[0]));
         if(var12 > this.M) {
            this.M = var12;
         }

         this.z[var5++] = new e.r(var10);
         ++var9;
      }

   }

   protected int V() {
      return this.z.length;
   }

   public net.z.z m(int var1) {
      return this.z[var1];
   }

   protected int I() {
      return super.I() + 15;
   }

   public int C() {
      return super.C() + 32;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public class r implements net.z.z {
      private final net.nr.h b;
      private final String q;
      private final m u;
      private final m r;

      private r(net.nr.h var2) {
         this.b = var2;
         this.q = net.c9.b.x(var2.g(), new Object[0]);
         this.u = new m(0, 0, 0, 75, 20, net.c9.b.x(var2.g(), new Object[0]));
         this.r = new m(0, 0, 0, 50, 20, net.c9.b.x("controls.reset", new Object[0]));
      }

      public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
         boolean var10 = g.B();
         boolean var11 = e.this.u.R == this.b;
         e.this.c.sO.v(this.q, (float)(var2 + 90 - e.this.M), (float)(var3 + var5 / 2 - e.this.c.sO.R / 2), 16777215);
         this.r.D = var2 + 190;
         this.r.R = var3;
         this.r.O = this.b.m() != this.b.a();
         this.r.Z(e.this.c, var6, var7, var9);
         this.u.D = var2 + 105;
         this.u.R = var3;
         this.u.J = net.nr.d.y(this.b.m());
         boolean var12 = false;
         if(this.b.m() != 0) {
            net.nr.h[] var13 = e.this.c.T.i;
            int var14 = var13.length;
            int var15 = 0;
            if(var15 < var14) {
               net.nr.h var16 = var13[var15];
               if(var16 != this.b && var16.m() == this.b.m()) {
                  var12 = true;
               }

               ++var15;
            }
         }

         this.u.Z(e.this.c, var6, var7, var9);
      }

      public boolean i(int var1, int var2, int var3, int var4, int var5, int var6) {
         if(this.u.X(e.this.c, var2, var3)) {
            e.this.u.R = this.b;
            return true;
         } else if(this.r.X(e.this.c, var2, var3)) {
            e.this.c.T.F(this.b, this.b.a());
            net.nr.h.G();
            return true;
         } else {
            return false;
         }
      }

      public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
         this.u.A(var2, var3);
         this.r.A(var2, var3);
      }

      public void h(int var1, int var2, int var3, float var4) {
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public class y implements net.z.z {
      private final String i;
      private final int k;

      public y(String var2) {
         this.i = net.c9.b.x(var2, new Object[0]);
         this.k = e.this.c.sO.r(this.i);
      }

      public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
         e.this.c.sO.v(this.i, (float)(tu.q / 2 - this.k / 2), (float)(var3 + var5 - e.this.c.sO.R - 1), 16777215);
      }

      public boolean i(int var1, int var2, int var3, int var4, int var5, int var6) {
         return false;
      }

      public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
      }

      public void h(int var1, int var2, int var3, float var4) {
      }
   }
}
