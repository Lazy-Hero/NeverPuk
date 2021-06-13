package net.y;

import com.google.common.primitives.Floats;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import net._c;
import net.os;
import net.wk;
import net.z9;
import net.y.m;
import net.yv.o8;
import net.yz.ac;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class p {
   private static final Logger q = LogManager.getLogger();
   private ByteBuffer E;
   public IntBuffer D;
   private ShortBuffer V;
   public FloatBuffer w;
   public int o;
   private net.y8.h n;
   private int v;
   private boolean H;
   public int X;
   private double Z;
   private double C;
   private double d;
   private net.y8.q p;
   private boolean h;
   private ac t = null;
   private boolean[] S = new boolean[256];
   private net.n9.v[] m = null;
   private net.n9.v[] Y = null;
   private net.n9.v P = null;
   public wk L;
   public _c s = null;
   private static String F;

   public p(int var1) {
      if(z9.Q()) {
         var1 *= 2;
      }

      this.E = m.T(var1 * 4);
      this.D = this.E.asIntBuffer();
      this.V = this.E.asShortBuffer();
      this.w = this.E.asFloatBuffer();
      wk.m(this);
   }

   private void z(int var1) {
      if(z9.Q()) {
         var1 *= 2;
      }

      if(net.u.t.s(var1, 4) / 4 > this.D.remaining() || this.o * this.p.H() + var1 > this.E.capacity()) {
         int var2 = this.E.capacity();
         int var3 = var2 + net.u.t.s(var1, 2097152);
         q.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", Integer.valueOf(var2), Integer.valueOf(var3));
         int var4 = this.D.position();
         ByteBuffer var5 = m.T(var3);
         this.E.position(0);
         var5.put(this.E);
         var5.rewind();
         this.E = var5;
         this.w = this.E.asFloatBuffer();
         this.D = this.E.asIntBuffer();
         this.D.position(var4);
         this.V = this.E.asShortBuffer();
         this.V.position(var4 << 1);
         if(this.m != null) {
            net.n9.v[] var6 = this.m;
            int var7 = this.g();
            this.m = new net.n9.v[var7];
            System.arraycopy(var6, 0, this.m, 0, Math.min(var6.length, this.m.length));
            this.Y = null;
         }
      }

   }

   public void w(float var1, float var2, float var3) {
      int var5 = this.o / 4;
      S();
      final float[] var6 = new float[var5];
      int var7 = 0;
      if(var7 < var5) {
         var6[var7] = z(this.w, (float)((double)var1 + this.Z), (float)((double)var2 + this.C), (float)((double)var3 + this.d), this.p.u(), var7 * this.p.H());
         ++var7;
      }

      Integer[] var17 = new Integer[var5];
      int var8 = 0;
      if(var8 < var17.length) {
         var17[var8] = Integer.valueOf(var8);
         ++var8;
      }

      Arrays.sort(var17, new Comparator() {
         public int t(Integer var1, Integer var2) {
            return Floats.compare(var6[var2.intValue()], var6[var1.intValue()]);
         }
      });
      BitSet var19 = new BitSet();
      int var9 = this.p.H();
      int[] var10 = new int[var9];
      int var11 = var19.nextClearBit(0);
      if(var11 < var17.length) {
         int var12 = var17[var11].intValue();
         if(var12 != var11) {
            this.D.limit(var12 * var9 + var9);
            this.D.position(var12 * var9);
            this.D.get(var10);
            int var14 = var17[var12].intValue();
            if(var12 != var11) {
               this.D.limit(var14 * var9 + var9);
               this.D.position(var14 * var9);
               IntBuffer var15 = this.D.slice();
               this.D.limit(var12 * var9 + var9);
               this.D.position(var12 * var9);
               this.D.put(var15);
               var19.set(var12);
               var14 = var17[var14].intValue();
            }

            this.D.limit(var11 * var9 + var9);
            this.D.position(var11 * var9);
            this.D.put(var10);
         }

         var19.set(var11);
         var19.nextClearBit(var11 + 1);
      }

      this.D.limit(this.D.capacity());
      this.D.position(this.F());
      if(this.m != null) {
         net.n9.v[] var20 = new net.n9.v[this.o / 4];
         int var21 = this.p.H() / 4 * 4;
         int var13 = 0;
         if(var13 < var17.length) {
            int var24 = var17[var13].intValue();
            var20[var13] = this.m[var24];
            ++var13;
         }

         System.arraycopy(var20, 0, this.m, 0, var20.length);
      }

   }

   public p.h k() {
      this.D.rewind();
      int var1 = this.F();
      this.D.limit(var1);
      int[] var2 = new int[var1];
      this.D.get(var2);
      this.D.limit(this.D.capacity());
      this.D.position(var1);
      net.n9.v[] var3 = null;
      if(this.m != null) {
         int var4 = this.o / 4;
         var3 = new net.n9.v[var4];
         System.arraycopy(this.m, 0, var3, 0, var4);
      }

      return new p.h(var2, new net.y8.q(this.p), var3);
   }

   public int F() {
      return this.o * this.p.u();
   }

   private static float z(FloatBuffer var0, float var1, float var2, float var3, int var4, int var5) {
      float var6 = var0.get(var5 + var4 * 0 + 0);
      float var7 = var0.get(var5 + var4 * 0 + 1);
      float var8 = var0.get(var5 + var4 * 0 + 2);
      float var9 = var0.get(var5 + var4 * 1 + 0);
      float var10 = var0.get(var5 + var4 * 1 + 1);
      float var11 = var0.get(var5 + var4 * 1 + 2);
      float var12 = var0.get(var5 + var4 * 2 + 0);
      float var13 = var0.get(var5 + var4 * 2 + 1);
      float var14 = var0.get(var5 + var4 * 2 + 2);
      float var15 = var0.get(var5 + var4 * 3 + 0);
      float var16 = var0.get(var5 + var4 * 3 + 1);
      float var17 = var0.get(var5 + var4 * 3 + 2);
      float var18 = (var6 + var9 + var12 + var15) * 0.25F - var1;
      float var19 = (var7 + var10 + var13 + var16) * 0.25F - var2;
      float var20 = (var8 + var11 + var14 + var17) * 0.25F - var3;
      return var18 * var18 + var19 * var19 + var20 * var20;
   }

   public void L(p.h var1) {
      this.D.clear();
      this.z(var1.F().length * 4);
      this.D.put(var1.F());
      this.o = var1.s();
      this.p = new net.y8.q(var1.O());
      if(var1.B != null) {
         if(this.m == null) {
            this.m = this.Y;
         }

         if(this.m == null || this.m.length < this.g()) {
            this.m = new net.n9.v[this.g()];
         }

         net.n9.v[] var2 = var1.B;
         System.arraycopy(var2, 0, this.m, 0, var2.length);
      } else {
         if(this.m != null) {
            this.Y = this.m;
         }

         this.m = null;
      }

   }

   public void X() {
      this.o = 0;
      this.n = null;
      this.v = 0;
      this.P = null;
   }

   public void m(int var1, net.y8.q var2) {
      if(this.h) {
         throw new IllegalStateException("Already building!");
      } else {
         this.h = true;
         this.X();
         this.X = var1;
         this.p = var2;
         this.n = var2.b(this.v);
         this.H = false;
         this.E.limit(this.E.capacity());
         if(z9.Q()) {
            wk.A(this);
         }

         if(z9.Sk()) {
            if(this.t != null) {
               if(this.m == null) {
                  this.m = this.Y;
               }

               if(this.m == null || this.m.length < this.g()) {
                  this.m = new net.n9.v[this.g()];
               }
            }
         } else {
            if(this.m != null) {
               this.Y = this.m;
            }

            this.m = null;
         }

      }
   }

   public p Y(double var1, double var3) {
      if(this.P != null && this.m != null) {
         var1 = (double)this.P.M((float)var1);
         var3 = (double)this.P.u((float)var3);
         this.m[this.o / 4] = this.P;
      }

      int var5 = this.o * this.p.H() + this.p.t(this.v);
      switch(null.i[this.n.t().ordinal()]) {
      case 1:
         this.E.putFloat(var5, (float)var1);
         this.E.putFloat(var5 + 4, (float)var3);
         break;
      case 2:
      case 3:
         this.E.putInt(var5, (int)var1);
         this.E.putInt(var5 + 4, (int)var3);
         break;
      case 4:
      case 5:
         this.E.putShort(var5, (short)((int)var3));
         this.E.putShort(var5 + 2, (short)((int)var1));
         break;
      case 6:
      case 7:
         this.E.put(var5, (byte)((int)var3));
         this.E.put(var5 + 1, (byte)((int)var1));
      }

      this.k();
      return this;
   }

   public p C(int var1, int var2) {
      int var3 = this.o * this.p.H() + this.p.t(this.v);
      switch(null.i[this.n.t().ordinal()]) {
      case 1:
         this.E.putFloat(var3, (float)var1);
         this.E.putFloat(var3 + 4, (float)var2);
         break;
      case 2:
      case 3:
         this.E.putInt(var3, var1);
         this.E.putInt(var3 + 4, var2);
         break;
      case 4:
      case 5:
         this.E.putShort(var3, (short)var2);
         this.E.putShort(var3 + 2, (short)var1);
         break;
      case 6:
      case 7:
         this.E.put(var3, (byte)var2);
         this.E.put(var3 + 1, (byte)var1);
      }

      this.k();
      return this;
   }

   public void w(int var1, int var2, int var3, int var4) {
      int var5 = (this.o - 4) * this.p.u() + this.p.u(1) / 4;
      int var6 = this.p.H() >> 2;
      this.D.put(var5, var1);
      this.D.put(var5 + var6, var2);
      this.D.put(var5 + var6 * 2, var3);
      this.D.put(var5 + var6 * 3, var4);
   }

   public void n(double var1, double var3, double var5) {
      int var7 = this.p.u();
      int var8 = (this.o - 4) * var7;
      int var9 = 0;

      while(true) {
         int var10 = var8 + var9 * var7;
         int var11 = var10 + 1;
         int var12 = var11 + 1;
         this.D.put(var10, Float.floatToRawIntBits((float)(var1 + this.Z) + Float.intBitsToFloat(this.D.get(var10))));
         this.D.put(var11, Float.floatToRawIntBits((float)(var3 + this.C) + Float.intBitsToFloat(this.D.get(var11))));
         this.D.put(var12, Float.floatToRawIntBits((float)(var5 + this.d) + Float.intBitsToFloat(this.D.get(var12))));
         ++var9;
      }
   }

   public int A(int var1) {
      return ((this.o - var1) * this.p.H() + this.p.U()) / 4;
   }

   public void X(float var1, float var2, float var3, int var4) {
      int var5 = this.A(var4);
      int var6 = -1;
      if(!this.H) {
         var6 = this.D.get(var5);
         if(ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            int var7 = (int)((float)(var6 & 255) * var1);
            int var8 = (int)((float)(var6 >> 8 & 255) * var2);
            int var9 = (int)((float)(var6 >> 16 & 255) * var3);
            var6 = var6 & -16777216;
            var6 = var6 | var9 << 16 | var8 << 8 | var7;
         } else {
            int var13 = (int)((float)(var6 >> 24 & 255) * var1);
            int var14 = (int)((float)(var6 >> 16 & 255) * var2);
            int var15 = (int)((float)(var6 >> 8 & 255) * var3);
            var6 = var6 & 255;
            var6 = var6 | var13 << 24 | var14 << 16 | var15 << 8;
         }
      }

      this.D.put(var5, var6);
   }

   private void M(int var1, int var2) {
      int var3 = this.A(var2);
      int var4 = var1 >> 16 & 255;
      int var5 = var1 >> 8 & 255;
      int var6 = var1 & 255;
      this.J(var3, var4, var5, var6);
   }

   public void E(float var1, float var2, float var3, int var4) {
      int var5 = this.A(var4);
      int var6 = net.u.t.g((int)(var1 * 255.0F), 0, 255);
      int var7 = net.u.t.g((int)(var2 * 255.0F), 0, 255);
      int var8 = net.u.t.g((int)(var3 * 255.0F), 0, 255);
      this.J(var5, var6, var7, var8);
   }

   public void J(int var1, int var2, int var3, int var4) {
      if(ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
         this.D.put(var1, -16777216 | var4 << 16 | var3 << 8 | var2);
      } else {
         this.D.put(var1, var2 << 24 | var3 << 16 | var4 << 8 | 255);
      }

   }

   public void l() {
      this.H = true;
   }

   public p m(float var1, float var2, float var3, float var4) {
      return this.V((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   public p V(int var1, int var2, int var3, int var4) {
      if(this.H) {
         return this;
      } else {
         int var5 = this.o * this.p.H() + this.p.t(this.v);
         switch(null.i[this.n.t().ordinal()]) {
         case 1:
            this.E.putFloat(var5, (float)var1 / 255.0F);
            this.E.putFloat(var5 + 4, (float)var2 / 255.0F);
            this.E.putFloat(var5 + 8, (float)var3 / 255.0F);
            this.E.putFloat(var5 + 12, (float)var4 / 255.0F);
            break;
         case 2:
         case 3:
            this.E.putFloat(var5, (float)var1);
            this.E.putFloat(var5 + 4, (float)var2);
            this.E.putFloat(var5 + 8, (float)var3);
            this.E.putFloat(var5 + 12, (float)var4);
            break;
         case 4:
         case 5:
            this.E.putShort(var5, (short)var1);
            this.E.putShort(var5 + 2, (short)var2);
            this.E.putShort(var5 + 4, (short)var3);
            this.E.putShort(var5 + 6, (short)var4);
            break;
         case 6:
         case 7:
            if(ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
               this.E.put(var5, (byte)var1);
               this.E.put(var5 + 1, (byte)var2);
               this.E.put(var5 + 2, (byte)var3);
               this.E.put(var5 + 3, (byte)var4);
            } else {
               this.E.put(var5, (byte)var4);
               this.E.put(var5 + 1, (byte)var3);
               this.E.put(var5 + 2, (byte)var2);
               this.E.put(var5 + 3, (byte)var1);
            }
         }

         this.k();
         return this;
      }
   }

   public void o(int[] var1) {
      if(z9.Q()) {
         wk.S(this, var1);
      }

      this.z(var1.length * 4);
      this.D.position(this.F());
      this.D.put(var1);
      this.o += var1.length / this.p.u();
      if(z9.Q()) {
         wk.q(this);
      }

   }

   public void W() {
      ++this.o;
      this.z(this.p.H());
      this.v = 0;
      this.n = this.p.b(this.v);
      if(z9.Q()) {
         wk.G(this);
      }

   }

   public p H(double var1, double var3, double var5) {
      if(z9.Q()) {
         wk.L(this);
      }

      int var7 = this.o * this.p.H() + this.p.t(this.v);
      switch(null.i[this.n.t().ordinal()]) {
      case 1:
         this.E.putFloat(var7, (float)(var1 + this.Z));
         this.E.putFloat(var7 + 4, (float)(var3 + this.C));
         this.E.putFloat(var7 + 8, (float)(var5 + this.d));
         break;
      case 2:
      case 3:
         this.E.putInt(var7, Float.floatToRawIntBits((float)(var1 + this.Z)));
         this.E.putInt(var7 + 4, Float.floatToRawIntBits((float)(var3 + this.C)));
         this.E.putInt(var7 + 8, Float.floatToRawIntBits((float)(var5 + this.d)));
         break;
      case 4:
      case 5:
         this.E.putShort(var7, (short)((int)(var1 + this.Z)));
         this.E.putShort(var7 + 2, (short)((int)(var3 + this.C)));
         this.E.putShort(var7 + 4, (short)((int)(var5 + this.d)));
         break;
      case 6:
      case 7:
         this.E.put(var7, (byte)((int)(var1 + this.Z)));
         this.E.put(var7 + 1, (byte)((int)(var3 + this.C)));
         this.E.put(var7 + 2, (byte)((int)(var5 + this.d)));
      }

      this.k();
      return this;
   }

   public void g(float var1, float var2, float var3) {
      int var4 = (byte)((int)(var1 * 127.0F)) & 255;
      int var5 = (byte)((int)(var2 * 127.0F)) & 255;
      int var6 = (byte)((int)(var3 * 127.0F)) & 255;
      int var7 = var4 | var5 << 8 | var6 << 16;
      int var8 = this.p.H() >> 2;
      int var9 = (this.o - 4) * var8 + this.p.m() / 4;
      this.D.put(var9, var7);
      this.D.put(var9 + var8, var7);
      this.D.put(var9 + var8 * 2, var7);
      this.D.put(var9 + var8 * 3, var7);
   }

   private void k() {
      ++this.v;
      this.v %= this.p.X();
      this.n = this.p.b(this.v);
      if(this.n.P() == net.y8.h.PADDING) {
         this.k();
      }

   }

   public p d(float var1, float var2, float var3) {
      int var4 = this.o * this.p.H() + this.p.t(this.v);
      switch(null.i[this.n.t().ordinal()]) {
      case 1:
         this.E.putFloat(var4, var1);
         this.E.putFloat(var4 + 4, var2);
         this.E.putFloat(var4 + 8, var3);
         break;
      case 2:
      case 3:
         this.E.putInt(var4, (int)var1);
         this.E.putInt(var4 + 4, (int)var2);
         this.E.putInt(var4 + 8, (int)var3);
         break;
      case 4:
      case 5:
         this.E.putShort(var4, (short)((int)(var1 * 32767.0F) & '\uffff'));
         this.E.putShort(var4 + 2, (short)((int)(var2 * 32767.0F) & '\uffff'));
         this.E.putShort(var4 + 4, (short)((int)(var3 * 32767.0F) & '\uffff'));
         break;
      case 6:
      case 7:
         this.E.put(var4, (byte)((int)(var1 * 127.0F) & 255));
         this.E.put(var4 + 1, (byte)((int)(var2 * 127.0F) & 255));
         this.E.put(var4 + 2, (byte)((int)(var3 * 127.0F) & 255));
      }

      this.k();
      return this;
   }

   public void S(double var1, double var3, double var5) {
      this.Z = var1;
      this.C = var3;
      this.d = var5;
   }

   public void Z() {
      if(!this.h) {
         throw new IllegalStateException("Not building!");
      } else {
         this.h = false;
         this.E.position(0);
         this.E.limit(this.F() * 4);
      }
   }

   public ByteBuffer E() {
      return this.E;
   }

   public net.y8.q T() {
      return this.p;
   }

   public int b() {
      return this.o;
   }

   public int I() {
      return this.X;
   }

   public void Q(int var1) {
      int var2 = 0;

      while(true) {
         this.M(var1, var2 + 1);
         ++var2;
      }
   }

   public void m(float var1, float var2, float var3) {
      int var4 = 0;

      while(true) {
         this.E(var1, var2, var3, var4 + 1);
         ++var4;
      }
   }

   public void J(net.n9.v var1) {
      if(this.m != null) {
         int var2 = this.o / 4;
         this.m[var2 - 1] = var1;
      }

   }

   public void b(net.n9.v var1) {
      if(this.m != null) {
         this.P = var1;
      }

   }

   public boolean b() {
      return this.m != null;
   }

   public void m() {
      if(this.m != null) {
         int var1 = z9.G().p().a();
         if(this.S.length <= var1) {
            this.S = new boolean[var1 + 1];
         }

         Arrays.fill(this.S, false);
         int var2 = 0;
         int var3 = -1;
         int var4 = this.o / 4;

         for(int var5 = 0; var5 < var4; ++var5) {
            net.n9.v var6 = this.m[var5];
            int var7 = var6.Q();
            if(!this.S[var7]) {
               if(var6 == os.VM) {
                  var3 = var5;
               } else {
                  var5 = this.b(var6, var5) - 1;
                  ++var2;
                  if(this.t != ac.TRANSLUCENT) {
                     this.S[var7] = true;
                  }
               }
            }
         }

         this.b(os.VM, var3);
         ++var2;
      }

   }

   private int b(net.n9.v var1, int var2) {
      GL11.glBindTexture(3553, var1.t);
      boolean var3 = true;
      int var4 = -1;
      int var5 = this.o / 4;

      for(int var6 = var2; var6 < var5; ++var6) {
         net.n9.v var7 = this.m[var6];
         if(var7 == var1) {
            var4 = var6;
         } else {
            this.q(var4, var6);
            if(this.t == ac.TRANSLUCENT) {
               return var6;
            }

            var4 = -1;
         }
      }

      this.q(var4, var5);
      return var5;
   }

   private void q(int var1, int var2) {
      int var3 = var2 - var1;
      int var4 = var1 * 4;
      int var5 = var3 * 4;
      GL11.glDrawArrays(this.X, var4, var5);
   }

   public void U(ac var1) {
      this.t = var1;
      if(this.m != null) {
         this.Y = this.m;
      }

      this.m = null;
      this.P = null;
   }

   private int g() {
      int var1 = this.D.capacity() * 4 / (this.p.u() * 4);
      return var1;
   }

   public _c X(o8 var1, net.yw.n var2, net.u.j var3) {
      if(this.s == null) {
         this.s = new _c(var1, var2, var3);
         return this.s;
      } else {
         this.s.S(var1, var2, var3);
         return this.s;
      }
   }

   public boolean l() {
      return this.h;
   }

   public double I() {
      return this.Z;
   }

   public double l() {
      return this.C;
   }

   public double z() {
      return this.d;
   }

   public void N(int var1, int var2, int var3, int var4, int var5) {
      if(ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
         this.D.put(var1, var5 << 24 | var4 << 16 | var3 << 8 | var2);
      } else {
         this.D.put(var1, var2 << 24 | var3 << 16 | var4 << 8 | var5);
      }

   }

   public boolean w() {
      return this.H;
   }

   static {
      v("K7Kku");
   }

   public static void v(String var0) {
      F = var0;
   }

   public static String S() {
      return F;
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   public class h {
      private final int[] T;
      private final net.y8.q h;
      private net.n9.v[] B;

      public h(int[] var2, net.y8.q var3, net.n9.v[] var4) {
         this.T = var2;
         this.h = var3;
         this.B = var4;
      }

      public h(int[] var2, net.y8.q var3) {
         this.T = var2;
         this.h = var3;
      }

      public int[] F() {
         return this.T;
      }

      public int s() {
         return this.T.length / this.h.u();
      }

      public net.y8.q O() {
         return this.h;
      }
   }
}
