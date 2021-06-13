package net.yz;

import java.util.List;
import java.util.Random;
import net.xn;
import net.yz.m_;
import org.apache.commons.lang3.StringUtils;

public class o {
   private static final o h = new o();
   private final Random E = new Random();
   private final String[] e = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale phnglui mglwnafh cthulhu rlyeh wgahnagl fhtagnbaguette".split(" ");

   public static o w() {
      return h;
   }

   public String m(net.z.r var1, int var2) {
      int var4 = this.E.nextInt(2) + 3;
      m_.g();
      String var5 = "";
      int var6 = 0;
      if(var6 < var4) {
         var5 = var5 + " ";
         var5 = var5 + this.e[this.E.nextInt(this.e.length)];
         ++var6;
      }

      List var9 = var1.m(var5, var2);
      return StringUtils.join(var9.size() >= 2?var9.subList(0, 2):var9, " ");
   }

   public void z(long var1) {
      this.E.setSeed(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
