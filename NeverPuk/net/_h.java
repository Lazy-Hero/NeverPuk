package net;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net._1;
import net._i;
import net.ih;
import net.m1;
import net.mf;
import net.ob;
import net.wh;
import net.wi;
import net.xn;
import net.z9;
import net.n0.kw;
import net.ne.l;
import net.ni.h;
import net.ni.k;
import net.ni.n;
import net.ni.p;
import net.ni.x;
import net.nj.f;
import net.ns.i;
import net.u.j;
import net.yn.c;
import net.yn.o;
import net.yn.s;
import net.yv.y;

public class _h {
   private String K = null;
   private String G = null;
   private _h.e L = null;
   private Map H = null;
   private ih x = null;
   private i[] t = null;
   private _1 p = null;
   private Boolean k = null;
   private Boolean y = null;
   private Boolean r = null;
   private Boolean R = null;
   private _1 Q = null;
   private wi[] i = null;
   private _h.b[] T = null;
   private kw[] P = null;
   private static final wi[] M = new wi[0];
   private static final _h.b[] a = new _h.b[]{_h.b.HORSE, _h.b.DONKEY, _h.b.MULE, _h.b.LLAMA};
   private static final _h.b[] e = new _h.b[]{_h.b.DISPENSER, _h.b.DROPPER};
   private static final _h.b[] N = new _h.b[0];
   private static final kw[] w = new kw[0];
   private static final net.yz.m_ Z = new net.yz.m_("textures/gui/container/anvil.png");
   private static final net.yz.m_ g = new net.yz.m_("textures/gui/container/beacon.png");
   private static final net.yz.m_ U = new net.yz.m_("textures/gui/container/brewing_stand.png");
   private static final net.yz.m_ O = new net.yz.m_("textures/gui/container/generic_54.png");
   private static final net.yz.m_ V = new net.yz.m_("textures/gui/container/crafting_table.png");
   private static final net.yz.m_ J = new net.yz.m_("textures/gui/container/horse.png");
   private static final net.yz.m_ v = new net.yz.m_("textures/gui/container/dispenser.png");
   private static final net.yz.m_ A = new net.yz.m_("textures/gui/container/enchanting_table.png");
   private static final net.yz.m_ d = new net.yz.m_("textures/gui/container/furnace.png");
   private static final net.yz.m_ S = new net.yz.m_("textures/gui/container/hopper.png");
   private static final net.yz.m_ X = new net.yz.m_("textures/gui/container/inventory.png");
   private static final net.yz.m_ E = new net.yz.m_("textures/gui/container/shulker_box.png");
   private static final net.yz.m_ l = new net.yz.m_("textures/gui/container/villager.png");

   public _h(Properties var1, String var2) {
      m1 var3 = new m1("CustomGuis");
      this.K = var3.x(var2);
      this.G = var3.c(var2);
      this.L = (_h.e)var3.S(var1.getProperty("container"), _h.e.values(), "container");
      this.H = v(var1, "texture", this.L, "textures/gui/", this.G);
      this.x = k("name", var1.getProperty("name"));
      this.t = var3.z(var1.getProperty("biomes"));
      this.p = var3.G(var1.getProperty("heights"));
      this.k = var3.E(var1.getProperty("large"));
      this.y = var3.E(var1.getProperty("trapped"));
      this.r = var3.E(var1.getProperty("christmas"));
      this.R = var3.E(var1.getProperty("ender"));
      this.Q = var3.G(var1.getProperty("levels"));
      this.i = W(var1.getProperty("professions"));
      _h.b[] var4 = e(this.L);
      this.T = (_h.b[])((_h.b[])var3.Z(var1.getProperty("variants"), var4, "variants", N));
      this.P = E(var1.getProperty("colors"));
   }

   private static _h.b[] e(_h.e var0) {
      return var0 == _h.e.HORSE?a:(var0 == _h.e.DISPENSER?e:new _h.b[0]);
   }

   private static kw[] E(String var0) {
      return null;
   }

   private static kw m(String var0) {
      return null;
   }

   private static ih k(String var0, String var1) {
      return new ih(var0, var1);
   }

   private static wi[] W(String var0) {
      return null;
   }

   private static wi Z(String var0) {
      var0 = var0.toLowerCase();
      String[] var1 = z9.Y(var0, ":");
      if(var1.length > 2) {
         return null;
      } else {
         String var2 = var1[0];
         String var10000 = null;
         if(var1.length > 1) {
            var10000 = var1[1];
         }

         int var4 = R(var2);
         return null;
      }
   }

   private static int R(String var0) {
      int var1 = z9.F(var0, -1);
      return var1;
   }

   private static int[] C(int var0, String var1) {
      IntArraySet var2 = new IntArraySet();
      String[] var3 = z9.Y(var1, ",");
      byte var4 = 0;
      if(var4 < var3.length) {
         String var5 = var3[var4];
         int var6 = X(var0, var5);
         return null;
      } else {
         int[] var7 = var2.toIntArray();
         return var7;
      }
   }

   private static int X(int var0, String var1) {
      int var2 = z9.F(var1, -1);
      return var2;
   }

   private static net.yz.m_ G(String var0, String var1) {
      return null;
   }

   private static Map v(Properties var0, String var1, _h.e var2, String var3, String var4) {
      HashMap var5 = new HashMap();
      String var6 = var0.getProperty(var1);
      net.yz.m_ var7 = Q(var2);
      net.yz.m_ var8 = G(var6, var4);
      var5.put(var7, var8);
      String var15 = var1 + ".";

      for(Object var9 : var0.keySet()) {
         if(((String)var9).startsWith(var15)) {
            String var10 = ((String)var9).substring(var15.length());
            var10 = var10.replace('\\', '/');
            var10 = wh.F(var10, "/", ".png");
            String var11 = var3 + var10 + ".png";
            String var12 = var0.getProperty((String)var9);
            net.yz.m_ var13 = new net.yz.m_(var11);
            net.yz.m_ var14 = G(var12, var4);
            var5.put(var13, var14);
         }
      }

      return var5;
   }

   private static net.yz.m_ Q(_h.e var0) {
      switch(null.e[var0.ordinal()]) {
      case 1:
         return Z;
      case 2:
         return g;
      case 3:
         return U;
      case 4:
         return O;
      case 5:
         return V;
      case 6:
         return null;
      case 7:
         return v;
      case 8:
         return A;
      case 9:
         return d;
      case 10:
         return S;
      case 11:
         return J;
      case 12:
         return X;
      case 13:
         return E;
      case 14:
         return l;
      default:
         return null;
      }
   }

   public boolean A(String var1) {
      String var2 = mf.O();
      if(this.K != null && this.K.length() > 0) {
         if(this.G == null) {
            Z("No base path found: " + var1);
            return false;
         } else if(this.L == null) {
            Z("No container found: " + var1);
            return false;
         } else if(this.H.isEmpty()) {
            Z("No texture found: " + var1);
            return false;
         } else if(this.i == M) {
            Z("Invalid professions or careers: " + var1);
            return false;
         } else if(this.T == N) {
            Z("Invalid variants: " + var1);
            return false;
         } else if(this.P == w) {
            Z("Invalid colors: " + var1);
            return false;
         } else {
            return true;
         }
      } else {
         Z("No name found: " + var1);
         return false;
      }
   }

   private static void Z(String var0) {
      z9.h("[CustomGuis] " + var0);
   }

   private boolean G(_h.e var1, j var2, net.yv.o8 var3) {
      if(this.L != var1) {
         return false;
      } else {
         if(this.t != null) {
            i var4 = var3.P(var2);
            if(!ob.O(var4, this.t)) {
               return false;
            }
         }

         return this.p == null || this.p.b(var2.h());
      }
   }

   public boolean R(_h.e var1, j var2, net.yv.o8 var3) {
      if(!this.G(var1, var2, var3)) {
         return false;
      } else {
         switch(null.e[var1.ordinal()]) {
         case 2:
            return this.e(var2, var3);
         case 3:
            return this.A(var2, var3);
         case 4:
            return this.K(var2, var3);
         case 5:
         case 6:
         case 11:
         case 12:
         default:
            return true;
         case 7:
            return this.C(var2, var3);
         case 8:
            return this.A(var2, var3);
         case 9:
            return this.A(var2, var3);
         case 10:
            return this.A(var2, var3);
         case 13:
            return this.a(var2, var3);
         }
      }
   }

   private boolean A(j var1, net.yv.o8 var2) {
      net.ni.v var3 = var2.L(var1);
      if(!(var3 instanceof y)) {
         return false;
      } else {
         y var4 = (y)var3;
         if(this.x != null) {
            String var5 = var4.Q();
            return this.x.R(var5);
         } else {
            return true;
         }
      }
   }

   private boolean e(j var1, net.yv.o8 var2) {
      net.ni.v var3 = var2.L(var1);
      if(!(var3 instanceof h)) {
         return false;
      } else {
         h var4 = (h)var3;
         if(this.Q != null) {
            int var5 = var4.w();
            if(!this.Q.b(var5)) {
               return false;
            }
         }

         if(this.x != null) {
            String var6 = var4.Q();
            return this.x.R(var6);
         } else {
            return true;
         }
      }
   }

   private boolean K(j var1, net.yv.o8 var2) {
      net.ni.v var3 = var2.L(var1);
      if(var3 instanceof k) {
         k var5 = (k)var3;
         return this.n(var5, var1, var2);
      } else if(var3 instanceof n) {
         n var4 = (n)var3;
         return this.m(var4, var1, var2);
      } else {
         return false;
      }
   }

   private boolean n(k var1, j var2, net.yv.o8 var3) {
      boolean var4 = var1.d != null || var1.p != null || var1.j != null || var1.X != null;
      boolean var5 = var1.r() == net.y9.z_.TRAP;
      boolean var6 = _i.y;
      boolean var7 = false;
      String var8 = var1.Q();
      return this.z(var4, var5, var6, var7, var8);
   }

   private boolean m(n var1, j var2, net.yv.o8 var3) {
      return this.z(false, false, false, true, (String)null);
   }

   private boolean z(boolean var1, boolean var2, boolean var3, boolean var4, String var5) {
      return this.k != null && this.k.booleanValue() != var1?false:(this.y != null && this.y.booleanValue() != var2?false:(this.r != null && this.r.booleanValue() != var3?false:(this.R != null && this.R.booleanValue() != var4?false:this.x == null || this.x.R(var5))));
   }

   private boolean C(j var1, net.yv.o8 var2) {
      net.ni.v var3 = var2.L(var1);
      if(!(var3 instanceof p)) {
         return false;
      } else {
         p var4 = (p)var3;
         if(this.x != null) {
            String var5 = var4.Q();
            if(!this.x.R(var5)) {
               return false;
            }
         }

         if(this.T != null) {
            _h.b var6 = this.o(var4);
            return z9.D((Object)var6, this.T);
         } else {
            return true;
         }
      }
   }

   private _h.b o(p var1) {
      return var1 instanceof x?_h.b.DROPPER:_h.b.DISPENSER;
   }

   private boolean a(j var1, net.yv.o8 var2) {
      net.ni.v var3 = var2.L(var1);
      if(!(var3 instanceof net.ni.e)) {
         return false;
      } else {
         net.ni.e var4 = (net.ni.e)var3;
         if(this.x != null) {
            String var5 = var4.Q();
            if(!this.x.R(var5)) {
               return false;
            }
         }

         if(this.P != null) {
            kw var6 = var4.N();
            return z9.D((Object)var6, this.P);
         } else {
            return true;
         }
      }
   }

   public boolean H(_h.e var1, l var2, net.yv.o8 var3) {
      if(!this.G(var1, var2.z(), var3)) {
         return false;
      } else {
         if(this.x != null) {
            String var4 = var2.Q();
            if(!this.x.R(var4)) {
               return false;
            }
         }

         switch(null.e[var1.ordinal()]) {
         case 11:
            return this.E(var2, var3);
         case 14:
            return this.e(var2, var3);
         default:
            return true;
         }
      }
   }

   private boolean e(l var1, net.yv.o8 var2) {
      if(!(var1 instanceof s)) {
         return false;
      } else {
         s var3 = (s)var1;
         f var4 = new f();
         var3.G(var4);
         Integer var5 = Integer.valueOf(var4.P("Profession"));
         Integer var6 = Integer.valueOf(var4.P("Career"));
         if(this.i == null) {
            return true;
         } else {
            boolean var7 = false;

            for(int var8 = 0; var8 < this.i.length; ++var8) {
               wi var9 = this.i[var8];
               if(var9.L(var5.intValue(), var6.intValue())) {
                  var7 = true;
                  break;
               }
            }

            return var7;
         }
      }
   }

   private boolean E(l var1, net.yv.o8 var2) {
      if(!(var1 instanceof net.yn.j)) {
         return false;
      } else {
         net.yn.j var3 = (net.yn.j)var1;
         if(this.T != null) {
            _h.b var4 = this.D(var3);
            if(!z9.D((Object)var4, this.T)) {
               return false;
            }
         }

         if(this.P != null && var3 instanceof net.yn.l) {
            net.yn.l var6 = (net.yn.l)var3;
            kw var5 = var6.T();
            return z9.D((Object)var5, this.P);
         } else {
            return true;
         }
      }
   }

   private _h.b D(net.yn.j var1) {
      return var1 instanceof c?_h.b.HORSE:(var1 instanceof o?_h.b.DONKEY:(var1 instanceof net.yn.h?_h.b.MULE:(var1 instanceof net.yn.l?_h.b.LLAMA:null)));
   }

   public _h.e d() {
      return this.L;
   }

   public net.yz.m_ W(net.yz.m_ var1) {
      net.yz.m_ var2 = (net.yz.m_)this.H.get(var1);
      return var1;
   }

   public String toString() {
      return "name: " + this.K + ", container: " + this.L + ", textures: " + this.H;
   }

   private static xn a(xn var0) {
      return var0;
   }

   private static enum b {
      HORSE,
      DONKEY,
      MULE,
      LLAMA,
      DISPENSER,
      DROPPER;
   }

   public static enum e {
      ANVIL,
      BEACON,
      BREWING_STAND,
      CHEST,
      CRAFTING,
      DISPENSER,
      ENCHANTMENT,
      FURNACE,
      HOPPER,
      HORSE,
      VILLAGER,
      SHULKER_BOX,
      CREATIVE,
      INVENTORY;
   }
}
