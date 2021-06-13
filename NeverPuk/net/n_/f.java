package net.n_;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.c.d;
import net.n_.i;
import net.n_.p;
import net.n_.v;
import net.n_.w;
import net.n_.x;
import net.ne.a;
import net.ne.l;
import net.r.r;
import net.s.k;
import net.s.m;
import net.u.t;
import net.yz.a7;
import net.yz.m_;

public class f {
   public static final d j = new d();
   public static f M;
   public static f d;
   private final Map u = Maps.newHashMap();
   private final boolean t;
   private final int Y;
   private String N = "";
   private int a = -1;
   private double o;
   private boolean b;

   @Nullable
   public static f Q(int var0) {
      return (f)j.T(var0);
   }

   public static int N(f var0) {
      return j.D(var0);
   }

   @Nullable
   public static f h(String var0) {
      return (f)j.B(new m_(var0));
   }

   protected f(boolean var1, int var2) {
      this.t = var1;
      this.o = 0.5D;
      this.Y = var2;
   }

   public static String U(i var0) {
      if(var0.x()) {
         return "**:**";
      } else {
         int var1 = var0.S();
         return a7.N(var1);
      }
   }

   protected f i(int var1, int var2) {
      this.a = var1 + var2 * 8;
      return this;
   }

   public void U(a var1, int var2) {
      boolean var3 = i.M();
      if(this == net.nb.b.n) {
         if(var1.h() >= var1.w()) {
            return;
         }

         var1.d(1.0F);
      }

      if(this == net.nb.b.j) {
         if(Float.compare(var1.h(), 1.0F) <= 0) {
            return;
         }

         var1.H(net.yz.z.B, 1.0F);
      }

      if(this == net.nb.b.e) {
         var1.H(net.yz.z.F, 1.0F);
      }

      if(this == net.nb.b.p && var1 instanceof r) {
         ((r)var1).Z(0.005F * (float)(var2 + 1));
      }

      if(this == net.nb.b.F && var1 instanceof r) {
         if(var1.hl.x) {
            return;
         }

         ((r)var1).e().n(var2 + 1, 1.0F);
      }

      if((this != net.nb.b.z || var1.f()) && (this != net.nb.b.W || !var1.f())) {
         if((this != net.nb.b.W || var1.f()) && (this != net.nb.b.z || !var1.f())) {
            return;
         }

         var1.H(net.yz.z.B, (float)(6 << var2));
      }

      var1.d((float)Math.max(4 << var2, 0));
   }

   public void C(@Nullable l var1, @Nullable l var2, a var3, int var4, double var5) {
      if((this != net.nb.b.z || var3.f()) && (this != net.nb.b.W || !var3.f())) {
         if(this == net.nb.b.W && !var3.f() || this == net.nb.b.z && var3.f()) {
            int var8 = (int)(var5 * (double)(6 << var4) + 0.5D);
            var3.H(net.yz.z.B, (float)var8);
         }
      } else {
         int var7 = (int)(var5 * (double)(4 << var4) + 0.5D);
         var3.d((float)var7);
      }

   }

   public boolean w(int var1, int var2) {
      if(this == net.nb.b.n) {
         int var5 = 50 >> var2;
         return var1 % var5 == 0;
      } else if(this == net.nb.b.j) {
         int var4 = 25 >> var2;
         return var1 % var4 == 0;
      } else if(this == net.nb.b.e) {
         int var3 = 40 >> var2;
         return var1 % var3 == 0;
      } else {
         return this == net.nb.b.p;
      }
   }

   public boolean u() {
      return false;
   }

   public f Q(String var1) {
      this.N = var1;
      return this;
   }

   public String s() {
      return this.N;
   }

   public boolean x() {
      return this.a >= 0;
   }

   public int b() {
      return this.a;
   }

   public boolean d() {
      return this.t;
   }

   public static String q(i var0, float var1) {
      if(var0.x()) {
         return "**:**";
      } else {
         int var2 = t.M((float)var0.S() * var1);
         return a7.N(var2);
      }
   }

   protected f P(double var1) {
      this.o = var1;
      return this;
   }

   public int t() {
      return this.Y;
   }

   public f o(net.s.b var1, String var2, double var3, int var5) {
      k var6 = new k(UUID.fromString(var2), this.s(), var3, var5);
      this.u.put(var1, var6);
      return this;
   }

   public Map z() {
      return this.u;
   }

   public void c(a var1, m var2, int var3) {
      for(Entry var5 : this.u.entrySet()) {
         net.s.i var6 = var2.Q((net.s.b)var5.getKey());
         var6.n((k)var5.getValue());
      }

   }

   public void a(a var1, m var2, int var3) {
      for(Entry var5 : this.u.entrySet()) {
         net.s.i var6 = var2.Q((net.s.b)var5.getKey());
         k var7 = (k)var5.getValue();
         var6.n(var7);
         var6.g(new k(var7.s(), this.s() + " " + var3, this.y(var3, var7), var7.X()));
      }

   }

   public double y(int var1, k var2) {
      return var2.e() * (double)(var1 + 1);
   }

   public boolean T() {
      return this.b;
   }

   public f T() {
      this.b = true;
      return this;
   }

   public static void n() {
      j.D(1, new m_("speed"), (new f(false, 8171462)).Q("effect.moveSpeed").i(0, 0).o(net.ne.d.G, "91AEAA56-376B-4498-935B-2F7F68070635", 0.20000000298023224D, 2).T());
      j.D(2, new m_("slowness"), (new f(true, 5926017)).Q("effect.moveSlowdown").i(1, 0).o(net.ne.d.G, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15000000596046448D, 2));
      i.M();
      j.D(3, new m_("haste"), (new f(false, 14270531)).Q("effect.digSpeed").i(2, 0).P(1.5D).T().o(net.ne.d.E, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.10000000149011612D, 2));
      j.D(4, new m_("mining_fatigue"), (new f(true, 4866583)).Q("effect.digSlowDown").i(3, 0).o(net.ne.d.E, "55FCED67-E92A-486E-9800-B47F202C4386", -0.10000000149011612D, 2));
      j.D(5, new m_("strength"), (new p(false, 9643043, 3.0D)).Q("effect.damageBoost").i(4, 0).o(net.ne.d.S, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0D, 0).T());
      j.D(6, new m_("instant_health"), (new w(false, 16262179)).Q("effect.heal").T());
      j.D(7, new m_("instant_damage"), (new w(true, 4393481)).Q("effect.harm").T());
      j.D(8, new m_("jump_boost"), (new f(false, 2293580)).Q("effect.jump").i(2, 1).T());
      j.D(9, new m_("nausea"), (new f(true, 5578058)).Q("effect.confusion").i(3, 1).P(0.25D));
      j.D(10, new m_("regeneration"), (new f(false, 13458603)).Q("effect.regeneration").i(7, 0).P(0.25D).T());
      j.D(11, new m_("resistance"), (new f(false, 10044730)).Q("effect.resistance").i(6, 1).T());
      j.D(12, new m_("fire_resistance"), (new f(false, 14981690)).Q("effect.fireResistance").i(7, 1).T());
      j.D(13, new m_("water_breathing"), (new f(false, 3035801)).Q("effect.waterBreathing").i(0, 2).T());
      j.D(14, new m_("invisibility"), (new f(false, 8356754)).Q("effect.invisibility").i(0, 1).T());
      j.D(15, new m_("blindness"), (new f(true, 2039587)).Q("effect.blindness").i(5, 1).P(0.25D));
      j.D(16, new m_("night_vision"), (new f(false, 2039713)).Q("effect.nightVision").i(4, 1).T());
      j.D(17, new m_("hunger"), (new f(true, 5797459)).Q("effect.hunger").i(1, 1));
      j.D(18, new m_("weakness"), (new p(true, 4738376, -4.0D)).Q("effect.weakness").i(5, 0).o(net.ne.d.S, "22653B89-116E-49DC-9B6B-9971489B5BE5", 0.0D, 0));
      j.D(19, new m_("poison"), (new f(true, 5149489)).Q("effect.poison").i(6, 0).P(0.25D));
      j.D(20, new m_("wither"), (new f(true, 3484199)).Q("effect.wither").i(1, 2).P(0.25D));
      j.D(21, new m_("health_boost"), (new v(false, 16284963)).Q("effect.healthBoost").i(7, 2).o(net.ne.d.C, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0D, 0).T());
      j.D(22, new m_("absorption"), (new x(false, 2445989)).Q("effect.absorption").i(2, 2).T());
      j.D(23, new m_("saturation"), (new w(false, 16262179)).Q("effect.saturation").T());
      j.D(24, new m_("glowing"), (new f(false, 9740385)).Q("effect.glowing").i(4, 2));
      j.D(25, new m_("levitation"), (new f(true, 13565951)).Q("effect.levitation").i(3, 2));
      j.D(26, new m_("luck"), (new f(false, 3381504)).Q("effect.luck").i(5, 2).T().o(net.ne.d.V, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0D, 0));
      j.D(27, new m_("unluck"), (new f(true, 12624973)).Q("effect.unluck").i(6, 2).o(net.ne.d.V, "CC5AF142-2BD2-4215-B636-2605AED11727", -1.0D, 0));
      if(net.u.d.y() == null) {
         i.z(false);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
