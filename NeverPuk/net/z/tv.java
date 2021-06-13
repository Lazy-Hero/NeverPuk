package net.z;

import java.io.IOException;
import net.z.e;
import net.z.g;
import net.z.m;
import net.z.th;
import net.z.tl;
import net.z.tu;

public class tv extends tu {
   private static final net.nr.d[] w = new net.nr.d[]{net.nr.d.INVERT_MOUSE, net.nr.d.SENSITIVITY, net.nr.d.TOUCHSCREEN, net.nr.d.AUTO_JUMP};
   private final tu U;
   protected String Z = "Controls";
   private final net.nr.d I;
   public net.nr.h R;
   public long K;
   private e y;
   private m J;

   public tv(tu var1, net.nr.d var2) {
      this.U = var1;
      this.I = var2;
   }

   public void L() {
      this.y = new e(this, this.A);
      this.m.add(new m(200, q / 2 - 155 + 160, V - 29, 150, 20, net.c9.b.x("gui.done", new Object[0])));
      this.J = this.x(new m(201, q / 2 - 155, V - 29, 150, 20, net.c9.b.x("controls.resetAll", new Object[0])));
      g.C();
      this.Z = net.c9.b.x("controls.title", new Object[0]);
      int var2 = 0;
      net.nr.d[] var3 = w;
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         net.nr.d var6 = var3[var5];
         if(var6.k()) {
            this.m.add(new tl(var6.p(), q / 2 - 155 + var2 % 2 * 160, 18 + 24 * (var2 >> 1), var6));
         }

         this.m.add(new th(var6.p(), q / 2 - 155 + var2 % 2 * 160, 18 + 24 * (var2 >> 1), var6, this.I.L(var6)));
         ++var2;
         ++var5;
      }

   }

   public void m() throws IOException {
      super.m();
      this.y.q();
   }

   protected void t(m var1) throws IOException {
      if(var1.g == 200) {
         this.A.s(this.U);
      } else if(var1.g == 201) {
         for(net.nr.h var5 : this.A.T.i) {
            var5.s(var5.a());
         }

         net.nr.h.G();
      } else if(var1.g < 100 && var1 instanceof th) {
         this.I.T(((th)var1).P(), 1);
         var1.J = this.I.L(net.nr.d.i(var1.g));
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      if(this.R != null) {
         this.I.F(this.R, -100 + var3);
         this.R = null;
         net.nr.h.G();
      } else if(!this.y.x(var1, var2, var3)) {
         super.C(var1, var2, var3);
      }

   }

   protected void E(int var1, int var2, int var3) {
      if(!this.y.U(var1, var2, var3)) {
         super.E(var1, var2, var3);
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      if(this.R != null) {
         if(var2 == 1) {
            this.I.F(this.R, 0);
         } else {
            this.I.F(this.R, var2);
         }

         this.R = null;
         this.K = net.nn.j.E();
         net.nr.h.G();
      } else {
         super.Q(var1, var2);
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.y.Z(var1, var2, var3);
      this.d(this.O, this.Z, q / 2, 8, 16777215);
      boolean var4 = false;

      for(net.nr.h var8 : this.I.i) {
         if(var8.m() != var8.a()) {
            var4 = true;
            break;
         }
      }

      this.J.O = var4;
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
