package net.y2;

import java.nio.IntBuffer;
import net.n9.y;
import net.y.d;
import net.y.p;
import net.y.ui;
import net.y8.x;

public class t {
   public int A;
   public int m;
   public int b;
   public int u;
   public boolean J;
   public int F;
   public int U;
   public int Y;
   public float[] E;
   public int o;
   private static String[] T;

   public t(int var1, int var2, boolean var3) {
      this.J = var3;
      this.F = -1;
      this.U = -1;
      this.Y = -1;
      this.E = new float[4];
      this.E[0] = 1.0F;
      this.E[1] = 1.0F;
      this.E[2] = 1.0F;
      this.E[3] = 0.0F;
      this.H(var1, var2);
   }

   public void H(int var1, int var2) {
      if(!ui.R()) {
         this.b = var1;
         this.u = var2;
      } else {
         d.B();
         if(this.F >= 0) {
            this.E();
         }

         this.C(var1, var2);
         this.Q();
         ui.Q(ui.g, 0);
      }

   }

   public void E() {
      if(ui.R()) {
         this.T();
         this.B();
         if(this.Y > -1) {
            ui.M(this.Y);
            this.Y = -1;
         }

         if(this.U > -1) {
            y.R(this.U);
            this.U = -1;
         }

         if(this.F > -1) {
            ui.Q(ui.g, 0);
            ui.u(this.F);
            this.F = -1;
         }
      }

   }

   public void C(int var1, int var2) {
      h();
      this.b = var1;
      this.u = var2;
      this.A = var1;
      this.m = var2;
      if(!ui.R()) {
         this.r();
      }

      this.F = ui.N();
      this.U = y.v();
      if(this.J) {
         this.Y = ui.l();
      }

      this.O(9728);
      d.z(this.U);
      d.U(3553, 0, '聘', this.A, this.m, 0, 6408, 5121, (IntBuffer)null);
      ui.Q(ui.g, this.F);
      ui.p(ui.g, ui.v, 3553, this.U, 0);
      if(this.J) {
         ui.L(ui.n, this.Y);
         ui.B(ui.n, '膦', this.A, this.m);
         ui.M(ui.g, ui.qF, ui.n, this.Y);
      }

      this.r();
      this.T();
   }

   public void O(int var1) {
      if(ui.R()) {
         this.o = var1;
         d.z(this.U);
         d.t(3553, 10241, var1);
         d.t(3553, 10240, var1);
         d.t(3553, 10242, 10496);
         d.t(3553, 10243, 10496);
         d.z(0);
      }

   }

   public void Q() {
      int var1 = ui.C(ui.g);
      if(var1 != ui.o) {
         if(var1 == ui.R) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
         } else if(var1 == ui.b) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
         } else if(var1 == ui.B) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
         } else if(var1 == ui.T) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
         } else {
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + var1);
         }
      }
   }

   public void O() {
      if(ui.R()) {
         d.z(this.U);
      }

   }

   public void T() {
      if(ui.R()) {
         d.z(0);
      }

   }

   public void U(boolean var1) {
      if(ui.R()) {
         ui.Q(ui.g, this.F);
         d.j(0, 0, this.b, this.u);
      }

   }

   public void B() {
      if(ui.R()) {
         ui.Q(ui.g, 0);
      }

   }

   public void X(float var1, float var2, float var3, float var4) {
      this.E[0] = var1;
      this.E[1] = var2;
      this.E[2] = var3;
      this.E[3] = var4;
   }

   public void u(int var1, int var2) {
      this.G(var1, var2, true);
   }

   public void G(int var1, int var2, boolean var3) {
      String[] var4 = h();
      if(ui.R()) {
         d.q(true, true, true, false);
         d.z();
         d.Y(false);
         d.G(5889);
         d.s();
         d.g(0.0D, (double)var1, (double)var2, 0.0D, 1000.0D, 3000.0D);
         d.G(5888);
         d.s();
         d.O(0.0F, 0.0F, -2000.0F);
         d.j(0, 0, var1, var2);
         d.S();
         d.i();
         d.d();
         if(var3) {
            d.E();
            d.G();
         }

         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.O();
         float var5 = (float)var1;
         float var6 = (float)var2;
         float var7 = (float)this.b / (float)this.A;
         float var8 = (float)this.u / (float)this.m;
         net.y.r var9 = net.y.r.f();
         p var10 = var9.k();
         var10.m(7, x.r);
         var10.H(0.0D, (double)var6, 0.0D).Y(0.0D, 0.0D).V(255, 255, 255, 255).W();
         var10.H((double)var5, (double)var6, 0.0D).Y((double)var7, 0.0D).V(255, 255, 255, 255).W();
         var10.H((double)var5, 0.0D, 0.0D).Y((double)var7, (double)var8).V(255, 255, 255, 255).W();
         var10.H(0.0D, 0.0D, 0.0D).Y(0.0D, (double)var8).V(255, 255, 255, 255).W();
         var9.p();
         this.T();
         d.Y(true);
         d.q(true, true, true, true);
      }

   }

   public void r() {
      this.U(true);
      d.O(this.E[0], this.E[1], this.E[2], this.E[3]);
      int var1 = 16384;
      if(this.J) {
         d.j(1.0D);
         var1 |= 256;
      }

      d.y(var1);
      this.B();
   }

   public static void D(String[] var0) {
      T = var0;
   }

   public static String[] h() {
      return T;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   static {
      D((String[])null);
   }
}
