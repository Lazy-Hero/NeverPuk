package net.z;

import net.xn;
import net.z.g;
import net.z.h;
import org.lwjgl.input.Mouse;

public class d extends h {
   private final net.ct.e u;

   public d(net.ct.e var1, int var2, int var3, int var4, int var5, int var6) {
      super(net.nn.j.b(), var2, var3, var4, var5, var6);
      this.u = var1;
   }

   protected int V() {
      return this.u.K();
   }

   protected void E(int var1, boolean var2, int var3, int var4) {
      this.u.J(var1, var2, var3, var4);
   }

   protected boolean z(int var1) {
      return this.u.T(var1);
   }

   protected void x() {
      this.u.z();
   }

   protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      this.u.C(var1, var2, var3, var4, var5, var6);
   }

   public int i() {
      return this.x;
   }

   public int a() {
      return this.N;
   }

   public int L() {
      return this.e;
   }

   protected int X() {
      return this.u.q();
   }

   protected int I() {
      return this.u.W();
   }

   public void q() {
      super.q();
      if(this.R > 0.0F && Mouse.getEventButtonState()) {
         this.u.n(this.a, this.G, this.B, this.g, this.E);
      }

   }

   public void G(int var1, int var2, int var3, net.ct.f var4) {
      this.u.c(var1, var2, var3, var4);
   }

   protected void e(int var1, int var2, int var3, int var4, float var5) {
      g.B();
      int var7 = this.V();
      int var8 = 0;
      if(var8 < var7) {
         int var9 = var2 + var8 * this.E + this.B;
         int var10 = this.E - 4;
         if(var9 > this.G || var9 + var10 < this.a) {
            this.N(var8, var1, var9, var5);
         }

         if(this.V && this.z(var8)) {
            this.G(this.x, var9, var10, net.ct.f.h);
         }

         this.x(var8, var1, var9, var10, var3, var4, var5);
         ++var8;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
