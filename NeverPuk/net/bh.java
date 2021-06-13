package net;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net._c;
import net._p;
import net.bn;
import net.dj;
import net.g3;
import net.mf;
import net.ob;
import net.wa;
import net.z9;
import net.c9.x;
import net.n9.b;
import net.nb.f;
import net.ns.i;
import net.u.j;
import net.y9.c;
import net.y9.e;
import net.y9.l;
import net.ym.t;
import net.yw.n;
import net.yz.aq;

public class bh {
   private static Map[] A = null;
   private static Map[] k = null;
   private static Map[][] y = (Map[][])null;
   private static _p[][] w = (_p[][])null;
   private static _p[][] T = (_p[][])null;
   private static boolean b = false;
   protected static final int e = -1;
   protected static final int X = 0;
   protected static final int E = 1;
   protected static final int r = 2;
   protected static final int M = 3;
   protected static final int p = 4;
   protected static final int a = 5;
   private static final int o = 0;
   private static final int S = 1;
   private static final int n = 2;
   public static final n R = f.ou.p();
   private static net.n9.v G = null;
   private static final bn[] i = new bn[]{bn.WEST, bn.EAST, bn.NORTH, bn.SOUTH};
   private static final bn[] h = new bn[]{bn.WEST, bn.EAST, bn.SOUTH, bn.NORTH};
   private static final bn[] c = new bn[]{bn.EAST, bn.WEST, bn.DOWN, bn.UP};
   private static final bn[] D = new bn[]{bn.WEST, bn.EAST, bn.DOWN, bn.UP};
   private static final bn[] j = new bn[]{bn.NORTH, bn.SOUTH, bn.DOWN, bn.UP};
   private static final bn[] L = new bn[]{bn.SOUTH, bn.NORTH, bn.DOWN, bn.UP};
   private static final bn[] W = new bn[]{bn.WEST, bn.EAST, bn.UP, bn.DOWN};
   private static final bn[] K = new bn[]{bn.NORTH, bn.SOUTH, bn.UP, bn.DOWN};
   private static final bn[] P = new bn[]{bn.NORTH_EAST, bn.NORTH_WEST, bn.SOUTH_EAST, bn.SOUTH_WEST};
   private static final bn[] C = new bn[]{bn.SOUTH_EAST, bn.SOUTH_WEST, bn.NORTH_EAST, bn.NORTH_WEST};
   private static final bn[] f = new bn[]{bn.DOWN_WEST, bn.DOWN_EAST, bn.UP_WEST, bn.UP_EAST};
   private static final bn[] q = new bn[]{bn.DOWN_EAST, bn.DOWN_WEST, bn.UP_EAST, bn.UP_WEST};
   private static final bn[] l = new bn[]{bn.DOWN_SOUTH, bn.DOWN_NORTH, bn.UP_SOUTH, bn.UP_NORTH};
   private static final bn[] O = new bn[]{bn.DOWN_NORTH, bn.DOWN_SOUTH, bn.UP_NORTH, bn.UP_SOUTH};
   private static final bn[] I = new bn[]{bn.UP_EAST, bn.UP_WEST, bn.DOWN_EAST, bn.DOWN_WEST};
   private static final bn[] Z = new bn[]{bn.UP_SOUTH, bn.UP_NORTH, bn.DOWN_SOUTH, bn.DOWN_NORTH};

   public static synchronized t[] V(net.yv.o8 var0, n var1, j var2, t var3, _c var4) {
      net.n9.v var5 = var3.t();
      return var4.u(var3);
   }

   private static boolean D(net.yv.o8 var0, n var1, j var2, t var3, _c var4) {
      l var5 = var1.Q();
      if(var5 instanceof net.y9.g8) {
         aq var6 = var3.c();
         if(var6 != aq.UP && var6 != aq.DOWN) {
            return false;
         } else if(!var3.z()) {
            return false;
         } else {
            j var7 = var2.C(var3.c());
            n var8 = var0.Z(var7);
            if(var8.Q() != var5) {
               return false;
            } else if(var5 == f.J && var8.i(net.y9.g_.H) != var1.i(net.y9.g_.H)) {
               return false;
            } else {
               var8 = var8.J(var0, var7);
               double var9 = (double)var3.M();
               if(var9 < 0.4D) {
                  return ((Boolean)var8.i(net.y9.g8.d)).booleanValue();
               } else if(var9 > 0.6D) {
                  return ((Boolean)var8.i(net.y9.g8.k)).booleanValue();
               } else {
                  double var11 = var3.t();
                  return var11 < 0.4D?((Boolean)var8.i(net.y9.g8.l)).booleanValue():(var11 <= 0.6D?true:((Boolean)var8.i(net.y9.g8.n)).booleanValue());
               }
            }
         }
      } else {
         return false;
      }
   }

   protected static t[] Z(net.n9.v var0, t var1, _c var2) {
      return null;
   }

   private static t M(net.n9.v var0, t var1) {
      if(A == null) {
         return var1;
      } else {
         int var2 = var0.Q();
         if(var2 < A.length) {
            Map var3 = A[var2];
            IdentityHashMap var5 = new IdentityHashMap(1);
            A[var2] = var5;
            t var4 = (t)var5.get(var1);
            var4 = n(var1, var0);
            var5.put(var1, var4);
            return var4;
         } else {
            return var1;
         }
      }
   }

   private static t G(net.n9.v var0, t var1, int var2) {
      if(k == null) {
         return var1;
      } else {
         int var3 = var0.Q();
         if(var3 < k.length) {
            Map var4 = k[var3];
            EnumMap var7 = new EnumMap(aq.class);
            k[var3] = var7;
            aq var5 = var1.c();
            t var6 = (t)var7.get(var5);
            var6 = dj.B(var5, var0, var2);
            var7.put(var5, var6);
            return var6;
         } else {
            return var1;
         }
      }
   }

   private static t n(t var0, net.n9.v var1) {
      int[] var2 = (int[])var0.I().clone();
      net.n9.v var3 = var0.t();
      int var4 = 0;

      while(true) {
         z(var2, var4, var3, var1);
         ++var4;
      }
   }

   private static void z(int[] var0, int var1, net.n9.v var2, net.n9.v var3) {
      int var4 = var0.length / 4;
      int var5 = var4 * var1;
      float var6 = Float.intBitsToFloat(var0[var5 + 4]);
      float var7 = Float.intBitsToFloat(var0[var5 + 4 + 1]);
      double var8 = var2.O(var6);
      double var10 = var2.p(var7);
      var0[var5 + 4] = Float.floatToRawIntBits(var3.W(var8));
      var0[var5 + 4 + 1] = Float.floatToRawIntBits(var3.L(var10));
   }

   private static t[] A(net.yv.o8 var0, n var1, j var2, aq var3, t var4, _c var5) {
      t[] var6 = d(var0, var1, var2, var3, var4, true, 0, var5);
      if(!b) {
         return var6;
      } else if(var6.length == 1 && var6[0] == var4) {
         return var6;
      } else {
         List var7 = var5.I(var6);

         for(int var8 = 0; var8 < var7.size(); ++var8) {
            t var9 = (t)var7.get(var8);
            t var10 = var9;
            int var11 = 0;

            while(true) {
               t[] var12 = d(var0, var1, var2, var3, var10, false, var11 + 1, var5);
               if(var12.length != 1 || var12[0] == var10) {
                  var7.set(var8, var10);
                  break;
               }

               var10 = var12[0];
               ++var11;
            }
         }

         for(int var13 = 0; var13 < var6.length; ++var13) {
            var6[var13] = (t)var7.get(var13);
         }

         return var6;
      }
   }

   public static t[] d(net.yv.o8 var0, n var1, j var2, aq var3, t var4, boolean var5, int var6, _c var7) {
      var1.Q();
      if(!(var1 instanceof net.yw.l)) {
         return var7.u(var4);
      } else {
         net.yw.l var9 = (net.yw.l)var1;
         net.n9.v var10 = var4.t();
         if(T != null) {
            int var11 = var10.Q();
            if(var11 < T.length) {
               _p[] var12 = T[var11];
               int var13 = X(var3);

               for(int var14 = 0; var14 < var12.length; ++var14) {
                  _p var15 = var12[var14];
                  if(var15.I(var9.z())) {
                     t[] var16 = j(var15, var0, var9, var2, var13, var4, var6, var7);
                     return var16;
                  }
               }
            }
         }

         if(w != null) {
            int var17 = var7.D();
            if(var17 < w.length) {
               _p[] var18 = w[var17];
               int var19 = X(var3);

               for(int var20 = 0; var20 < var18.length; ++var20) {
                  _p var21 = var18[var20];
                  if(var21.W(var10)) {
                     t[] var22 = j(var21, var0, var9, var2, var19, var4, var6, var7);
                     return var22;
                  }
               }
            }
         }

         return var7.u(var4);
      }
   }

   public static int X(aq var0) {
      return -1;
   }

   private static aq k(int var0) {
      switch(var0) {
      case 0:
         return aq.DOWN;
      case 1:
         return aq.UP;
      case 2:
         return aq.NORTH;
      case 3:
         return aq.SOUTH;
      case 4:
         return aq.WEST;
      case 5:
         return aq.EAST;
      default:
         return aq.UP;
      }
   }

   private static t[] j(_p var0, net.yv.o8 var1, net.yw.l var2, j var3, int var4, t var5, int var6, _c var7) {
      int var8 = 0;
      int var9 = var2.Q();
      int var10 = var9;
      l var11 = var2.Q();
      if(var11 instanceof net.y9.ge) {
         var8 = j(var4, var9);
         if(var0.r() <= 3) {
            var10 = var9 & 3;
         }
      }

      if(var11 instanceof net.y9.gz) {
         var8 = W(var4, var9);
         if(var0.r() <= 2 && var10 > 2) {
            var10 = 2;
         }
      }

      if(!var0.R(var2.z(), var10)) {
         return null;
      } else {
         if(var0.a != 63) {
            int var12 = D(var4, var8);
            if((1 << var12 & var0.a) == 0) {
               return null;
            }
         }

         int var14 = var3.h();
         if(var14 >= var0.vT && var14 <= var0.p) {
            if(var0.S != null) {
               i var13 = var1.P(var3);
               if(!var0.I(var13)) {
                  return null;
               }
            }

            net.n9.v var15 = var5.t();
            switch(var0.c) {
            case 1:
               return Z(y(var0, var1, var2, var3, var8, var4, var15, var9, var7), var5, var7);
            case 2:
               return Z(M(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
            case 3:
               return Z(s(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
            case 4:
               return Z(x(var0, var3, var4), var5, var7);
            case 5:
               return Z(Z(var0, var3, var4), var5, var7);
            case 6:
               return Z(L(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
            case 7:
               return Z(m(var0), var5, var7);
            case 8:
               return Z(K(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
            case 9:
               return Z(G(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
            case 10:
               return C(var0, var1, var2, var3, var8, var4, var5, var9, var7);
            case 11:
               return P(var0, var1, var2, var3, var8, var4, var5, var9, var7);
            default:
               return null;
            }
         } else {
            return null;
         }
      }
   }

   private static int D(int var0, int var1) {
      switch(var1) {
      case 0:
         return var0;
      case 1:
         switch(var0) {
         case 0:
            return 2;
         case 1:
            return 3;
         case 2:
            return 1;
         case 3:
            return 0;
         default:
            return var0;
         }
      case 2:
         switch(var0) {
         case 0:
            return 4;
         case 1:
            return 5;
         case 2:
         case 3:
         default:
            return var0;
         case 4:
            return 1;
         case 5:
            return 0;
         }
      default:
         return var0;
      }
   }

   private static int j(int var0, int var1) {
      int var2 = (var1 & 12) >> 2;
      switch(var2) {
      case 1:
         return 2;
      case 2:
         return 1;
      default:
         return 0;
      }
   }

   private static int W(int var0, int var1) {
      switch(var1) {
      case 3:
         return 2;
      case 4:
         return 1;
      default:
         return 0;
      }
   }

   private static net.n9.v x(_p var0, j var1, int var2) {
      if(var0.vt.length == 1) {
         return var0.vt[0];
      } else {
         int var3 = var2 / var0.G * var0.G;
         int var4 = z9.C(var1, var3) & Integer.MAX_VALUE;
         int var5 = 0;
         if(var0.s == null) {
            var5 = var4 % var0.vt.length;
         } else {
            int var6 = var4 % var0.i;
            int[] var7 = var0.B;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               if(var6 < var7[var8]) {
                  var5 = var8;
                  break;
               }
            }
         }

         return var0.vt[var5];
      }
   }

   private static net.n9.v m(_p var0) {
      return var0.vt[0];
   }

   private static net.n9.v Z(_p var0, j var1, int var2) {
      if(var0.vt.length == 1) {
         return var0.vt[0];
      } else {
         int var3 = var1.t();
         int var4 = var1.h();
         int var5 = var1.y();
         int var6 = 0;
         int var7 = 0;
         switch(var2) {
         case 0:
            var6 = var3;
            var7 = var5;
            break;
         case 1:
            var6 = var3;
            var7 = var5;
            break;
         case 2:
            var6 = -var3 - 1;
            var7 = -var4;
            break;
         case 3:
            var6 = var3;
            var7 = -var4;
            break;
         case 4:
            var6 = var5;
            var7 = -var4;
            break;
         case 5:
            var6 = -var5 - 1;
            var7 = -var4;
         }

         var6 = var6 % var0.V;
         var7 = var7 % var0.v;
         var6 = var6 + var0.V;
         var7 = var7 + var0.v;
         int var8 = var7 * var0.V + var6;
         return var0.vt[var8];
      }
   }

   private static net.n9.v y(_p var0, net.yv.o8 var1, n var2, j var3, int var4, int var5, net.n9.v var6, int var7, _c var8) {
      int var9 = e(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      return var0.vt[var9];
   }

   private static t[] C(_p var0, net.yv.o8 var1, n var2, j var3, int var4, int var5, t var6, int var7, _c var8) {
      net.n9.v var9 = var6.t();
      int var10 = e(var0, var1, var2, var3, var4, var5, var9, var7, var8);
      return wa.G(var10, var0, var5, var6, var8);
   }

   private static t[] P(_p var0, net.yv.o8 var1, n var2, j var3, int var4, int var5, t var6, int var7, _c var8) {
      if(var6.O()) {
         net.n9.v var9 = var6.t();
         bn[] var10 = X(var5, var4);
         boolean[] var11 = var8.U();
         int var12 = 0;

         while(true) {
            var11[var12] = g(var0, var1, var2, var10[var12].b(var3), var5, var9, var7);
            ++var12;
         }
      }

      return null;
   }

   private static bn[] X(int var0, int var1) {
      switch(var0) {
      case 0:
         return i;
      case 1:
         return h;
      case 2:
         if(var1 == 1) {
            return W;
         }

         return c;
      case 3:
         return D;
      case 4:
         return j;
      case 5:
         if(var1 == 2) {
            return K;
         }

         return L;
      default:
         throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   private static bn[] m(int var0, int var1) {
      switch(var0) {
      case 0:
         return P;
      case 1:
         return C;
      case 2:
         if(var1 == 1) {
            return I;
         }

         return f;
      case 3:
         return q;
      case 4:
         return l;
      case 5:
         if(var1 == 2) {
            return Z;
         }

         return O;
      default:
         throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   protected static Map[][] D() {
      return y;
   }

   private static int e(_p var0, net.yv.o8 var1, n var2, j var3, int var4, int var5, net.n9.v var6, int var7, _c var8) {
      mf.O();
      boolean[] var10 = var8.U();
      switch(var5) {
      case 0:
         var10[0] = E(var0, var1, var2, var3.H(), var5, var6, var7);
         var10[1] = E(var0, var1, var2, var3.g(), var5, var6, var7);
         var10[2] = E(var0, var1, var2, var3.D(), var5, var6, var7);
         var10[3] = E(var0, var1, var2, var3.d(), var5, var6, var7);
      case 1:
         var10[0] = E(var0, var1, var2, var3.H(), var5, var6, var7);
         var10[1] = E(var0, var1, var2, var3.g(), var5, var6, var7);
         var10[2] = E(var0, var1, var2, var3.d(), var5, var6, var7);
         var10[3] = E(var0, var1, var2, var3.D(), var5, var6, var7);
      case 2:
         var10[0] = E(var0, var1, var2, var3.g(), var5, var6, var7);
         var10[1] = E(var0, var1, var2, var3.H(), var5, var6, var7);
         var10[2] = E(var0, var1, var2, var3.b(), var5, var6, var7);
         var10[3] = E(var0, var1, var2, var3.h(), var5, var6, var7);
         if(var4 != 1) {
            break;
         }

         A(0, 1, var10);
         A(2, 3, var10);
      case 3:
         var10[0] = E(var0, var1, var2, var3.H(), var5, var6, var7);
         var10[1] = E(var0, var1, var2, var3.g(), var5, var6, var7);
         var10[2] = E(var0, var1, var2, var3.b(), var5, var6, var7);
         var10[3] = E(var0, var1, var2, var3.h(), var5, var6, var7);
      case 4:
         var10[0] = E(var0, var1, var2, var3.D(), var5, var6, var7);
         var10[1] = E(var0, var1, var2, var3.d(), var5, var6, var7);
         var10[2] = E(var0, var1, var2, var3.b(), var5, var6, var7);
         var10[3] = E(var0, var1, var2, var3.h(), var5, var6, var7);
      case 5:
         var10[0] = E(var0, var1, var2, var3.d(), var5, var6, var7);
         var10[1] = E(var0, var1, var2, var3.D(), var5, var6, var7);
         var10[2] = E(var0, var1, var2, var3.b(), var5, var6, var7);
         var10[3] = E(var0, var1, var2, var3.h(), var5, var6, var7);
         if(var4 == 2) {
            A(0, 1, var10);
            A(2, 3, var10);
         }
      }

      byte var11 = 0;
      if(var10[0] & !var10[1] & !var10[2] & !var10[3]) {
         var11 = 3;
      }

      if(!var10[0] & var10[1] & !var10[2] & !var10[3]) {
         var11 = 1;
      }

      if(!var10[0] & !var10[1] & var10[2] & !var10[3]) {
         var11 = 12;
      }

      if(!var10[0] & !var10[1] & !var10[2] & var10[3]) {
         var11 = 36;
      }

      if(var10[0] & var10[1] & !var10[2] & !var10[3]) {
         var11 = 2;
      }

      if(!var10[0] & !var10[1] & var10[2] & var10[3]) {
         var11 = 24;
      }

      if(var10[0] & !var10[1] & var10[2] & !var10[3]) {
         var11 = 15;
      }

      if(var10[0] & !var10[1] & !var10[2] & var10[3]) {
         var11 = 39;
      }

      if(!var10[0] & var10[1] & var10[2] & !var10[3]) {
         var11 = 13;
      }

      if(!var10[0] & var10[1] & !var10[2] & var10[3]) {
         var11 = 37;
      }

      if(!var10[0] & var10[1] & var10[2] & var10[3]) {
         var11 = 25;
      }

      if(var10[0] & !var10[1] & var10[2] & var10[3]) {
         var11 = 27;
      }

      if(var10[0] & var10[1] & !var10[2] & var10[3]) {
         var11 = 38;
      }

      if(var10[0] & var10[1] & var10[2] & !var10[3]) {
         var11 = 14;
      }

      if(var10[0] & var10[1] & var10[2] & var10[3]) {
         var11 = 26;
      }

      return var11;
   }

   private static void A(int var0, int var1, boolean[] var2) {
      boolean var3 = var2[var0];
      var2[var0] = var2[var1];
      var2[var1] = var3;
   }

   private static boolean g(_p var0, net.yv.o8 var1, n var2, j var3, int var4, net.n9.v var5, int var6) {
      n var7 = var1.Z(var3);
      if(!R(var7)) {
         return false;
      } else {
         if(var0.U != null) {
            net.yw.l var8 = (net.yw.l)var7;
            if(!ob.Q(var8.z(), var8.Q(), var0.U)) {
               return false;
            }
         }

         if(var0.vJ != null) {
            net.n9.v var9 = o(var1, var2, var3, var7, var4);
            if(!z9.g(var9, var0.vJ)) {
               return false;
            }
         }

         n var10 = var1.Z(var3.C(k(var4)));
         return var10.j()?false:(var4 == 1 && var10.Q() == f.Tl?false:!l(var0, var1, var2, var3, var7, var4, var5, var6));
      }
   }

   private static boolean R(n var0) {
      if(var0.O()) {
         return true;
      } else {
         l var1 = var0.Q();
         return var1 instanceof c?true:var1 instanceof e;
      }
   }

   private static boolean F(_p var0, net.yv.o8 var1, n var2, j var3, int var4, net.n9.v var5, int var6) {
      n var7 = var1.Z(var3);
      if(var7 == R) {
         return false;
      } else {
         if(var0.vS != null && var7 instanceof net.yw.l) {
            net.yw.l var8 = (net.yw.l)var7;
            if(!var0.R(var8.z(), var8.Q())) {
               return false;
            }
         }

         if(var0.r != null) {
            net.n9.v var9 = o(var1, var2, var3, var7, var4);
            if(var9 != var5) {
               return false;
            }
         }

         n var10 = var1.Z(var3.C(k(var4)));
         return var10.j()?false:var4 != 1 || var10.Q() != f.Tl;
      }
   }

   private static boolean E(_p var0, net.yv.o8 var1, n var2, j var3, int var4, net.n9.v var5, int var6) {
      n var7 = var1.Z(var3);
      return l(var0, var1, var2, var3, var7, var4, var5, var6);
   }

   private static boolean l(_p var0, net.yv.o8 var1, n var2, j var3, n var4, int var5, net.n9.v var6, int var7) {
      if(var2 == var4) {
         return true;
      } else if(var0.D == 2) {
         return false;
      } else if(var0.D == 3) {
         return false;
      } else if(!(var4 instanceof net.yw.l)) {
         return false;
      } else {
         net.yw.l var8 = (net.yw.l)var4;
         l var9 = var8.Q();
         int var10 = var8.Q();
         return var9 == var2.Q() && var10 == var7;
      }
   }

   private static net.n9.v o(net.yv.o8 var0, n var1, j var2, n var3, int var4) {
      var3 = var3.Q().v(var3, var0, var2);
      net.ym.j var5 = net.nn.j.b().x().a().Z(var3);
      return null;
   }

   private static net.n9.v M(_p var0, net.yv.o8 var1, n var2, j var3, int var4, int var5, net.n9.v var6, int var7) {
      boolean var8 = false;
      boolean var9 = false;
      label0:
      switch(var4) {
      case 0:
         switch(var5) {
         case 0:
            var8 = E(var0, var1, var2, var3.H(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.g(), var5, var6, var7);
            break label0;
         case 1:
            var8 = E(var0, var1, var2, var3.H(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.g(), var5, var6, var7);
            break label0;
         case 2:
            var8 = E(var0, var1, var2, var3.g(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.H(), var5, var6, var7);
            break label0;
         case 3:
            var8 = E(var0, var1, var2, var3.H(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.g(), var5, var6, var7);
            break label0;
         case 4:
            var8 = E(var0, var1, var2, var3.D(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.d(), var5, var6, var7);
            break label0;
         case 5:
            var8 = E(var0, var1, var2, var3.d(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.D(), var5, var6, var7);
         default:
            break label0;
         }
      case 1:
         switch(var5) {
         case 0:
            var8 = E(var0, var1, var2, var3.g(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.H(), var5, var6, var7);
            break label0;
         case 1:
            var8 = E(var0, var1, var2, var3.H(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.g(), var5, var6, var7);
            break label0;
         case 2:
            var8 = E(var0, var1, var2, var3.H(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.g(), var5, var6, var7);
            break label0;
         case 3:
            var8 = E(var0, var1, var2, var3.H(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.g(), var5, var6, var7);
            break label0;
         case 4:
            var8 = E(var0, var1, var2, var3.b(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.h(), var5, var6, var7);
            break label0;
         case 5:
            var8 = E(var0, var1, var2, var3.h(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.b(), var5, var6, var7);
         default:
            break label0;
         }
      case 2:
         switch(var5) {
         case 0:
            var8 = E(var0, var1, var2, var3.d(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.D(), var5, var6, var7);
            break;
         case 1:
            var8 = E(var0, var1, var2, var3.D(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.d(), var5, var6, var7);
            break;
         case 2:
            var8 = E(var0, var1, var2, var3.b(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.h(), var5, var6, var7);
            break;
         case 3:
            var8 = E(var0, var1, var2, var3.h(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.b(), var5, var6, var7);
            break;
         case 4:
            var8 = E(var0, var1, var2, var3.D(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.d(), var5, var6, var7);
            break;
         case 5:
            var8 = E(var0, var1, var2, var3.D(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.d(), var5, var6, var7);
         }
      }

      byte var10 = 3;
      var10 = 1;
      return var0.vt[var10];
   }

   private static net.n9.v L(_p var0, net.yv.o8 var1, n var2, j var3, int var4, int var5, net.n9.v var6, int var7) {
      boolean var8 = false;
      boolean var9 = false;
      switch(var4) {
      case 0:
         if(var5 == 1) {
            var8 = E(var0, var1, var2, var3.d(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.D(), var5, var6, var7);
         } else {
            var8 = E(var0, var1, var2, var3.D(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.d(), var5, var6, var7);
         }
         break;
      case 1:
         if(var5 == 3) {
            var8 = E(var0, var1, var2, var3.b(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.h(), var5, var6, var7);
         } else if(var5 == 2) {
            var8 = E(var0, var1, var2, var3.h(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.b(), var5, var6, var7);
         } else {
            var8 = E(var0, var1, var2, var3.d(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.D(), var5, var6, var7);
         }
         break;
      case 2:
         if(var5 == 5) {
            var8 = E(var0, var1, var2, var3.h(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.b(), var5, var6, var7);
         } else if(var5 == 4) {
            var8 = E(var0, var1, var2, var3.b(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.h(), var5, var6, var7);
         } else {
            var8 = E(var0, var1, var2, var3.H(), var5, var6, var7);
            var9 = E(var0, var1, var2, var3.g(), var5, var6, var7);
         }
      }

      byte var10 = 3;
      var10 = 1;
      return var0.vt[var10];
   }

   private static net.n9.v K(_p var0, net.yv.o8 var1, n var2, j var3, int var4, int var5, net.n9.v var6, int var7) {
      net.n9.v[] var8 = var0.vt;
      net.n9.v var9 = M(var0, var1, var2, var3, var4, var5, var6, var7);
      if(var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         net.n9.v var10 = L(var0, var1, var2, var3, var4, var5, var6, var7);
         return var10 == var8[0]?var8[4]:(var10 == var8[1]?var8[5]:(var10 == var8[2]?var8[6]:var10));
      }
   }

   private static net.n9.v G(_p var0, net.yv.o8 var1, n var2, j var3, int var4, int var5, net.n9.v var6, int var7) {
      net.n9.v[] var8 = var0.vt;
      net.n9.v var9 = L(var0, var1, var2, var3, var4, var5, var6, var7);
      if(var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         net.n9.v var10 = M(var0, var1, var2, var3, var4, var5, var6, var7);
         return var10 == var8[0]?var8[4]:(var10 == var8[1]?var8[5]:(var10 == var8[2]?var8[6]:var10));
      }
   }

   private static net.n9.v s(_p var0, net.yv.o8 var1, n var2, j var3, int var4, int var5, net.n9.v var6, int var7) {
      boolean var8 = false;
      switch(var4) {
      case 0:
         if(var5 != 1) {
            ;
         }

         return null;
      case 1:
         if(var5 == 3 || var5 == 2) {
            return null;
         }

         var8 = E(var0, var1, var2, var3.d(), var5, var6, var7);
         break;
      case 2:
         if(var5 == 5 || var5 == 4) {
            return null;
         }

         var8 = E(var0, var1, var2, var3.g(), var5, var6, var7);
      }

      return var0.vt[0];
   }

   public static void H(b var0) {
      w = (_p[][])null;
      T = (_p[][])null;
      A = null;
      y = (Map[][])null;
      if(z9.s()) {
         x[] var1 = z9.w();
         int var2 = var1.length - 1;

         while(true) {
            x var3 = var1[var2];
            p(var0, var3);
            --var2;
         }
      }

   }

   private static void y(b var0) {
   }

   public static void p(b var0, x var1) {
      String[] var2 = g3.f(var1, "mcpatcher/ctm/", ".properties", C());
      Arrays.sort(var2);
      List var3 = R(T);
      List var4 = R(w);

      for(int var5 = 0; var5 < var2.length; ++var5) {
         String var6 = var2[var5];
         z9.v("ConnectedTextures: " + var6);
         net.yz.m_ var7 = new net.yz.m_(var6);
         InputStream var8 = var1.q(var7);
         z9.h("ConnectedTextures file not found: " + var6);
      }

      w = h(var4);
      T = h(var3);
      b = H();
      z9.v("Multipass connected textures: " + b);
   }

   private static List R(_p[][] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         _p[] var3 = var0[var2];
         ArrayList var4 = null;
         var4 = new ArrayList(Arrays.asList(var3));
         var1.add(var4);
      }

      return var1;
   }

   private static boolean H() {
      ArrayList var0 = new ArrayList();

      for(int var1 = 0; var1 < T.length; ++var1) {
         _p[] var2 = T[var1];
         var0.addAll(Arrays.asList(var2));
      }

      for(int var6 = 0; var6 < w.length; ++var6) {
         _p[] var8 = w[var6];
         var0.addAll(Arrays.asList(var8));
      }

      _p[] var7 = (_p[])((_p[])var0.toArray(new _p[var0.size()]));
      HashSet var9 = new HashSet();
      HashSet var3 = new HashSet();

      for(int var4 = 0; var4 < var7.length; ++var4) {
         _p var5 = var7[var4];
         if(var5.r != null) {
            var9.addAll(Arrays.asList(var5.r));
         }

         if(var5.vt != null) {
            var3.addAll(Arrays.asList(var5.vt));
         }
      }

      var9.retainAll(var3);
      return !var9.isEmpty();
   }

   private static _p[][] h(List var0) {
      _p[][] var1 = new _p[var0.size()][];

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         List var3 = (List)var0.get(var2);
         _p[] var4 = (_p[])((_p[])var3.toArray(new _p[var3.size()]));
         var1[var2] = var4;
      }

      return var1;
   }

   private static void L(_p var0, List var1) {
      if(var0.r != null) {
         for(int var2 = 0; var2 < var0.r.length; ++var2) {
            net.n9.v var3 = var0.r[var2];
            if(!(var3 instanceof net.n9.v)) {
               z9.h("TextureAtlasSprite is not TextureAtlasSprite: " + var3 + ", name: " + var3.V());
            } else {
               int var4 = var3.Q();
               z9.h("Invalid tile ID: " + var4 + ", icon: " + var3.V());
            }
         }
      }

   }

   private static void Z(_p var0, List var1) {
      if(var0.vS != null) {
         for(int var2 = 0; var2 < var0.vS.length; ++var2) {
            int var3 = var0.vS[var2].K();
            z9.h("Invalid block ID: " + var3);
         }
      }

   }

   private static void R(_p var0, List var1, int var2) {
      while(var2 >= var1.size()) {
         var1.add((Object)null);
      }

      List var3 = (List)var1.get(var2);
      ArrayList var4 = new ArrayList();
      var1.set(var2, var4);
      var4.add(var0);
   }

   private static String[] C() {
      ArrayList var0 = new ArrayList();
      String var1 = "mcpatcher/ctm/default/";
      if(z9.I(new net.yz.m_("textures/blocks/glass.png"))) {
         var0.add(var1 + "glass.properties");
         var0.add(var1 + "glasspane.properties");
      }

      if(z9.I(new net.yz.m_("textures/blocks/bookshelf.png"))) {
         var0.add(var1 + "bookshelf.properties");
      }

      if(z9.I(new net.yz.m_("textures/blocks/sandstone_normal.png"))) {
         var0.add(var1 + "sandstone.properties");
      }

      String[] var2 = new String[]{"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         if(z9.I(new net.yz.m_("textures/blocks/glass_" + var4 + ".png"))) {
            var0.add(var1 + var3 + "_glass_" + var4 + "/glass_" + var4 + ".properties");
            var0.add(var1 + var3 + "_glass_" + var4 + "/glass_pane_" + var4 + ".properties");
         }
      }

      String[] var5 = (String[])((String[])var0.toArray(new String[var0.size()]));
      return var5;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
