package net.z;

import java.io.IOException;
import net.z.g;
import net.z.m;
import net.z.th;
import net.z.tl;
import net.z.tu;

public class wy extends tu {
   private static final net.nr.d[] f = new net.nr.d[]{net.nr.d.CHAT_VISIBILITY, net.nr.d.CHAT_COLOR, net.nr.d.CHAT_LINKS, net.nr.d.CHAT_OPACITY, net.nr.d.CHAT_LINKS_PROMPT, net.nr.d.CHAT_SCALE, net.nr.d.CHAT_HEIGHT_FOCUSED, net.nr.d.CHAT_HEIGHT_UNFOCUSED, net.nr.d.CHAT_WIDTH, net.nr.d.REDUCED_DEBUG_INFO, net.nr.d.NARRATOR};
   private final tu l;
   private final net.nr.d s;
   private String a;
   private th Y;

   public wy(tu var1, net.nr.d var2) {
      this.l = var1;
      this.s = var2;
   }

   public void L() {
      this.a = net.c9.b.x("options.chat.title", new Object[0]);
      g.C();
      int var2 = 0;
      net.nr.d[] var3 = f;
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         net.nr.d var6 = var3[var5];
         if(var6.k()) {
            this.m.add(new tl(var6.p(), q / 2 - 155 + var2 % 2 * 160, V / 6 + 24 * (var2 >> 1), var6));
         }

         th var7 = new th(var6.p(), q / 2 - 155 + var2 % 2 * 160, V / 6 + 24 * (var2 >> 1), var6, this.s.L(var6));
         this.m.add(var7);
         if(var6 == net.nr.d.NARRATOR) {
            this.Y = var7;
            var7.O = net.yc.d.o.l();
         }

         ++var2;
         ++var5;
      }

      this.m.add(new m(200, q / 2 - 100, V / 6 + 144, net.c9.b.x("gui.done", new Object[0])));
   }

   protected void Q(char var1, int var2) throws IOException {
      if(var2 == 1) {
         this.A.T.m();
      }

      super.Q(var1, var2);
   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         if(var1.g < 100 && var1 instanceof th) {
            this.s.T(((th)var1).P(), 1);
            var1.J = this.s.L(net.nr.d.i(var1.g));
         }

         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.l);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.a, q / 2, 20, 16777215);
      super.v(var1, var2, var3);
   }

   public void e() {
      this.Y.J = this.s.L(net.nr.d.i(this.Y.g));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
