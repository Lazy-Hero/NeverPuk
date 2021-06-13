package net.yk;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.u_;
import net.xn;
import net.z9;
import net.y.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t {
   private static final Logger l = LogManager.getLogger();
   private final List s = Lists.newArrayList();
   private final List K = Lists.newArrayList();
   public boolean R;
   private String g = "";
   private final Map n = Maps.newHashMap();
   public boolean j = true;
   private boolean N;
   private static final String B = "scheduledExecutables";
   private static final String x = "tick";
   private static final String v = "preRenderErrors";
   private static final String z = "render";
   private static final String U = "display";
   private static final int q = "scheduledExecutables".hashCode();
   private static final int P = "tick".hashCode();
   private static final int J = "preRenderErrors".hashCode();
   private static final int d = "render".hashCode();
   private static final int u = "display".hashCode();
   private static String[] D;

   public t() {
      this.N = this.j;
   }

   public void m() {
      this.n.clear();
      this.g = "";
      this.s.clear();
      this.N = this.j;
   }

   public void K(String var1) {
      if(u_.e()) {
         int var2 = var1.hashCode();
         if(var2 == q && var1.equals("scheduledExecutables")) {
            u_.a.G();
         } else if(var2 == P && var1.equals("tick") && z9.k()) {
            u_.a.C();
            u_.H.G();
         } else if(var2 == J && var1.equals("preRenderErrors")) {
            u_.H.C();
         }
      }

      if(z9.Z()) {
         int var3 = var1.hashCode();
         if(var3 == d && var1.equals("render")) {
            d.Y = false;
         } else if(var3 == u && var1.equals("display")) {
            d.Y = true;
         }
      }

      if(this.N && this.R) {
         if(!this.g.isEmpty()) {
            this.g = this.g + ".";
         }

         this.g = this.g + var1;
         this.s.add(this.g);
         this.K.add(Long.valueOf(System.nanoTime()));
      }

   }

   public void c(Supplier var1) {
      if(this.N && this.R) {
         this.K((String)var1.get());
      }

   }

   public void N() {
      if(this.N && this.R) {
         long var1 = System.nanoTime();
         long var3 = ((Long)this.K.remove(this.K.size() - 1)).longValue();
         this.s.remove(this.s.size() - 1);
         long var5 = var1 - var3;
         if(this.n.containsKey(this.g)) {
            this.n.put(this.g, Long.valueOf(((Long)this.n.get(this.g)).longValue() + var5));
         } else {
            this.n.put(this.g, Long.valueOf(var5));
         }

         if(var5 > 100000000L) {
            l.warn("Something\'s taking too long! \'{}\' took aprox {} ms", this.g, Double.valueOf((double)var5 / 1000000.0D));
         }

         this.g = this.s.isEmpty()?"":(String)this.s.get(this.s.size() - 1);
      }

   }

   public List b(String var1) {
      String[] var2 = h();
      if(!this.R) {
         return Collections.emptyList();
      } else {
         long var3 = this.n.containsKey("root")?((Long)this.n.get("root")).longValue():0L;
         long var5 = this.n.containsKey(var1)?((Long)this.n.get(var1)).longValue():-1L;
         ArrayList var7 = Lists.newArrayList();
         if(!var1.isEmpty()) {
            var1 = var1 + ".";
         }

         long var8 = 0L;
         Iterator var10 = this.n.keySet().iterator();
         if(var10.hasNext()) {
            String var11 = (String)var10.next();
            if(var11.length() > var1.length() && var11.startsWith(var1) && var11.indexOf(".", var1.length() + 1) < 0) {
               var8 += ((Long)this.n.get(var11)).longValue();
            }
         }

         float var20 = (float)var8;
         Long.compare(var8, var5);
         long var24;
         int var10000 = (var24 = var3 - var8) == 0L?0:(var24 < 0L?-1:1);
         Iterator var21 = this.n.keySet().iterator();
         if(var21.hasNext()) {
            String var12 = (String)var21.next();
            if(var12.length() > var1.length() && var12.startsWith(var1) && var12.indexOf(".", var1.length() + 1) < 0) {
               long var13 = ((Long)this.n.get(var12)).longValue();
               double var15 = (double)var13 * 100.0D / (double)var8;
               double var17 = (double)var13 * 100.0D / (double)var3;
               String var19 = var12.substring(var1.length());
               var7.add(new t.j(var19, var15, var17));
            }
         }

         var21 = this.n.keySet().iterator();
         if(var21.hasNext()) {
            String var23 = (String)var21.next();
            this.n.put(var23, Long.valueOf(((Long)this.n.get(var23)).longValue() * 950L / 1000L));
         }

         Float.compare((float)var8, var20);
         Collections.sort(var7);
         var7.add(0, new t.j(var1, 100.0D, (double)var8 * 100.0D / (double)var3));
         return var7;
      }
   }

   public void F(String var1) {
      if(this.N) {
         this.N();
         this.K(var1);
      }

   }

   public void C(Supplier var1) {
      if(this.N) {
         this.N();
         this.c(var1);
      }

   }

   public String D() {
      return this.s.isEmpty()?"[UNKNOWN]":(String)this.s.get(this.s.size() - 1);
   }

   public void v(Class var1) {
      if(this.R) {
         this.K(var1.getSimpleName());
      }

   }

   static {
      m(new String[4]);
   }

   public static void m(String[] var0) {
      D = var0;
   }

   public static String[] h() {
      return D;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static final class j implements Comparable {
      public double i;
      public double M;
      public String c;

      public j(String var1, double var2, double var4) {
         t.D;
         super();
         this.c = var1;
         this.i = var2;
         this.M = var4;
         if(net.u.d.y() == null) {
            t.D = new String[3];
         }

      }

      public int H(t.j var1) {
         String[] var2 = t.D;
         return Double.compare(var1.i, this.i) < 0?-1:(var1.i > this.i?1:var1.c.compareTo(this.c));
      }

      public int m() {
         return (this.c.hashCode() & 11184810) + 4473924;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
