package net.nc;

import com.google.common.collect.Maps;
import java.util.Map;
import net.xn;
import net.nc.e;
import net.nc.g;
import net.nc.h;
import net.nc.m;
import net.nc.r;

public interface u {
   Map J = Maps.newHashMap();
   u l = new g("dummy");
   u z = new g("trigger");
   u A = new g("deathCount");
   u k = new g("playerKillCount");
   u h = new g("totalKillCount");
   u B = new e("health");
   u g = new r("food");
   u P = new r("air");
   u E = new r("armor");
   u m = new r("xp");
   u p = new r("level");
   u[] r = new u[]{new h("teamkill.", net.cb.z.BLACK), new h("teamkill.", net.cb.z.DARK_BLUE), new h("teamkill.", net.cb.z.DARK_GREEN), new h("teamkill.", net.cb.z.DARK_AQUA), new h("teamkill.", net.cb.z.DARK_RED), new h("teamkill.", net.cb.z.DARK_PURPLE), new h("teamkill.", net.cb.z.GOLD), new h("teamkill.", net.cb.z.GRAY), new h("teamkill.", net.cb.z.DARK_GRAY), new h("teamkill.", net.cb.z.BLUE), new h("teamkill.", net.cb.z.GREEN), new h("teamkill.", net.cb.z.AQUA), new h("teamkill.", net.cb.z.RED), new h("teamkill.", net.cb.z.LIGHT_PURPLE), new h("teamkill.", net.cb.z.YELLOW), new h("teamkill.", net.cb.z.WHITE)};
   u[] G = new u[]{new h("killedByTeam.", net.cb.z.BLACK), new h("killedByTeam.", net.cb.z.DARK_BLUE), new h("killedByTeam.", net.cb.z.DARK_GREEN), new h("killedByTeam.", net.cb.z.DARK_AQUA), new h("killedByTeam.", net.cb.z.DARK_RED), new h("killedByTeam.", net.cb.z.DARK_PURPLE), new h("killedByTeam.", net.cb.z.GOLD), new h("killedByTeam.", net.cb.z.GRAY), new h("killedByTeam.", net.cb.z.DARK_GRAY), new h("killedByTeam.", net.cb.z.BLUE), new h("killedByTeam.", net.cb.z.GREEN), new h("killedByTeam.", net.cb.z.AQUA), new h("killedByTeam.", net.cb.z.RED), new h("killedByTeam.", net.cb.z.LIGHT_PURPLE), new h("killedByTeam.", net.cb.z.YELLOW), new h("killedByTeam.", net.cb.z.WHITE)};

   String k();

   boolean B();

   u.o I();

   public static enum o {
      INTEGER,
      HEARTS;

      private static final Map C;
      private final String z;

      private o(String var3) {
         this.z = var3;
      }

      public String e() {
         return this.z;
      }

      public static u.o l(String var0) {
         m.I();
         u.o var2 = (u.o)C.get(var0);
         return var2 == null?INTEGER:var2;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
