package net.y6;

import net.xn;
import net.y6.jb;

public class ez extends net.y6.z {
   private final jb V;
   private final jb h;
   private final jb X;
   private final jb p;
   private final jb w;
   private final jb D;
   private final jb c;
   private final jb H;
   private final jb G;
   private final jb T;
   private final jb S;
   private final jb P;
   private float J;

   public ez() {
      net.y6.z.C();
      this.w("head.main", 0, 0);
      this.w("head.nose", 0, 24);
      this.w("head.ear1", 0, 10);
      this.w("head.ear2", 6, 10);
      this.V = new jb(this, 26, 24);
      this.V.U(-1.0F, 5.5F, -3.7F, 2, 1, 7);
      this.V.n(3.0F, 17.5F, 3.7F);
      this.V.x = true;
      this.Q(this.V, 0.0F, 0.0F, 0.0F);
      this.h = new jb(this, 8, 24);
      this.h.U(-1.0F, 5.5F, -3.7F, 2, 1, 7);
      this.h.n(-3.0F, 17.5F, 3.7F);
      this.h.x = true;
      this.Q(this.h, 0.0F, 0.0F, 0.0F);
      this.X = new jb(this, 30, 15);
      this.X.U(-1.0F, 0.0F, 0.0F, 2, 4, 5);
      this.X.n(3.0F, 17.5F, 3.7F);
      this.X.x = true;
      this.Q(this.X, -0.34906584F, 0.0F, 0.0F);
      this.p = new jb(this, 16, 15);
      this.p.U(-1.0F, 0.0F, 0.0F, 2, 4, 5);
      this.p.n(-3.0F, 17.5F, 3.7F);
      this.p.x = true;
      this.Q(this.p, -0.34906584F, 0.0F, 0.0F);
      this.w = new jb(this, 0, 0);
      this.w.U(-3.0F, -2.0F, -10.0F, 6, 5, 10);
      this.w.n(0.0F, 19.0F, 8.0F);
      this.w.x = true;
      this.Q(this.w, -0.34906584F, 0.0F, 0.0F);
      this.D = new jb(this, 8, 15);
      this.D.U(-1.0F, 0.0F, -1.0F, 2, 7, 2);
      this.D.n(3.0F, 17.0F, -1.0F);
      this.D.x = true;
      this.Q(this.D, -0.17453292F, 0.0F, 0.0F);
      this.c = new jb(this, 0, 15);
      this.c.U(-1.0F, 0.0F, -1.0F, 2, 7, 2);
      this.c.n(-3.0F, 17.0F, -1.0F);
      this.c.x = true;
      this.Q(this.c, -0.17453292F, 0.0F, 0.0F);
      this.H = new jb(this, 32, 0);
      this.H.U(-2.5F, -4.0F, -5.0F, 5, 4, 5);
      this.H.n(0.0F, 16.0F, -1.0F);
      this.H.x = true;
      this.Q(this.H, 0.0F, 0.0F, 0.0F);
      this.G = new jb(this, 52, 0);
      this.G.U(-2.5F, -9.0F, -1.0F, 2, 5, 1);
      this.G.n(0.0F, 16.0F, -1.0F);
      this.G.x = true;
      this.Q(this.G, 0.0F, -0.2617994F, 0.0F);
      this.T = new jb(this, 58, 0);
      this.T.U(0.5F, -9.0F, -1.0F, 2, 5, 1);
      this.T.n(0.0F, 16.0F, -1.0F);
      this.T.x = true;
      this.Q(this.T, 0.0F, 0.2617994F, 0.0F);
      this.S = new jb(this, 52, 6);
      this.S.U(-1.5F, -1.5F, 0.0F, 3, 3, 2);
      this.S.n(0.0F, 20.0F, 7.0F);
      this.S.x = true;
      this.Q(this.S, -0.3490659F, 0.0F, 0.0F);
      this.P = new jb(this, 32, 9);
      this.P.U(-0.5F, -2.5F, -5.5F, 1, 1, 1);
      this.P.n(0.0F, 16.0F, -1.0F);
      this.P.x = true;
      this.Q(this.P, 0.0F, 0.0F, 0.0F);
      if(net.u.d.y() == null) {
         net.y6.z.j(false);
      }

   }

   private void Q(jb var1, float var2, float var3, float var4) {
      var1.b = var2;
      var1.N = var3;
      var1.c = var4;
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.W();
      this.p(var2, var3, var4, var5, var6, var7, var1);
      if(this.n) {
         float var10000 = 1.5F;
         net.y.d.c();
         net.y.d.W(0.56666666F, 0.56666666F, 0.56666666F);
         net.y.d.O(0.0F, 22.0F * var7, 2.0F * var7);
         this.H.B(var7);
         this.T.B(var7);
         this.G.B(var7);
         this.P.B(var7);
         net.y.d.Y();
         net.y.d.c();
         net.y.d.W(0.4F, 0.4F, 0.4F);
         net.y.d.O(0.0F, 36.0F * var7, 0.0F);
         this.V.B(var7);
         this.h.B(var7);
         this.X.B(var7);
         this.p.B(var7);
         this.w.B(var7);
         this.D.B(var7);
         this.c.B(var7);
         this.S.B(var7);
         net.y.d.Y();
      }

      net.y.d.c();
      net.y.d.W(0.6F, 0.6F, 0.6F);
      net.y.d.O(0.0F, 16.0F * var7, 0.0F);
      this.V.B(var7);
      this.h.B(var7);
      this.X.B(var7);
      this.p.B(var7);
      this.w.B(var7);
      this.D.B(var7);
      this.c.B(var7);
      this.H.B(var7);
      this.G.B(var7);
      this.T.B(var7);
      this.S.B(var7);
      this.P.B(var7);
      net.y.d.Y();
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      float var8 = var3 - (float)var7.x;
      net.yn.z var9 = (net.yn.z)var7;
      this.P.b = var5 * 0.017453292F;
      this.H.b = var5 * 0.017453292F;
      this.G.b = var5 * 0.017453292F;
      this.T.b = var5 * 0.017453292F;
      this.P.N = var4 * 0.017453292F;
      this.H.N = var4 * 0.017453292F;
      this.G.N = this.P.N - 0.2617994F;
      this.T.N = this.P.N + 0.2617994F;
      this.J = net.u.t.A(var9.U(var8) * 3.1415927F);
      this.X.b = (this.J * 50.0F - 21.0F) * 0.017453292F;
      this.p.b = (this.J * 50.0F - 21.0F) * 0.017453292F;
      this.V.b = this.J * 50.0F * 0.017453292F;
      this.h.b = this.J * 50.0F * 0.017453292F;
      this.D.b = (this.J * -40.0F - 11.0F) * 0.017453292F;
      this.c.b = (this.J * -40.0F - 11.0F) * 0.017453292F;
   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      super.x(var1, var2, var3, var4);
      this.J = net.u.t.A(((net.yn.z)var1).U(var4) * 3.1415927F);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
