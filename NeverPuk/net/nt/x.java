package net.nt;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class x extends net.nv.h {
   public static final Pattern t = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
   private static net.u.d[] E;

   public String k() {
      return "ban-ip";
   }

   public int o() {
      return 3;
   }

   public boolean F(net.nx.f var1, net.nv.f var2) {
      return var1.c().Y().v() && super.F(var1, var2);
   }

   public String K(net.nv.f var1) {
      return "commands.banip.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      if(var3.length >= 1 && var3[0].length() > 1) {
         net.cb.t var4 = var3.length >= 2?O(var2, var3, 1):null;
         Matcher var5 = t.matcher(var3[0]);
         if(var5.matches()) {
            this.w(var1, var2, var3[0], (String)null);
         } else {
            net.r.h var6 = var1.c().F(var3[0]);
            throw new net.nv.k("commands.banip.invalid");
         }
      } else {
         throw new net.nv.x("commands.banip.usage", new Object[0]);
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):Collections.emptyList();
   }

   protected void w(net.nx.f var1, net.nv.f var2, String var3, @Nullable String var4) {
      net.n.f var6 = new net.n.f(var3, (Date)null, var2.Q(), (Date)null, var4);
      var1.c().Y().a(var6);
      List var7 = var1.c().J(var3);
      O();
      String[] var8 = new String[var7.size()];
      int var9 = 0;
      Iterator var10 = var7.iterator();
      if(var10.hasNext()) {
         net.r.h var11 = (net.r.h)var10.next();
         var11.t1.r(new net.cb.h("multiplayer.disconnect.ip_banned", new Object[0]));
         var8[var9++] = var11.Q();
      }

      if(var7.isEmpty()) {
         g(var2, this, "commands.banip.success", new Object[]{var3});
      }

      g(var2, this, "commands.banip.success.players", new Object[]{var3, g(var8)});
   }

   static {
      d((net.u.d[])null);
   }

   public static void d(net.u.d[] var0) {
      E = var0;
   }

   public static net.u.d[] O() {
      return E;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
