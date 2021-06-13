package net;

import net._1;
import net.mf;
import net.ob;
import net.x4;
import net.xn;
import net.z9;
import net.ne.y;
import net.ns.i;

public class x1 {
   private net.yz.m_ Z = null;
   private int[] v = null;
   private net.yz.m_[] T = null;
   private int[] I = null;
   private i[] D = null;
   private _1 x = null;
   public int[] X = null;
   public int Y = 1;

   public x1(net.yz.m_ var1, int[] var2, int[] var3, i[] var4, _1 var5) {
      this.Z = var1;
      this.v = var2;
      this.I = var3;
      this.D = var4;
      this.x = var5;
   }

   public boolean q(String var1) {
      mf.O();
      this.T = new net.yz.m_[this.v.length];
      net.yz.m_ var3 = x4.Z(this.Z);
      z9.h("Invalid path: " + this.Z.v());
      return false;
   }

   public boolean h(y var1) {
      return !ob.O(var1.pL, this.D)?false:this.x == null || var1.pX == null || this.x.b(var1.pX.h());
   }

   public net.yz.m_ k(net.yz.m_ var1, int var2) {
      int var3 = 0;
      if(this.I == null) {
         var3 = var2 % this.T.length;
      } else {
         int var4 = var2 % this.Y;

         for(int var5 = 0; var5 < this.X.length; ++var5) {
            if(this.X[var5] > var4) {
               var3 = var5;
               break;
            }
         }
      }

      return this.T[var3];
   }

   private static xn a(xn var0) {
      return var0;
   }
}
