package net.nw;

import javax.annotation.Nullable;
import net.xn;
import net.a.t;
import net.nw.s;
import net.nw.v;
import net.u.d;
import net.u.j;
import net.u.r;
import net.yz.ai;

public class a extends s {
   private r x;
   private int w;

   public a(t var1) {
      super(var1);
   }

   public void H() {
      if(this.w++ % 10 == 0) {
         float var1 = (this.h.Q().nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.h.Q().nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.h.Q().nextFloat() - 0.5F) * 8.0F;
         this.h.hl.n(ai.EXPLOSION_HUGE, this.h.b + (double)var1, this.h.hS + 2.0D + (double)var2, this.h.hr + (double)var3, 0.0D, 0.0D, 0.0D, new int[0]);
      }

   }

   public void J() {
      s.H();
      ++this.w;
      if(this.x == null) {
         j var2 = this.h.hl.A(net.w.e.z);
         this.x = new r((double)var2.t(), (double)var2.h(), (double)var2.y());
      }

      double var4 = this.x.s(this.h.b, this.h.hS, this.h.hr);
      if(Double.compare(var4, 100.0D) >= 0 && var4 <= 22500.0D && !this.h.t && !this.h.u) {
         this.h.u(1.0F);
      }

      this.h.u(0.0F);
      if(d.y() == null) {
         s.V(new d[4]);
      }

   }

   public void h() {
      this.x = null;
      this.w = 0;
   }

   public float H() {
      return 3.0F;
   }

   @Nullable
   public r Y() {
      return this.x;
   }

   public v x() {
      return v.Q;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
