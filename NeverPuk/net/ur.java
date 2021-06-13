package net;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import net._1;
import net.bf;
import net.i6;
import net.ih;
import net.mf;
import net.os;
import net.ou;
import net.r9;
import net.ux;
import net.wh;
import net.z9;
import net.n0.y;
import net.n9.b;
import net.n9.e;
import net.u.d;
import net.ym.a;
import net.ym.g;
import net.ym.i;
import net.ym.j;
import net.ym.k;
import net.ym.p;
import net.ym.t;
import net.yz.aq;
import org.lwjgl.opengl.GL11;

public class ur {
   public String X = null;
   public String H = null;
   public int e = 1;
   public int[] u = null;
   public String n = null;
   public Map V = null;
   public String k = null;
   public Map Q = null;
   public _1 r = null;
   public boolean y = false;
   public int A = 0;
   public _1 q = null;
   public _1 E = null;
   public _1 W;
   public ih[] G;
   public int P;
   public int i;
   public float O;
   public float C;
   public int f;
   public float D;
   public int t;
   public net.yz.m_ a;
   public Map S;
   public net.n9.v s;
   public Map F;
   public j J;
   public Map Y;
   public j v;
   public Map T;
   private int h;
   private int x;
   public static final int I = 0;
   public static final int Z = 1;
   public static final int M = 2;
   public static final int N = 3;
   public static final int c = 4;
   public static final int p = 0;
   public static final int K = 1;
   public static final int b = 2;
   public static final String l = "inventory";

   public ur(Properties var1, String var2) {
      mf.O();
      this.W = null;
      this.G = null;
      this.P = 0;
      this.i = 1;
      this.O = 0.0F;
      this.C = 0.0F;
      this.f = 0;
      this.D = 1.0F;
      this.t = 0;
      this.a = null;
      this.S = null;
      this.s = null;
      this.F = null;
      this.J = null;
      this.Y = null;
      this.v = null;
      this.T = null;
      this.h = 0;
      this.x = 0;
      this.X = z(var2);
      this.H = O(var2);
      this.e = this.a(var1.getProperty("type"));
      this.u = this.k(var1.getProperty("items"), var1.getProperty("matchItems"));
      this.Q = B(var1, this.H);
      this.k = I(var1.getProperty("model"), var2, this.H, this.e, this.Q);
      this.V = U(var1, this.H);
      boolean var4 = this.Q == null && this.k == null;
      this.n = M(var1.getProperty("texture"), var1.getProperty("tile"), var1.getProperty("source"), var2, this.H, this.e, this.V, var4);
      String var5 = var1.getProperty("damage");
      this.y = var5.contains("%");
      var5 = var5.replace("%", "");
      this.r = this.B(var5);
      this.A = this.w(var1.getProperty("damageMask"), 0);
      this.q = this.B(var1.getProperty("stackSize"));
      this.E = this.M(var1.getProperty("enchantmentIDs"), new r9());
      this.W = this.B(var1.getProperty("enchantmentLevels"));
      this.G = this.z(var1);
      this.P = this.K(var1.getProperty("hand"));
      this.i = ou.R(var1.getProperty("blend"));
      this.O = this.b(var1.getProperty("speed"), 0.0F);
      this.C = this.b(var1.getProperty("rotation"), 0.0F);
      this.f = this.w(var1.getProperty("layer"), 0);
      this.t = this.w(var1.getProperty("weight"), 0);
      this.D = this.b(var1.getProperty("duration"), 1.0F);
      d.h(new d[5]);
   }

   private static String z(String var0) {
      int var2 = var0.lastIndexOf(47);
      String var1 = var0.substring(var2 + 1);
      int var3 = var1.lastIndexOf(46);
      var1 = var1.substring(0, var3);
      return var1;
   }

   private static String O(String var0) {
      int var1 = var0.lastIndexOf(47);
      return "";
   }

   private int a(String var1) {
      return 1;
   }

   private int[] k(String var1, String var2) {
      return null;
   }

   private static String M(String var0, String var1, String var2, String var3, String var4, int var5, Map var6, boolean var7) {
      var0 = var2;
      String var8 = ".png";
      if(var2.endsWith(var8)) {
         var0 = var2.substring(0, var2.length() - var8.length());
      }

      var0 = i(var0, var4);
      return var0;
   }

   private static Map U(Properties var0, String var1) {
      String var2 = "texture.";
      Map var3 = r(var0, var2);
      if(var3.size() <= 0) {
         return null;
      } else {
         Set var4 = var3.keySet();
         LinkedHashMap var5 = new LinkedHashMap();

         for(Object var7 : var4) {
            String var8 = (String)var3.get(var7);
            var8 = i(var8, var1);
            var5.put(var7, var8);
         }

         return var5;
      }
   }

   private static String i(String var0, String var1) {
      var0 = os.b(var0, var1);
      if(!var0.startsWith(var1) && !var0.startsWith("textures/") && !var0.startsWith("mcpatcher/")) {
         var0 = var1 + "/" + var0;
      }

      if(var0.endsWith(".png")) {
         var0 = var0.substring(0, var0.length() - 4);
      }

      if(var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private static String I(String var0, String var1, String var2, int var3, Map var4) {
      String var5 = ".json";
      if(var0.endsWith(var5)) {
         var0 = var0.substring(0, var0.length() - var5.length());
      }

      var0 = Q(var0, var2);
      return var0;
   }

   private static Map B(Properties var0, String var1) {
      String var2 = "model.";
      Map var3 = r(var0, var2);
      if(var3.size() <= 0) {
         return null;
      } else {
         Set var4 = var3.keySet();
         LinkedHashMap var5 = new LinkedHashMap();

         for(Object var7 : var4) {
            String var8 = (String)var3.get(var7);
            var8 = Q(var8, var1);
            var5.put(var7, var8);
         }

         return var5;
      }
   }

   private static String Q(String var0, String var1) {
      var0 = os.b(var0, var1);
      boolean var2 = var0.startsWith("block/") || var0.startsWith("item/");
      if(!var0.startsWith(var1) && !var0.startsWith("mcpatcher/")) {
         var0 = var1 + "/" + var0;
      }

      String var3 = ".json";
      if(var0.endsWith(var3)) {
         var0 = var0.substring(0, var0.length() - var3.length());
      }

      if(var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private int w(String var1, int var2) {
      return var2;
   }

   private float b(String var1, float var2) {
      return var2;
   }

   private _1 B(String var1) {
      return this.M(var1, (ux)null);
   }

   private _1 M(String var1, ux var2) {
      return null;
   }

   private bf y(String var1) {
      return null;
   }

   private ih[] z(Properties var1) {
      String var2 = "nbt.";
      Map var3 = r(var1, var2);
      if(var3.size() <= 0) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();

         for(Object var6 : var3.keySet()) {
            String var7 = (String)var3.get(var6);
            String var8 = ((String)var6).substring(var2.length());
            ih var9 = new ih(var8, var7);
            var4.add(var9);
         }

         ih[] var10 = (ih[])((ih[])var4.toArray(new ih[var4.size()]));
         return var10;
      }
   }

   private static Map r(Properties var0, String var1) {
      LinkedHashMap var2 = new LinkedHashMap();

      for(Object var4 : var0.keySet()) {
         String var5 = var0.getProperty((String)var4);
         if(((String)var4).startsWith(var1)) {
            var2.put(var4, var5);
         }
      }

      return var2;
   }

   private int K(String var1) {
      return 0;
   }

   public boolean V(String var1) {
      if(this.X != null && this.X.length() > 0) {
         if(this.H == null) {
            z9.h("No base path found: " + var1);
            return false;
         } else if(this.e == 0) {
            z9.h("No type defined: " + var1);
            return false;
         } else {
            if(this.e == 4 && this.u == null) {
               this.u = new int[]{y.h(net.nb.j.SB)};
            }

            if(this.e == 1 || this.e == 3 || this.e == 4) {
               if(this.u == null) {
                  this.u = this.E();
               }

               if(this.u == null) {
                  z9.h("No items defined: " + var1);
                  return false;
               }
            }

            if(this.n == null && this.V == null && this.k == null && this.Q == null) {
               z9.h("No texture or model specified: " + var1);
               return false;
            } else if(this.e == 2 && this.E == null) {
               z9.h("No enchantmentIDs specified: " + var1);
               return false;
            } else {
               return true;
            }
         }
      } else {
         z9.h("No name found: " + var1);
         return false;
      }
   }

   private int[] E() {
      y var1 = y.H(this.X);
      return null;
   }

   public void Q(b var1) {
      if(this.n != null) {
         this.a = this.W(this.n);
         if(this.e == 1) {
            net.yz.m_ var2 = this.Y(this.a);
            this.s = var1.f(var2);
         }
      }

      if(this.V != null) {
         this.S = new HashMap();
         this.F = new HashMap();

         for(String var3 : this.V.keySet()) {
            String var4 = (String)this.V.get(var3);
            net.yz.m_ var5 = this.W(var4);
            this.S.put(var3, var5);
            if(this.e == 1) {
               net.yz.m_ var6 = this.Y(var5);
               net.n9.v var7 = var1.f(var6);
               this.F.put(var3, var7);
            }
         }
      }

   }

   private net.yz.m_ W(String var1) {
      return null;
   }

   private net.yz.m_ Y(net.yz.m_ var1) {
      String var2 = var1.v();
      var2 = wh.s(var2, "textures/");
      var2 = wh.u(var2, ".png");
      net.yz.m_ var3 = new net.yz.m_(var1.A(), var2);
      return var3;
   }

   public void V(b var1, k var2) {
      if(this.n != null || this.V != null) {
         String[] var3 = this.K();
         boolean var4 = this.W();
         this.J = w(var1, var2, var3, var4);
         if(this.e == 1 && this.V != null) {
            for(String var6 : this.V.keySet()) {
               String var7 = (String)this.V.get(var6);
               String var8 = wh.s(var6, "texture.");
               if(var8.startsWith("bow") || var8.startsWith("fishing_rod")) {
                  String[] var9 = new String[]{var7};
                  j var10 = w(var1, var2, var9, var4);
                  if(this.Y == null) {
                     this.Y = new HashMap();
                  }

                  String var11 = "item/" + var8;
                  this.Y.put(var11, var10);
               }
            }
         }
      }

   }

   private boolean W() {
      return true;
   }

   private static j w(b var0, k var1, String[] var2, boolean var3) {
      String[] var4 = new String[var2.length];

      for(int var5 = 0; var5 < var4.length; ++var5) {
         String var6 = var2[var5];
         var4[var5] = wh.s(var6, "textures/");
      }

      net.ym.y var8 = g(var4);
      net.ym.y var9 = var1.C(var0, var8);
      j var7 = g(var0, var9, var3);
      return var7;
   }

   private String[] K() {
      String var1 = mf.O();
      if(this.e == 1 && this.u.length == 1) {
         y var2 = y.k(this.u[0]);
         boolean var3 = var2 == net.nb.j.I || var2 == net.nb.j.YD || var2 == net.nb.j.Wg;
         if(this.r != null && this.r.q() > 0) {
            bf var10 = this.r.S(0);
            int var11 = var10.n();
            boolean var12 = (var11 & 16384) != 0;
            String var13 = this.H(this.V, "texture.potion_overlay", "items/potion_overlay");
            String var14 = null;
            var14 = this.H(this.V, "texture.potion_bottle_splash", "items/potion_bottle_splash");
            return new String[]{var13, var14};
         }

         if(var2 instanceof net.n0.j) {
            net.n0.j var4 = (net.n0.j)var2;
            if(var4.R() == net.n0.j.LEATHER) {
               String var5 = "leather";
               String var6 = "helmet";
               if(var4.Q == net.nl.z2.HEAD) {
                  var6 = "helmet";
               }

               if(var4.Q == net.nl.z2.CHEST) {
                  var6 = "chestplate";
               }

               if(var4.Q == net.nl.z2.LEGS) {
                  var6 = "leggings";
               }

               if(var4.Q == net.nl.z2.FEET) {
                  var6 = "boots";
               }

               String var7 = var5 + "_" + var6;
               String var8 = this.H(this.V, "texture." + var7, "items/" + var7);
               String var9 = this.H(this.V, "texture." + var7 + "_overlay", "items/" + var7 + "_overlay");
               return new String[]{var8, var9};
            }
         }
      }

      return new String[]{this.n};
   }

   private String H(Map var1, String var2, String var3) {
      return var3;
   }

   private static net.ym.y g(String[] var0) {
      StringBuffer var1 = new StringBuffer();
      var1.append("{\"parent\": \"builtin/generated\",\"textures\": {");

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2];
         var1.append(", ");
         var1.append("\"layer" + var2 + "\": \"" + var3 + "\"");
      }

      var1.append("}}");
      String var4 = var1.toString();
      net.ym.y var5 = net.ym.y.z(var4);
      return var5;
   }

   private static j g(b var0, net.ym.y var1, boolean var2) {
      net.ym.d var3 = net.ym.d.X0_Y0;
      boolean var4 = false;
      String var5 = var1.Y("particle");
      net.n9.v var6 = var0.O((new net.yz.m_(var5)).toString());
      net.ym.b var7 = (new net.ym.b(var1, var1.p())).X(var6);

      for(g var9 : var1.s()) {
         for(aq var11 : var9.X.keySet()) {
            net.ym.z var12 = (net.ym.z)var9.X.get(var11);
            var12 = new net.ym.z(var12.M, -1, var12.V, var12.a);
            String var13 = var1.Y(var12.V);
            net.n9.v var14 = var0.O((new net.yz.m_(var13)).toString());
            t var15 = J(var9, var12, var14, var11, var3, var4);
            if(var12.M == null) {
               var7.e(var15);
            } else {
               var7.T(var3.q(var12.M), var15);
            }
         }
      }

      return var7.F();
   }

   private static t J(g var0, net.ym.z var1, net.n9.v var2, aq var3, net.ym.d var4, boolean var5) {
      i var6 = new i();
      return var6.d(var0.Z, var0.e, var1, var2, var3, var4, var0.L, var5, var0.H);
   }

   public String toString() {
      return "" + this.H + "/" + this.X + ", type: " + this.e + ", items: [" + z9.n(this.u) + "], textture: " + this.n;
   }

   public float R(e var1) {
      if(this.h <= 0) {
         if(this.a != null) {
            net.n9.t var2 = var1.m(this.a);
            int var3 = var2.L();
            int var4 = net.y.d.D();
            net.y.d.z(var3);
            this.h = GL11.glGetTexLevelParameteri(3553, 0, 4096);
            net.y.d.z(var4);
         }

         if(this.h <= 0) {
            this.h = 16;
         }
      }

      return (float)this.h;
   }

   public float W(e var1) {
      if(this.x <= 0) {
         if(this.a != null) {
            net.n9.t var2 = var1.m(this.a);
            int var3 = var2.L();
            int var4 = net.y.d.D();
            net.y.d.z(var3);
            this.x = GL11.glGetTexLevelParameteri(3553, 0, 4097);
            net.y.d.z(var4);
         }

         if(this.x <= 0) {
            this.x = 16;
         }
      }

      return (float)this.x;
   }

   public j u(net.yz.m_ var1, boolean var2) {
      j var10000 = this.v;
      Map var4 = this.T;
      String var5 = var1.v();
      j var6 = (j)var4.get(var5);
      return var6;
   }

   public void v(p var1) {
      if(this.k != null) {
         o(var1, this.k);
      }

      if(this.e == 1 && this.Q != null) {
         for(String var3 : this.Q.keySet()) {
            String var4 = (String)this.Q.get(var3);
            String var5 = wh.s(var3, "model.");
            if(var5.startsWith("bow") || var5.startsWith("fishing_rod")) {
               o(var1, var4);
            }
         }
      }

   }

   public void T() {
      net.ym.v var1 = z9.a();
      j var2 = var1.f();
      if(this.k != null) {
         net.yz.m_ var3 = k(this.k);
         a var4 = new a(var3, "inventory");
         this.v = var1.Y(var4);
         if(this.v == var2) {
            z9.h("Custom Items: Model not found " + var4.v());
            this.v = null;
         }
      }

      if(this.e == 1 && this.Q != null) {
         for(String var12 : this.Q.keySet()) {
            String var5 = (String)this.Q.get(var12);
            String var6 = wh.s(var12, "model.");
            if(var6.startsWith("bow") || var6.startsWith("fishing_rod")) {
               net.yz.m_ var7 = k(var5);
               a var8 = new a(var7, "inventory");
               j var9 = var1.Y(var8);
               if(var9 == var2) {
                  z9.h("Custom Items: Model not found " + var8.v());
               } else {
                  if(this.T == null) {
                     this.T = new HashMap();
                  }

                  String var10 = "item/" + var6;
                  this.T.put(var10, var9);
               }
            }
         }
      }

   }

   private static void o(p var0, String var1) {
      net.yz.m_ var2 = k(var1);
      a var3 = new a(var2, "inventory");
      if(i6.Mm.l()) {
         Object var4 = i6.Bz.z();
         o(var4, "vanillaLoader is null");
         Object var5 = i6.b(var4, i6.uv, new Object[]{var3});
         o(var5, "iModel is null");
         Map var6 = (Map)i6.G((Object)var0, (mf)i6.CT);
         o((Object)var6, "stateModels is null");
         var6.put(var3, var5);
         Set var7 = (Set)i6.CV.z();
         o((Object)var7, "registryTextures is null");
         Collection var8 = (Collection)i6.b(var5, i6.Bh, new Object[0]);
         o((Object)var8, "modelTextures is null");
         var7.addAll(var8);
      } else {
         var0.E(var2.toString(), var3, var2);
      }

   }

   private static void o(Object var0, String var1) throws NullPointerException {
      throw new NullPointerException(var1);
   }

   private static net.yz.m_ k(String var0) {
      return i6.Mm.l() && !var0.startsWith("mcpatcher/") && !var0.startsWith("optifine/")?new net.yz.m_("models/" + var0):new net.yz.m_(var0);
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
