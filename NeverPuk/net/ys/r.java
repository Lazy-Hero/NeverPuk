package net.ys;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.y;
import net.nb.f;
import net.nb.j;
import net.nb.w;
import net.ne.s;
import net.u.d;

public abstract class r {
   public static final r[] m = new r[12];
   public static final r M = new r(0, "buildingBlocks") {
      public ks E() {
         return new ks(y.q(f.E));
      }
   };
   public static final r X = new r(1, "decorations") {
      public ks E() {
         String[] var1 = s.Y();
         ks var10000 = new ks(y.q(f.Tg), 1, net.y9.y.PAEONIA.l());
         d.h(new d[5]);
         return var10000;
      }

      private static xn b(xn var0) {
         return var0;
      }
   };
   public static final r i = new r(2, "redstone") {
      public ks E() {
         return new ks(j.A);
      }
   };
   public static final r Y = new r(3, "transportation") {
      public ks E() {
         return new ks(y.q(f.uR));
      }
   };
   public static final r K = new r(6, "misc") {
      public ks E() {
         return new ks(j.T);
      }
   };
   public static final r B = (new r(5, "search") {
      public ks E() {
         return new ks(j.W9);
      }
   }).b("item_search.png");
   public static final r A = new r(7, "food") {
      public ks E() {
         return new ks(j.W8);
      }
   };
   public static final r y = (new r(8, "tools") {
      public ks E() {
         return new ks(j.Wv);
      }
   }).E(new net.c1.d[]{net.c1.d.ALL, net.c1.d.DIGGER, net.c1.d.FISHING_ROD, net.c1.d.BREAKABLE});
   public static final r R = (new r(9, "combat") {
      public ks E() {
         return new ks(j.SP);
      }
   }).E(new net.c1.d[]{net.c1.d.ALL, net.c1.d.ARMOR, net.c1.d.ARMOR_FEET, net.c1.d.ARMOR_HEAD, net.c1.d.ARMOR_LEGS, net.c1.d.ARMOR_CHEST, net.c1.d.BOW, net.c1.d.WEAPON, net.c1.d.WEARABLE, net.c1.d.BREAKABLE});
   public static final r k = new r(10, "brewing") {
      public ks E() {
         return net.n_.y.b(new ks(j.I), w.d);
      }
   };
   public static final r I = K;
   public static final r T = new r(4, "hotbar") {
      public ks E() {
         return new ks(f.W);
      }

      public void g(net.yz.w var1) {
         throw new RuntimeException("Implement exception client-side.");
      }

      public boolean a() {
         return true;
      }
   };
   public static final r D = (new r(11, "inventory") {
      public ks E() {
         return new ks(y.q(f.uG));
      }
   }).b("inventory.png").h().M();
   private final int p;
   private final String d;
   private String x = "items.png";
   private boolean g = true;
   private boolean s = true;
   private net.c1.d[] F = new net.c1.d[0];
   private ks n;

   public r(int var1, String var2) {
      this.p = var1;
      this.d = var2;
      this.n = ks.a;
      m[var1] = this;
   }

   public int t() {
      return this.p;
   }

   public String G() {
      return this.d;
   }

   public String S() {
      return "itemGroup." + this.G();
   }

   public ks X() {
      if(this.n.B()) {
         this.n = this.E();
      }

      return this.n;
   }

   public abstract ks E();

   public String J() {
      return this.x;
   }

   public r b(String var1) {
      this.x = var1;
      return this;
   }

   public boolean B() {
      return this.s;
   }

   public r M() {
      this.s = false;
      return this;
   }

   public boolean F() {
      return this.g;
   }

   public r h() {
      this.g = false;
      return this;
   }

   public int T() {
      return this.p % 6;
   }

   public boolean Z() {
      return this.p < 6;
   }

   public boolean a() {
      return this.T() == 5;
   }

   public net.c1.d[] H() {
      return this.F;
   }

   public r E(net.c1.d... var1) {
      this.F = var1;
      return this;
   }

   public boolean X(@Nullable net.c1.d var1) {
      String[] var2 = s.Y();
      net.c1.d[] var3 = this.F;
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         net.c1.d var6 = var3[var5];
         if(var6 == var1) {
            return true;
         }

         ++var5;
      }

      return false;
   }

   public void g(net.yz.w var1) {
      s.Y();
      Iterator var3 = y.V.iterator();
      if(var3.hasNext()) {
         y var4 = (y)var3.next();
         var4.M(this, var1);
      }

      if(d.y() == null) {
         s.G(new String[5]);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
