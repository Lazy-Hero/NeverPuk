package net.z;

import java.io.IOException;
import net.z.f;
import net.z.g;
import net.z.m;
import net.z.wz;

public class wa extends wz {
   private final String F;
   private final String y;
   private final String R;
   private boolean s;

   public wa(f var1, String var2, int var3, boolean var4) {
      boolean var5 = g.B();
      super(var1, net.c9.b.x("chat.link.confirmTrusted", new Object[0]), var2, var3);
      this.s = true;
      this.r = net.c9.b.x("chat.link.open", new Object[0]);
      this.J = net.c9.b.x("gui.cancel", new Object[0]);
      this.y = net.c9.b.x("chat.copy", new Object[0]);
      this.F = net.c9.b.x("chat.link.warning", new Object[0]);
      this.R = var2;
   }

   public void L() {
      super.L();
      this.m.clear();
      this.m.add(new m(0, q / 2 - 50 - 105, V / 6 + 96, 100, 20, this.r));
      this.m.add(new m(2, q / 2 - 50, V / 6 + 96, 100, 20, this.y));
      this.m.add(new m(1, q / 2 - 50 + 105, V / 6 + 96, 100, 20, this.J));
   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.B();
      if(var1.g == 2) {
         this.d();
      }

      this.a.y(var1.g == 0, this.f);
   }

   public void d() {
      G(this.R);
   }

   public void v(int var1, int var2, float var3) {
      g.C();
      super.v(var1, var2, var3);
      if(this.s) {
         this.d(this.O, this.F, q / 2, 110, 16764108);
      }

   }

   public void e() {
      this.s = false;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
