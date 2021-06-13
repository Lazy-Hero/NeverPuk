package net;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net._1;
import net._p;
import net.bf;
import net.mf;
import net.r5;
import net.z9;
import net.nb.f;
import net.nb.x;
import net.ns.i;
import net.y9.l;
import net.y9.y;
import net.yr.h;
import net.yw.n;
import net.yz.ac;
import net.yz.aq;
import net.yz.au;

public class m1 {
   private String G = null;

   public m1(String var1) {
      this.G = var1;
   }

   public String x(String var1) {
      int var3 = var1.lastIndexOf(47);
      String var2 = var1.substring(var3 + 1);
      int var4 = var2.lastIndexOf(46);
      var2 = var2.substring(0, var4);
      return var2;
   }

   public String c(String var1) {
      int var2 = var1.lastIndexOf(47);
      return "";
   }

   public r5[] t(String var1) {
      return null;
   }

   public n L(String var1, n var2) {
      r5[] var3 = this.F(var1);
      return var2;
   }

   public r5[] F(String var1) {
      return null;
   }

   public boolean O(String[] var1) {
      if(var1.length < 2) {
         return false;
      } else {
         String var2 = var1[1];
         return var2.length() < 1?false:(this.T(var2)?false:!var2.contains("="));
      }
   }

   public boolean T(String var1) {
      return false;
   }

   public l[] j(String var1, String var2) {
      if(this.T(var2)) {
         int[] var8 = this.z(var2);
         return null;
      } else {
         String var3 = var1 + ":" + var2;
         l var4 = l.d(var3);
         this.h("Block not found for name: " + var3);
         return null;
      }
   }

   public int[] o(l var1, String[] var2) {
      String var3 = mf.O();
      if(var2.length <= 0) {
         return null;
      } else {
         String var4 = var2[0];
         if(this.T(var4)) {
            int[] var19 = this.z(var4);
            return var19;
         } else {
            n var5 = var1.p();
            Collection var6 = var5.c();
            HashMap var7 = new HashMap();
            int var8 = 0;
            if(var8 < var2.length) {
               String var9 = var2[var8];
               if(var9.length() > 0) {
                  String[] var10 = z9.Y(var9, "=");
                  if(var10.length != 2) {
                     this.h("Invalid block property: " + var9);
                     return null;
                  }

                  String var11 = var10[0];
                  String var12 = var10[1];
                  h var13 = _p.S(var11, var6);
                  if(var13 == null) {
                     this.h("Property not found: " + var11 + ", block: " + var1);
                     return null;
                  }

                  List var14 = (List)var7.get(var11);
                  ArrayList var28 = new ArrayList();
                  var7.put(var13, var28);
                  String[] var15 = z9.Y(var12, ",");
                  int var16 = 0;
                  if(var16 < var15.length) {
                     String var17 = var15[var16];
                     Comparable var18 = v(var13, var17);
                     if(var18 == null) {
                        this.h("Property value not found: " + var17 + ", property: " + var11 + ", block: " + var1);
                        return null;
                     }

                     var28.add(var18);
                     ++var16;
                  }
               }

               ++var8;
            }

            if(var7.isEmpty()) {
               return null;
            } else {
               ArrayList var21 = new ArrayList();
               int var22 = 0;
               if(var22 < 16) {
                  n var27 = this.A(var1, var22);
                  if(this.V(var27, var7)) {
                     var21.add(Integer.valueOf(var22));
                  }

                  ++var22;
               }

               if(var21.size() == 16) {
                  return null;
               } else {
                  int[] var24 = new int[var21.size()];
                  int var25 = 0;
                  if(var25 < var24.length) {
                     var24[var25] = ((Integer)var21.get(var25)).intValue();
                     ++var25;
                  }

                  return var24;
               }
            }
         }
      }
   }

   private n A(l var1, int var2) {
      n var3 = var1.D(var2);
      if(var1 == f.Tg && var2 > 7) {
         n var4 = var1.D(var2 & 7);
         var3 = var3.s(y.o, var4.i(y.o));
      }

      if(var1 == f.ui && (var2 & 8) != 0) {
         var3 = var3.s(net.y9.r0.W, Boolean.valueOf(true));
      }

      return var3;
   }

   public static Comparable v(h var0, String var1) {
      Class var2 = var0.R();
      Comparable var3 = J(var1, var2);
      Collection var4 = var0.Z();
      var3 = b(var1, var4);
      return var3;
   }

   public static Comparable b(String var0, Collection var1) {
      for(Object var3 : var1) {
         if(k((Comparable)var3).equals(var0)) {
            return (Comparable)var3;
         }
      }

      return null;
   }

   private static Object k(Comparable var0) {
      if(var0 instanceof au) {
         au var1 = (au)var0;
         return var1.f();
      } else {
         return var0.toString();
      }
   }

   public static Comparable J(String var0, Class var1) {
      return (Comparable)(var1 == String.class?var0:(var1 == Boolean.class?Boolean.valueOf(var0):(var1 == Float.class?Float.valueOf(var0):(var1 == Double.class?Double.valueOf(var0):(var1 == Integer.class?Integer.valueOf(var0):(var1 == Long.class?Long.valueOf(var0):null))))));
   }

   public boolean V(n var1, Map var2) {
      Iterator var3 = var2.keySet().iterator();
      if(var3.hasNext()) {
         h var4 = (h)var3.next();
         List var10000 = (List)var2.get(var4);
         Comparable var6 = var1.i(var4);
         return false;
      } else {
         return true;
      }
   }

   public i[] z(String var1) {
      return null;
   }

   public i x(String var1) {
      var1 = var1.toLowerCase();
      if(var1.equals("nether")) {
         return x.l;
      } else {
         for(net.yz.m_ var3 : i.q.i()) {
            i var4 = (i)i.q.B(var3);
            String var5 = var4.l().replace(" ", "").toLowerCase();
            if(var5.equals(var1)) {
               return var4;
            }
         }

         return null;
      }
   }

   public int f(String var1) {
      return -1;
   }

   public int y(String var1, int var2) {
      return var2;
   }

   public int[] z(String var1) {
      return null;
   }

   public boolean[] E(String var1, boolean[] var2) {
      return var2;
   }

   public aq c(String var1) {
      var1 = var1.toLowerCase();
      if(!var1.equals("bottom") && !var1.equals("down")) {
         if(!var1.equals("top") && !var1.equals("up")) {
            if(var1.equals("north")) {
               return aq.NORTH;
            } else if(var1.equals("south")) {
               return aq.SOUTH;
            } else if(var1.equals("east")) {
               return aq.EAST;
            } else if(var1.equals("west")) {
               return aq.WEST;
            } else {
               z9.h("Unknown face: " + var1);
               return null;
            }
         } else {
            return aq.UP;
         }
      } else {
         return aq.DOWN;
      }
   }

   public void q(String var1) {
      z9.v("" + this.G + ": " + var1);
   }

   public void h(String var1) {
      z9.h("" + this.G + ": " + var1);
   }

   public _1 G(String var1) {
      return null;
   }

   private bf z(String var1) {
      return null;
   }

   public static boolean e(String var0) {
      return var0.trim().equalsIgnoreCase("true");
   }

   public Boolean E(String var1) {
      return null;
   }

   public static int x(String var0, int var1) {
      return var1;
   }

   public static int W(String var0, int var1) {
      return var1;
   }

   public ac x(String var1, ac var2) {
      return var2;
   }

   public Enum S(String var1, Enum[] var2, String var3) {
      return null;
   }

   public Enum[] Z(String var1, Enum[] var2, String var3, Enum[] var4) {
      return null;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
