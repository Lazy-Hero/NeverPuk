package net.nv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.j;
import net.nv.t;

public class yc extends h {
   private static final String[] a = new String[]{"Yolo", "Ask for help on twitter", "/deop @p", "Scoreboard deleted, commands blocked", "Contact helpdesk for help", "/testfornoob @p", "/trigger warning", "Oh my god, it\'s full of stats", "/kill @p[name=!Searge]", "Have you tried turning it off and on again?", "Sorry, no help today"};
   private final Random P = new Random();

   public String k() {
      return "help";
   }

   public int o() {
      return 0;
   }

   public String K(f var1) {
      return "commands.help.usage";
   }

   public List s() {
      return Arrays.asList(new String[]{"?"});
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var2 instanceof net.ni.w) {
         var2.r((new net.cb.l("Searge says: ")).z(a[this.P.nextInt(a.length) % a.length]));
      }

      List var5 = this.B(var2, var1);
      boolean var10000 = true;
      int var7 = (var5.size() - 1) / 7;
      int var8 = 0;
      var8 = var3.length == 0?0:g(var3[0], 1, var7 + 1) - 1;
      int var9 = Math.min((var8 + 1) * 7, var5.size());
      net.cb.h var10 = new net.cb.h("commands.help.header", new Object[]{Integer.valueOf(var8 + 1), Integer.valueOf(var7 + 1)});
      var10.E().i(net.cb.z.DARK_GREEN);
      var2.r(var10);
      int var11 = var8 * 7;
      if(var11 < var9) {
         net.nv.z var12 = (net.nv.z)var5.get(var11);
         net.cb.h var13 = new net.cb.h(var12.K(var2), new Object[0]);
         var13.E().V(new net.n6.k(net.n6.k.SUGGEST_COMMAND, "/" + var12.k() + " "));
         var2.r(var13);
         ++var11;
      }

      net.cb.h var16 = new net.cb.h("commands.help.footer", new Object[0]);
      var16.E().i(net.cb.z.GREEN);
      var2.r(var16);
   }

   protected List B(f var1, net.nx.f var2) {
      List var3 = var2.f().C(var1);
      Collections.sort(var3);
      return var3;
   }

   protected Map X(net.nx.f var1) {
      return var1.f().g();
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      if(var3.length == 1) {
         Set var5 = this.X(var1).keySet();
         return D(var3, (String[])var5.toArray(new String[var5.size()]));
      } else {
         return Collections.emptyList();
      }
   }

   static {
      String[] var10000 = new String[]{"Yolo", "Ask for help on twitter", "/deop @p", "Scoreboard deleted, commands blocked", "Contact helpdesk for help", "/testfornoob @p", "/trigger warning", "Oh my god, it\'s full of stats", "/kill @p[name=!Searge]", "Have you tried turning it off and on again?", "Sorry, no help today"};
   }

   private static j a(j var0) {
      return var0;
   }
}
