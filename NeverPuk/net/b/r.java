package net.b;

import net.xn;
import net.b.c;
import net.b.m;
import net.b.n;
import net.ne.y;
import net.yv.o8;
import net.yz.a4;

public abstract class r {
   protected o8 m;
   protected y e;
   protected final a4 p = new a4();
   protected int c;
   protected int H;
   protected int l;
   protected boolean f;
   protected boolean s;
   protected boolean q;

   public void o(o8 var1, y var2) {
      this.m = var1;
      this.e = var2;
      this.p.d();
      this.c = net.u.t.M(var2.h9 + 1.0F);
      this.H = net.u.t.M(var2.m + 1.0F);
      this.l = net.u.t.M(var2.h9 + 1.0F);
   }

   public void H() {
      this.m = null;
      this.e = null;
   }

   protected c v(int var1, int var2, int var3) {
      n.q();
      int var5 = c.z(var1, var2, var3);
      c var6 = (c)this.p.b(var5);
      if(var6 == null) {
         var6 = new c(var1, var2, var3);
         this.p.t(var5, var6);
      }

      return var6;
   }

   public abstract c H();

   public abstract c E(double var1, double var3, double var5);

   public abstract int z(c[] var1, c var2, c var3, float var4);

   public abstract m V(o8 var1, int var2, int var3, int var4, y var5, int var6, int var7, int var8, boolean var9, boolean var10);

   public abstract m H(o8 var1, int var2, int var3, int var4);

   public void V(boolean var1) {
      this.f = var1;
   }

   public void s(boolean var1) {
      this.s = var1;
   }

   public void O(boolean var1) {
      this.q = var1;
   }

   public boolean l() {
      return this.f;
   }

   public boolean V() {
      return this.s;
   }

   public boolean R() {
      return this.q;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
