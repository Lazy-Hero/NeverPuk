package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.gc;
import net.y9.l;
import net.y9.n;
import net.y9.z4;
import net.y9.zu;
import net.yv.o8;
import net.yz.a5;
import net.yz.ac;
import net.yz.aq;
import net.yz.au;

public class zr extends z4 {
   public static final net.yr.l k = net.yr.l.J("legacy_data", 0, 15);
   public static final net.yr.w n = net.yr.w.l("contents", zr.c.class);
   protected static final net.u.e i = new net.u.e(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D);

   public zr() {
      super(net.y1.l.c);
      this.r(this.b.T().s(n, zr.c.EMPTY).s(k, Integer.valueOf(0)));
   }

   public String U() {
      return net.yq.e.E("item.flowerPot.name");
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return i;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      var4.o((net.yz.k)var5);
      net.ni.m var11 = this.t(var1, var2);
      return false;
   }

   private boolean D(ks var1) {
      l var2 = l.F(var1.Z());
      if(var2 != net.nb.f.dO && var2 != net.nb.f.d2 && var2 != net.nb.f.dW && var2 != net.nb.f.df && var2 != net.nb.f.T && var2 != net.nb.f.X && var2 != net.nb.f.dY) {
         int var3 = var1.n();
         return var2 == net.nb.f.TU && var3 == zu.i.FERN.j();
      } else {
         return true;
      }
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.ni.m var4 = this.t(var1, var2);
      ks var5 = var4.S();
      return !var5.B()?var5:new ks(net.nb.j.Yn);
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return super.J(var1, var2) && var1.Z(var2.b()).z();
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.Z(var3.b()).z()) {
         this.N(var2, var3, var1, 0);
         var2.J(var3);
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.ni.m var4 = this.t(var1, var2);
      if(var4.X() != null) {
         e(var1, var2, new ks(var4.X(), 1, var4.m()));
      }

      super.V(var1, var2, var3);
   }

   public void X(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      super.X(var1, var2, var3, var4);
      if(var4.a6.V) {
         net.ni.m var5 = this.t(var1, var2);
         var5.U(ks.a);
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.Yn;
   }

   @Nullable
   private net.ni.m t(net.yv.r var1, net.u.j var2) {
      net.ni.v var3 = var1.L(var2);
      return var3 instanceof net.ni.m?(net.ni.m)var3:null;
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      Object var3 = null;
      int var4 = 0;
      switch(var2) {
      case 1:
         var3 = net.nb.f.d2;
         var4 = n.v.POPPY.z();
         break;
      case 2:
         var3 = net.nb.f.dO;
         break;
      case 3:
         var3 = net.nb.f.X;
         var4 = gc.i.OAK.B();
         break;
      case 4:
         var3 = net.nb.f.X;
         var4 = gc.i.SPRUCE.B();
         break;
      case 5:
         var3 = net.nb.f.X;
         var4 = gc.i.BIRCH.B();
         break;
      case 6:
         var3 = net.nb.f.X;
         var4 = gc.i.JUNGLE.B();
         break;
      case 7:
         var3 = net.nb.f.T;
         break;
      case 8:
         var3 = net.nb.f.df;
         break;
      case 9:
         var3 = net.nb.f.dW;
         break;
      case 10:
         var3 = net.nb.f.dY;
         break;
      case 11:
         var3 = net.nb.f.TU;
         var4 = zu.i.FERN.j();
         break;
      case 12:
         var3 = net.nb.f.X;
         var4 = gc.i.ACACIA.B();
         break;
      case 13:
         var3 = net.nb.f.X;
         var4 = gc.i.DARK_OAK.B();
      }

      return new net.ni.m(net.n0.y.q((l)var3), var4);
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n, k});
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(k)).intValue();
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      g3.v.w();
      zr.c var5 = zr.c.EMPTY;
      net.ni.v var6 = var2 instanceof net.yv.q?((net.yv.q)var2).S(var3, net.l.q.CHECK):var2.L(var3);
      if(var6 instanceof net.ni.m) {
         net.ni.m var7 = (net.ni.m)var6;
         net.n0.y var8 = var7.X();
         if(var8 instanceof net.n0.q) {
            int var9 = var7.m();
            l var10 = l.F(var8);
            if(var10 == net.nb.f.X) {
               switch(null.w[gc.i.r(var9).ordinal()]) {
               case 1:
                  var5 = zr.c.OAK_SAPLING;
               case 2:
                  var5 = zr.c.SPRUCE_SAPLING;
               case 3:
                  var5 = zr.c.BIRCH_SAPLING;
               case 4:
                  var5 = zr.c.JUNGLE_SAPLING;
               case 5:
                  var5 = zr.c.ACACIA_SAPLING;
               case 6:
                  var5 = zr.c.DARK_OAK_SAPLING;
               default:
                  var5 = zr.c.EMPTY;
               }
            }

            if(var10 == net.nb.f.TU) {
               switch(var9) {
               case 0:
                  var5 = zr.c.DEAD_BUSH;
               case 2:
                  var5 = zr.c.FERN;
               default:
                  var5 = zr.c.EMPTY;
               }
            }

            if(var10 == net.nb.f.dO) {
               var5 = zr.c.DANDELION;
            }

            if(var10 == net.nb.f.d2) {
               switch(null.u[n.v.D(n.b.RED, var9).ordinal()]) {
               case 1:
                  var5 = zr.c.POPPY;
               case 2:
                  var5 = zr.c.BLUE_ORCHID;
               case 3:
                  var5 = zr.c.ALLIUM;
               case 4:
                  var5 = zr.c.HOUSTONIA;
               case 5:
                  var5 = zr.c.RED_TULIP;
               case 6:
                  var5 = zr.c.ORANGE_TULIP;
               case 7:
                  var5 = zr.c.WHITE_TULIP;
               case 8:
                  var5 = zr.c.PINK_TULIP;
               case 9:
                  var5 = zr.c.OXEYE_DAISY;
               default:
                  var5 = zr.c.EMPTY;
               }
            }

            if(var10 == net.nb.f.T) {
               var5 = zr.c.MUSHROOM_RED;
            }

            if(var10 == net.nb.f.df) {
               var5 = zr.c.MUSHROOM_BROWN;
            }

            if(var10 == net.nb.f.dY) {
               var5 = zr.c.DEAD_BUSH;
            }

            if(var10 == net.nb.f.dW) {
               var5 = zr.c.CACTUS;
            }
         }
      }

      return var1.s(n, var5);
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum c implements au {
      EMPTY("empty"),
      POPPY("rose"),
      BLUE_ORCHID("blue_orchid"),
      ALLIUM("allium"),
      HOUSTONIA("houstonia"),
      RED_TULIP("red_tulip"),
      ORANGE_TULIP("orange_tulip"),
      WHITE_TULIP("white_tulip"),
      PINK_TULIP("pink_tulip"),
      OXEYE_DAISY("oxeye_daisy"),
      DANDELION("dandelion"),
      OAK_SAPLING("oak_sapling"),
      SPRUCE_SAPLING("spruce_sapling"),
      BIRCH_SAPLING("birch_sapling"),
      JUNGLE_SAPLING("jungle_sapling"),
      ACACIA_SAPLING("acacia_sapling"),
      DARK_OAK_SAPLING("dark_oak_sapling"),
      MUSHROOM_RED("mushroom_red"),
      MUSHROOM_BROWN("mushroom_brown"),
      DEAD_BUSH("dead_bush"),
      FERN("fern"),
      CACTUS("cactus");

      private final String i;

      private c(String var3) {
         this.i = var3;
      }

      public String toString() {
         return this.i;
      }

      public String f() {
         return this.i;
      }
   }
}
