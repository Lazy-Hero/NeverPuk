package net.z;

import java.awt.Color;
import net.xh;
import net.xn;
import net.yz.m_;
import net.z.g;
import net.z.t;
import org.lwjgl.input.Mouse;

public class m extends g {
   protected static final m_ b;
   protected int s;
   public static t L;
   protected int h;
   public int D;
   public int R;
   public String J;
   public int g;
   public boolean O;
   public boolean F;
   protected boolean P;
   private int Y;
   private static int[] Q;

   public m(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   public m(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.Y = 20;
      this.s = 200;
      this.h = 20;
      this.O = true;
      this.F = true;
      this.g = var1;
      this.D = var2;
      this.R = var3;
      this.s = var4;
      this.h = var5;
      this.J = var6;
   }

   protected int O(boolean var1) {
      byte var2 = 1;
      if(!this.O) {
         var2 = 0;
      } else {
         var2 = 2;
      }

      return var2;
   }

   public void Z(net.nn.j var1, int var2, int var3, float var4) {
      boolean var5 = g.C();
      if(this.F) {
         this.P = var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h;
         Color var6 = new Color(255, 255, 255, 255);
         Color var7 = new Color(this.Y + 14, this.Y + 14, this.Y + 14, 255);
         var1.n().E(b);
         if(!this.O) {
            var7 = new Color(10, 10, 10, 255);
            var6 = new Color(100, 100, 100, 255);
         }

         label221: {
            if(this.P) {
               if(this.Y >= 100) {
                  break label221;
               }

               this.Y += 13;
            }

            if(this.Y > 20) {
               this.Y -= 13;
            }
         }

         net.y.d.C();
         net.y.d.G(770, 771, 1, 0);
         net.y.d.D(770, 771);
         xh.f((double)this.D, (double)this.R, (double)this.s, (double)this.h, var7, new Color(30, 30, 30, 255));
         var1.sO.Z(this.J, (float)(this.D + this.s / 2), (float)(this.R + (this.h - 8) / 2), var6.getRGB());
         this.N(var1, var2, var3);
      }

   }

   public static int F() {
      return Mouse.getX() * L.u() / net.nn.j.b().sB;
   }

   public static int A() {
      return L.v() - Mouse.getY() * L.v() / net.nn.j.b().st - 1;
   }

   protected void N(net.nn.j var1, int var2, int var3) {
   }

   public void A(int var1, int var2) {
   }

   public boolean X(net.nn.j var1, int var2, int var3) {
      return this.O && this.F && var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h;
   }

   public boolean Z() {
      return this.P;
   }

   public void W(int var1, int var2) {
   }

   public void i(net.h.m var1) {
      var1.g((net.h.d)net.h.a.v(net.nb.l.Ku, 1.0F));
   }

   public int h() {
      return this.s;
   }

   public void V(int var1) {
      this.s = var1;
   }

   static {
      if(a() == null) {
         T(new int[5]);
      }

      b = new m_("textures/gui/widgets.png");
      L = new t(net.nn.j.b());
   }

   public static void T(int[] var0) {
      Q = var0;
   }

   public static int[] a() {
      return Q;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
