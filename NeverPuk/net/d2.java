package net;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import net.mf;
import net.xn;
import net.z9;
import net.zo;
import net.n9.e;
import net.n9.x;
import net.nn.j;
import net.y.d;
import net.y6.jb;
import net.y6.t;
import net.yy.f;

public class d2 {
   private Dimension k = null;
   private boolean c = false;
   private zo[] X = new zo[0];
   private net.yz.m_ S = null;
   private BufferedImage B = null;
   private x J = null;
   private final net.yz.m_ h = new net.yz.m_("textures/blocks/wool_colored_red.png");
   public static final int C = 0;
   public static final int j = 1;
   public static final int F = 2;
   public static final int a = 3;
   public static final int o = 4;
   public static final int u = 5;
   public static final int g = 6;

   public d2(Dimension var1, boolean var2, zo[] var3) {
      this.k = var1;
      this.c = var2;
      this.X = var3;
   }

   public void P(t var1, f var2, float var3, float var4) {
      mf.O();
      e var6 = z9.V();
      if(this.c) {
         var6.E(var2.g());
      }

      if(this.S != null) {
         if(this.J == null && this.B != null) {
            this.J = new x(this.B);
            j.b().n().E(this.S, this.J);
         }

         var6.E(this.S);
      }

      var6.E(this.h);
      int var7 = 0;
      if(var7 < this.X.length) {
         zo var8 = this.X[var7];
         d.c();
         if(var2.Q()) {
            d.O(0.0F, 0.2F, 0.0F);
         }

         var8.N(var1, var3);
         d.Y();
         ++var7;
      }

   }

   public static jb a(t var0, int var1) {
      switch(var1) {
      case 0:
         return var0.N;
      case 1:
         return var0.G;
      case 2:
         return var0.B;
      case 3:
         return var0.A;
      case 4:
         return var0.a;
      case 5:
         return var0.H;
      default:
         return null;
      }
   }

   public BufferedImage h() {
      return this.B;
   }

   public void S(BufferedImage var1) {
      this.B = var1;
   }

   public x e() {
      return this.J;
   }

   public net.yz.m_ a() {
      return this.S;
   }

   public void D(net.yz.m_ var1) {
      this.S = var1;
   }

   public boolean l() {
      return this.c;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
