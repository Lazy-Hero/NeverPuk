package net;

import java.nio.ByteBuffer;
import java.util.Properties;
import net.mf;
import net.om;
import net.os;
import net.xn;
import net.z9;
import net.n9.t;
import net.y.d;
import net.y.m;
import org.lwjgl.opengl.GL11;

public class mb {
   private String I = null;
   private String s = null;
   net.yz.m_ S = null;
   private int U = -1;
   private int V = 0;
   private int H = 0;
   private int L = 0;
   private int v = 0;
   private om[] p = null;
   private int w = 0;
   byte[] W = null;
   private ByteBuffer e = null;

   public mb(String var1, byte[] var2, String var3, net.yz.m_ var4, int var5, int var6, int var7, int var8, Properties var9, int var10) {
      this.I = var1;
      this.s = var3;
      this.S = var4;
      mf.O();
      this.V = var5;
      this.H = var6;
      this.L = var7;
      this.v = var8;
      int var12 = var7 * var8 * 4;
      if(var2.length % var12 != 0) {
         z9.h("Invalid animated texture length: " + var2.length + ", frameWidth: " + var7 + ", frameHeight: " + var8);
      }

      this.W = var2;
      int var13 = var2.length / var12;
      if(var9.get("tile.0") != null) {
         int var14 = 0;
         if(var9.get("tile." + var14) != null) {
            var13 = var14 + 1;
            ++var14;
         }
      }

      String var23 = (String)var9.get("duration");
      int var15 = z9.F(var23, var10);
      this.p = new om[var13];
      int var16 = 0;
      if(var16 < this.p.length) {
         String var17 = (String)var9.get("tile." + var16);
         int var18 = z9.F(var17, var16);
         String var19 = (String)var9.get("duration." + var16);
         int var20 = z9.F(var19, var15);
         om var21 = new om(var18, var20);
         this.p[var16] = var21;
         ++var16;
      }

   }

   public boolean s() {
      if(this.p.length <= 0) {
         return false;
      } else {
         if(this.w >= this.p.length) {
            this.w = 0;
         }

         om var1 = this.p[this.w];
         ++var1.n;
         if(var1.n < var1.V) {
            return false;
         } else {
            var1.n = 0;
            ++this.w;
            if(this.w >= this.p.length) {
               this.w = 0;
            }

            return true;
         }
      }
   }

   public int E() {
      if(this.p.length <= 0) {
         return 0;
      } else {
         if(this.w >= this.p.length) {
            this.w = 0;
         }

         om var1 = this.p[this.w];
         return var1.q;
      }
   }

   public int n() {
      return this.p.length;
   }

   public boolean F() {
      if(this.U < 0) {
         t var4 = os.x(this.S);
         return false;
      } else {
         if(this.e == null) {
            this.e = m.T(this.W.length);
            this.e.put(this.W);
            this.W = null;
         }

         if(!this.s()) {
            return false;
         } else {
            int var1 = this.L * this.v * 4;
            int var2 = this.E();
            int var3 = var1 * var2;
            if(var3 + var1 > this.e.capacity()) {
               return false;
            } else {
               this.e.position(var3);
               d.z(this.U);
               GL11.glTexSubImage2D(3553, 0, this.V, this.H, this.L, this.v, 6408, 5121, this.e);
               return true;
            }
         }
      }
   }

   public String i() {
      return this.I;
   }

   public String N() {
      return this.s;
   }

   public net.yz.m_ N() {
      return this.S;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
