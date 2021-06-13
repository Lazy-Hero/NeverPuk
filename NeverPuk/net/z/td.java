package net.z;

import java.io.IOException;
import net.z.g;
import net.z.m;
import net.z.th;
import net.z.tu;

public class td extends tu {
   private final tu b;
   private String S;

   public td(tu var1) {
      this.b = var1;
   }

   public void L() {
      g.B();
      int var2 = 0;
      this.S = net.c9.b.x("options.skinCustomisation.title", new Object[0]);
      net.r.j[] var3 = net.r.j.values();
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         net.r.j var6 = var3[var5];
         this.m.add(new td.a(var6.h(), q / 2 - 155 + var2 % 2 * 160, V / 6 + 24 * (var2 >> 1), 150, 20, var6));
         ++var2;
         ++var5;
      }

      this.m.add(new th(199, q / 2 - 155 + var2 % 2 * 160, V / 6 + 24 * (var2 >> 1), net.nr.d.MAIN_HAND, this.A.T.L(net.nr.d.MAIN_HAND)));
      ++var2;
      if(var2 % 2 == 1) {
         ++var2;
      }

      this.m.add(new m(200, q / 2 - 100, V / 6 + 24 * (var2 >> 1), net.c9.b.x("gui.done", new Object[0])));
   }

   protected void Q(char var1, int var2) throws IOException {
      if(var2 == 1) {
         this.A.T.m();
      }

      super.Q(var1, var2);
   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.b);
         } else if(var1.g == 199) {
            this.A.T.T(net.nr.d.MAIN_HAND, 1);
            var1.J = this.A.T.L(net.nr.d.MAIN_HAND);
            this.A.T.k();
         } else if(var1 instanceof td.a) {
            net.r.j var2 = ((td.a)var1).N;
            this.A.T.V(var2);
            var1.J = this.n(var2);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.S, q / 2, 20, 16777215);
      super.v(var1, var2, var3);
   }

   private String n(net.r.j var1) {
      String var2;
      if(this.A.T.y().contains(var1)) {
         var2 = net.c9.b.x("options.on", new Object[0]);
      } else {
         var2 = net.c9.b.x("options.off", new Object[0]);
      }

      return var1.r().c() + ": " + var2;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   class a extends m {
      private final net.r.j N;

      private a(int var2, int var3, int var4, int var5, int var6, net.r.j var7) {
         super(var2, var3, var4, var5, var6, td.this.n(var7));
         this.N = var7;
      }
   }
}
