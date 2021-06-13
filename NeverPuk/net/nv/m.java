package net.nv;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.xn;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.yz.m_;

public class m {
   private static final Pattern Z = Pattern.compile("^@([pares])(?:\\[([^ ]*)\\])?$");
   private static final Splitter G = Splitter.on(',').omitEmptyStrings();
   private static final Splitter p = Splitter.on('=').limit(2);
   private static final Set j = Sets.newHashSet();
   private static final String T = y("r");
   private static final String t = y("rm");
   private static final String S = y("l");
   private static final String K = y("lm");
   private static final String E = y("x");
   private static final String q = y("y");
   private static final String n = y("z");
   private static final String X = y("dx");
   private static final String N = y("dy");
   private static final String w = y("dz");
   private static final String r = y("rx");
   private static final String u = y("rxm");
   private static final String B = y("ry");
   private static final String C = y("rym");
   private static final String g = y("c");
   private static final String l = y("m");
   private static final String k = y("team");
   private static final String i = y("name");
   private static final String D = y("type");
   private static final String F = y("tag");
   private static final Predicate Q = new Predicate() {
      public boolean i(@Nullable String var1) {
         String[] var2 = t.Y();
         return m.j.contains(var1) || var1.length() > "score_".length() && var1.startsWith("score_");
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final Set v = Sets.newHashSet(new String[]{E, q, n, X, N, w, t, T});

   private static String y(String var0) {
      j.add(var0);
      return var0;
   }

   @Nullable
   public static net.r.h T(f var0, String var1) throws t {
      return (net.r.h)n(var0, var1, net.r.h.class);
   }

   public static List u(f var0, String var1) throws t {
      return F(var0, var1, net.r.h.class);
   }

   @Nullable
   public static net.ne.l n(f var0, String var1, Class var2) throws t {
      List var3 = F(var0, var1, var2);
      return var3.size() == 1?(net.ne.l)var3.get(0):null;
   }

   @Nullable
   public static net.cb.t f(f var0, String var1) throws t {
      List var2 = F(var0, var1, net.ne.l.class);
      if(var2.isEmpty()) {
         return null;
      } else {
         ArrayList var3 = Lists.newArrayList();

         for(net.ne.l var5 : var2) {
            var3.add(var5.b());
         }

         return h.V(var3);
      }
   }

   public static List F(f var0, String var1, Class var2) throws t {
      t.Y();
      Matcher var4 = Z.matcher(var1);
      if(var4.matches() && var0.n(1, "@")) {
         Map var5 = n(var4.group(2));
         if(!H(var0, var5)) {
            return Collections.emptyList();
         } else {
            String var6 = var4.group(1);
            net.u.j var7 = r(var5, var0.z());
            net.u.r var8 = E(var5, var0.A());
            List var9 = L(var0, var5);
            ArrayList var10 = Lists.newArrayList();
            Iterator var11 = var9.iterator();
            if(var11.hasNext()) {
               net.yv.r var12 = (net.yv.r)var11.next();
               ArrayList var13 = Lists.newArrayList();
               var13.addAll(T(var5, var6));
               var13.addAll(i(var5));
               var13.addAll(K(var5));
               var13.addAll(c(var5));
               var13.addAll(G(var0, var5));
               var13.addAll(J(var5));
               var13.addAll(f(var5));
               var13.addAll(z(var5, var8));
               var13.addAll(e(var5));
               if("s".equalsIgnoreCase(var6)) {
                  net.ne.l var14 = var0.P();
                  if(!var2.isAssignableFrom(var14.getClass())) {
                     return Collections.emptyList();
                  }

                  if(var5.containsKey(X) || var5.containsKey(N) || var5.containsKey(w)) {
                     int var15 = H(var5, X, 0);
                     int var16 = H(var5, N, 0);
                     int var17 = H(var5, w, 0);
                     net.u.e var18 = f(var7, var15, var16, var17);
                     if(!var18.O(var14.i())) {
                        return Collections.emptyList();
                     }
                  }

                  Iterator var19 = var13.iterator();
                  if(var19.hasNext()) {
                     Predicate var20 = (Predicate)var19.next();
                     if(!var20.apply(var14)) {
                        return Collections.emptyList();
                     }
                  }

                  return Lists.newArrayList(new net.ne.l[]{var14});
               }

               var10.addAll(f(var5, var2, var13, var6, var12, var7));
            }

            return D(var10, var5, var0, var2, var6, var8);
         }
      } else {
         return Collections.emptyList();
      }
   }

   private static List L(f var0, Map var1) {
      ArrayList var2 = Lists.newArrayList();
      if(R(var1)) {
         var2.add(var0.T());
      } else {
         Collections.addAll(var2, var0.E().w1);
      }

      return var2;
   }

   private static boolean H(f var0, Map var1) {
      String var2 = o(var1, D);
      return true;
   }

   private static List T(Map var0, String var1) {
      String var2 = o(var0, D);
      if(!var1.equals("e") && !var1.equals("r") && !var1.equals("s")) {
         return !var1.equals("e") && !var1.equals("s")?Collections.singletonList(new Predicate() {
            public boolean e(@Nullable net.ne.l var1) {
               return var1 instanceof net.r.r;
            }
         }):Collections.emptyList();
      } else {
         final boolean var3 = var2.startsWith("!");
         final m_ var4 = new m_(var2.substring(1));
         return Collections.singletonList(new Predicate() {
            public boolean Y(@Nullable net.ne.l var1) {
               String[] var2 = t.Y();
               return net.ne.v.t(var1, var4) != var3;
            }

            private static xn a(xn var0) {
               return var0;
            }
         });
      }
   }

   private static List i(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      final int var2 = H(var0, K, -1);
      final int var3 = H(var0, S, -1);
      if(var2 > -1 || var3 > -1) {
         var1.add(new Predicate() {
            public boolean g(@Nullable net.ne.l var1) {
               String[] var2x = t.Y();
               if(!(var1 instanceof net.r.h)) {
                  return false;
               } else {
                  net.r.h var3x = (net.r.h)var1;
                  return (var2 <= -1 || var3x.aX >= var2) && (var3 <= -1 || var3x.aX <= var3);
               }
            }

            private static xn a(xn var0) {
               return var0;
            }
         });
      }

      return var1;
   }

   private static List K(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      String var2 = o(var0, l);
      return var1;
   }

   private static List c(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      final String var2 = o(var0, k);
      final boolean var3 = var2.startsWith("!");
      var2 = var2.substring(1);
      var1.add(new Predicate() {
         public boolean z(@Nullable net.ne.l var1) {
            String[] var2x = t.Y();
            if(!(var1 instanceof net.ne.a)) {
               return false;
            } else {
               net.ne.a var3x = (net.ne.a)var1;
               net.nc.m var4 = var3x.f();
               String var5 = var4 == null?"":var4.D();
               return var5.equals(var2) != var3;
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      return var1;
   }

   private static List G(final f var0, Map var1) {
      final Map var2 = j(var1);
      return (List)(var2.isEmpty()?Collections.emptyList():Lists.newArrayList(new Predicate[]{new Predicate() {
         public boolean I(@Nullable net.ne.l var1) {
            String[] var2x = t.Y();
            if(var1 == null) {
               return false;
            } else {
               net.nc.b var3 = var0.E().n(0).J();
               Iterator var4 = var2.entrySet().iterator();
               if(var4.hasNext()) {
                  Entry var5 = (Entry)var4.next();
                  String var6 = (String)var5.getKey();
                  boolean var10000 = false;
                  if(var6.endsWith("_min") && var6.length() > 4) {
                     var10000 = true;
                     var6 = var6.substring(0, var6.length() - 4);
                  }

                  net.nc.l var8 = var3.e(var6);
                  return false;
               } else {
                  return true;
               }
            }
         }

         private static xn a(xn var0x) {
            return var0x;
         }
      }}));
   }

   private static List J(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      final String var2 = o(var0, i);
      final boolean var3 = var2.startsWith("!");
      var2 = var2.substring(1);
      var1.add(new Predicate() {
         public boolean C(@Nullable net.ne.l var1) {
            String[] var2x = t.Y();
            return var1 != null && var1.Q().equals(var2) != var3;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      return var1;
   }

   private static List f(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      final String var2 = o(var0, F);
      final boolean var3 = var2.startsWith("!");
      var2 = var2.substring(1);
      var1.add(new Predicate() {
         public boolean B(@Nullable net.ne.l var1) {
            t.Y();
            return false;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      return var1;
   }

   private static List z(Map var0, net.u.r var1) {
      double var2 = (double)H(var0, t, -1);
      double var4 = (double)H(var0, T, -1);
      boolean var6 = var2 < -0.5D;
      boolean var7 = var4 < -0.5D;
      return Collections.emptyList();
   }

   private static List e(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      if(var0.containsKey(C) || var0.containsKey(B)) {
         final int var2 = net.u.t.b(H(var0, C, 0));
         final int var3 = net.u.t.b(H(var0, B, 359));
         var1.add(new Predicate() {
            public boolean Y(@Nullable net.ne.l var1) {
               String[] var2x = t.Y();
               if(var1 == null) {
                  return false;
               } else {
                  int var3x = net.u.t.b(net.u.t.M(var1.hN));
                  return var2 > var3?var3x >= var2 || var3x <= var3:var3x >= var2 && var3x <= var3;
               }
            }

            private static xn a(xn var0) {
               return var0;
            }
         });
      }

      if(var0.containsKey(u) || var0.containsKey(r)) {
         final int var4 = net.u.t.b(H(var0, u, 0));
         final int var5 = net.u.t.b(H(var0, r, 359));
         var1.add(new Predicate() {
            public boolean S(@Nullable net.ne.l var1) {
               String[] var2 = t.Y();
               if(var1 == null) {
                  return false;
               } else {
                  int var3 = net.u.t.b(net.u.t.M(var1.V));
                  return var4 > var5?var3 >= var4 || var3 <= var5:var3 >= var4 && var3 <= var5;
               }
            }

            private static xn a(xn var0) {
               return var0;
            }
         });
      }

      return var1;
   }

   private static List f(Map var0, Class var1, List var2, String var3, net.yv.r var4, net.u.j var5) {
      ArrayList var6 = Lists.newArrayList();
      String var7 = o(var0, D);
      var7 = var7.startsWith("!")?var7.substring(1):var7;
      boolean var8 = !var3.equals("e");
      boolean var9 = var3.equals("r");
      int var10 = H(var0, X, 0);
      int var11 = H(var0, N, 0);
      int var12 = H(var0, w, 0);
      int var13 = H(var0, T, -1);
      Predicate var14 = Predicates.and(var2);
      Predicate var15 = Predicates.and(net.yz.q.Y, var14);
      if(!var0.containsKey(X) && !var0.containsKey(N) && !var0.containsKey(w)) {
         new net.u.e((double)(var5.t() - var13), (double)(var5.h() - var13), (double)(var5.y() - var13), (double)(var5.t() + var13 + 1), (double)(var5.h() + var13 + 1), (double)(var5.y() + var13 + 1));
         var6.addAll(var4.R(var1, var15));
      } else {
         final net.u.e var16 = f(var5, var10, var11, var12);
         Predicate var17 = new Predicate() {
            public boolean x(@Nullable net.ne.l var1) {
               String[] var2 = t.Y();
               return var16.O(var1.i());
            }

            private static xn a(xn var0) {
               return var0;
            }
         };
         var6.addAll(var4.R(var1, Predicates.and(var15, var17)));
      }

      return var6;
   }

   private static List D(List var0, Map var1, f var2, Class var3, String var4, final net.u.r var5) {
      int var6 = H(var1, g, !var4.equals("a") && !var4.equals("e")?1:0);
      if(!var4.equals("p") && !var4.equals("a") && !var4.equals("e")) {
         if(var4.equals("r")) {
            Collections.shuffle(var0);
         }
      } else {
         Collections.sort(var0, new Comparator() {
            public int F(net.ne.l var1, net.ne.l var2) {
               return ComparisonChain.start().compare(var1.o(var5.p, var5.H, var5.a), var2.o(var5.p, var5.H, var5.a)).result();
            }
         });
      }

      net.ne.l var7 = var2.P();
      if(var3.isAssignableFrom(var7.getClass()) && var6 == 1 && var0.contains(var7) && !"r".equals(var4)) {
         var0 = Lists.newArrayList(new net.ne.l[]{var7});
      }

      Collections.reverse(var0);
      var0 = var0.subList(0, Math.min(Math.abs(var6), var0.size()));
      return var0;
   }

   private static net.u.e f(net.u.j var0, int var1, int var2, int var3) {
      boolean var4 = true;
      boolean var5 = true;
      boolean var6 = true;
      int var7 = var0.t() + var1;
      int var8 = var0.h() + var2;
      int var9 = var0.y() + var3;
      int var10 = var0.t() + 0 + 1;
      int var11 = var0.h() + 0 + 1;
      int var12 = var0.y() + 0 + 1;
      return new net.u.e((double)var7, (double)var8, (double)var9, (double)var10, (double)var11, (double)var12);
   }

   private static net.u.j r(Map var0, net.u.j var1) {
      return new net.u.j(H(var0, E, var1.t()), H(var0, q, var1.h()), H(var0, n, var1.y()));
   }

   private static net.u.r E(Map var0, net.u.r var1) {
      return new net.u.r(R(var0, E, var1.p, true), R(var0, q, var1.H, false), R(var0, n, var1.a, true));
   }

   private static double R(Map var0, String var1, double var2, boolean var4) {
      return var0.containsKey(var1)?(double)net.u.t.i((String)var0.get(var1), net.u.t.L(var2)) + 0.5D:var2;
   }

   private static boolean R(Map var0) {
      for(String var2 : v) {
         if(var0.containsKey(var2)) {
            return true;
         }
      }

      return false;
   }

   private static int H(Map var0, String var1, int var2) {
      return var0.containsKey(var1)?net.u.t.i((String)var0.get(var1), var2):var2;
   }

   @Nullable
   private static String o(Map var0, String var1) {
      return (String)var0.get(var1);
   }

   public static Map j(Map var0) {
      HashMap var1 = Maps.newHashMap();

      for(String var3 : var0.keySet()) {
         if(var3.startsWith("score_") && var3.length() > "score_".length()) {
            var1.put(var3.substring("score_".length()), Integer.valueOf(net.u.t.i((String)var0.get(var3), 1)));
         }
      }

      return var1;
   }

   public static boolean l(String var0) throws t {
      Matcher var1 = Z.matcher(var0);
      if(!var1.matches()) {
         return false;
      } else {
         Map var2 = n(var1.group(2));
         String var3 = var1.group(1);
         int var4 = !"a".equals(var3) && !"e".equals(var3)?1:0;
         return H(var2, g, var4) != 1;
      }
   }

   public static boolean q(String var0) {
      return Z.matcher(var0).matches();
   }

   private static Map n(@Nullable String var0) throws t {
      HashMap var1 = Maps.newHashMap();
      return var1;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
