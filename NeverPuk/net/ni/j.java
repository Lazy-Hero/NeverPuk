package net.ni;

import java.util.Random;
import net.xn;
import net.ni.v;
import net.ni.w;

public class j extends v implements net.yz.i, net.yv.z {
   public int F;
   public float y;
   public float Y;
   public float V;
   public float b;
   public float A;
   public float T;
   public float M;
   public float r;
   public float K;
   private static final Random m = new Random();
   private String w;

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      if(this.H()) {
         var1.b("CustomName", this.w);
      }

      return var1;
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      if(var1.K("CustomName", 8)) {
         this.w = var1.J("CustomName");
      }

   }

   public void m() {
      this.T = this.A;
      this.r = this.M;
      w.C();
      net.r.r var2 = this.J.d((double)((float)this.S.t() + 0.5F), (double)((float)this.S.h() + 0.5F), (double)((float)this.S.y() + 0.5F), 3.0D, false);
      double var3 = var2.b - (double)((float)this.S.t() + 0.5F);
      double var5 = var2.hr - (double)((float)this.S.y() + 0.5F);
      this.K = (float)net.u.t.V(var5, var3);
      this.A += 0.1F;
      if(this.A < 0.5F || m.nextInt(40) == 0) {
         float var7 = this.V;

         while(true) {
            this.V += (float)(m.nextInt(4) - m.nextInt(4));
            if(var7 != this.V) {
               break;
            }
         }
      }

      net.u.d.h(new net.u.d[1]);
      this.K += 0.02F;
      this.A -= 0.1F;
      if(this.M >= 3.1415927F) {
         this.M -= 6.2831855F;
      }

      if(this.M < -3.1415927F) {
         this.M += 6.2831855F;
      }

      if(this.K >= 3.1415927F) {
         this.K -= 6.2831855F;
      }

      if(this.K < -3.1415927F) {
         this.K += 6.2831855F;
      }

      float var8 = this.K - this.M;
      if(var8 >= 3.1415927F) {
         var8 -= 6.2831855F;
      }

      if(var8 < -3.1415927F) {
         var8 += 6.2831855F;
      }

      this.M += var8 * 0.4F;
      this.A = net.u.t.T(this.A, 0.0F, 1.0F);
      ++this.F;
      this.Y = this.y;
      float var4 = (this.V - this.y) * 0.4F;
      float var10 = 0.2F;
      var4 = net.u.t.T(var4, -0.2F, 0.2F);
      this.b += (var4 - this.b) * 0.9F;
      this.y += this.b;
   }

   public String Q() {
      return this.H()?this.w:"container.enchant";
   }

   public boolean H() {
      return this.w != null && !this.w.isEmpty();
   }

   public void O(String var1) {
      this.w = var1;
   }

   public net.cb.t b() {
      return (net.cb.t)(this.H()?new net.cb.l(this.Q()):new net.cb.h(this.Q(), new Object[0]));
   }

   public net.nl.v A(net.r.i var1, net.r.r var2) {
      return new net.nl.l(var1, this.J, this.S);
   }

   public String H() {
      return "minecraft:enchanting_table";
   }

   private static xn a(xn var0) {
      return var0;
   }
}
