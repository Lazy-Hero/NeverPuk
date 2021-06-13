package net.c2;

import java.io.IOException;
import net.c2.j;
import net.cb.l;
import net.ni.sg;
import net.yp.v;
import net.yz.a3;
import net.z.tu;
import org.lwjgl.input.Keyboard;

public class g extends tu {
   private final sg w;
   private int o;
   private int Q;
   private net.z.m W;

   public g(sg var1) {
      this.w = var1;
   }

   public void L() {
      this.m.clear();
      Keyboard.enableRepeatEvents(true);
      this.W = this.x(new net.z.m(0, q / 2 - 100, V / 4 + 120, net.c9.b.x("gui.done", new Object[0])));
      this.w.p(false);
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
      v var1 = this.A.d();
      var1.L((net.n2.k)(new net.m.z(this.w.C(), this.w.k)));
      this.w.p(true);
   }

   public void K() {
      ++this.o;
   }

   protected void t(net.z.m var1) throws IOException {
      if(var1.O && var1.g == 0) {
         this.w.W();
         this.A.s((tu)null);
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      if(var2 == 200) {
         this.Q = this.Q - 1 & 3;
      }

      if(var2 == 208 || var2 == 28 || var2 == 156) {
         this.Q = this.Q + 1 & 3;
      }

      String var3 = this.w.k[this.Q].l();
      if(var2 == 14 && !var3.isEmpty()) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      if(a3.s(var1) && this.O.r(var3 + var1) <= 90) {
         var3 = var3 + var1;
      }

      this.w.k[this.Q] = new l(var3);
      if(var2 == 1) {
         this.t(this.W);
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, net.c9.b.x("sign.edit", new Object[0]), q / 2, 40, 16777215);
      j.u.g();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.y.d.c();
      net.y.d.O((float)(q / 2), 0.0F, 50.0F);
      float var10000 = 93.75F;
      net.y.d.W(-93.75F, -93.75F, -93.75F);
      net.y.d.P(180.0F, 0.0F, 1.0F, 0.0F);
      net.y9.l var6 = this.w.a();
      if(var6 == net.nb.f.uL) {
         float var7 = (float)(this.w.B() * 360) / 16.0F;
         net.y.d.P(var7, 0.0F, 1.0F, 0.0F);
         net.y.d.O(0.0F, -1.0625F, 0.0F);
      }

      int var9 = this.w.B();
      float var8 = 0.0F;
      if(var9 == 2) {
         var8 = 180.0F;
      }

      if(var9 == 4) {
         var8 = 90.0F;
      }

      if(var9 == 5) {
         var8 = -90.0F;
      }

      net.y.d.P(var8, 0.0F, 1.0F, 0.0F);
      net.y.d.O(0.0F, -1.0625F, 0.0F);
      if(this.o / 6 % 2 == 0) {
         this.w.c = this.Q;
      }

      net.c5.g.E.f(this.w, -0.5D, -0.75D, -0.5D, 0.0F);
      this.w.c = -1;
      net.y.d.Y();
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
