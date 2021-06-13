package net.n0;

import com.google.common.base.Predicates;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.UUID;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.nl.z2;
import net.y9.zz;
import net.yz.ad;
import net.yz.am;
import net.yz.aq;

public class j extends y {
   private static final int[] m = new int[]{13, 15, 16, 11};
   private static final UUID[] t = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
   public static final String[] E = new String[]{"minecraft:items/empty_armor_slot_boots", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_helmet"};
   public static final net.n4.k H = new net.n4.y() {
      protected ks B(net.n4.i var1, ks var2) {
         kw.b();
         ks var4 = j.N(var1, var2);
         return var4.B()?super.B(var1, var2):var4;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   public final z2 Q;
   public final int x;
   public final float G;
   public final int F;
   private final j.n W;

   public static ks N(net.n4.i var0, ks var1) {
      kw.b();
      net.u.j var3 = var0.X().C((aq)var0.K().i(zz.H));
      List var4 = var0.v().L(net.ne.a.class, new net.u.e(var3), Predicates.and(net.yz.q.n, new net.yz.q(var1)));
      if(var4.isEmpty()) {
         return ks.a;
      } else {
         net.ne.a var5 = (net.ne.a)var4.get(0);
         z2 var6 = net.ne.y.M(var1);
         ks var7 = var1.w(1);
         var5.u(var6, var7);
         if(var5 instanceof net.ne.y) {
            ((net.ne.y)var5).a(var6, 2.0F);
         }

         return var1;
      }
   }

   public j(j.n var1, int var2, z2 var3) {
      this.W = var1;
      this.Q = var3;
      this.F = var2;
      this.x = var1.l(var3);
      this.d(var1.z(var3));
      this.G = var1.i();
      this.S = 1;
      this.M(net.ys.r.R);
      zz.f.H(this, H);
   }

   public z2 J() {
      return this.Q;
   }

   public int z() {
      return this.W.m();
   }

   public j.n R() {
      return this.W;
   }

   public boolean G(ks var1) {
      if(this.W != j.n.LEATHER) {
         return false;
      } else {
         net.nj.f var2 = var1.o();
         return var2.K("display", 10) && var2.o("display").K("color", 3);
      }
   }

   public int e(ks var1) {
      if(this.W != j.n.LEATHER) {
         return 16777215;
      } else {
         net.nj.f var2 = var1.o();
         net.nj.f var3 = var2.o("display");
         return var3.K("color", 3)?var3.P("color"):10511680;
      }
   }

   public void k(ks var1) {
      if(this.W == j.n.LEATHER) {
         net.nj.f var2 = var1.o();
         net.nj.f var3 = var2.o("display");
         if(var3.G("color")) {
            var3.A("color");
         }
      }

   }

   public void k(ks var1, int var2) {
      if(this.W != j.n.LEATHER) {
         throw new UnsupportedOperationException("Can\'t dye non-leather!");
      } else {
         net.nj.f var3 = var1.o();
         var3 = new net.nj.f();
         var1.t(var3);
         net.nj.f var4 = var3.o("display");
         if(!var3.K("display", 10)) {
            var3.K("display", var4);
         }

         var4.r("color", var2);
      }
   }

   public boolean l(ks var1, ks var2) {
      return this.W.l() == var2.Z() || super.l(var1, var2);
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var4 = var2.o((net.yz.k)var3);
      z2 var5 = net.ne.y.M(var4);
      ks var6 = var2.U(var5);
      if(var6.B()) {
         var2.u(var5, var4.s());
         var4.u(0);
         return new am(ad.SUCCESS, var4);
      } else {
         return new am(ad.FAIL, var4);
      }
   }

   public Multimap v(z2 var1) {
      kw.b();
      Multimap var3 = super.v(var1);
      if(var1 == this.Q) {
         var3.put(net.ne.d.g.K(), new net.s.k(t[var1.l()], "Armor modifier", (double)this.x, 0));
         var3.put(net.ne.d.f.K(), new net.s.k(t[var1.l()], "Armor toughness", (double)this.G, 0));
      }

      return var3;
   }

   static {
      String[] var10000 = new String[]{"minecraft:items/empty_armor_slot_boots", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_helmet"};
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   public static enum n {
      LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, net.nb.l.P_, 0.0F),
      CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, net.nb.l.oF, 0.0F),
      IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, net.nb.l.HK, 0.0F),
      GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, net.nb.l.D2, 0.0F),
      DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, net.nb.l.u, 2.0F);

      private final String n;
      private final int t;
      private final int[] C;
      private final int m;
      private final net.yz.a r;
      private final float U;

      private n(String var3, int var4, int[] var5, int var6, net.yz.a var7, float var8) {
         this.n = var3;
         this.t = var4;
         this.C = var5;
         this.m = var6;
         this.r = var7;
         this.U = var8;
      }

      public int z(z2 var1) {
         return j.m[var1.l()] * this.t;
      }

      public int l(z2 var1) {
         return this.C[var1.l()];
      }

      public int m() {
         return this.m;
      }

      public net.yz.a K() {
         return this.r;
      }

      public y l() {
         int[] var1 = kw.b();
         return this == LEATHER?net.nb.j.Yr:(this == CHAIN?net.nb.j.S1:(this == GOLD?net.nb.j.F:(this == IRON?net.nb.j.S1:(this == DIAMOND?net.nb.j.B:null))));
      }

      public String b() {
         return this.n;
      }

      public float i() {
         return this.U;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
