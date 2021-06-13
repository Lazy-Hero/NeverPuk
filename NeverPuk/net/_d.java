package net;

import java.awt.Color;
import net.iw;
import net.xh;
import net.xn;
import net.nn.j;
import net.y.d;
import net.z.t8;
import net.z.tc;
import net.z.tu;

public class _d {
   protected int d;
   protected String e;
   protected int r;
   protected j H;
   protected net.yz.m_ i;
   protected int q;
   protected int v;
   protected int u = 0;
   protected int z;
   private static boolean G;

   public _d(net.yz.m_ var1, int var2, int var3, int var4, int var5, String var6, int var7) {
      this.i = var1;
      this.v = var2;
      this.z = var3;
      this.r = var4;
      this.d = var5;
      this.e = var6;
      this.q = var7;
      this.H = j.b();
   }

   protected void s(int var1, int var2) {
      if(this.Q(var1, var2)) {
         if(this.u < 5) {
            ++this.u;
         }
      } else if(this.u > 0) {
         --this.u;
      }

   }

   public void v(int var1, int var2) {
      boolean var3 = C();
      if(this.Q(var1, var2)) {
         if(this.q == 16) {
            this.H.s(new t8((tu)null, this.H.T));
         }

         if(this.q == 15) {
            this.H.s(new tc((tu)null, this.H.T, this.H.I()));
         }

         if(this.q == 14) {
            this.H.A();
         }

         if(this.q == 13) {
            iw.Y("https://vk.com/neverhook");
         }
      }

   }

   public void h(int var1, int var2, Color var3) {
      C();
      d.c();
      d.E();
      this.s(var1, var2);
      if(this.u > 0) {
         xh.T(this.i, (float)(this.v - this.u), (float)(this.z - this.u), (float)(this.r + this.u * 2), (float)(this.d + this.u * 2), new Color(156, 156, 156, 255));
         this.H.s0.i(this.e, (float)this.v + (float)this.r / 2.0F + (float)this.H.s0.s(this.e) / 2.0F - 6.0F, (float)(this.z + this.d - 17), (new Color(255, 255, 255, 255)).getRGB());
         net.u.d.h(new net.u.d[5]);
      }

      xh.T(this.i, (float)this.v, (float)this.z, (float)this.r, (float)this.d, var3);
      d.Y();
   }

   protected boolean Q(int var1, int var2) {
      return xh.Q((double)this.v, (double)this.z, (double)(this.v + this.r), (double)(this.z + this.d), var1, var2);
   }

   public static void y(boolean var0) {
      G = var0;
   }

   public static boolean C() {
      return G;
   }

   public static boolean z() {
      boolean var0 = C();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(!z()) {
         y(true);
      }

   }
}
