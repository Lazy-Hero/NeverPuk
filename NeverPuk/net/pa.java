package net;

import net.p_;
import net.py;
import net.uv;
import net.xn;
import net.nn.j;
import net.u.t;
import net.y.d;

public class pa extends py {
   private float q = 1.0F;
   public boolean M;
   private uv z = null;

   public pa(int var1, int var2, int var3, int var4, int var5, uv var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.z = var6;
      this.q = var6.v();
      this.J = p_.q(var6, this.s);
   }

   protected int O(boolean var1) {
      return 0;
   }

   protected void N(j var1, int var2, int var3) {
      int[] var4 = uv.l();
      if(this.F) {
         if(this.M) {
            this.q = (float)(var2 - (this.D + 4)) / (float)(this.s - 8);
            this.q = t.T(this.q, 0.0F, 1.0F);
            this.z.k(this.q);
            this.q = this.z.v();
            this.J = p_.q(this.z, this.s);
         }

         var1.n().E(b);
         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.g(this.D + (int)(this.q * (float)(this.s - 8)), this.R, 0, 66, 4, 20);
         this.g(this.D + (int)(this.q * (float)(this.s - 8)) + 4, this.R, 196, 66, 4, 20);
      }

   }

   public boolean X(j var1, int var2, int var3) {
      int[] var4 = uv.l();
      if(super.X(var1, var2, var3)) {
         this.q = (float)(var2 - (this.D + 4)) / (float)(this.s - 8);
         this.q = t.T(this.q, 0.0F, 1.0F);
         this.z.k(this.q);
         this.J = p_.q(this.z, this.s);
         this.M = true;
         return true;
      } else {
         return false;
      }
   }

   public void A(int var1, int var2) {
      this.M = false;
   }

   public void H() {
      this.q = this.z.v();
   }

   private static xn c(xn var0) {
      return var0;
   }
}
