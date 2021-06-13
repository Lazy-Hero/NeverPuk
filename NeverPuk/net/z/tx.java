package net.z;

import java.awt.Color;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.m4;
import net.xh;
import net.z.g;
import net.z.m;
import net.z.t;
import net.z.tt;
import net.z.tu;

public class tx extends tu {
   private final String K;
   private final net.cb.t F;
   private List b;
   private final tu H;
   private int z;

   public tx(tu var1, String var2, net.cb.t var3) {
      this.H = var1;
      this.K = net.c9.b.x(var2, new Object[0]);
      this.F = var3;
   }

   protected void Q(char var1, int var2) throws IOException {
   }

   public void L() {
      this.m.clear();
      this.b = this.O.m(this.F.c(), q - 50);
      this.z = this.b.size() * this.O.R;
      this.m.add(new m(0, q / 2 - 100, Math.min(V / 2 + this.z / 2 + this.O.R, V - 30), net.c9.b.x("gui.toMenu", new Object[0])));
      this.m.add(new m(1, q / 2 - 100, Math.min(V / 2 + this.z / 2 + this.O.R + 23, V - 30), net.c9.b.x("Reconnect", new Object[0])));
   }

   protected void t(m var1) throws IOException {
      switch(var1.g) {
      case 0:
         this.A.s(this.H);
         break;
      case 1:
         this.A.J((net.cp.v)null);
         this.A.s(new net.cp.e(new tt(), this.A, m4.J));
      }

   }

   public void v(int var1, int var2, float var3) {
      t var5 = new t(this.A);
      xh.T(-5.0D, 0.0D, (double)(var5.u() - -6), (double)var5.v(), 0.5D, (new Color(40, 40, 40, 255)).getRGB(), (new Color(60, 60, 60, 255)).getRGB(), true);
      g.C();
      xh.T(1.0D, 1.4D, (double)(var5.u() - 1), (double)var5.v() - 1.7D, 0.5D, (new Color(22, 22, 22, 255)).getRGB(), (new Color(60, 60, 60, 255)).getRGB(), true);
      this.d(this.O, this.K, q / 2, V / 2 - this.z / 2 - this.O.R * 2, 11184810);
      int var6 = V / 2 - this.z / 2;
      if(this.b != null) {
         Iterator var7 = this.b.iterator();
         if(var7.hasNext()) {
            String var8 = (String)var7.next();
            this.d(this.O, var8, q / 2, var6, 16777215);
            int var10000 = var6 + this.O.R;
         }
      }

      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
