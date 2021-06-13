package com.sun.jna;

import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.c;
import com.sun.jna.ct;
import com.sun.jna.d;
import com.sun.jna.t;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;
import net.xn;

public class z {
   private long c;
   private final String l;
   private final String k;
   private final Map s = new HashMap();
   final int w;
   private String N;
   final Map T;
   private static final Map j;
   private static final Map C;
   private static final List v;
   private static final int Z = -1;
   private static final String[] a;
   private static final String[] b;

   private static String W(String var0, int var1, String var2) {
      return var0 + "|" + var1 + "|" + var2;
   }

   private z(String var1, String var2, long var3, Map var5) {
      this.l = this.v(var1);
      this.k = var2;
      this.c = var3;
      Object var6 = var5.get(a(-21113, 12900));
      int var7 = var6 instanceof Number?((Number)var6).intValue():0;
      this.w = var7;
      this.T = var5;
      this.N = (String)var5.get(a(-21059, 16111));
      if(this.N == null) {
         this.N = Native.L();
      }

      if(d.o() && a(-21085, 2823).equals(this.l.toLowerCase())) {
         Map var8 = this.s;
         Function var9 = new Function(this, a(-21082, 1918), 63, this.N) {
            Object y(Object[] var1, Class var2, boolean var3, int var4) {
               return Integer.valueOf(Native.getLastError());
            }

            Object t(Method var1, Class[] var2, Class var3, Object[] var4, Map var5) {
               return Integer.valueOf(Native.getLastError());
            }
         };
         this.s.put(W(a(-21115, -4789), this.w, this.N), var9);
      }

   }

   private static int J(Map var0) {
      Object var1 = var0.get(a(-21076, 8250));
      return var1 instanceof Number?((Number)var1).intValue():-1;
   }

   private static com.sun.jna.z T(String var0, Map var1) {
      if(Native.Q) {
         System.out.println(a(-21099, 24942) + var0 + "\'");
      }

      (new File(var0)).isAbsolute();
      ArrayList var3 = new ArrayList();
      int var4 = J(var1);
      String var5 = Native.p(var0);
      if(Native.Q) {
         System.out.println(a(-21120, -14337) + var5);
      }

      var3.add(var5);
      List var6 = (List)C.get(var0);
      var3.addAll(0, var6);
      if(Native.Q) {
         System.out.println(a(-21084, -1555) + System.getProperty(a(-21110, 24125)));
      }

      var3.addAll(n(a(-21058, 7683)));
      String var7 = B(var0, var3);
      long var8 = 0L;
      if(Native.Q) {
         System.out.println(a(-21060, -2888) + var7);
      }

      var8 = Native.open(var7, var4);
      if(var8 == 0L) {
         var7 = B(var0, var3);
         if(Native.Q) {
            System.out.println(a(-21106, -25438) + var7);
         }

         var8 = Native.open(var7, var4);
         if(var8 == 0L) {
            throw new UnsatisfiedLinkError(a(-21006, -24138) + var0 + "\'");
         }
      }

      if(Native.Q) {
         System.out.println(a(-21105, 28141) + var0 + a(-21062, -2109) + var7);
      }

      return new com.sun.jna.z(var0, var7, var8, var1);
   }

   static String q(String var0) {
      File var1 = new File(var0);
      if(var1.isAbsolute()) {
         if(var0.indexOf(a(-21070, 29723)) != -1 && var1.exists()) {
            return var1.getAbsolutePath();
         }

         var1 = new File(new File(var1.getParentFile(), var1.getName() + a(-21063, 7585)), var1.getName());
         if(var1.exists()) {
            return var1.getAbsolutePath();
         }
      } else {
         String[] var2 = new String[]{System.getProperty(a(-21089, -1091)), "", a(-21093, -20079)};
         String var3 = var0.indexOf(a(-21063, 7585)) == -1?var0 + a(-21078, -4423) + var0:var0;

         for(int var4 = 0; var4 < var2.length; ++var4) {
            String var5 = var2[var4] + a(-21108, -16055) + var3;
            if((new File(var5)).exists()) {
               return var5;
            }
         }
      }

      return null;
   }

   private String v(String var1) {
      String var2 = var1;
      a(-21080, 25821);
      String var4 = k(a(-21067, 14486));
      int var5 = var4.indexOf(a(-21067, 14486));
      if(var1.startsWith(var4.substring(0, var5))) {
         var2 = var1.substring(var5);
      }

      String var6 = var4.substring(var5 + a(-21067, 14486).length());
      int var7 = var2.indexOf(var6);
      if(var7 != -1) {
         var2 = var2.substring(0, var7);
      }

      return var2;
   }

   public static final com.sun.jna.z n(String var0) {
      return u(var0, Collections.emptyMap());
   }

   public static final com.sun.jna.z D(String var0, ClassLoader var1) {
      return u(var0, Collections.singletonMap(a(-21117, 10566), var1));
   }

   public static final com.sun.jna.z u(String var0, Map var1) {
      HashMap var2 = new HashMap(var1);
      if(var2.get(a(-21101, 22791)) == null) {
         var2.put(a(-21101, 22791), Integer.valueOf(0));
      }

      if((d.K() || d.y() || d.q()) && d.f.equals(var0)) {
         var0 = null;
      }

      Map var3 = j;
      Reference var4 = (Reference)j.get(var0 + var2);
      com.sun.jna.z var5 = (com.sun.jna.z)var4.get();
      var5 = new com.sun.jna.z(a(-21119, 26871), (String)null, Native.open((String)null, J((Map)var2)), var2);
      WeakReference var8 = new WeakReference(var5);
      j.put(var5.e() + var2, var8);
      File var6 = var5.p();
      j.put(var6.getAbsolutePath() + var2, var8);
      j.put(var6.getName() + var2, var8);
      return var5;
   }

   public static final synchronized com.sun.jna.z T() {
      return n((String)null);
   }

   public static final synchronized com.sun.jna.z k(Map var0) {
      return u((String)null, var0);
   }

   public static final void l(String var0, String var1) {
      Map var2 = C;
      List var3 = (List)C.get(var0);
      var3 = Collections.synchronizedList(new ArrayList());
      C.put(var0, var3);
      var3.add(var1);
   }

   public Function i(String var1) {
      return this.L(var1, this.w);
   }

   Function W(String var1, Method var2) {
      t var3 = (t)this.T.get(a(-21073, -32438));
      var1 = var3.d(this, var2);
      String var4 = System.getProperty(a(-21068, 21434), a(-21081, 23790));
      if(var1.startsWith(var4)) {
         var1 = var1.substring(var4.length());
      }

      int var5 = this.w;
      Class[] var6 = var2.getExceptionTypes();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         if(ct.class.isAssignableFrom(var6[var7])) {
            var5 |= 64;
         }
      }

      return this.L(var1, var5);
   }

   public Function L(String var1, int var2) {
      return this.s(var1, var2, this.N);
   }

   public Function s(String var1, int var2, String var3) {
      throw new NullPointerException(a(-21086, -21811));
   }

   public Map m() {
      return this.T;
   }

   public Pointer J(String var1) {
      return new Pointer(this.t(var1));
   }

   long t(String var1) {
      if(this.c == 0L) {
         throw new UnsatisfiedLinkError(a(-21114, -2852));
      } else {
         return Native.findSymbol(this.c, var1);
      }
   }

   public String toString() {
      return a(-21002, 18540) + this.k + "@" + this.c + ">";
   }

   public String e() {
      return this.l;
   }

   public File p() {
      return this.k == null?null:new File(this.k);
   }

   protected void finalize() {
      this.F();
   }

   static void r() {
      Map var1 = j;

      for(Reference var2 : new LinkedHashSet(j.values())) {
         com.sun.jna.z var3 = (com.sun.jna.z)var2.get();
         var3.F();
      }

   }

   public void F() {
      HashSet var2 = new HashSet();
      c.F();
      Map var3 = j;
      Iterator var4 = j.entrySet().iterator();
      if(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Reference var6 = (Reference)var5.getValue();
         if(var6.get() == this) {
            var2.add(var5.getKey());
         }
      }

      var4 = var2.iterator();
      if(var4.hasNext()) {
         String var10 = (String)var4.next();
         j.remove(var10);
      }

      if(this.c != 0L) {
         Native.close(this.c);
         this.c = 0L;
      }

      if(net.u.d.y() == null) {
         c.l(new net.u.d[3]);
      }

   }

   private static List n(String var0) {
      String var1 = System.getProperty(var0, "");
      if("".equals(var1)) {
         return Collections.emptyList();
      } else {
         StringTokenizer var2 = new StringTokenizer(var1, File.pathSeparator);
         ArrayList var3 = new ArrayList();

         while(var2.hasMoreTokens()) {
            String var4 = var2.nextToken();
            if(!"".equals(var4)) {
               var3.add(var4);
            }
         }

         return var3;
      }
   }

   private static String B(String var0, List var1) {
      if((new File(var0)).isAbsolute()) {
         return var0;
      } else {
         String var2 = k(var0);

         for(String var4 : var1) {
            File var5 = new File(var4, var2);
            if(var5.exists()) {
               return var5.getAbsolutePath();
            }

            if(d.k() && var2.endsWith(a(-21005, 7743))) {
               var5 = new File(var4, var2.substring(0, var2.lastIndexOf(a(-21003, -26538))) + a(-21008, 28517));
               if(var5.exists()) {
                  return var5.getAbsolutePath();
               }
            }
         }

         return var2;
      }
   }

   static String k(String var0) {
      if(d.k()) {
         if(!var0.startsWith(a(-21096, 3746)) || !var0.endsWith(a(-21003, -26538)) && !var0.endsWith(a(-21116, 22684))) {
            String var1 = System.mapLibraryName(var0);
            return var1.endsWith(a(-21116, 22684))?var1.substring(0, var1.lastIndexOf(a(-21116, 22684))) + a(-21003, -26538):var1;
         } else {
            return var0;
         }
      } else {
         if(!d.K() && !d.y()) {
            if(d.q()) {
               if(var0.startsWith(a(-21096, 3746))) {
                  return var0;
               }
            } else if(d.o() && (var0.endsWith(a(-21111, -25614)) || var0.endsWith(a(-21057, -20714)))) {
               return var0;
            }
         } else if(y(var0) || var0.endsWith(a(-21071, -16503))) {
            return var0;
         }

         return System.mapLibraryName(var0);
      }
   }

   private static boolean y(String var0) {
      if(var0.startsWith(a(-21072, 10080))) {
         int var1 = var0.lastIndexOf(a(-20994, -6184));
         if(var1 != -1 && var1 + 4 < var0.length()) {
            for(int var2 = var1 + 4; var2 < var0.length(); ++var2) {
               char var3 = var0.charAt(var2);
               if(!Character.isDigit(var3) && var3 != 46) {
                  return false;
               }
            }

            return true;
         }
      }

      return false;
   }

   static String E(final String var0, List var1) {
      File var2 = new File(var0);
      if(var2.isAbsolute()) {
         var1 = Arrays.asList(new String[]{var2.getParent()});
      }

      FilenameFilter var3 = new FilenameFilter() {
         public boolean accept(File var1, String var2) {
            net.u.d[] var3 = c.F();
            return (var2.startsWith("lib" + var0 + ".so") || var2.startsWith(var0 + ".so") && var0.startsWith("lib")) && com.sun.jna.z.y(var2);
         }

         private static xn a(xn var0x) {
            return var0x;
         }
      };
      LinkedList var4 = new LinkedList();

      for(String var6 : var1) {
         File[] var7 = (new File(var6)).listFiles(var3);
         if(var7.length > 0) {
            var4.addAll(Arrays.asList(var7));
         }
      }

      double var14 = -1.0D;
      String var15 = null;

      for(File var9 : var4) {
         String var10 = var9.getAbsolutePath();
         String var11 = var10.substring(var10.lastIndexOf(a(-21118, 8955)) + 4);
         double var12 = t(var11);
         if(var12 > var14) {
            var14 = var12;
            var15 = var10;
         }
      }

      return var15;
   }

   static double t(String var0) {
      double var1 = 0.0D;
      double var3 = 1.0D;
      int var5 = var0.indexOf(".");

      while(true) {
         String var6;
         if(var5 != -1) {
            var6 = var0.substring(0, var5);
            var0 = var0.substring(var5 + 1);
            var5 = var0.indexOf(".");
         } else {
            var6 = var0;
            var0 = null;
         }

         var1 += (double)Integer.parseInt(var6) / var3;
         var3 *= 100.0D;
      }
   }

   private static String q() {
      String var0 = d.b;
      String var1 = d.j()?a(-21001, -18053):(d.T()?"":a(-21087, 6667));
      String var2 = a(-21083, -9625);
      if(d.u()) {
         var0 = d.m()?a(-21103, -7989):a(-21102, 19361);
      } else if(d.X()) {
         var0 = d.m()?a(-21079, -20106):a(-21088, -31211);
      } else if(d.d()) {
         var0 = a(-21074, 5287);
         var2 = a(-21094, 3483);
      }

      return var0 + var1 + var2;
   }

   private static ArrayList K() {
      ArrayList var0 = new ArrayList();
      Process var1 = Runtime.getRuntime().exec(a(-20993, -13765));
      BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream()));
      String var3 = "";

      while((var3 = var2.readLine()) != null) {
         int var4 = var3.indexOf(a(-21098, -18718));
         int var5 = var3.lastIndexOf(47);
         if(var4 != -1 && var5 != -1 && var4 < var5) {
            String var6 = var3.substring(var4 + 4, var5);
            if(!var0.contains(var6)) {
               var0.add(var6);
            }
         }
      }

      var2.close();
      return var0;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21065) & '\uffff';
      if(b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch(var3[0] & 255) {
         case 0:
            var10000 = 141;
            break;
         case 1:
            var10000 = 177;
            break;
         case 2:
            var10000 = 78;
            break;
         case 3:
            var10000 = 33;
            break;
         case 4:
            var10000 = 119;
            break;
         case 5:
            var10000 = 150;
            break;
         case 6:
            var10000 = 121;
            break;
         case 7:
            var10000 = 123;
            break;
         case 8:
            var10000 = 72;
            break;
         case 9:
            var10000 = 107;
            break;
         case 10:
            var10000 = 197;
            break;
         case 11:
            var10000 = 13;
            break;
         case 12:
            var10000 = 152;
            break;
         case 13:
            var10000 = 203;
            break;
         case 14:
            var10000 = 250;
            break;
         case 15:
            var10000 = 200;
            break;
         case 16:
            var10000 = 26;
            break;
         case 17:
            var10000 = 135;
            break;
         case 18:
            var10000 = 239;
            break;
         case 19:
            var10000 = 87;
            break;
         case 20:
            var10000 = 173;
            break;
         case 21:
            var10000 = 118;
            break;
         case 22:
            var10000 = 237;
            break;
         case 23:
            var10000 = 233;
            break;
         case 24:
            var10000 = 64;
            break;
         case 25:
            var10000 = 149;
            break;
         case 26:
            var10000 = 21;
            break;
         case 27:
            var10000 = 77;
            break;
         case 28:
            var10000 = 63;
            break;
         case 29:
            var10000 = 181;
            break;
         case 30:
            var10000 = 226;
            break;
         case 31:
            var10000 = 97;
            break;
         case 32:
            var10000 = 90;
            break;
         case 33:
            var10000 = 192;
            break;
         case 34:
            var10000 = 204;
            break;
         case 35:
            var10000 = 189;
            break;
         case 36:
            var10000 = 96;
            break;
         case 37:
            var10000 = 128;
            break;
         case 38:
            var10000 = 249;
            break;
         case 39:
            var10000 = 158;
            break;
         case 40:
            var10000 = 193;
            break;
         case 41:
            var10000 = 242;
            break;
         case 42:
            var10000 = 1;
            break;
         case 43:
            var10000 = 27;
            break;
         case 44:
            var10000 = 19;
            break;
         case 45:
            var10000 = 213;
            break;
         case 46:
            var10000 = 102;
            break;
         case 47:
            var10000 = 74;
            break;
         case 48:
            var10000 = 207;
            break;
         case 49:
            var10000 = 155;
            break;
         case 50:
            var10000 = 39;
            break;
         case 51:
            var10000 = 101;
            break;
         case 52:
            var10000 = 10;
            break;
         case 53:
            var10000 = 215;
            break;
         case 54:
            var10000 = 29;
            break;
         case 55:
            var10000 = 254;
            break;
         case 56:
            var10000 = 220;
            break;
         case 57:
            var10000 = 209;
            break;
         case 58:
            var10000 = 65;
            break;
         case 59:
            var10000 = 136;
            break;
         case 60:
            var10000 = 153;
            break;
         case 61:
            var10000 = 58;
            break;
         case 62:
            var10000 = 15;
            break;
         case 63:
            var10000 = 35;
            break;
         case 64:
            var10000 = 137;
            break;
         case 65:
            var10000 = 17;
            break;
         case 66:
            var10000 = 190;
            break;
         case 67:
            var10000 = 73;
            break;
         case 68:
            var10000 = 67;
            break;
         case 69:
            var10000 = 148;
            break;
         case 70:
            var10000 = 70;
            break;
         case 71:
            var10000 = 217;
            break;
         case 72:
            var10000 = 221;
            break;
         case 73:
            var10000 = 133;
            break;
         case 74:
            var10000 = 154;
            break;
         case 75:
            var10000 = 95;
            break;
         case 76:
            var10000 = 7;
            break;
         case 77:
            var10000 = 184;
            break;
         case 78:
            var10000 = 230;
            break;
         case 79:
            var10000 = 4;
            break;
         case 80:
            var10000 = 109;
            break;
         case 81:
            var10000 = 202;
            break;
         case 82:
            var10000 = 162;
            break;
         case 83:
            var10000 = 81;
            break;
         case 84:
            var10000 = 22;
            break;
         case 85:
            var10000 = 229;
            break;
         case 86:
            var10000 = 0;
            break;
         case 87:
            var10000 = 59;
            break;
         case 88:
            var10000 = 165;
            break;
         case 89:
            var10000 = 43;
            break;
         case 90:
            var10000 = 211;
            break;
         case 91:
            var10000 = 98;
            break;
         case 92:
            var10000 = 164;
            break;
         case 93:
            var10000 = 53;
            break;
         case 94:
            var10000 = 51;
            break;
         case 95:
            var10000 = 100;
            break;
         case 96:
            var10000 = 131;
            break;
         case 97:
            var10000 = 38;
            break;
         case 98:
            var10000 = 147;
            break;
         case 99:
            var10000 = 191;
            break;
         case 100:
            var10000 = 240;
            break;
         case 101:
            var10000 = 206;
            break;
         case 102:
            var10000 = 91;
            break;
         case 103:
            var10000 = 252;
            break;
         case 104:
            var10000 = 60;
            break;
         case 105:
            var10000 = 115;
            break;
         case 106:
            var10000 = 138;
            break;
         case 107:
            var10000 = 224;
            break;
         case 108:
            var10000 = 194;
            break;
         case 109:
            var10000 = 183;
            break;
         case 110:
            var10000 = 76;
            break;
         case 111:
            var10000 = 112;
            break;
         case 112:
            var10000 = 130;
            break;
         case 113:
            var10000 = 178;
            break;
         case 114:
            var10000 = 122;
            break;
         case 115:
            var10000 = 144;
            break;
         case 116:
            var10000 = 196;
            break;
         case 117:
            var10000 = 46;
            break;
         case 118:
            var10000 = 56;
            break;
         case 119:
            var10000 = 244;
            break;
         case 120:
            var10000 = 223;
            break;
         case 121:
            var10000 = 187;
            break;
         case 122:
            var10000 = 208;
            break;
         case 123:
            var10000 = 75;
            break;
         case 124:
            var10000 = 134;
            break;
         case 125:
            var10000 = 241;
            break;
         case 126:
            var10000 = 174;
            break;
         case 127:
            var10000 = 214;
            break;
         case 128:
            var10000 = 116;
            break;
         case 129:
            var10000 = 31;
            break;
         case 130:
            var10000 = 186;
            break;
         case 131:
            var10000 = 49;
            break;
         case 132:
            var10000 = 172;
            break;
         case 133:
            var10000 = 201;
            break;
         case 134:
            var10000 = 113;
            break;
         case 135:
            var10000 = 88;
            break;
         case 136:
            var10000 = 85;
            break;
         case 137:
            var10000 = 40;
            break;
         case 138:
            var10000 = 83;
            break;
         case 139:
            var10000 = 104;
            break;
         case 140:
            var10000 = 198;
            break;
         case 141:
            var10000 = 28;
            break;
         case 142:
            var10000 = 199;
            break;
         case 143:
            var10000 = 25;
            break;
         case 144:
            var10000 = 55;
            break;
         case 145:
            var10000 = 30;
            break;
         case 146:
            var10000 = 143;
            break;
         case 147:
            var10000 = 92;
            break;
         case 148:
            var10000 = 159;
            break;
         case 149:
            var10000 = 24;
            break;
         case 150:
            var10000 = 228;
            break;
         case 151:
            var10000 = 238;
            break;
         case 152:
            var10000 = 163;
            break;
         case 153:
            var10000 = 182;
            break;
         case 154:
            var10000 = 105;
            break;
         case 155:
            var10000 = 6;
            break;
         case 156:
            var10000 = 157;
            break;
         case 157:
            var10000 = 9;
            break;
         case 158:
            var10000 = 185;
            break;
         case 159:
            var10000 = 169;
            break;
         case 160:
            var10000 = 94;
            break;
         case 161:
            var10000 = 247;
            break;
         case 162:
            var10000 = 44;
            break;
         case 163:
            var10000 = 41;
            break;
         case 164:
            var10000 = 111;
            break;
         case 165:
            var10000 = 99;
            break;
         case 166:
            var10000 = 18;
            break;
         case 167:
            var10000 = 222;
            break;
         case 168:
            var10000 = 117;
            break;
         case 169:
            var10000 = 50;
            break;
         case 170:
            var10000 = 156;
            break;
         case 171:
            var10000 = 23;
            break;
         case 172:
            var10000 = 140;
            break;
         case 173:
            var10000 = 127;
            break;
         case 174:
            var10000 = 84;
            break;
         case 175:
            var10000 = 161;
            break;
         case 176:
            var10000 = 251;
            break;
         case 177:
            var10000 = 89;
            break;
         case 178:
            var10000 = 120;
            break;
         case 179:
            var10000 = 212;
            break;
         case 180:
            var10000 = 114;
            break;
         case 181:
            var10000 = 93;
            break;
         case 182:
            var10000 = 124;
            break;
         case 183:
            var10000 = 71;
            break;
         case 184:
            var10000 = 243;
            break;
         case 185:
            var10000 = 171;
            break;
         case 186:
            var10000 = 54;
            break;
         case 187:
            var10000 = 47;
            break;
         case 188:
            var10000 = 2;
            break;
         case 189:
            var10000 = 180;
            break;
         case 190:
            var10000 = 142;
            break;
         case 191:
            var10000 = 170;
            break;
         case 192:
            var10000 = 160;
            break;
         case 193:
            var10000 = 36;
            break;
         case 194:
            var10000 = 45;
            break;
         case 195:
            var10000 = 248;
            break;
         case 196:
            var10000 = 227;
            break;
         case 197:
            var10000 = 14;
            break;
         case 198:
            var10000 = 176;
            break;
         case 199:
            var10000 = 253;
            break;
         case 200:
            var10000 = 235;
            break;
         case 201:
            var10000 = 129;
            break;
         case 202:
            var10000 = 139;
            break;
         case 203:
            var10000 = 255;
            break;
         case 204:
            var10000 = 188;
            break;
         case 205:
            var10000 = 245;
            break;
         case 206:
            var10000 = 175;
            break;
         case 207:
            var10000 = 151;
            break;
         case 208:
            var10000 = 52;
            break;
         case 209:
            var10000 = 86;
            break;
         case 210:
            var10000 = 179;
            break;
         case 211:
            var10000 = 132;
            break;
         case 212:
            var10000 = 103;
            break;
         case 213:
            var10000 = 68;
            break;
         case 214:
            var10000 = 145;
            break;
         case 215:
            var10000 = 66;
            break;
         case 216:
            var10000 = 236;
            break;
         case 217:
            var10000 = 225;
            break;
         case 218:
            var10000 = 82;
            break;
         case 219:
            var10000 = 79;
            break;
         case 220:
            var10000 = 219;
            break;
         case 221:
            var10000 = 62;
            break;
         case 222:
            var10000 = 32;
            break;
         case 223:
            var10000 = 168;
            break;
         case 224:
            var10000 = 11;
            break;
         case 225:
            var10000 = 205;
            break;
         case 226:
            var10000 = 195;
            break;
         case 227:
            var10000 = 167;
            break;
         case 228:
            var10000 = 57;
            break;
         case 229:
            var10000 = 232;
            break;
         case 230:
            var10000 = 16;
            break;
         case 231:
            var10000 = 246;
            break;
         case 232:
            var10000 = 146;
            break;
         case 233:
            var10000 = 210;
            break;
         case 234:
            var10000 = 20;
            break;
         case 235:
            var10000 = 69;
            break;
         case 236:
            var10000 = 42;
            break;
         case 237:
            var10000 = 218;
            break;
         case 238:
            var10000 = 37;
            break;
         case 239:
            var10000 = 126;
            break;
         case 240:
            var10000 = 8;
            break;
         case 241:
            var10000 = 12;
            break;
         case 242:
            var10000 = 108;
            break;
         case 243:
            var10000 = 3;
            break;
         case 244:
            var10000 = 110;
            break;
         case 245:
            var10000 = 5;
            break;
         case 246:
            var10000 = 61;
            break;
         case 247:
            var10000 = 216;
            break;
         case 248:
            var10000 = 234;
            break;
         case 249:
            var10000 = 80;
            break;
         case 250:
            var10000 = 34;
            break;
         case 251:
            var10000 = 48;
            break;
         case 252:
            var10000 = 166;
            break;
         case 253:
            var10000 = 106;
            break;
         case 254:
            var10000 = 125;
            break;
         default:
            var10000 = 231;
         }

         short var4 = var10000;
         int var5 = (var1 & 255) - var4;
         var5 = var5 + 256;
         int var6 = ((var1 & '\uffff') >>> 8) - var4;
         var6 = var6 + 256;

         for(int var7 = 0; var7 < var3.length; ++var7) {
            int var8 = var7 % 2;
            var3[var7] = (char)(var3[var7] ^ var5);
            var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 255;
         }

         b[var2] = (new String(var3)).intern();
      }

      return b[var2];
   }
}
