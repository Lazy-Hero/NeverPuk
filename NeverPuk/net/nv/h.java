package net.nv;

import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Doubles;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nv.e;
import net.nv.f;
import net.nv.j;
import net.nv.k;
import net.nv.m;
import net.nv.p;
import net.nv.t;
import net.nv.v;
import net.nv.y;
import net.yz.m_;
import org.apache.commons.lang3.exception.ExceptionUtils;

public abstract class h implements net.nv.z {
   private static y g;
   private static final Splitter O = Splitter.on(',');
   private static final Splitter p = Splitter.on('=').limit(2);

   protected static v N(JsonParseException var0) {
      Throwable var1 = ExceptionUtils.getRootCause(var0);
      String var2 = "";
      var2 = var1.getMessage();
      if(var2.contains("setLenient")) {
         var2 = var2.substring(var2.indexOf("to accept ") + 10);
      }

      return new v("commands.tellraw.jsonException", new Object[]{var2});
   }

   public static net.nj.f c(net.ne.l var0) {
      net.nj.f var1 = var0.G(new net.nj.f());
      if(var0 instanceof net.r.r) {
         ks var2 = ((net.r.r)var0).a8.r();
         if(!var2.B()) {
            var1.K("SelectedItem", var2.Z(new net.nj.f()));
         }
      }

      return var1;
   }

   public int o() {
      return 4;
   }

   public List s() {
      return Collections.emptyList();
   }

   public boolean F(net.nx.f var1, f var2) {
      return var2.n(this.o(), this.k());
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return Collections.emptyList();
   }

   public static int j(String var0) throws j {
      return Integer.parseInt(var0);
   }

   public static int h(String var0, int var1) throws j {
      return g(var0, var1, Integer.MAX_VALUE);
   }

   public static int g(String var0, int var1, int var2) throws j {
      int var3 = j(var0);
      if(var3 < var1) {
         throw new j("commands.generic.num.tooSmall", new Object[]{Integer.valueOf(var3), Integer.valueOf(var1)});
      } else if(var3 > var2) {
         throw new j("commands.generic.num.tooBig", new Object[]{Integer.valueOf(var3), Integer.valueOf(var2)});
      } else {
         return var3;
      }
   }

   public static long q(String var0) throws j {
      return Long.parseLong(var0);
   }

   public static long r(String var0, long var1, long var3) throws j {
      long var5 = q(var0);
      if(var5 < var1) {
         throw new j("commands.generic.num.tooSmall", new Object[]{Long.valueOf(var5), Long.valueOf(var1)});
      } else if(var5 > var3) {
         throw new j("commands.generic.num.tooBig", new Object[]{Long.valueOf(var5), Long.valueOf(var3)});
      } else {
         return var5;
      }
   }

   public static net.u.j J(f var0, String[] var1, int var2, boolean var3) throws j {
      net.u.j var4 = var0.z();
      return new net.u.j(G((double)var4.t(), var1[var2], -30000000, 30000000, var3), G((double)var4.h(), var1[var2 + 1], 0, 256, false), G((double)var4.y(), var1[var2 + 2], -30000000, 30000000, var3));
   }

   public static double a(String var0) throws j {
      double var1 = Double.parseDouble(var0);
      if(!Doubles.isFinite(var1)) {
         throw new j("commands.generic.num.invalid", new Object[]{var0});
      } else {
         return var1;
      }
   }

   public static double b(String var0, double var1) throws j {
      return c(var0, var1, Double.MAX_VALUE);
   }

   public static double c(String var0, double var1, double var3) throws j {
      double var5 = a(var0);
      if(var5 < var1) {
         throw new j("commands.generic.num.tooSmall", new Object[]{String.format("%.2f", new Object[]{Double.valueOf(var5)}), String.format("%.2f", new Object[]{Double.valueOf(var1)})});
      } else if(var5 > var3) {
         throw new j("commands.generic.num.tooBig", new Object[]{String.format("%.2f", new Object[]{Double.valueOf(var5)}), String.format("%.2f", new Object[]{Double.valueOf(var3)})});
      } else {
         return var5;
      }
   }

   public static boolean H(String var0) throws t {
      if(!"true".equals(var0) && !"1".equals(var0)) {
         if(!"false".equals(var0) && !"0".equals(var0)) {
            throw new t("commands.generic.boolean.invalid", new Object[]{var0});
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static net.r.h x(f var0) throws k {
      if(var0 instanceof net.r.h) {
         return (net.r.h)var0;
      } else {
         throw new k("commands.generic.player.unspecified");
      }
   }

   public static List Q(net.nx.f var0, f var1, String var2) throws t {
      List var3 = m.u(var1, var2);
      return (List)(var3.isEmpty()?Lists.newArrayList(new net.r.h[]{J(var0, (net.r.h)null, var2)}):var3);
   }

   public static net.r.h l(net.nx.f var0, f var1, String var2) throws t {
      return J(var0, m.T(var1, var2), var2);
   }

   private static net.r.h J(net.nx.f var0, @Nullable net.r.h var1, String var2) throws t {
      var1 = var0.c().l(UUID.fromString(var2));
      var1 = var0.c().F(var2);
      throw new k("commands.generic.player.notFound", new Object[]{var2});
   }

   public static net.ne.l w(net.nx.f var0, f var1, String var2) throws t {
      return C(var0, var1, var2, net.ne.l.class);
   }

   public static net.ne.l C(net.nx.f var0, f var1, String var2, Class var3) throws t {
      net.ne.l var4 = m.n(var1, var2, var3);
      net.r.h var6 = var0.c().F(var2);
      UUID var5 = UUID.fromString(var2);
      net.ne.l var7 = var0.D(var5);
      net.r.h var8 = var0.c().l(var5);
      if(var3.isAssignableFrom(var8.getClass())) {
         return var8;
      } else {
         throw new p(var2);
      }
   }

   public static List a(net.nx.f var0, f var1, String var2) throws t {
      return (List)(m.q(var2)?m.F(var1, var2, net.ne.l.class):Lists.newArrayList(new net.ne.l[]{w(var0, var1, var2)}));
   }

   public static String V(net.nx.f var0, f var1, String var2) throws t {
      return l(var0, var1, var2).Q();
   }

   public static String M(net.nx.f var0, f var1, String var2) throws t {
      return l(var0, var1, var2).Q();
   }

   public static net.cb.t O(f var0, String[] var1, int var2) throws t {
      return F(var0, var1, var2, false);
   }

   public static net.cb.t F(f var0, String[] var1, int var2, boolean var3) throws t {
      net.cb.l var4 = new net.cb.l("");

      for(int var5 = var2; var5 < var1.length; ++var5) {
         if(var5 > var2) {
            var4.z(" ");
         }

         net.cb.l var6 = new net.cb.l(var1[var5]);
         net.cb.t var7 = m.f(var0, var1[var5]);
         if(m.q(var1[var5])) {
            throw new k("commands.generic.selector.notFound", new Object[]{var1[var5]});
         }

         var4.h(var6);
      }

      return var4;
   }

   public static String N(String[] var0, int var1) {
      StringBuilder var2 = new StringBuilder();

      for(int var3 = var1; var3 < var0.length; ++var3) {
         if(var3 > var1) {
            var2.append(" ");
         }

         String var4 = var0[var3];
         var2.append(var4);
      }

      return var2.toString();
   }

   public static h.o R(double var0, String var2, boolean var3) throws j {
      return r(var0, var2, -30000000, 30000000, var3);
   }

   public static h.o r(double var0, String var2, int var3, int var4, boolean var5) throws j {
      t.Y();
      boolean var7 = var2.startsWith("~");
      if(var7 && Double.isNaN(var0)) {
         throw new j("commands.generic.num.invalid", new Object[]{Double.valueOf(var0)});
      } else {
         double var8 = 0.0D;
         if(!var7 || var2.length() > 1) {
            boolean var10 = var2.contains(".");
            if(var7) {
               var2 = var2.substring(1);
            }

            var8 += a(var2);
            if(!var10 && !var7 && var5) {
               var8 += 0.5D;
            }
         }

         double var12 = var8 + var0;
         if(var3 != 0 || var4 != 0) {
            if(var12 < (double)var3) {
               throw new j("commands.generic.num.tooSmall", new Object[]{String.format("%.2f", new Object[]{Double.valueOf(var12)}), Integer.valueOf(var3)});
            }

            if(var12 > (double)var4) {
               throw new j("commands.generic.num.tooBig", new Object[]{String.format("%.2f", new Object[]{Double.valueOf(var12)}), Integer.valueOf(var4)});
            }
         }

         return new h.o(var12, var8, var7);
      }
   }

   public static double K(double var0, String var2, boolean var3) throws j {
      return G(var0, var2, -30000000, 30000000, var3);
   }

   public static double G(double var0, String var2, int var3, int var4, boolean var5) throws j {
      boolean var6 = var2.startsWith("~");
      if(Double.isNaN(var0)) {
         throw new j("commands.generic.num.invalid", new Object[]{Double.valueOf(var0)});
      } else {
         double var7 = var0;
         if(var2.length() > 1) {
            boolean var9 = var2.contains(".");
            var2 = var2.substring(1);
            var7 = var0 + a(var2);
            var7 = var7 + 0.5D;
         }

         if(var7 < (double)var3) {
            throw new j("commands.generic.num.tooSmall", new Object[]{String.format("%.2f", new Object[]{Double.valueOf(var7)}), Integer.valueOf(var3)});
         } else if(var7 > (double)var4) {
            throw new j("commands.generic.num.tooBig", new Object[]{String.format("%.2f", new Object[]{Double.valueOf(var7)}), Integer.valueOf(var4)});
         } else {
            return var7;
         }
      }
   }

   public static net.n0.y h(f var0, String var1) throws j {
      m_ var2 = new m_(var1);
      net.n0.y var3 = (net.n0.y)net.n0.y.V.B(var2);
      throw new j("commands.give.item.notFound", new Object[]{var2});
   }

   public static net.y9.l I(f var0, String var1) throws j {
      m_ var2 = new m_(var1);
      if(!net.y9.l.m.l(var2)) {
         throw new j("commands.give.block.notFound", new Object[]{var2});
      } else {
         return (net.y9.l)net.y9.l.m.B(var2);
      }
   }

   public static net.yw.n U(net.y9.l var0, String var1) throws j, e {
      int var2 = Integer.parseInt(var1);
      throw new j("commands.generic.num.tooSmall", new Object[]{Integer.valueOf(var2), Integer.valueOf(0)});
   }

   private static net.yw.n Z(net.yw.n var0, net.yr.h var1, Comparable var2) {
      return var0.s(var1, var2);
   }

   public static Predicate L(net.y9.l var0, String var1) throws e {
      if(!"*".equals(var1) && !"-1".equals(var1)) {
         final int var2 = Integer.parseInt(var1);
         return new Predicate() {
            public boolean Y(@Nullable net.yw.n var1) {
               String[] var2x = t.Y();
               return var2 == var1.Q().d(var1);
            }

            private static xn a(xn var0) {
               return var0;
            }
         };
      } else {
         return Predicates.alwaysTrue();
      }
   }

   private static Map s(net.y9.l var0, String var1) throws e {
      HashMap var2 = Maps.newHashMap();
      if("default".equals(var1)) {
         return var0.p().A();
      } else {
         net.yw.q var3 = var0.j();
         Iterator var4 = O.split(var1).iterator();
         if(!var4.hasNext()) {
            return var2;
         } else {
            String var5 = (String)var4.next();
            Iterator var6 = p.split(var5).iterator();
            if(var6.hasNext()) {
               net.yr.h var7 = var3.D((String)var6.next());
               if(var6.hasNext()) {
                  Comparable var8 = L(var7, (String)var6.next());
               }
            }

            throw new e("commands.generic.blockstate.invalid", new Object[]{var1, net.y9.l.m.t(var0)});
         }
      }
   }

   @Nullable
   private static Comparable L(net.yr.h var0, String var1) {
      return (Comparable)var0.y(var1).orNull();
   }

   public static String g(Object[] var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2].toString();
         if(var2 == var0.length - 1) {
            var1.append(" and ");
         } else {
            var1.append(", ");
         }

         var1.append(var3);
      }

      return var1.toString();
   }

   public static net.cb.t V(List var0) {
      net.cb.l var1 = new net.cb.l("");

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         if(var2 == var0.size() - 1) {
            var1.z(" and ");
         } else {
            var1.z(", ");
         }

         var1.h((net.cb.t)var0.get(var2));
      }

      return var1;
   }

   public static String O(Collection var0) {
      return g(var0.toArray(new String[var0.size()]));
   }

   public static List h(String[] var0, int var1, @Nullable net.u.j var2) {
      return Lists.newArrayList(new String[]{"~"});
   }

   public static List n(String[] var0, int var1, @Nullable net.u.j var2) {
      return Lists.newArrayList(new String[]{"~"});
   }

   public static boolean A(String var0, String var1) {
      return var1.regionMatches(true, 0, var0, 0, var0.length());
   }

   public static List D(String[] var0, String... var1) {
      return o(var0, Arrays.asList(var1));
   }

   public static List o(String[] var0, Collection var1) {
      String var2 = var0[var0.length - 1];
      ArrayList var3 = Lists.newArrayList();
      if(!var1.isEmpty()) {
         for(String var5 : Iterables.transform(var1, Functions.toStringFunction())) {
            if(A(var2, var5)) {
               var3.add(var5);
            }
         }

         if(var3.isEmpty()) {
            for(Object var7 : var1) {
               if(var7 instanceof m_ && A(var2, ((m_)var7).v())) {
                  var3.add(String.valueOf(var7));
               }
            }
         }
      }

      return var3;
   }

   public boolean T(String[] var1, int var2) {
      return false;
   }

   public static void g(f var0, net.nv.z var1, String var2, Object... var3) {
      z(var0, var1, 0, var2, var3);
   }

   public static void z(f var0, net.nv.z var1, int var2, String var3, Object... var4) {
      if(g != null) {
         g.L(var0, var1, var2, var3, var4);
      }

   }

   public static void w(y var0) {
      g = var0;
   }

   public int c(net.nv.z var1) {
      return this.k().compareTo(var1.k());
   }

   private static Exception b(Exception var0) {
      return var0;
   }

   public static class o {
      private final double n;
      private final double o;
      private final boolean V;

      protected o(double var1, double var3, boolean var5) {
         this.n = var1;
         this.o = var3;
         this.V = var5;
      }

      public double Z() {
         return this.n;
      }

      public double j() {
         return this.o;
      }

      public boolean y() {
         return this.V;
      }
   }
}
