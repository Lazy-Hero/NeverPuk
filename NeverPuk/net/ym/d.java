package net.ym;

import java.util.Map;
import java.util.Optional;
import net._b;
import net.b4;
import net.bd;
import net.i6;
import net.xn;
import net.ym.t;
import net.yz.aq;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

public enum d implements _b, b4 {
   X0_Y0,
   X0_Y90,
   X0_Y180,
   X0_Y270,
   X90_Y0,
   X90_Y90,
   X90_Y180,
   X90_Y270,
   X180_Y0,
   X180_Y90,
   X180_Y180,
   X180_Y270,
   X270_Y0,
   X270_Y90,
   X270_Y180,
   X270_Y270;

   private static final Map p;
   private final int Z;
   private final Matrix4f D;
   private final int S;
   private final int n;

   private static int o(int var0, int var1) {
      return var0 * 360 + var1;
   }

   private d(int var3, int var4) {
      this.Z = o(var3, var4);
      this.D = new Matrix4f();
      Matrix4f var5 = new Matrix4f();
      var5.setIdentity();
      Matrix4f.rotate((float)(-var3) * 0.017453292F, new Vector3f(1.0F, 0.0F, 0.0F), var5, var5);
      this.S = net.u.t.l(var3 / 90);
      Matrix4f var6 = new Matrix4f();
      var6.setIdentity();
      Matrix4f.rotate((float)(-var4) * 0.017453292F, new Vector3f(0.0F, 1.0F, 0.0F), var6, var6);
      this.n = net.u.t.l(var4 / 90);
      Matrix4f.mul(var6, var5, this.D);
   }

   public Matrix4f B() {
      return this.D;
   }

   public aq q(aq var1) {
      aq var2 = var1;

      for(int var3 = 0; var3 < this.S; ++var3) {
         var2 = var2.K(aq.l.X);
      }

      if(var2.r() != aq.l.Y) {
         for(int var4 = 0; var4 < this.n; ++var4) {
            var2 = var2.K(aq.l.Y);
         }
      }

      return var2;
   }

   public int e(aq var1, int var2) {
      t.V();
      int var4 = var2;
      if(var1.r() == aq.l.X) {
         var4 = (var2 + this.S) % 4;
      }

      aq var5 = var1;
      int var6 = 0;
      if(var6 < this.S) {
         var5 = var1.K(aq.l.X);
         ++var6;
      }

      if(var5.r() == aq.l.Y) {
         var4 = (var4 + this.n) % 4;
      }

      return var4;
   }

   public static d v(int var0, int var1) {
      return (d)p.get(Integer.valueOf(o(net.u.t.F(var0, 360), net.u.t.F(var1, 360))));
   }

   public Optional U(Optional var1) {
      return (Optional)i6.H(i6.C_, new Object[]{this.j(), var1});
   }

   public bd j() {
      return i6.U_.r()?(bd)i6.H(i6.U_, new Object[]{this}):new bd();
   }

   public aq O(aq var1) {
      return this.q(var1);
   }

   public int b(aq var1, int var2) {
      return this.e(var1, var2);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static xn a(xn var0) {
      return var0;
   }
}
