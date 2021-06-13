package net.z;

import java.awt.Color;
import net.xh;
import net.xn;
import net.z.g;
import net.z.m;
import net.z.t;
import org.lwjgl.input.Mouse;

public abstract class h {
   protected final net.nn.j s;
   protected int x;
   protected int t;
   protected int a;
   protected int G;
   protected int y;
   protected int v;
   protected final int E;
   private int q;
   private int D;
   protected int e;
   protected int N;
   protected boolean K = true;
   protected int Q = -2;
   protected float R;
   protected float g;
   protected int C = -1;
   protected long d;
   protected boolean H = true;
   protected boolean V = true;
   protected boolean w;
   protected int B;
   private boolean W = true;

   public h(net.nn.j var1, int var2, int var3, int var4, int var5, int var6) {
      this.s = var1;
      this.x = var2;
      this.t = var3;
      this.a = var4;
      this.G = var5;
      this.E = var6;
      this.v = 0;
      this.y = var2;
   }

   public void C(int var1, int var2, int var3, int var4) {
      this.x = var1;
      this.t = var2;
      this.a = var3;
      this.G = var4;
      this.v = 0;
      this.y = var1;
   }

   public void S(boolean var1) {
      this.V = var1;
   }

   protected void y(boolean var1, int var2) {
      this.w = var1;
      this.B = var2;
      this.B = 0;
   }

   protected abstract int V();

   protected abstract void E(int var1, boolean var2, int var3, int var4);

   protected abstract boolean z(int var1);

   protected int X() {
      return this.V() * this.E + this.B;
   }

   protected abstract void x();

   protected void N(int var1, int var2, int var3, float var4) {
   }

   protected abstract void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7);

   protected void A(int var1, int var2, net.y.r var3) {
   }

   protected void b(int var1, int var2) {
   }

   protected void M(int var1, int var2) {
   }

   public int p(int var1, int var2) {
      int var3 = this.v + this.x / 2 - this.C() / 2;
      int var4 = this.v + this.x / 2 + this.C() / 2;
      int var5 = var2 - this.a - this.B + (int)this.g - 4;
      int var6 = var5 / this.E;
      return var1 < this.I() && var1 >= var3 && var1 <= var4 && var6 < this.V()?var6:-1;
   }

   public void A(int var1, int var2) {
      this.q = var1;
      this.D = var2;
   }

   protected void B() {
      this.g = net.u.t.T(this.g, 0.0F, (float)this.Z());
   }

   public int Z() {
      return Math.max(0, this.X() - (this.G - this.a - 4));
   }

   public int h() {
      return (int)this.g;
   }

   public boolean A(int var1) {
      return var1 >= this.a && var1 <= this.G && this.e >= this.v && this.e <= this.y;
   }

   public void O(int var1) {
      this.g += (float)var1;
      this.B();
      this.Q = -2;
   }

   public void L(m var1) {
      if(var1.O) {
         if(var1.g == this.q) {
            this.g -= (float)(this.E * 2 / 3);
            this.Q = -2;
            this.B();
         } else if(var1.g == this.D) {
            this.g += (float)(this.E * 2 / 3);
            this.Q = -2;
            this.B();
         }
      }

   }

   public void Z(int var1, int var2, float var3) {
      boolean var4 = g.B();
      if(this.H) {
         this.e = var1;
         this.N = var2;
         this.x();
         int var5 = this.I();
         int var6 = var5 + 6;
         this.B();
         net.y.d.i();
         net.y.d.V();
         net.y.r var7 = net.y.r.f();
         net.y.p var8 = var7.k();
         this.u(var7);
         int var9 = this.v + this.x / 2 - this.C() / 2 + 2;
         int var10 = this.a + 4 - (int)this.g;
         if(this.w) {
            this.A(var9, var10, var7);
         }

         this.e(var9, var10, var1, var2, var3);
         net.y.d.z();
         this.J(0, this.a, 255, 255);
         this.J(this.G, this.t, 255, 255);
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ZERO, net.y.d.ONE);
         net.y.d.d();
         net.y.d.Q(7425);
         net.y.d.w();
         boolean var10000 = true;
         var8.m(7, net.y8.x.r);
         var8.H((double)this.v, (double)(this.a + 4), 0.0D).Y(0.0D, 1.0D).V(0, 0, 0, 0).W();
         var8.H((double)this.y, (double)(this.a + 4), 0.0D).Y(1.0D, 1.0D).V(0, 0, 0, 0).W();
         var8.H((double)this.y, (double)this.a, 0.0D).Y(1.0D, 0.0D).V(0, 0, 0, 255).W();
         var8.H((double)this.v, (double)this.a, 0.0D).Y(0.0D, 0.0D).V(0, 0, 0, 255).W();
         var7.p();
         var8.m(7, net.y8.x.r);
         var8.H((double)this.v, (double)this.G, 0.0D).Y(0.0D, 1.0D).V(0, 0, 0, 255).W();
         var8.H((double)this.y, (double)this.G, 0.0D).Y(1.0D, 1.0D).V(0, 0, 0, 255).W();
         var8.H((double)this.y, (double)(this.G - 4), 0.0D).Y(1.0D, 0.0D).V(0, 0, 0, 0).W();
         var8.H((double)this.v, (double)(this.G - 4), 0.0D).Y(0.0D, 0.0D).V(0, 0, 0, 0).W();
         var7.p();
         int var12 = this.Z();
         if(var12 > 0) {
            int var13 = (this.G - this.a) * (this.G - this.a) / this.X();
            var13 = net.u.t.g(var13, 32, this.G - this.a - 8);
            int var14 = (int)this.g * (this.G - this.a - var13) / var12 + this.a;
            if(var14 < this.a) {
               var14 = this.a;
            }

            var8.m(7, net.y8.x.r);
            var8.H((double)var5, (double)this.G, 0.0D).Y(0.0D, 1.0D).V(0, 0, 0, 255).W();
            var8.H((double)var6, (double)this.G, 0.0D).Y(1.0D, 1.0D).V(0, 0, 0, 255).W();
            var8.H((double)var6, (double)this.a, 0.0D).Y(1.0D, 0.0D).V(0, 0, 0, 255).W();
            var8.H((double)var5, (double)this.a, 0.0D).Y(0.0D, 0.0D).V(0, 0, 0, 255).W();
            var7.p();
            var8.m(7, net.y8.x.r);
            var8.H((double)var5, (double)(var14 + var13), 0.0D).Y(0.0D, 1.0D).V(128, 128, 128, 255).W();
            var8.H((double)var6, (double)(var14 + var13), 0.0D).Y(1.0D, 1.0D).V(128, 128, 128, 255).W();
            var8.H((double)var6, (double)var14, 0.0D).Y(1.0D, 0.0D).V(128, 128, 128, 255).W();
            var8.H((double)var5, (double)var14, 0.0D).Y(0.0D, 0.0D).V(128, 128, 128, 255).W();
            var7.p();
            var8.m(7, net.y8.x.r);
            var8.H((double)var5, (double)(var14 + var13 - 1), 0.0D).Y(0.0D, 1.0D).V(192, 192, 192, 255).W();
            var8.H((double)(var6 - 1), (double)(var14 + var13 - 1), 0.0D).Y(1.0D, 1.0D).V(192, 192, 192, 255).W();
            var8.H((double)(var6 - 1), (double)var14, 0.0D).Y(1.0D, 0.0D).V(192, 192, 192, 255).W();
            var8.H((double)var5, (double)var14, 0.0D).Y(0.0D, 0.0D).V(192, 192, 192, 255).W();
            var7.p();
         }

         this.M(var1, var2);
         net.y.d.S();
         net.y.d.Q(7424);
         net.y.d.m();
         net.y.d.E();
      }

   }

   public void f(int var1, int var2, float var3) {
      if(this.H) {
         this.e = var1;
         this.N = var2;
         int var4 = this.I();
         int var5 = var4 + 6;
         this.B();
         net.y.d.i();
         net.y.d.V();
         net.y.r var6 = net.y.r.f();
         net.y.p var7 = var6.k();
         t var8 = new t(this.s);
         xh.T(-5.0D, 0.0D, (double)(var8.u() - -6), (double)var8.v(), 0.5D, (new Color(44, 44, 44, 255)).getRGB(), (new Color(33, 33, 33, 255)).getRGB(), true);
         xh.T(1.0D, 1.4D, (double)(var8.u() - 1), (double)var8.v() - 1.7D, 0.5D, (new Color(17, 17, 17, 255)).getRGB(), (new Color(33, 33, 33, 255)).getRGB(), true);
         int var9 = this.v + this.x / 2 - this.C() / 2 + 2;
         int var10 = this.a + 4 - (int)this.g;
         if(this.w) {
            this.A(var9, var10, var6);
         }

         this.e(var9, var10, var1, var2, var3);
         net.y.d.z();
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ZERO, net.y.d.ONE);
         net.y.d.d();
         net.y.d.Q(7425);
         net.y.d.w();
         int var11 = this.Z();
         int var12 = (this.G - this.a) * (this.G - this.a) / this.X();
         var12 = net.u.t.g(var12, 32, this.G - this.a - 8);
         int var13 = (int)this.g * (this.G - this.a - var12) / var11 + this.a;
         if(var13 < this.a) {
            var13 = this.a;
         }

         var7.m(7, net.y8.x.r);
         var7.H((double)var4, (double)this.G, 0.0D).Y(0.0D, 1.0D).V(0, 0, 0, 255).W();
         var7.H((double)var5, (double)this.G, 0.0D).Y(1.0D, 1.0D).V(0, 0, 0, 255).W();
         var7.H((double)var5, (double)this.a, 0.0D).Y(1.0D, 0.0D).V(0, 0, 0, 255).W();
         var7.H((double)var4, (double)this.a, 0.0D).Y(0.0D, 0.0D).V(0, 0, 0, 255).W();
         var6.p();
         var7.m(7, net.y8.x.r);
         var7.H((double)var4, (double)(var13 + var12), 0.0D).Y(0.0D, 1.0D).V(128, 128, 128, 255).W();
         var7.H((double)var5, (double)(var13 + var12), 0.0D).Y(1.0D, 1.0D).V(128, 128, 128, 255).W();
         var7.H((double)var5, (double)var13, 0.0D).Y(1.0D, 0.0D).V(128, 128, 128, 255).W();
         var7.H((double)var4, (double)var13, 0.0D).Y(0.0D, 0.0D).V(128, 128, 128, 255).W();
         var6.p();
         var7.m(7, net.y8.x.r);
         var7.H((double)var4, (double)(var13 + var12 - 1), 0.0D).Y(0.0D, 1.0D).V(192, 192, 192, 255).W();
         var7.H((double)(var5 - 1), (double)(var13 + var12 - 1), 0.0D).Y(1.0D, 1.0D).V(192, 192, 192, 255).W();
         var7.H((double)(var5 - 1), (double)var13, 0.0D).Y(1.0D, 0.0D).V(192, 192, 192, 255).W();
         var7.H((double)var4, (double)var13, 0.0D).Y(0.0D, 0.0D).V(192, 192, 192, 255).W();
         var6.p();
         this.M(var1, var2);
         net.y.d.S();
         net.y.d.Q(7424);
         net.y.d.m();
         net.y.d.E();
      }

   }

   public void q() {
      if(this.A(this.N)) {
         if(Mouse.getEventButton() == 0 && Mouse.getEventButtonState() && this.N >= this.a && this.N <= this.G) {
            int var1 = (this.x - this.C()) / 2;
            int var2 = (this.x + this.C()) / 2;
            int var3 = this.N - this.a - this.B + (int)this.g - 4;
            int var4 = var3 / this.E;
            if(var4 < this.V() && this.e >= var1 && this.e <= var2) {
               this.E(var4, false, this.e, this.N);
               this.C = var4;
            } else if(this.e >= var1 && this.e <= var2) {
               this.b(this.e - var1, this.N - this.a + (int)this.g - 4);
            }
         }

         if(Mouse.isButtonDown(0) && this.d()) {
            if(this.Q != -1) {
               if(this.Q >= 0) {
                  this.g -= (float)(this.N - this.Q) * this.R;
                  this.Q = this.N;
               }
            } else {
               boolean var10 = true;
               if(this.N >= this.a && this.N <= this.G) {
                  int var14 = (this.x - this.C()) / 2;
                  int var15 = (this.x + this.C()) / 2;
                  int var16 = this.N - this.a - this.B + (int)this.g - 4;
                  int var5 = var16 / this.E;
                  if(var5 < this.V() && this.e >= var14 && this.e <= var15) {
                     boolean var6 = var5 == this.C && net.nn.j.E() - this.d < 250L;
                     this.E(var5, var6, this.e, this.N);
                     this.C = var5;
                     this.d = net.nn.j.E();
                  } else if(this.e >= var14 && this.e <= var15) {
                     this.b(this.e - var14, this.N - this.a + (int)this.g - 4);
                     var10 = false;
                  }

                  int var17 = this.I();
                  int var7 = var17 + 6;
                  if(this.e >= var17 && this.e <= var7) {
                     this.R = -1.0F;
                     int var8 = this.Z();
                     if(var8 < 1) {
                        var8 = 1;
                     }

                     int var9 = (int)((float)((this.G - this.a) * (this.G - this.a)) / (float)this.X());
                     var9 = net.u.t.g(var9, 32, this.G - this.a - 8);
                     this.R /= (float)(this.G - this.a - var9) / (float)var8;
                  } else {
                     this.R = 1.0F;
                  }

                  this.Q = this.N;
               } else {
                  this.Q = -2;
               }
            }
         } else {
            this.Q = -1;
         }

         int var12 = Mouse.getEventDWheel();
         var12 = -1;
         this.g += (float)(var12 * this.E / 2);
      }

   }

   public void b(boolean var1) {
      this.W = var1;
   }

   public boolean d() {
      return this.W;
   }

   public int C() {
      return 220;
   }

   protected void e(int var1, int var2, int var3, int var4, float var5) {
      int var6 = this.V();
      net.y.r var7 = net.y.r.f();
      net.y.p var8 = var7.k();

      for(int var9 = 0; var9 < var6; ++var9) {
         int var10 = var2 + var9 * this.E + this.B;
         int var11 = this.E - 4;
         if(var10 > this.G || var10 + var11 < this.a) {
            this.N(var9, var1, var10, var5);
         }

         if(this.V && this.z(var9)) {
            int var12 = this.v + (this.x / 2 - this.C() / 2);
            int var13 = this.v + this.x / 2 + this.C() / 2;
            net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
            net.y.d.w();
            var8.m(7, net.y8.x.r);
            var8.H((double)var12, (double)(var10 + var11 + 2), 0.0D).Y(0.0D, 1.0D).V(128, 128, 128, 255).W();
            var8.H((double)var13, (double)(var10 + var11 + 2), 0.0D).Y(1.0D, 1.0D).V(128, 128, 128, 255).W();
            var8.H((double)var13, (double)(var10 - 2), 0.0D).Y(1.0D, 0.0D).V(128, 128, 128, 255).W();
            var8.H((double)var12, (double)(var10 - 2), 0.0D).Y(0.0D, 0.0D).V(128, 128, 128, 255).W();
            var8.H((double)(var12 + 1), (double)(var10 + var11 + 1), 0.0D).Y(0.0D, 1.0D).V(0, 0, 0, 255).W();
            var8.H((double)(var13 - 1), (double)(var10 + var11 + 1), 0.0D).Y(1.0D, 1.0D).V(0, 0, 0, 255).W();
            var8.H((double)(var13 - 1), (double)(var10 - 1), 0.0D).Y(1.0D, 0.0D).V(0, 0, 0, 255).W();
            var8.H((double)(var12 + 1), (double)(var10 - 1), 0.0D).Y(0.0D, 0.0D).V(0, 0, 0, 255).W();
            var7.p();
            net.y.d.S();
         }

         if(var10 >= this.a - this.E && var10 <= this.G) {
            this.x(var9, var1, var10, var11, var3, var4, var5);
         }
      }

   }

   protected int I() {
      return this.x / 2 + 124;
   }

   protected void J(int var1, int var2, int var3, int var4) {
      net.y.r var5 = net.y.r.f();
      net.y.p var6 = var5.k();
      this.s.n().E(g.v);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      float var10000 = 32.0F;
      var6.m(7, net.y8.x.r);
      var6.H((double)this.v, (double)var2, 0.0D).Y(0.0D, (double)((float)var2 / 32.0F)).V(64, 64, 64, var4).W();
      var6.H((double)(this.v + this.x), (double)var2, 0.0D).Y((double)((float)this.x / 32.0F), (double)((float)var2 / 32.0F)).V(64, 64, 64, var4).W();
      var6.H((double)(this.v + this.x), (double)var1, 0.0D).Y((double)((float)this.x / 32.0F), (double)((float)var1 / 32.0F)).V(64, 64, 64, var3).W();
      var6.H((double)this.v, (double)var1, 0.0D).Y(0.0D, (double)((float)var1 / 32.0F)).V(64, 64, 64, var3).W();
      var5.p();
   }

   public void j(int var1) {
      this.v = var1;
      this.y = var1 + this.x;
   }

   public int W() {
      return this.E;
   }

   protected void u(net.y.r var1) {
      net.y.p var2 = var1.k();
      this.s.n().E(g.v);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      float var10000 = 32.0F;
      var2.m(7, net.y8.x.r);
      var2.H((double)this.v, (double)this.G, 0.0D).Y((double)((float)this.v / 32.0F), (double)((float)(this.G + (int)this.g) / 32.0F)).V(32, 32, 32, 255).W();
      var2.H((double)this.y, (double)this.G, 0.0D).Y((double)((float)this.y / 32.0F), (double)((float)(this.G + (int)this.g) / 32.0F)).V(32, 32, 32, 255).W();
      var2.H((double)this.y, (double)this.a, 0.0D).Y((double)((float)this.y / 32.0F), (double)((float)(this.a + (int)this.g) / 32.0F)).V(32, 32, 32, 255).W();
      var2.H((double)this.v, (double)this.a, 0.0D).Y((double)((float)this.v / 32.0F), (double)((float)(this.a + (int)this.g) / 32.0F)).V(32, 32, 32, 255).W();
      var1.p();
   }

   private static xn c(xn var0) {
      return var0;
   }
}
