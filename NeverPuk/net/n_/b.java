package net.n_;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n_.i;
import net.u.d;
import net.yz.m_;

public class b {
   private static final m_ Q = new m_("empty");
   public static final net.c.p b = new net.c.p(Q);
   private static int x;
   private final String p;
   private final ImmutableList K;

   @Nullable
   public static b I(String var0) {
      return (b)b.B(new m_(var0));
   }

   public b(i... var1) {
      this((String)null, var1);
   }

   public b(@Nullable String var1, i... var2) {
      this.p = var1;
      this.K = ImmutableList.copyOf(var2);
   }

   public String o(String var1) {
      boolean var2 = i.z();
      return this.p == null?var1 + ((m_)b.t(this)).v():var1 + this.p;
   }

   public List s() {
      return this.K;
   }

   public static void r() {
      F("empty", new b(new i[0]));
      i.z();
      F("water", new b(new i[0]));
      F("mundane", new b(new i[0]));
      F("thick", new b(new i[0]));
      F("awkward", new b(new i[0]));
      F("night_vision", new b(new i[]{new i(net.nb.b.G, 3600)}));
      F("long_night_vision", new b("night_vision", new i[]{new i(net.nb.b.G, 9600)}));
      F("invisibility", new b(new i[]{new i(net.nb.b.y, 3600)}));
      F("long_invisibility", new b("invisibility", new i[]{new i(net.nb.b.y, 9600)}));
      F("leaping", new b(new i[]{new i(net.nb.b.q, 3600)}));
      F("long_leaping", new b("leaping", new i[]{new i(net.nb.b.q, 9600)}));
      F("strong_leaping", new b("leaping", new i[]{new i(net.nb.b.q, 1800, 1)}));
      F("fire_resistance", new b(new i[]{new i(net.nb.b.t, 3600)}));
      F("long_fire_resistance", new b("fire_resistance", new i[]{new i(net.nb.b.t, 9600)}));
      F("swiftness", new b(new i[]{new i(net.nb.b.E, 3600)}));
      F("long_swiftness", new b("swiftness", new i[]{new i(net.nb.b.E, 9600)}));
      F("strong_swiftness", new b("swiftness", new i[]{new i(net.nb.b.E, 1800, 1)}));
      F("slowness", new b(new i[]{new i(net.nb.b.h, 1800)}));
      F("long_slowness", new b("slowness", new i[]{new i(net.nb.b.h, 4800)}));
      F("water_breathing", new b(new i[]{new i(net.nb.b.x, 3600)}));
      F("long_water_breathing", new b("water_breathing", new i[]{new i(net.nb.b.x, 9600)}));
      F("healing", new b(new i[]{new i(net.nb.b.z, 1)}));
      F("strong_healing", new b("healing", new i[]{new i(net.nb.b.z, 1, 1)}));
      F("harming", new b(new i[]{new i(net.nb.b.W, 1)}));
      F("strong_harming", new b("harming", new i[]{new i(net.nb.b.W, 1, 1)}));
      F("poison", new b(new i[]{new i(net.nb.b.j, 900)}));
      F("long_poison", new b("poison", new i[]{new i(net.nb.b.j, 1800)}));
      F("strong_poison", new b("poison", new i[]{new i(net.nb.b.j, 432, 1)}));
      F("regeneration", new b(new i[]{new i(net.nb.b.n, 900)}));
      F("long_regeneration", new b("regeneration", new i[]{new i(net.nb.b.n, 1800)}));
      F("strong_regeneration", new b("regeneration", new i[]{new i(net.nb.b.n, 450, 1)}));
      F("strength", new b(new i[]{new i(net.nb.b.L, 3600)}));
      F("long_strength", new b("strength", new i[]{new i(net.nb.b.L, 9600)}));
      F("strong_strength", new b("strength", new i[]{new i(net.nb.b.L, 1800, 1)}));
      F("weakness", new b(new i[]{new i(net.nb.b.a, 1800)}));
      F("long_weakness", new b("weakness", new i[]{new i(net.nb.b.a, 4800)}));
      F("luck", new b("luck", new i[]{new i(net.nb.b.Z, 6000)}));
      b.x();
      d.h(new d[1]);
   }

   protected static void F(String var0, b var1) {
      b.D(x++, new m_(var0), var1);
   }

   public boolean F() {
      boolean var1 = i.z();
      if(!this.K.isEmpty()) {
         UnmodifiableIterator var2 = this.K.iterator();
         if(var2.hasNext()) {
            i var3 = (i)var2.next();
            if(var3.i().u()) {
               return true;
            }
         }
      }

      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
