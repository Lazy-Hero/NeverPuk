package net.nw;

import javax.annotation.Nullable;
import net.a.t;
import net.nm.j;
import net.nw.x;
import net.r.r;
import net.u.d;

public abstract class s implements x {
   protected final t h;
   private static d[] L;

   public s(t var1) {
      this.h = var1;
   }

   public boolean C() {
      return false;
   }

   public void H() {
   }

   public void J() {
   }

   public void g(j var1, net.u.j var2, net.yz.z var3, @Nullable r var4) {
   }

   public void h() {
   }

   public void o() {
   }

   public float H() {
      return 0.6F;
   }

   @Nullable
   public net.u.r Y() {
      return null;
   }

   public float e(net.ne.i var1, net.yz.z var2, float var3) {
      return var3;
   }

   public float l() {
      float var1 = net.u.t.R(this.h.hf * this.h.hf + this.h.J * this.h.J) + 1.0F;
      float var2 = Math.min(var1, 40.0F);
      return 0.7F / var2 / var1;
   }

   public static void V(d[] var0) {
      L = var0;
   }

   public static d[] H() {
      return L;
   }

   static {
      if(H() == null) {
         V(new d[5]);
      }

   }
}
