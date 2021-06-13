package net.n0;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.n0.k7;
import net.n0.kt;
import net.n0.kw;
import net.n0.y;
import net.nl.z2;
import net.yz.ad;
import net.yz.am;
import net.yz.aq;
import net.yz.m_;

public final class ks {
   public static final ks a = new ks((y)null);
   public static final DecimalFormat x = new DecimalFormat("#.##");
   public int p;
   private int T;
   private final y W;
   private net.nj.f k;
   private boolean Z;
   private int B;
   private net.nm.e C;
   private net.y9.l j;
   private boolean R;
   private net.y9.l q;
   private boolean u;
   private static String[] D;

   public ks(net.y9.l var1) {
      this((net.y9.l)var1, 1);
   }

   public ks(net.y9.l var1, int var2) {
      this((net.y9.l)var1, var2, 0);
   }

   public ks(net.y9.l var1, int var2, int var3) {
      this(y.q(var1), var2, var3);
   }

   public ks(y var1) {
      this((y)var1, 1);
   }

   public ks(y var1, int var2) {
      this((y)var1, var2, 0);
   }

   public ks(y var1, int var2, int var3) {
      this.W = var1;
      this.B = var3;
      this.p = var2;
      if(this.B < 0) {
         this.B = 0;
      }

      this.l();
   }

   private void l() {
      this.Z = this.B();
   }

   public ks(net.nj.f var1) {
      this.W = y.H(var1.J("id"));
      this.p = var1.R("Count");
      this.B = Math.max(0, var1.E("Damage"));
      if(var1.K("tag", 10)) {
         this.k = var1.o("tag");
         if(this.W != null) {
            this.W.v(var1);
         }
      }

      this.l();
   }

   public boolean B() {
      return this == a?true:(this.W != null && this.W != y.q(net.nb.f.ou)?(this.p <= 0?true:this.B < -32768 || this.B > '\uffff'):true);
   }

   public static void K(net.c0.d var0) {
      var0.U(net.c0.q.ITEM_INSTANCE, new net.ng.o());
      var0.U(net.c0.q.ITEM_INSTANCE, new net.ng.e());
   }

   public ks w(int var1) {
      int var2 = Math.min(var1, this.p);
      ks var3 = this.s();
      var3.u(var2);
      this.H(var2);
      return var3;
   }

   public y Z() {
      return this.Z?y.q(net.nb.f.ou):this.W;
   }

   public ad o(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      ad var9 = this.Z().y(var1, var2, var3, var4, var5, var6, var7, var8);
      if(var9 == ad.SUCCESS) {
         var1.S(net.v.q.H(this.W));
      }

      return var9;
   }

   public float y(net.yw.n var1) {
      return this.Z().V(this, var1);
   }

   public am N(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      return this.Z().G(var1, var2, var3);
   }

   public ks y(net.yv.r var1, net.ne.a var2) {
      return this.Z().V(this, var1, var2);
   }

   public net.nj.f Z(net.nj.f var1) {
      m_ var2 = (m_)y.V.t(this.W);
      var1.b("id", "minecraft:air");
      var1.D("Count", (byte)this.p);
      var1.h("Damage", (short)this.B);
      if(this.k != null) {
         var1.K("tag", this.k);
      }

      return var1;
   }

   public int j() {
      return this.Z().E();
   }

   public boolean y() {
      return this.j() > 1 && (!this.M() || !this.j());
   }

   public boolean M() {
      return this.Z?false:(this.W.F() <= 0?false:!this.D() || !this.o().i("Unbreakable"));
   }

   public boolean z() {
      return this.Z().I();
   }

   public boolean j() {
      return this.M() && this.B > 0;
   }

   public int z() {
      return this.B;
   }

   public int n() {
      return this.B;
   }

   public void d(int var1) {
      this.B = var1;
      if(this.B < 0) {
         this.B = 0;
      }

   }

   public int Z() {
      return this.Z().F();
   }

   public boolean M(int var1, Random var2, @Nullable net.r.h var3) {
      if(!this.M()) {
         return false;
      } else {
         int var4 = net.c1.y.g(net.nb.u.r, this);
         int var5 = 0;

         for(int var6 = 0; var6 < var1; ++var6) {
            if(net.c1.m.l(this, var4, var2)) {
               ++var5;
            }
         }

         var1 = var1 - var5;
         return false;
      }
   }

   public void S(int var1, net.ne.a var2) {
      if((!(var2 instanceof net.r.r) || !((net.r.r)var2).a6.V) && this.M() && this.M(var1, var2.Q(), var2 instanceof net.r.h?(net.r.h)var2:null)) {
         var2.T(this);
         this.H(1);
         if(var2 instanceof net.r.r) {
            net.r.r var3 = (net.r.r)var2;
            var3.S(net.v.q.u(this.W));
         }

         this.B = 0;
      }

   }

   public void H(net.ne.a var1, net.r.r var2) {
      boolean var3 = this.W.S(this, var1, var2);
      var2.S(net.v.q.H(this.W));
   }

   public void h(net.yv.r var1, net.yw.n var2, net.u.j var3, net.r.r var4) {
      boolean var5 = this.Z().Y(this, var1, var2, var3, var4);
      var4.S(net.v.q.H(this.W));
   }

   public boolean D(net.yw.n var1) {
      return this.Z().W(var1);
   }

   public boolean f(net.r.r var1, net.ne.a var2, net.yz.k var3) {
      return this.Z().X(this, var1, var2, var3);
   }

   public ks s() {
      ks var1 = new ks(this.W, this.p, this.B);
      var1.S(this.G());
      if(this.k != null) {
         var1.k = this.k.F();
      }

      return var1;
   }

   public static boolean a(ks var0, ks var1) {
      return var0.B() && var1.B()?true:(!var0.B() && !var1.B()?(var0.k == null && var1.k != null?false:var0.k == null || var0.k.equals(var1.k)):false);
   }

   public static boolean D(ks var0, ks var1) {
      return var0.B() && var1.B()?true:!var0.B() && !var1.B() && var0.e(var1);
   }

   private boolean e(ks var1) {
      return this.p != var1.p?false:(this.Z() != var1.Z()?false:(this.B != var1.B?false:(this.k == null && var1.k != null?false:this.k == null || this.k.equals(var1.k))));
   }

   public static boolean K(ks var0, ks var1) {
      return var0 == var1?true:!var0.B() && !var1.B() && var0.g(var1);
   }

   public static boolean n(ks var0, ks var1) {
      return var0 == var1?true:!var0.B() && !var1.B() && var0.J(var1);
   }

   public boolean g(ks var1) {
      return !var1.B() && this.W == var1.W && this.B == var1.B;
   }

   public boolean J(ks var1) {
      return !this.M()?this.g(var1):!var1.B() && this.W == var1.W;
   }

   public String e() {
      return this.Z().f(this);
   }

   public String toString() {
      return this.p + "x" + this.Z().z() + "@" + this.B;
   }

   public void o(net.yv.r var1, net.ne.l var2, int var3, boolean var4) {
      if(this.T > 0) {
         --this.T;
      }

      if(this.W != null) {
         this.W.j(this, var1, var2, var3, var4);
      }

   }

   public void P(net.yv.r var1, net.r.r var2, int var3) {
      var2.m(net.v.q.W(this.W), var3);
      this.Z().g(this, var1, var2);
   }

   public int o() {
      return this.Z().K(this);
   }

   public k7 D() {
      return this.Z().g(this);
   }

   public void w(net.yv.r var1, net.ne.a var2, int var3) {
      this.Z().k(this, var1, var2, var3);
   }

   public boolean D() {
      return !this.Z && this.k != null;
   }

   @Nullable
   public net.nj.f o() {
      return this.k;
   }

   public net.nj.f c(String var1) {
      if(this.k != null && this.k.K(var1, 10)) {
         return this.k.o(var1);
      } else {
         net.nj.f var2 = new net.nj.f();
         this.Q(var1, var2);
         return var2;
      }
   }

   @Nullable
   public net.nj.f j(String var1) {
      return this.k != null && this.k.K(var1, 10)?this.k.o(var1):null;
   }

   public void Q(String var1) {
      if(this.k != null && this.k.K(var1, 10)) {
         this.k.A(var1);
      }

   }

   public net.nj.h q() {
      return this.k != null?this.k.A("ench", 10):new net.nj.h();
   }

   public void t(@Nullable net.nj.f var1) {
      this.k = var1;
   }

   public String j() {
      net.nj.f var1 = this.j("display");
      return var1.K("Name", 8)?var1.J("Name"):(var1.K("LocName", 8)?net.yq.e.E(var1.J("LocName")):this.Z().m(this));
   }

   public ks Q(String var1) {
      this.c("display").b("LocName", var1);
      return this;
   }

   public ks m(String var1) {
      this.c("display").b("Name", var1);
      return this;
   }

   public void p() {
      net.nj.f var1 = this.j("display");
      var1.A("Name");
      if(var1.N()) {
         this.Q("display");
      }

      if(this.k != null && this.k.N()) {
         this.k = null;
      }

   }

   public boolean v() {
      net.nj.f var1 = this.j("display");
      return var1.K("Name", 8);
   }

   public List G(@Nullable net.r.r var1, net.yf.f var2) {
      ArrayList var4 = Lists.newArrayList();
      kw.b();
      String var5 = this.j();
      if(this.v()) {
         var5 = net.cb.z.ITALIC + var5;
      }

      var5 = var5 + net.cb.z.RESET;
      if(var2.c()) {
         String var6 = "";
         if(!var5.isEmpty()) {
            var5 = var5 + " (";
            var6 = ")";
         }

         int var7 = y.h(this.W);
         if(this.z()) {
            var5 = var5 + String.format("#%04d/%d%s", new Object[]{Integer.valueOf(var7), Integer.valueOf(this.B), var6});
         }

         var5 = var5 + String.format("#%04d%s", new Object[]{Integer.valueOf(var7), var6});
      }

      if(!this.v() && this.W == net.nb.j.WN) {
         var5 = var5 + " #" + this.B;
      }

      var4.add(var5);
      int var21 = 0;
      if(this.D() && this.k.K("HideFlags", 99)) {
         var21 = this.k.P("HideFlags");
      }

      int var10000 = var21 & 32;
      this.Z().h(this, var1 == null?null:var1.hl, var4, var2);
      if(this.D()) {
         var10000 = var21 & 1;
         net.nj.h var22 = this.q();
         int var8 = 0;
         if(var8 < var22.z()) {
            net.nj.f var9 = var22.i(var8);
            short var10 = var9.E("id");
            short var11 = var9.E("lvl");
            net.c1.c var12 = net.c1.c.R(var10);
            var4.add(var12.q(var11));
            ++var8;
         }

         if(this.k.K("display", 10)) {
            net.nj.f var23 = this.k.o("display");
            if(var23.K("color", 3)) {
               if(var2.c()) {
                  var4.add(net.yq.e.x("item.color", new Object[]{String.format("#%06X", new Object[]{Integer.valueOf(var23.P("color"))})}));
               }

               var4.add(net.cb.z.ITALIC + net.yq.e.E("item.dyed"));
            }

            if(var23.r("Lore") == 9) {
               net.nj.h var28 = var23.A("Lore", 8);
               if(!var28.N()) {
                  int var34 = 0;
                  if(var34 < var28.z()) {
                     var4.add(net.cb.z.DARK_PURPLE + "" + net.cb.z.ITALIC + var28.w(var34));
                     ++var34;
                  }
               }
            }
         }
      }

      z2[] var24 = z2.values();
      int var29 = var24.length;
      int var36 = 0;
      if(var36 < var29) {
         z2 var40 = var24[var36];
         Multimap var41 = this.Z(var40);
         if(!var41.isEmpty()) {
            var10000 = var21 & 2;
            var4.add("");
            var4.add(net.yq.e.E("item.modifiers." + var40.H()));
            Iterator var42 = var41.entries().iterator();
            if(var42.hasNext()) {
               Entry var13 = (Entry)var42.next();
               net.s.k var14 = (net.s.k)var13.getValue();
               double var15 = var14.e();
               boolean var17 = false;
               if(var14.s() == y.U) {
                  var15 = var15 + var1.t(net.ne.d.S).J();
                  var15 = var15 + (double)net.c1.y.M(this, net.ne.u.UNDEFINED);
                  var17 = true;
               }

               if(var14.s() == y.v) {
                  var15 += var1.t(net.ne.d.E).J();
                  var17 = true;
               }

               if(var14.X() != 1 && var14.X() != 2) {
                  ;
               }

               double var18 = var15 * 100.0D;
               if(var15 > 0.0D) {
                  var4.add(net.cb.z.BLUE + " " + net.yq.e.x("attribute.modifier.plus." + var14.X(), new Object[]{x.format(var18), net.yq.e.E("attribute.name." + (String)var13.getKey())}));
               }

               if(var15 < 0.0D) {
                  var18 = var18 * -1.0D;
                  var4.add(net.cb.z.RED + " " + net.yq.e.x("attribute.modifier.take." + var14.X(), new Object[]{x.format(var18), net.yq.e.E("attribute.name." + (String)var13.getKey())}));
               }
            }
         }

         ++var36;
      }

      if(this.D() && this.o().i("Unbreakable")) {
         var10000 = var21 & 4;
         var4.add(net.cb.z.BLUE + net.yq.e.E("item.unbreakable"));
      }

      if(this.D() && this.k.K("CanDestroy", 9)) {
         var10000 = var21 & 8;
         net.nj.h var25 = this.k.A("CanDestroy", 8);
         if(!var25.N()) {
            var4.add("");
            var4.add(net.cb.z.GRAY + net.yq.e.E("item.canBreak"));
            var29 = 0;
            if(var29 < var25.z()) {
               net.y9.l var38 = net.y9.l.d(var25.w(var29));
               if(var38 != null) {
                  var4.add(net.cb.z.DARK_GRAY + var38.U());
               }

               var4.add(net.cb.z.DARK_GRAY + "missingno");
               ++var29;
            }
         }
      }

      if(this.D() && this.k.K("CanPlaceOn", 9)) {
         var10000 = var21 & 16;
         net.nj.h var26 = this.k.A("CanPlaceOn", 8);
         if(!var26.N()) {
            var4.add("");
            var4.add(net.cb.z.GRAY + net.yq.e.E("item.canPlace"));
            var29 = 0;
            if(var29 < var26.z()) {
               net.y9.l var39 = net.y9.l.d(var26.w(var29));
               if(var39 != null) {
                  var4.add(net.cb.z.DARK_GRAY + var39.U());
               }

               var4.add(net.cb.z.DARK_GRAY + "missingno");
               ++var29;
            }
         }
      }

      if(var2.c()) {
         if(this.j()) {
            var4.add(net.yq.e.x("item.durability", new Object[]{Integer.valueOf(this.Z() - this.z()), Integer.valueOf(this.Z())}));
         }

         var4.add(net.cb.z.DARK_GRAY + ((m_)y.V.t(this.W)).toString());
         if(this.D()) {
            var4.add(net.cb.z.DARK_GRAY + net.yq.e.x("item.nbt_tags", new Object[]{Integer.valueOf(this.o().b().size())}));
         }
      }

      return var4;
   }

   public boolean q() {
      return this.Z().F(this);
   }

   public kt p() {
      return this.Z().B(this);
   }

   public boolean d() {
      return !this.Z().x(this)?false:!this.g();
   }

   public void N(net.c1.c var1, int var2) {
      if(this.k == null) {
         this.t(new net.nj.f());
      }

      if(!this.k.K("ench", 9)) {
         this.k.K("ench", new net.nj.h());
      }

      net.nj.h var3 = this.k.A("ench", 10);
      net.nj.f var4 = new net.nj.f();
      var4.h("id", (short)net.c1.c.g(var1));
      var4.h("lvl", (short)((byte)var2));
      var3.m(var4);
   }

   public boolean g() {
      return this.k != null && this.k.K("ench", 9)?!this.k.A("ench", 10).N():false;
   }

   public void Q(String var1, net.nj.q var2) {
      if(this.k == null) {
         this.t(new net.nj.f());
      }

      this.k.K(var1, var2);
   }

   public boolean U() {
      return this.Z().W();
   }

   public boolean E() {
      return this.C != null;
   }

   public void C(net.nm.e var1) {
      this.C = var1;
   }

   @Nullable
   public net.nm.e o() {
      return this.Z?null:this.C;
   }

   public int X() {
      return this.D() && this.k.K("RepairCost", 3)?this.k.P("RepairCost"):0;
   }

   public void J(int var1) {
      if(!this.D()) {
         this.k = new net.nj.f();
      }

      this.k.r("RepairCost", var1);
   }

   public Multimap Z(z2 var1) {
      Object var2;
      if(this.D() && this.k.K("AttributeModifiers", 9)) {
         var2 = HashMultimap.create();
         net.nj.h var3 = this.k.A("AttributeModifiers", 10);

         for(int var4 = 0; var4 < var3.z(); ++var4) {
            net.nj.f var5 = var3.i(var4);
            net.s.k var6 = net.ne.d.w(var5);
            if((!var5.K("Slot", 8) || var5.J("Slot").equals(var1.H())) && var6.s().getLeastSignificantBits() != 0L && var6.s().getMostSignificantBits() != 0L) {
               ((Multimap)var2).put(var5.J("AttributeName"), var6);
            }
         }
      } else {
         var2 = this.Z().v(var1);
      }

      return (Multimap)var2;
   }

   public void Z(String var1, net.s.k var2, @Nullable z2 var3) {
      if(this.k == null) {
         this.k = new net.nj.f();
      }

      if(!this.k.K("AttributeModifiers", 9)) {
         this.k.K("AttributeModifiers", new net.nj.h());
      }

      net.nj.h var4 = this.k.A("AttributeModifiers", 10);
      net.nj.f var5 = net.ne.d.w(var2);
      var5.b("AttributeName", var1);
      var5.b("Slot", var3.H());
      var4.m(var5);
   }

   public net.cb.t b() {
      net.cb.l var1 = new net.cb.l(this.j());
      if(this.v()) {
         var1.E().P(Boolean.valueOf(true));
      }

      net.cb.t var2 = (new net.cb.l("[")).h(var1).z("]");
      if(!this.Z) {
         net.nj.f var3 = this.Z(new net.nj.f());
         var2.E().G(new net.n6.o(net.n6.o.SHOW_ITEM, new net.cb.l(var3.toString())));
         var2.E().i(this.p().rarityColor);
      }

      return var2;
   }

   public boolean q(net.y9.l var1) {
      if(var1 == this.j) {
         return this.R;
      } else {
         this.j = var1;
         if(this.D() && this.k.K("CanDestroy", 9)) {
            net.nj.h var2 = this.k.A("CanDestroy", 8);

            for(int var3 = 0; var3 < var2.z(); ++var3) {
               net.y9.l var4 = net.y9.l.d(var2.w(var3));
               if(var4 == var1) {
                  this.R = true;
                  return true;
               }
            }
         }

         this.R = false;
         return false;
      }
   }

   public boolean Z(net.y9.l var1) {
      if(var1 == this.q) {
         return this.u;
      } else {
         this.q = var1;
         if(this.D() && this.k.K("CanPlaceOn", 9)) {
            net.nj.h var2 = this.k.A("CanPlaceOn", 8);

            for(int var3 = 0; var3 < var2.z(); ++var3) {
               net.y9.l var4 = net.y9.l.d(var2.w(var3));
               if(var4 == var1) {
                  this.u = true;
                  return true;
               }
            }
         }

         this.u = false;
         return false;
      }
   }

   public int G() {
      return this.T;
   }

   public void S(int var1) {
      this.T = var1;
   }

   public int U() {
      return this.Z?0:this.p;
   }

   public void u(int var1) {
      this.p = var1;
      this.l();
   }

   public void A(int var1) {
      this.u(this.p + var1);
   }

   public void H(int var1) {
      this.A(-var1);
   }

   static {
      F(new String[3]);
   }

   public static void F(String[] var0) {
      D = var0;
   }

   public static String[] V() {
      return D;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
