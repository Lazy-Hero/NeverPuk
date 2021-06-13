package net.cn;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.cn.p;
import net.cn.w;
import net.ns.i;

public class a {
   private final List R = Lists.newArrayList();
   private final Map Y = Maps.newHashMap();
   private int o;

   public int q() {
      return this.o;
   }

   public void j(int var1) {
      this.o = var1;
   }

   public Map v() {
      return this.Y;
   }

   public List N() {
      return this.R;
   }

   public void l() {
      int var1 = 0;

      for(p var3 : this.R) {
         var3.s(var1);
         var1 += var3.Q();
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(3);
      var1.append(";");

      for(int var2 = 0; var2 < this.R.size(); ++var2) {
         var1.append(",");
         var1.append(this.R.get(var2));
      }

      var1.append(";");
      var1.append(this.o);
      if(this.Y.isEmpty()) {
         var1.append(";");
      } else {
         var1.append(";");
         int var9 = 0;

         for(Entry var4 : this.Y.entrySet()) {
            ++var9;
            var1.append(((String)var4.getKey()).toLowerCase(Locale.ROOT));
            Map var5 = (Map)var4.getValue();
            if(!var5.isEmpty()) {
               var1.append("(");
               int var6 = 0;

               for(Entry var8 : var5.entrySet()) {
                  ++var6;
                  var1.append((String)var8.getKey());
                  var1.append("=");
                  var1.append((String)var8.getValue());
               }

               var1.append(")");
            }
         }
      }

      return var1.toString();
   }

   private static p V(int var0, String var1, int var2) {
      String[] var3 = var0 >= 3?var1.split("\\*", 2):var1.split("x", 2);
      int var4 = 1;
      int var5 = 0;
      if(var3.length == 2) {
         var4 = Integer.parseInt(var3[0]);
         if(var2 + var4 >= 256) {
            var4 = 256 - var2;
         }

         var4 = 0;
      }

      String var7 = var3[var3.length - 1];
      if(var0 < 3) {
         var3 = var7.split(":", 2);
         if(var3.length > 1) {
            var5 = Integer.parseInt(var3[1]);
         }

         net.y9.l var6 = net.y9.l.I(Integer.parseInt(var3[0]));
         if(var6 == net.nb.f.ou) {
            var5 = 0;
         }

         p var12 = new p(var0, var4, var6, var5);
         var12.s(var2);
         return var12;
      } else {
         var3 = var7.split(":", 3);
         if(var3.length > 1) {
            net.y9.l.d(var3[0] + ":" + var3[1]);
         } else {
            Object var10000 = null;
         }

         if(var3.length > 2) {
            Integer.parseInt(var3[2]);
         } else {
            boolean var13 = false;
         }

         return null;
      }
   }

   private static List m(int var0, String var1) {
      if(var1.length() >= 1) {
         ArrayList var2 = Lists.newArrayList();
         String[] var3 = var1.split(",");
         byte var4 = 0;
         int var6 = var3.length;
         byte var7 = 0;
         if(var7 < var6) {
            String var8 = var3[var7];
            p var9 = V(var0, var8, var4);
            return null;
         } else {
            return var2;
         }
      } else {
         return null;
      }
   }

   public static a n(String var0) {
      int var1 = w.a();
      if(var0 == null) {
         return G();
      } else {
         String[] var2 = var0.split(";", -1);
         int var3 = var2.length == 1?0:net.u.t.i(var2[0], 0);
         if(var3 >= 0 && var3 <= 3) {
            a var4 = new a();
            int var5 = var2.length == 1?0:1;
            List var6 = m(var3, var2[var5++]);
            if(var6 != null && !var6.isEmpty()) {
               var4.N().addAll(var6);
               var4.l();
               int var7 = i.y(net.nb.x.v);
               if(var3 > 0 && var2.length > var5) {
                  var7 = net.u.t.i(var2[var5++], var7);
               }

               var4.j(var7);
               if(var3 > 0 && var2.length > var5) {
                  String[] var8 = var2[var5++].toLowerCase(Locale.ROOT).split(",");
                  int var10 = var8.length;
                  int var11 = 0;
                  if(var11 < var10) {
                     String var12 = var8[var11];
                     String[] var13 = var12.split("\\(", 2);
                     HashMap var14 = Maps.newHashMap();
                     if(!var13[0].isEmpty()) {
                        var4.v().put(var13[0], var14);
                        if(var13.length > 1 && var13[1].endsWith(")") && var13[1].length() > 1) {
                           String[] var15 = var13[1].substring(0, var13[1].length() - 1).split(" ");
                           int var17 = var15.length;
                           int var18 = 0;
                           if(var18 < var17) {
                              String var19 = var15[var18];
                              String[] var20 = var19.split("=", 2);
                              if(var20.length == 2) {
                                 var14.put(var20[0], var20[1]);
                              }

                              ++var18;
                           }
                        }
                     }

                     ++var11;
                  }
               }

               var4.v().put("village", Maps.newHashMap());
               return var4;
            } else {
               return G();
            }
         } else {
            return G();
         }
      }
   }

   public static a G() {
      a var0 = new a();
      var0.j(i.y(net.nb.x.v));
      var0.N().add(new p(1, net.nb.f.T8));
      var0.N().add(new p(2, net.nb.f.dl));
      var0.N().add(new p(1, net.nb.f.p));
      var0.l();
      var0.v().put("village", Maps.newHashMap());
      return var0;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
