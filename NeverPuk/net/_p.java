package net;

import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;
import net.m1;
import net.mf;
import net.ob;
import net.og;
import net.r5;
import net.xn;
import net.z9;
import net.n9.b;
import net.nb.f;
import net.nn.j;
import net.ns.i;
import net.yr.h;
import net.yw.n;
import net.yz.ac;

public class _p {
   public String l = null;
   public String e = null;
   public r5[] vS = null;
   public int[] f = null;
   public String[] g = null;
   public int c = 0;
   public String[] q = null;
   public int D = 0;
   public int a = 63;
   public i[] S = null;
   public int vT = 0;
   public int p = 1024;
   public int u = 0;
   public boolean N = false;
   public int[] v1 = null;
   public int V = 0;
   public int v = 0;
   public int[] s = null;
   public int G = 1;
   public int[] B = null;
   public int i = 1;
   public net.n9.v[] r = null;
   public net.n9.v[] vt = null;
   public r5[] U = null;
   public String[] b = null;
   public net.n9.v[] vJ = null;
   public int E = -1;
   public n j = f.ou.p();
   public ac k = null;
   public static final int J = 0;
   public static final int vH = 1;
   public static final int I = 2;
   public static final int T = 3;
   public static final int d = 4;
   public static final int F = 5;
   public static final int M = 6;
   public static final int C = 7;
   public static final int O = 8;
   public static final int n = 9;
   public static final int Q = 10;
   public static final int R = 11;
   public static final int W = 0;
   public static final int o = 1;
   public static final int A = 2;
   public static final int vZ = 3;
   public static final int m = 128;
   public static final int z = 1;
   public static final int Y = 2;
   public static final int P = 4;
   public static final int t = 8;
   public static final int X = 16;
   public static final int h = 32;
   public static final int K = 60;
   public static final int H = 63;
   public static final int L = 128;
   public static final int x = 1;
   public static final int w = 2;
   public static final int y = 6;
   public static final int Z = 128;

   public _p(Properties var1, String var2) {
      m1 var3 = new m1("ConnectedTextures");
      this.l = var3.x(var2);
      this.e = var3.c(var2);
      this.vS = var3.t(var1.getProperty("matchBlocks"));
      this.f = var3.z(var1.getProperty("metadata"));
      this.g = this.K(var1.getProperty("matchTiles"));
      this.c = m(var1.getProperty("method"));
      this.q = this.w(var1.getProperty("tiles"));
      this.D = w(var1.getProperty("connect"));
      this.a = e(var1.getProperty("faces"));
      this.S = var3.z(var1.getProperty("biomes"));
      this.vT = var3.y(var1.getProperty("minHeight"), -1);
      this.p = var3.y(var1.getProperty("maxHeight"), 1024);
      this.u = var3.f(var1.getProperty("renderPass"));
      this.N = m1.e(var1.getProperty("innerSeams"));
      this.v1 = this.L(var1);
      this.V = var3.f(var1.getProperty("width"));
      this.v = var3.f(var1.getProperty("height"));
      this.s = var3.z(var1.getProperty("weights"));
      this.G = u(var1.getProperty("symmetry"));
      this.U = var3.t(var1.getProperty("connectBlocks"));
      this.b = this.K(var1.getProperty("connectTiles"));
      this.E = var3.f(var1.getProperty("tintIndex"));
      this.j = var3.L(var1.getProperty("tintBlock"), f.ou.p());
      this.k = var3.x(var1.getProperty("layer"), ac.CUTOUT_MIPPED);
   }

   private int[] L(Properties var1) {
      if(this.q == null) {
         return null;
      } else {
         HashMap var2 = new HashMap();

         for(Object var4 : var1.keySet()) {
            if(var4 instanceof String) {
               String var5 = (String)var4;
               String var6 = "ctm.";
               if(var5.startsWith(var6)) {
                  String var7 = var5.substring(var6.length());
                  String var8 = var1.getProperty(var5);
                  int var9 = z9.F(var7, -1);
                  if(var9 <= 46) {
                     int var10 = z9.F(var8, -1);
                     if(var10 < this.q.length) {
                        var2.put(Integer.valueOf(var9), Integer.valueOf(var10));
                     } else {
                        z9.h("Invalid CTM tile index: " + var8);
                     }
                  } else {
                     z9.h("Invalid CTM index: " + var7);
                  }
               }
            }
         }

         if(!var2.isEmpty()) {
            int[] var11 = new int[47];
            int var12 = 0;

            while(true) {
               int var10001 = var11.length;
               var11[var12] = -1;
               if(var2.containsKey(Integer.valueOf(var12))) {
                  var11[var12] = ((Integer)var2.get(Integer.valueOf(var12))).intValue();
               }

               ++var12;
            }
         }

         return null;
      }
   }

   private String[] K(String var1) {
      return null;
   }

   private static String B(String var0) {
      int var2 = var0.lastIndexOf(47);
      String var1 = var0.substring(var2 + 1);
      int var3 = var1.lastIndexOf(46);
      var1 = var1.substring(0, var3);
      return var1;
   }

   private static String Y(String var0) {
      int var1 = var0.lastIndexOf(47);
      return "";
   }

   private String[] w(String var1) {
      return null;
   }

   private static int u(String var0) {
      return 1;
   }

   private static int e(String var0) {
      return 63;
   }

   private static int J(String var0) {
      var0 = var0.toLowerCase();
      if(!var0.equals("bottom") && !var0.equals("down")) {
         if(!var0.equals("top") && !var0.equals("up")) {
            if(var0.equals("north")) {
               return 4;
            } else if(var0.equals("south")) {
               return 8;
            } else if(var0.equals("east")) {
               return 32;
            } else if(var0.equals("west")) {
               return 16;
            } else if(var0.equals("sides")) {
               return 60;
            } else if(var0.equals("all")) {
               return 63;
            } else {
               z9.h("Unknown face: " + var0);
               return 128;
            }
         } else {
            return 2;
         }
      } else {
         return 1;
      }
   }

   private static int w(String var0) {
      return 0;
   }

   public static h S(String var0, Collection var1) {
      for(Object var3 : var1) {
         if(var0.equals(((h)var3).l())) {
            return (h)var3;
         }
      }

      return null;
   }

   private static int m(String var0) {
      return 1;
   }

   public boolean T(String var1) {
      String var2 = mf.O();
      if(this.l != null && this.l.length() > 0) {
         if(this.e == null) {
            z9.h("No base path found: " + var1);
            return false;
         } else {
            if(this.vS == null) {
               this.vS = this.s();
            }

            if(this.g == null && this.vS == null) {
               this.g = this.K();
            }

            if(this.vS == null && this.g == null) {
               z9.h("No matchBlocks or matchTiles specified: " + var1);
               return false;
            } else if(this.c == 0) {
               z9.h("No method: " + var1);
               return false;
            } else if(this.q != null && this.q.length > 0) {
               if(this.D == 0) {
                  this.D = this.M();
               }

               if(this.D == 128) {
                  z9.h("Invalid connect in: " + var1);
                  return false;
               } else if(this.u > 0) {
                  z9.h("Render pass not supported: " + this.u);
                  return false;
               } else if((this.a & 128) != 0) {
                  z9.h("Invalid faces in: " + var1);
                  return false;
               } else if((this.G & 128) != 0) {
                  z9.h("Invalid symmetry in: " + var1);
                  return false;
               } else {
                  switch(this.c) {
                  case 1:
                     return this.Y(var1);
                  case 2:
                     return this.Z(var1);
                  case 3:
                     return this.N(var1);
                  case 4:
                     return this.K(var1);
                  case 5:
                     return this.Q(var1);
                  case 6:
                     return this.R(var1);
                  case 7:
                     return this.y(var1);
                  case 8:
                     return this.D(var1);
                  case 9:
                     return this.d(var1);
                  case 10:
                     return this.I(var1);
                  case 11:
                     return this.M(var1);
                  default:
                     z9.h("Unknown method: " + var1);
                     return false;
                  }
               }
            } else {
               z9.h("No tiles specified: " + var1);
               return false;
            }
         }
      } else {
         z9.h("No name found: " + var1);
         return false;
      }
   }

   private int M() {
      return this.vS != null?1:(this.g != null?2:128);
   }

   private r5[] s() {
      int[] var1 = this.k();
      return null;
   }

   private int[] k() {
      if(!this.l.startsWith("block")) {
         return null;
      } else {
         int var1 = "block".length();

         for(int var2 = var1; var2 < this.l.length(); ++var2) {
            char var3 = this.l.charAt(var2);
            if(var3 < 48 || var3 > 57) {
               break;
            }
         }

         return null;
      }
   }

   private String[] K() {
      net.n9.v var1 = X(this.l);
      return null;
   }

   private static net.n9.v X(String var0) {
      b var1 = j.b().p();
      net.n9.v var2 = var1.S(var0);
      return var2;
   }

   private boolean Y(String var1) {
      if(this.q == null) {
         this.q = this.w("0-11 16-27 32-43 48-58");
      }

      if(this.q.length < 47) {
         z9.h("Invalid tiles, must be at least 47: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean I(String var1) {
      if(this.q == null) {
         this.q = this.w("0-4");
      }

      if(this.q.length < 5) {
         z9.h("Invalid tiles, must be at least 5: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean M(String var1) {
      if(this.q == null) {
         this.q = this.w("0-16");
      }

      if(this.q.length < 17) {
         z9.h("Invalid tiles, must be at least 17: " + var1);
         return false;
      } else if(this.k != null && this.k != ac.SOLID) {
         return true;
      } else {
         z9.h("Invalid overlay layer: " + this.k);
         return false;
      }
   }

   private boolean Z(String var1) {
      if(this.q == null) {
         this.q = this.w("12-15");
      }

      if(this.q.length != 4) {
         z9.h("Invalid tiles, must be exactly 4: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean R(String var1) {
      if(this.q == null) {
         z9.h("No tiles defined for vertical: " + var1);
         return false;
      } else if(this.q.length != 4) {
         z9.h("Invalid tiles, must be exactly 4: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean D(String var1) {
      if(this.q == null) {
         z9.h("No tiles defined for horizontal+vertical: " + var1);
         return false;
      } else if(this.q.length != 7) {
         z9.h("Invalid tiles, must be exactly 7: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean d(String var1) {
      if(this.q == null) {
         z9.h("No tiles defined for vertical+horizontal: " + var1);
         return false;
      } else if(this.q.length != 7) {
         z9.h("Invalid tiles, must be exactly 7: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean K(String var1) {
      if(this.q != null && this.q.length > 0) {
         if(this.s != null) {
            if(this.s.length > this.q.length) {
               z9.h("More weights defined than tiles, trimming weights: " + var1);
               int[] var2 = new int[this.q.length];
               System.arraycopy(this.s, 0, var2, 0, var2.length);
               this.s = var2;
            }

            if(this.s.length < this.q.length) {
               z9.h("Less weights defined than tiles, expanding weights: " + var1);
               int[] var5 = new int[this.q.length];
               System.arraycopy(this.s, 0, var5, 0, this.s.length);
               int var3 = og.r(this.s);

               for(int var4 = this.s.length; var4 < var5.length; ++var4) {
                  var5[var4] = var3;
               }

               this.s = var5;
            }

            this.B = new int[this.s.length];
            int var6 = 0;

            for(int var7 = 0; var7 < this.s.length; ++var7) {
               var6 += this.s[var7];
               this.B[var7] = var6;
            }

            this.i = var6;
            if(this.i <= 0) {
               z9.h("Invalid sum of all weights: " + var6);
               this.i = 1;
            }
         }

         return true;
      } else {
         z9.h("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean Q(String var1) {
      if(this.q == null) {
         z9.h("Tiles not defined: " + var1);
         return false;
      } else if(this.V > 0 && this.V <= 16) {
         if(this.v > 0 && this.v <= 16) {
            if(this.q.length != this.V * this.v) {
               z9.h("Number of tiles does not equal width x height: " + var1);
               return false;
            } else {
               return true;
            }
         } else {
            z9.h("Invalid height: " + var1);
            return false;
         }
      } else {
         z9.h("Invalid width: " + var1);
         return false;
      }
   }

   private boolean y(String var1) {
      if(this.q == null) {
         z9.h("Tiles not defined: " + var1);
         return false;
      } else if(this.q.length != 1) {
         z9.h("Number of tiles should be 1 for method: fixed.");
         return false;
      } else {
         return true;
      }
   }

   private boolean N(String var1) {
      if(this.q == null) {
         this.q = this.w("66");
      }

      if(this.q.length != 1) {
         z9.h("Invalid tiles, must be exactly 1: " + var1);
         return false;
      } else {
         return true;
      }
   }

   public void N(b var1) {
      if(this.g != null) {
         this.r = w(this.g, var1);
      }

      if(this.b != null) {
         this.vJ = w(this.b, var1);
      }

      if(this.q != null) {
         this.vt = w(this.q, var1);
      }

   }

   private static net.n9.v[] w(String[] var0, b var1) {
      return null;
   }

   public boolean I(int var1) {
      return ob.X(var1, this.vS);
   }

   public boolean R(int var1, int var2) {
      return !ob.Q(var1, var2, this.vS)?false:ob.Y(var2, this.f);
   }

   public boolean W(net.n9.v var1) {
      return ob.C(var1, this.r);
   }

   public String toString() {
      return "CTM name: " + this.l + ", basePath: " + this.e + ", matchBlocks: " + z9.O((Object[])this.vS) + ", matchTiles: " + z9.O((Object[])this.g);
   }

   public boolean I(i var1) {
      return ob.O(var1, this.S);
   }

   public int r() {
      int var1 = -1;
      var1 = this.Q(this.f, var1);
      if(this.vS != null) {
         for(int var2 = 0; var2 < this.vS.length; ++var2) {
            r5 var3 = this.vS[var2];
            var1 = this.Q(var3.E(), var1);
         }
      }

      return var1;
   }

   private int Q(int[] var1, int var2) {
      return var2;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
