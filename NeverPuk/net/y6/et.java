package net.y6;

import net.xn;
import net.y6.jb;

public class et extends net.y6.z {
   private final jb U;
   private final jb V;
   private final jb l;
   private final jb N;
   private final jb L;
   private final jb I;
   private final jb e;
   private final jb k;
   private int s = 1;

   public et() {
      this.w("head.main", 0, 0);
      this.w("head.nose", 0, 24);
      this.w("head.ear1", 0, 10);
      this.w("head.ear2", 6, 10);
      this.e = new jb(this, "head");
      this.e.M("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
      this.e.M("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
      this.e.M("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
      this.e.M("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
      this.e.n(0.0F, 15.0F, -9.0F);
      this.k = new jb(this, 20, 0);
      this.k.d(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
      this.k.n(0.0F, 12.0F, -10.0F);
      this.L = new jb(this, 0, 15);
      this.L.U(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.L.b = 0.9F;
      this.L.n(0.0F, 15.0F, 8.0F);
      this.I = new jb(this, 4, 15);
      this.I.U(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.I.n(0.0F, 20.0F, 14.0F);
      this.U = new jb(this, 8, 13);
      this.U.U(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.U.n(1.1F, 18.0F, 5.0F);
      this.V = new jb(this, 8, 13);
      this.V.U(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.V.n(-1.1F, 18.0F, 5.0F);
      this.l = new jb(this, 40, 0);
      this.l.U(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.l.n(1.2F, 13.8F, -5.0F);
      this.N = new jb(this, 40, 0);
      this.N.U(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.N.n(-1.2F, 13.8F, -5.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      if(this.n) {
         float var10000 = 2.0F;
         net.y.d.c();
         net.y.d.W(0.75F, 0.75F, 0.75F);
         net.y.d.O(0.0F, 10.0F * var7, 4.0F * var7);
         this.e.B(var7);
         net.y.d.Y();
         net.y.d.c();
         net.y.d.W(0.5F, 0.5F, 0.5F);
         net.y.d.O(0.0F, 24.0F * var7, 0.0F);
         this.k.B(var7);
         this.U.B(var7);
         this.V.B(var7);
         this.l.B(var7);
         this.N.B(var7);
         this.L.B(var7);
         this.I.B(var7);
         net.y.d.Y();
      } else {
         this.e.B(var7);
         this.k.B(var7);
         this.L.B(var7);
         this.I.B(var7);
         this.U.B(var7);
         this.V.B(var7);
         this.l.B(var7);
         this.N.B(var7);
      }

   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      this.e.b = var5 * 0.017453292F;
      this.e.N = var4 * 0.017453292F;
      if(this.s != 3) {
         this.k.b = 1.5707964F;
         if(this.s == 2) {
            this.U.b = net.u.t.m(var1 * 0.6662F) * var2;
            this.V.b = net.u.t.m(var1 * 0.6662F + 0.3F) * var2;
            this.l.b = net.u.t.m(var1 * 0.6662F + 3.1415927F + 0.3F) * var2;
            this.N.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * var2;
            this.I.b = 1.7278761F + 0.31415927F * net.u.t.m(var1) * var2;
         } else {
            this.U.b = net.u.t.m(var1 * 0.6662F) * var2;
            this.V.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * var2;
            this.l.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * var2;
            this.N.b = net.u.t.m(var1 * 0.6662F) * var2;
            if(this.s == 1) {
               this.I.b = 1.7278761F + 0.7853982F * net.u.t.m(var1) * var2;
            } else {
               this.I.b = 1.7278761F + 0.47123894F * net.u.t.m(var1) * var2;
            }
         }
      }

   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      net.yn.g var6 = (net.yn.g)var1;
      this.k.I = 12.0F;
      this.k.h = -10.0F;
      this.e.I = 15.0F;
      this.e.h = -9.0F;
      net.y6.z.C();
      this.L.I = 15.0F;
      this.L.h = 8.0F;
      this.I.I = 20.0F;
      this.I.h = 14.0F;
      this.l.I = 13.8F;
      this.l.h = -5.0F;
      this.N.I = 13.8F;
      this.N.h = -5.0F;
      this.U.I = 18.0F;
      this.U.h = 5.0F;
      this.V.I = 18.0F;
      this.V.h = 5.0F;
      this.L.b = 0.9F;
      if(var6.Q()) {
         ++this.k.I;
         this.e.I += 2.0F;
         ++this.L.I;
         this.I.I += -4.0F;
         this.I.h += 2.0F;
         this.L.b = 1.5707964F;
         this.I.b = 1.5707964F;
         this.s = 0;
      }

      if(var6.B()) {
         this.I.I = this.L.I;
         this.I.h += 2.0F;
         this.L.b = 1.5707964F;
         this.I.b = 1.5707964F;
         this.s = 2;
      }

      if(var6.Ke()) {
         this.k.b = 0.7853982F;
         this.k.I += -4.0F;
         this.k.h += 5.0F;
         this.e.I += -3.3F;
         ++this.e.h;
         this.L.I += 8.0F;
         this.L.h += -2.0F;
         this.I.I += 2.0F;
         this.I.h += -0.8F;
         this.L.b = 1.7278761F;
         this.I.b = 2.670354F;
         this.l.b = -0.15707964F;
         this.l.I = 15.8F;
         this.l.h = -7.0F;
         this.N.b = -0.15707964F;
         this.N.I = 15.8F;
         this.N.h = -7.0F;
         this.U.b = -1.5707964F;
         this.U.I = 21.0F;
         this.U.h = 1.0F;
         this.V.b = -1.5707964F;
         this.V.I = 21.0F;
         this.V.h = 1.0F;
         this.s = 3;
      }

      this.s = 1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
