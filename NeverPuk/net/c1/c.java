package net.c1;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.c1.a;
import net.c1.b;
import net.c1.d;
import net.c1.e;
import net.c1.f;
import net.c1.g;
import net.c1.h;
import net.c1.i;
import net.c1.j;
import net.c1.k;
import net.c1.l;
import net.c1.m;
import net.c1.n;
import net.c1.o;
import net.c1.p;
import net.c1.q;
import net.c1.r;
import net.c1.s;
import net.c1.t;
import net.c1.u;
import net.c1.v;
import net.c1.w;
import net.c1.y;
import net.n0.ks;
import net.nl.z2;
import net.yz.m_;

public abstract class c {
   public static final net.c.d i = new net.c.d();
   private final z2[] D;
   private final c.u r;
   @Nullable
   public d a;
   protected String h;

   @Nullable
   public static c R(int var0) {
      return (c)i.T(var0);
   }

   public static int g(c var0) {
      return i.D(var0);
   }

   @Nullable
   public static c I(String var0) {
      return (c)i.B(new m_(var0));
   }

   protected c(c.u var1, d var2, z2[] var3) {
      this.r = var1;
      this.a = var2;
      this.D = var3;
   }

   public List l(net.ne.a var1) {
      ArrayList var3 = Lists.newArrayList();
      z2[] var4 = this.D;
      y.j();
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         z2 var7 = var4[var6];
         ks var8 = var1.U(var7);
         if(!var8.B()) {
            var3.add(var8);
         }

         ++var6;
      }

      return var3;
   }

   public c.u w() {
      return this.r;
   }

   public int m() {
      return 1;
   }

   public int h() {
      return 1;
   }

   public int O(int var1) {
      return 1 + var1 * 10;
   }

   public int x(int var1) {
      return this.O(var1) + 5;
   }

   public int U(int var1, net.yz.z var2) {
      return 0;
   }

   public float e(int var1, net.ne.u var2) {
      return 0.0F;
   }

   public final boolean q(c var1) {
      return this.k(var1) && var1.k(this);
   }

   protected boolean k(c var1) {
      return this != var1;
   }

   public c Q(String var1) {
      this.h = var1;
      return this;
   }

   public String i() {
      return "enchantment." + this.h;
   }

   public String q(int var1) {
      y.j();
      String var3 = net.yq.e.E(this.i());
      if(this.G()) {
         var3 = net.cb.z.RED + var3;
      }

      return var1 == 1 && this.h() == 1?var3:var3 + " " + net.yq.e.E("enchantment.level." + var1);
   }

   public boolean U(ks var1) {
      return this.a.F(var1.Z());
   }

   public void B(net.ne.a var1, net.ne.l var2, int var3) {
   }

   public void d(net.ne.a var1, net.ne.l var2, int var3) {
   }

   public boolean S() {
      return false;
   }

   public boolean G() {
      return false;
   }

   public static void A() {
      z2[] var1 = new z2[]{z2.HEAD, z2.CHEST, z2.LEGS, z2.FEET};
      i.D(0, new m_("protection"), new u(c.u.COMMON, u.n.ALL, var1));
      i.D(1, new m_("fire_protection"), new u(c.u.UNCOMMON, u.n.FIRE, var1));
      i.D(2, new m_("feather_falling"), new u(c.u.UNCOMMON, u.n.FALL, var1));
      i.D(3, new m_("blast_protection"), new u(c.u.RARE, u.n.EXPLOSION, var1));
      i.D(4, new m_("projectile_protection"), new u(c.u.UNCOMMON, u.n.PROJECTILE, var1));
      i.D(5, new m_("respiration"), new q(c.u.RARE, var1));
      i.D(6, new m_("aqua_affinity"), new f(c.u.RARE, var1));
      i.D(7, new m_("thorns"), new v(c.u.VERY_RARE, var1));
      i.D(8, new m_("depth_strider"), new a(c.u.RARE, var1));
      i.D(9, new m_("frost_walker"), new w(c.u.RARE, new z2[]{z2.FEET}));
      i.D(10, new m_("binding_curse"), new r(c.u.VERY_RARE, var1));
      y.j();
      i.D(16, new m_("sharpness"), new n(c.u.COMMON, 0, new z2[]{z2.MAINHAND}));
      i.D(17, new m_("smite"), new n(c.u.UNCOMMON, 1, new z2[]{z2.MAINHAND}));
      i.D(18, new m_("bane_of_arthropods"), new n(c.u.UNCOMMON, 2, new z2[]{z2.MAINHAND}));
      i.D(19, new m_("knockback"), new k(c.u.UNCOMMON, new z2[]{z2.MAINHAND}));
      i.D(20, new m_("fire_aspect"), new p(c.u.RARE, new z2[]{z2.MAINHAND}));
      i.D(21, new m_("looting"), new g(c.u.RARE, d.WEAPON, new z2[]{z2.MAINHAND}));
      i.D(22, new m_("sweeping"), new b(c.u.RARE, new z2[]{z2.MAINHAND}));
      i.D(32, new m_("efficiency"), new net.c1.z(c.u.COMMON, new z2[]{z2.MAINHAND}));
      i.D(33, new m_("silk_touch"), new o(c.u.VERY_RARE, new z2[]{z2.MAINHAND}));
      i.D(34, new m_("unbreaking"), new m(c.u.UNCOMMON, new z2[]{z2.MAINHAND}));
      i.D(35, new m_("fortune"), new g(c.u.RARE, d.DIGGER, new z2[]{z2.MAINHAND}));
      i.D(48, new m_("power"), new h(c.u.COMMON, new z2[]{z2.MAINHAND}));
      i.D(49, new m_("punch"), new t(c.u.RARE, new z2[]{z2.MAINHAND}));
      i.D(50, new m_("flame"), new j(c.u.RARE, new z2[]{z2.MAINHAND}));
      i.D(51, new m_("infinity"), new l(c.u.VERY_RARE, new z2[]{z2.MAINHAND}));
      i.D(61, new m_("luck_of_the_sea"), new g(c.u.RARE, d.FISHING_ROD, new z2[]{z2.MAINHAND}));
      i.D(62, new m_("lure"), new i(c.u.RARE, d.FISHING_ROD, new z2[]{z2.MAINHAND}));
      i.D(70, new m_("mending"), new e(c.u.RARE, z2.values()));
      i.D(71, new m_("vanishing_curse"), new s(c.u.VERY_RARE, z2.values()));
      net.u.d.h(new net.u.d[1]);
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static enum u {
      COMMON(10),
      UNCOMMON(5),
      RARE(2),
      VERY_RARE(1);

      private final int C;

      private u(int var3) {
         this.C = var3;
      }

      public int S() {
         return this.C;
      }
   }
}
