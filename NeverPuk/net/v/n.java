package net.v;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import net.xn;
import net.cb.t;
import net.u.d;
import net.v.g;
import net.v.q;

public class n {
   public final String r;
   private final t K;
   public boolean w;
   private final g q;
   private final net.nc.u p;
   private Class E;
   private static final NumberFormat V = NumberFormat.getIntegerInstance(Locale.US);
   public static g U = new g() {
      public String a(int var1) {
         return n.V.format((long)var1);
      }
   };
   private static final DecimalFormat k = new DecimalFormat("########0.00");
   public static g y = new g() {
      public String a(int var1) {
         double var3 = (double)var1 / 20.0D;
         double var5 = var3 / 60.0D;
         double var7 = var5 / 60.0D;
         int var10000 = n.I();
         double var9 = var7 / 24.0D;
         int var2 = var10000;
         double var11 = var9 / 365.0D;
         if(Double.compare(var11, 0.5D) > 0) {
            return n.k.format(var11) + " y";
         } else if(Double.compare(var9, 0.5D) > 0) {
            return n.k.format(var9) + " d";
         } else if(Double.compare(var7, 0.5D) > 0) {
            return n.k.format(var7) + " h";
         } else {
            String var14 = var5 > 0.5D?n.k.format(var5) + " m":var3 + " s";
            if(d.y() == null) {
               ++var2;
               n.F = var2;
            }

            return var14;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   public static g O = new g() {
      public String a(int var1) {
         n.F;
         double var3 = (double)var1 / 100.0D;
         double var5 = var3 / 1000.0D;
         return Double.compare(var5, 0.5D) > 0?n.k.format(var5) + " km":(var3 > 0.5D?n.k.format(var3) + " m":var1 + " cm");
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   public static g a = new g() {
      public String a(int var1) {
         return n.k.format((double)var1 * 0.1D);
      }
   };
   private static int F;

   public n(String var1, t var2, g var3) {
      this.r = var1;
      this.K = var2;
      this.q = var3;
      this.p = new net.nc.c(this);
      net.nc.u.J.put(this.p.k(), this.p);
   }

   public n(String var1, t var2) {
      this(var1, var2, U);
   }

   public n h() {
      this.w = true;
      return this;
   }

   public n i() {
      if(q.g.containsKey(this.r)) {
         throw new RuntimeException("Duplicate stat id: \"" + ((n)q.g.get(this.r)).K + "\" and \"" + this.K + "\" at id " + this.r);
      } else {
         q.gq.add(this);
         q.g.put(this.r, this);
         return this;
      }
   }

   public String t(int var1) {
      return this.q.a(var1);
   }

   public t q() {
      t var1 = this.K.c();
      var1.E().i(net.cb.z.GRAY);
      return var1;
   }

   public boolean equals(Object var1) {
      int var2 = I();
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         n var3 = (n)var1;
         return this.r.equals(var3.r);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.r.hashCode();
   }

   public String toString() {
      return "Stat{id=" + this.r + ", nameId=" + this.K + ", awardLocallyOnly=" + this.w + ", formatter=" + this.q + ", objectiveCriteria=" + this.p + '}';
   }

   public net.nc.u j() {
      return this.p;
   }

   public Class J() {
      return this.E;
   }

   static {
      W(71);
   }

   public static void W(int var0) {
      F = var0;
   }

   public static int h() {
      return F;
   }

   public static int I() {
      int var0 = h();
      return 71;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
