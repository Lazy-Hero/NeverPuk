package net.yc;

import com.mojang.text2speech.Narrator;
import net.xn;
import net.cb.c;
import net.cb.h;
import net.cb.t;
import net.nd.i;
import net.nn.j;
import net.yc.e;

public class d implements e {
   public static final d o = new d();
   private final Narrator N = Narrator.getNarrator();
   private static net.u.d[] q;

   public void B(c var1, t var2) {
      int var3 = j.b().T.wj;
      if(this.N.active() && (var3 == 1 || var3 == 2 && var1 == c.CHAT || var3 == 3 && var1 == c.SYSTEM)) {
         if(var2 instanceof h && "chat.type.text".equals(((h)var2).X())) {
            this.N.say((new h("chat.type.text.narrate", ((h)var2).S())).l());
         } else {
            this.N.say(var2.l());
         }
      }

   }

   public void a(int var1) {
      this.N.clear();
      this.N.say((new h("options.narrator", new Object[0])).l() + " : " + (new h(net.nr.d.wG[var1], new Object[0])).l());
      n();
      net.nd.h var3 = j.b().J();
      if(this.N.active()) {
         if(var1 == 0) {
            i.u(var3, i.r.NARRATOR_TOGGLE, new h("narrator.toast.disabled", new Object[0]), (t)null);
            net.u.d.h(new net.u.d[5]);
         }

         i.u(var3, i.r.NARRATOR_TOGGLE, new h("narrator.toast.enabled", new Object[0]), new h(net.nr.d.wG[var1], new Object[0]));
      }

      i.u(var3, i.r.NARRATOR_TOGGLE, new h("narrator.toast.disabled", new Object[0]), new h("options.narrator.notavailable", new Object[0]));
   }

   public boolean l() {
      return this.N.active();
   }

   public void S() {
      this.N.clear();
   }

   static {
      Y(new net.u.d[1]);
   }

   public static void Y(net.u.d[] var0) {
      q = var0;
   }

   public static net.u.d[] n() {
      return q;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
