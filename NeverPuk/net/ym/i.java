package net.ym;

import javax.annotation.Nullable;
import net.b4;
import net.dj;
import net.i6;
import net.oz;
import net.xn;
import net.z9;
import net.y.un;
import net.ym.d;
import net.ym.h;
import net.ym.q;
import net.ym.t;
import net.yz.aq;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class i {
   private static final float p = 1.0F / (float)Math.cos(0.39269909262657166D) - 1.0F;
   private static final float g = 1.0F / (float)Math.cos(0.7853981633974483D) - 1.0F;
   private static final i.v[] b = new i.v[d.values().length * aq.values().length];
   private static final i.v S = new i.v(null) {
      q M(float var1, float var2, float var3, float var4) {
         return new q(new float[]{var1, var2, var3, var4}, 0);
      }
   };
   private static final i.v s = new i.v(null) {
      q M(float var1, float var2, float var3, float var4) {
         return new q(new float[]{var4, 16.0F - var1, var2, 16.0F - var3}, 270);
      }
   };
   private static final i.v I = new i.v(null) {
      q M(float var1, float var2, float var3, float var4) {
         return new q(new float[]{16.0F - var1, 16.0F - var2, 16.0F - var3, 16.0F - var4}, 0);
      }
   };
   private static final i.v G = new i.v(null) {
      q M(float var1, float var2, float var3, float var4) {
         return new q(new float[]{16.0F - var2, var3, 16.0F - var4, var1}, 90);
      }
   };

   public t d(Vector3f var1, Vector3f var2, net.ym.z var3, net.n9.v var4, aq var5, d var6, @Nullable h var7, boolean var8, boolean var9) {
      q var10 = var3.a;
      var10 = this.Z(var3.a, var5, var6);
      int[] var11 = this.u(var10, var4, var5, this.C(var1, var2), var6, var7, var9);
      aq var12 = S(var11);
      this.X(var11, var12);
      return new t(var11, var3.j, var12, var4);
   }

   public t k(Vector3f var1, Vector3f var2, net.ym.z var3, net.n9.v var4, aq var5, b4 var6, h var7, boolean var8, boolean var9) {
      q var10 = var3.a;
      if(i6.Mj.r()) {
         var10 = (q)i6.H(i6.Mj, new Object[]{var3.a, var5, var6});
      } else {
         var10 = this.Z(var3.a, var5, (d)var6);
      }

      boolean var11 = !i6.uc.r();
      int[] var12 = this.u(var10, var4, var5, this.C(var1, var2), var6, var7, var11);
      aq var13 = S(var12);
      this.X(var12, var13);
      if(i6.uc.r()) {
         i6.H(i6.uc, new Object[]{var12, var13});
         return new t(var12, var3.j, var13, var4, var9, net.y8.x.d);
      } else {
         return new t(var12, var3.j, var13, var4);
      }
   }

   private q Z(q var1, aq var2, d var3) {
      return b[r(var3, var2)].T(var1);
   }

   private int[] u(q var1, net.n9.v var2, aq var3, float[] var4, b4 var5, @Nullable h var6, boolean var7) {
      byte var8 = 28;
      if(z9.Q()) {
         var8 = 56;
      }

      int[] var9 = new int[var8];
      int var10 = 0;

      while(true) {
         this.c(var9, var10, var3, var1, var4, var2, var5, var6, var7);
         ++var10;
      }
   }

   private int i(aq var1) {
      float var2 = m(var1);
      int var3 = net.u.t.g((int)(var2 * 255.0F), 0, 255);
      return -16777216 | var3 << 16 | var3 << 8 | var3;
   }

   public static float m(aq var0) {
      switch(null.c[var0.ordinal()]) {
      case 1:
         if(z9.Q()) {
            return oz.KO;
         }

         return 0.5F;
      case 2:
         return 1.0F;
      case 3:
      case 4:
         if(z9.Q()) {
            return oz.W;
         }

         return 0.8F;
      case 5:
      case 6:
         if(z9.Q()) {
            return oz.er;
         }

         return 0.6F;
      default:
         return 1.0F;
      }
   }

   private float[] C(Vector3f var1, Vector3f var2) {
      float[] var3 = new float[aq.values().length];
      var3[un.u.P] = var1.x / 16.0F;
      var3[un.u.f] = var1.y / 16.0F;
      var3[un.u.m] = var1.z / 16.0F;
      var3[un.u.s] = var2.x / 16.0F;
      var3[un.u.L] = var2.y / 16.0F;
      var3[un.u.Q] = var2.z / 16.0F;
      return var3;
   }

   private void c(int[] var1, int var2, aq var3, q var4, float[] var5, net.n9.v var6, b4 var7, @Nullable h var8, boolean var9) {
      aq var10 = var7.O(var3);
      int var11 = this.i(var10);
      un.k var12 = un.n(var3).k(var2);
      Vector3f var13 = new Vector3f(var5[var12.V], var5[var12.j], var5[var12.C]);
      this.K(var13, var8);
      int var14 = this.V(var13, var3, var2, var7);
      dj.e(var13);
      this.O(var1, var14, var2, var13, var11, var6, var4);
   }

   private void O(int[] var1, int var2, int var3, Vector3f var4, int var5, net.n9.v var6, q var7) {
      int var8 = var1.length / 4;
      int var9 = var2 * var8;
      var1[var9] = Float.floatToRawIntBits(var4.x);
      var1[var9 + 1] = Float.floatToRawIntBits(var4.y);
      var1[var9 + 2] = Float.floatToRawIntBits(var4.z);
      var1[var9 + 3] = var5;
      var1[var9 + 4] = Float.floatToRawIntBits(var6.W((double)var7.Q(var3) * 0.999D + (double)var7.Q((var3 + 2) % 4) * 0.001D));
      var1[var9 + 4 + 1] = Float.floatToRawIntBits(var6.L((double)var7.D(var3) * 0.999D + (double)var7.D((var3 + 2) % 4) * 0.001D));
   }

   private void K(Vector3f var1, @Nullable h var2) {
      Matrix4f var3 = this.w();
      Vector3f var4 = new Vector3f(0.0F, 0.0F, 0.0F);
      switch(null.O[var2.O.ordinal()]) {
      case 1:
         Matrix4f.rotate(var2.l * 0.017453292F, new Vector3f(1.0F, 0.0F, 0.0F), var3, var3);
         var4.set(0.0F, 1.0F, 1.0F);
         break;
      case 2:
         Matrix4f.rotate(var2.l * 0.017453292F, new Vector3f(0.0F, 1.0F, 0.0F), var3, var3);
         var4.set(1.0F, 0.0F, 1.0F);
         break;
      case 3:
         Matrix4f.rotate(var2.l * 0.017453292F, new Vector3f(0.0F, 0.0F, 1.0F), var3, var3);
         var4.set(1.0F, 1.0F, 0.0F);
      }

      if(var2.o) {
         if(Math.abs(var2.l) == 22.5F) {
            var4.scale(p);
         } else {
            var4.scale(g);
         }

         Vector3f.add(var4, new Vector3f(1.0F, 1.0F, 1.0F), var4);
      } else {
         var4.set(1.0F, 1.0F, 1.0F);
      }

      this.l(var1, new Vector3f(var2.i), var3, var4);
   }

   public int u(Vector3f var1, aq var2, int var3, d var4) {
      return this.u(var1, var2, var3, var4);
   }

   public int V(Vector3f var1, aq var2, int var3, b4 var4) {
      if(var4 == d.X0_Y0) {
         return var3;
      } else {
         if(i6.Bb.r()) {
            i6.H(i6.Bb, new Object[]{var1, var4.j()});
         } else {
            this.l(var1, new Vector3f(0.5F, 0.5F, 0.5F), ((d)var4).B(), new Vector3f(1.0F, 1.0F, 1.0F));
         }

         return var4.b(var2, var3);
      }
   }

   private void l(Vector3f var1, Vector3f var2, Matrix4f var3, Vector3f var4) {
      Vector4f var5 = new Vector4f(var1.x - var2.x, var1.y - var2.y, var1.z - var2.z, 1.0F);
      Matrix4f.transform(var3, var5, var5);
      var5.x *= var4.x;
      var5.y *= var4.y;
      var5.z *= var4.z;
      var1.set(var5.x + var2.x, var5.y + var2.y, var5.z + var2.z);
   }

   private Matrix4f w() {
      Matrix4f var1 = new Matrix4f();
      var1.setIdentity();
      return var1;
   }

   public static aq S(int[] var0) {
      int var1 = var0.length / 4;
      int var2 = var1 * 2;
      Vector3f var3 = new Vector3f(Float.intBitsToFloat(var0[0]), Float.intBitsToFloat(var0[1]), Float.intBitsToFloat(var0[2]));
      Vector3f var4 = new Vector3f(Float.intBitsToFloat(var0[var1]), Float.intBitsToFloat(var0[var1 + 1]), Float.intBitsToFloat(var0[var1 + 2]));
      Vector3f var5 = new Vector3f(Float.intBitsToFloat(var0[var2]), Float.intBitsToFloat(var0[var2 + 1]), Float.intBitsToFloat(var0[var2 + 2]));
      Vector3f var6 = new Vector3f();
      Vector3f var7 = new Vector3f();
      Vector3f var8 = new Vector3f();
      Vector3f.sub(var3, var4, var6);
      Vector3f.sub(var5, var4, var7);
      Vector3f.cross(var7, var6, var8);
      float var9 = (float)Math.sqrt((double)(var8.x * var8.x + var8.y * var8.y + var8.z * var8.z));
      var8.x /= var9;
      var8.y /= var9;
      var8.z /= var9;
      Object var10 = null;
      float var11 = 0.0F;

      for(aq var15 : aq.values()) {
         net.u.d var16 = var15.E();
         Vector3f var17 = new Vector3f((float)var16.t(), (float)var16.h(), (float)var16.y());
         float var18 = Vector3f.dot(var8, var17);
         if(var18 >= 0.0F && var18 > var11) {
            var11 = var18;
         }
      }

      return aq.UP;
   }

   private void X(int[] var1, aq var2) {
      int[] var4 = new int[var1.length];
      System.arraycopy(var1, 0, var4, 0, var1.length);
      t.v();
      float[] var5 = new float[aq.values().length];
      var5[un.u.P] = 999.0F;
      var5[un.u.f] = 999.0F;
      var5[un.u.m] = 999.0F;
      var5[un.u.s] = -999.0F;
      var5[un.u.L] = -999.0F;
      var5[un.u.Q] = -999.0F;
      int var6 = var1.length / 4;
      int var7 = 0;
      int var8 = var6 * var7;
      float var9 = Float.intBitsToFloat(var4[var8]);
      float var10 = Float.intBitsToFloat(var4[var8 + 1]);
      float var11 = Float.intBitsToFloat(var4[var8 + 2]);
      if(Float.compare(var9, var5[un.u.P]) < 0) {
         var5[un.u.P] = var9;
      }

      if(Float.compare(var10, var5[un.u.f]) < 0) {
         var5[un.u.f] = var10;
      }

      if(Float.compare(var11, var5[un.u.m]) < 0) {
         var5[un.u.m] = var11;
      }

      if(Float.compare(var9, var5[un.u.s]) > 0) {
         var5[un.u.s] = var9;
      }

      if(Float.compare(var10, var5[un.u.L]) > 0) {
         var5[un.u.L] = var10;
      }

      if(var11 > var5[un.u.Q]) {
         var5[un.u.Q] = var11;
      }

      ++var7;
      un var20 = un.n(var2);
      var8 = 0;
      int var23 = var6 * var8;
      un.k var24 = var20.k(var8);
      var11 = var5[var24.V];
      float var12 = var5[var24.j];
      float var13 = var5[var24.C];
      var1[var23] = Float.floatToRawIntBits(var11);
      var1[var23 + 1] = Float.floatToRawIntBits(var12);
      var1[var23 + 2] = Float.floatToRawIntBits(var13);
      int var14 = 0;
      int var15 = var6 * var14;
      float var16 = Float.intBitsToFloat(var4[var15]);
      float var17 = Float.intBitsToFloat(var4[var15 + 1]);
      float var18 = Float.intBitsToFloat(var4[var15 + 2]);
      if(net.u.t.C(var11, var16) && net.u.t.C(var12, var17) && net.u.t.C(var13, var18)) {
         var1[var23 + 4] = var4[var15 + 4];
         var1[var23 + 4 + 1] = var4[var15 + 4 + 1];
      }

      ++var14;
      ++var8;
   }

   private static void g(d var0, aq var1, i.v var2) {
      b[r(var0, var1)] = var2;
   }

   private static int r(d var0, aq var1) {
      return d.values().length * var1.ordinal() + var0.ordinal();
   }

   static {
      g(d.X0_Y0, aq.DOWN, S);
      g(d.X0_Y0, aq.EAST, S);
      g(d.X0_Y0, aq.NORTH, S);
      g(d.X0_Y0, aq.SOUTH, S);
      g(d.X0_Y0, aq.UP, S);
      g(d.X0_Y0, aq.WEST, S);
      g(d.X0_Y90, aq.EAST, S);
      g(d.X0_Y90, aq.NORTH, S);
      g(d.X0_Y90, aq.SOUTH, S);
      g(d.X0_Y90, aq.WEST, S);
      g(d.X0_Y180, aq.EAST, S);
      g(d.X0_Y180, aq.NORTH, S);
      g(d.X0_Y180, aq.SOUTH, S);
      g(d.X0_Y180, aq.WEST, S);
      g(d.X0_Y270, aq.EAST, S);
      g(d.X0_Y270, aq.NORTH, S);
      g(d.X0_Y270, aq.SOUTH, S);
      g(d.X0_Y270, aq.WEST, S);
      g(d.X90_Y0, aq.DOWN, S);
      g(d.X90_Y0, aq.SOUTH, S);
      g(d.X90_Y90, aq.DOWN, S);
      g(d.X90_Y180, aq.DOWN, S);
      g(d.X90_Y180, aq.NORTH, S);
      g(d.X90_Y270, aq.DOWN, S);
      g(d.X180_Y0, aq.DOWN, S);
      g(d.X180_Y0, aq.UP, S);
      g(d.X270_Y0, aq.SOUTH, S);
      g(d.X270_Y0, aq.UP, S);
      g(d.X270_Y90, aq.UP, S);
      g(d.X270_Y180, aq.NORTH, S);
      g(d.X270_Y180, aq.UP, S);
      g(d.X270_Y270, aq.UP, S);
      g(d.X0_Y270, aq.UP, s);
      g(d.X0_Y90, aq.DOWN, s);
      g(d.X90_Y0, aq.WEST, s);
      g(d.X90_Y90, aq.WEST, s);
      g(d.X90_Y180, aq.WEST, s);
      g(d.X90_Y270, aq.NORTH, s);
      g(d.X90_Y270, aq.SOUTH, s);
      g(d.X90_Y270, aq.WEST, s);
      g(d.X180_Y90, aq.UP, s);
      g(d.X180_Y270, aq.DOWN, s);
      g(d.X270_Y0, aq.EAST, s);
      g(d.X270_Y90, aq.EAST, s);
      g(d.X270_Y90, aq.NORTH, s);
      g(d.X270_Y90, aq.SOUTH, s);
      g(d.X270_Y180, aq.EAST, s);
      g(d.X270_Y270, aq.EAST, s);
      g(d.X0_Y180, aq.DOWN, I);
      g(d.X0_Y180, aq.UP, I);
      g(d.X90_Y0, aq.NORTH, I);
      g(d.X90_Y0, aq.UP, I);
      g(d.X90_Y90, aq.UP, I);
      g(d.X90_Y180, aq.SOUTH, I);
      g(d.X90_Y180, aq.UP, I);
      g(d.X90_Y270, aq.UP, I);
      g(d.X180_Y0, aq.EAST, I);
      g(d.X180_Y0, aq.NORTH, I);
      g(d.X180_Y0, aq.SOUTH, I);
      g(d.X180_Y0, aq.WEST, I);
      g(d.X180_Y90, aq.EAST, I);
      g(d.X180_Y90, aq.NORTH, I);
      g(d.X180_Y90, aq.SOUTH, I);
      g(d.X180_Y90, aq.WEST, I);
      g(d.X180_Y180, aq.DOWN, I);
      g(d.X180_Y180, aq.EAST, I);
      g(d.X180_Y180, aq.NORTH, I);
      g(d.X180_Y180, aq.SOUTH, I);
      g(d.X180_Y180, aq.UP, I);
      g(d.X180_Y180, aq.WEST, I);
      g(d.X180_Y270, aq.EAST, I);
      g(d.X180_Y270, aq.NORTH, I);
      g(d.X180_Y270, aq.SOUTH, I);
      g(d.X180_Y270, aq.WEST, I);
      g(d.X270_Y0, aq.DOWN, I);
      g(d.X270_Y0, aq.NORTH, I);
      g(d.X270_Y90, aq.DOWN, I);
      g(d.X270_Y180, aq.DOWN, I);
      g(d.X270_Y180, aq.SOUTH, I);
      g(d.X270_Y270, aq.DOWN, I);
      g(d.X0_Y90, aq.UP, G);
      g(d.X0_Y270, aq.DOWN, G);
      g(d.X90_Y0, aq.EAST, G);
      g(d.X90_Y90, aq.EAST, G);
      g(d.X90_Y90, aq.NORTH, G);
      g(d.X90_Y90, aq.SOUTH, G);
      g(d.X90_Y180, aq.EAST, G);
      g(d.X90_Y270, aq.EAST, G);
      g(d.X270_Y0, aq.WEST, G);
      g(d.X180_Y90, aq.DOWN, G);
      g(d.X180_Y270, aq.UP, G);
      g(d.X270_Y90, aq.WEST, G);
      g(d.X270_Y180, aq.WEST, G);
      g(d.X270_Y270, aq.NORTH, G);
      g(d.X270_Y270, aq.SOUTH, G);
      g(d.X270_Y270, aq.WEST, G);
   }

   private static xn a(xn var0) {
      return var0;
   }

   abstract static class v {
      private v() {
      }

      public q T(q var1) {
         float var2 = var1.Q(var1.G(0));
         float var3 = var1.D(var1.G(0));
         float var4 = var1.Q(var1.G(2));
         float var5 = var1.D(var1.G(2));
         return this.M(var2, var3, var4, var5);
      }

      abstract q M(float var1, float var2, float var3, float var4);
   }
}
