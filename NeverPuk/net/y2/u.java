package net.y2;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.xn;
import net.y.ui;
import net.y2.m;
import net.y2.t;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;

public class u {
   private static final Logger r = LogManager.getLogger();
   private int W;
   private final int S;
   private final int v;
   private final IntBuffer X;
   private final FloatBuffer t;
   private final String M;
   private boolean g;
   private final m E;

   public u(String var1, int var2, int var3, m var4) {
      this.M = var1;
      this.S = var3;
      this.v = var2;
      this.E = var4;
      if(var2 <= 3) {
         this.X = BufferUtils.createIntBuffer(var3);
         this.t = null;
      } else {
         this.X = null;
         this.t = BufferUtils.createFloatBuffer(var3);
      }

      this.W = -1;
      this.L();
   }

   private void L() {
      this.g = true;
      if(this.E != null) {
         this.E.Y();
      }

   }

   public static int T(String var0) {
      byte var1 = -1;
      if("int".equals(var0)) {
         var1 = 0;
      } else if("float".equals(var0)) {
         var1 = 4;
      } else if(var0.startsWith("matrix")) {
         if(var0.endsWith("2x2")) {
            var1 = 8;
         } else if(var0.endsWith("3x3")) {
            var1 = 9;
         } else if(var0.endsWith("4x4")) {
            var1 = 10;
         }
      }

      return var1;
   }

   public void l(int var1) {
      this.W = var1;
   }

   public String P() {
      return this.M;
   }

   public void a(float var1) {
      this.t.position(0);
      this.t.put(0, var1);
      this.L();
   }

   public void T(float var1, float var2) {
      this.t.position(0);
      this.t.put(0, var1);
      this.t.put(1, var2);
      this.L();
   }

   public void P(float var1, float var2, float var3) {
      this.t.position(0);
      this.t.put(0, var1);
      this.t.put(1, var2);
      this.t.put(2, var3);
      this.L();
   }

   public void A(float var1, float var2, float var3, float var4) {
      this.t.position(0);
      this.t.put(var1);
      this.t.put(var2);
      this.t.put(var3);
      this.t.put(var4);
      this.t.flip();
      this.L();
   }

   public void l(float var1, float var2, float var3, float var4) {
      this.t.position(0);
      if(this.v >= 4) {
         this.t.put(0, var1);
      }

      if(this.v >= 5) {
         this.t.put(1, var2);
      }

      if(this.v >= 6) {
         this.t.put(2, var3);
      }

      if(this.v >= 7) {
         this.t.put(3, var4);
      }

      this.L();
   }

   public void G(int var1, int var2, int var3, int var4) {
      this.X.position(0);
      if(this.v >= 0) {
         this.X.put(0, var1);
      }

      if(this.v >= 1) {
         this.X.put(1, var2);
      }

      if(this.v >= 2) {
         this.X.put(2, var3);
      }

      if(this.v >= 3) {
         this.X.put(3, var4);
      }

      this.L();
   }

   public void r(float[] var1) {
      if(var1.length < this.S) {
         r.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", Integer.valueOf(this.S), Integer.valueOf(var1.length));
      } else {
         this.t.position(0);
         this.t.put(var1);
         this.t.position(0);
         this.L();
      }

   }

   public void s(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      this.t.position(0);
      this.t.put(0, var1);
      this.t.put(1, var2);
      this.t.put(2, var3);
      this.t.put(3, var4);
      this.t.put(4, var5);
      this.t.put(5, var6);
      this.t.put(6, var7);
      this.t.put(7, var8);
      this.t.put(8, var9);
      this.t.put(9, var10);
      this.t.put(10, var11);
      this.t.put(11, var12);
      this.t.put(12, var13);
      this.t.put(13, var14);
      this.t.put(14, var15);
      this.t.put(15, var16);
      this.L();
   }

   public void z(Matrix4f var1) {
      this.s(var1.m00, var1.m01, var1.m02, var1.m03, var1.m10, var1.m11, var1.m12, var1.m13, var1.m20, var1.m21, var1.m22, var1.m23, var1.m30, var1.m31, var1.m32, var1.m33);
   }

   public void w() {
      if(!this.g) {
         ;
      }

      this.g = false;
      if(this.v <= 3) {
         this.p();
      } else if(this.v <= 7) {
         this.K();
      } else {
         if(this.v > 10) {
            r.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", Integer.valueOf(this.v));
            return;
         }

         this.o();
      }

   }

   private void p() {
      String[] var1 = t.h();
      switch(this.v) {
      case 0:
         ui.I(this.W, this.X);
      case 1:
         ui.K(this.W, this.X);
      case 2:
         ui.m(this.W, this.X);
      case 3:
         ui.W(this.W, this.X);
      default:
         r.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", Integer.valueOf(this.S));
      }
   }

   private void K() {
      switch(this.v) {
      case 4:
         ui.Z(this.W, this.t);
         break;
      case 5:
         ui.v(this.W, this.t);
         break;
      case 6:
         ui.U(this.W, this.t);
         break;
      case 7:
         ui.E(this.W, this.t);
         break;
      default:
         r.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", Integer.valueOf(this.S));
      }

   }

   private void o() {
      switch(this.v) {
      case 8:
         ui.y(this.W, true, this.t);
         break;
      case 9:
         ui.C(this.W, true, this.t);
         break;
      case 10:
         ui.B(this.W, true, this.t);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
