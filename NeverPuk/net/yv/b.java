package net.yv;

import net.ns.i6;
import net.yv.c;
import net.yv.h;
import net.yv.r;

public class b extends c {
   public void b() {
      this.M = new i6(net.nb.x.l);
      this.F = true;
      this.l = true;
   }

   public net.u.r o(float var1, float var2) {
      return new net.u.r(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
   }

   protected void z() {
      r.C();
      float var10001 = 0.1F;
      int var3 = 0;
      float var4 = 1.0F - (float)var3 / 15.0F;
      this.W[var3] = (1.0F - var4) / (var4 * 3.0F + 1.0F) * 0.9F + 0.1F;
      ++var3;
   }

   public net.cn.e z() {
      return new net.cn.n(this.H, this.H.B().X(), this.H.a());
   }

   public boolean Z() {
      return false;
   }

   public boolean i(int var1, int var2) {
      return false;
   }

   public float G(long var1, float var3) {
      return 0.5F;
   }

   public boolean X() {
      return false;
   }

   public boolean J(int var1, int var2) {
      return true;
   }

   public net.nz.p E() {
      return new net.nz.p() {
         public double s() {
            return super.s() / 8.0D;
         }

         public double A() {
            return super.A() / 8.0D;
         }
      };
   }

   public h L() {
      return h.NETHER;
   }
}
