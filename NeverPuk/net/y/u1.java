package net.y;

import java.nio.FloatBuffer;
import net.y.d;
import net.y.m;

public class u1 {
   private static final FloatBuffer M = m.R(4);
   private static final net.u.r u = (new net.u.r(0.20000000298023224D, 1.0D, -0.699999988079071D)).I();
   private static final net.u.r s = (new net.u.r(-0.20000000298023224D, 1.0D, 0.699999988079071D)).I();

   public static void m() {
      d.i();
      d.J(0);
      d.J(1);
      d.e();
   }

   public static void B() {
      d.K();
      d.k(0);
      d.k(1);
      d.G();
      d.G(1032, 5634);
      d.j(16384, 4611, u(u.p, u.H, u.a, 0.0D));
      float var10000 = 0.6F;
      d.j(16384, 4609, T(0.6F, 0.6F, 0.6F, 1.0F));
      d.j(16384, 4608, T(0.0F, 0.0F, 0.0F, 1.0F));
      d.j(16384, 4610, T(0.0F, 0.0F, 0.0F, 1.0F));
      d.j(16385, 4611, u(s.p, s.H, s.a, 0.0D));
      d.j(16385, 4609, T(0.6F, 0.6F, 0.6F, 1.0F));
      d.j(16385, 4608, T(0.0F, 0.0F, 0.0F, 1.0F));
      d.j(16385, 4610, T(0.0F, 0.0F, 0.0F, 1.0F));
      d.Q(7424);
      var10000 = 0.4F;
      d.Y(2899, T(0.4F, 0.4F, 0.4F, 1.0F));
   }

   private static FloatBuffer u(double var0, double var2, double var4, double var6) {
      return T((float)var0, (float)var2, (float)var4, (float)var6);
   }

   public static FloatBuffer T(float var0, float var1, float var2, float var3) {
      M.clear();
      M.put(var0).put(var1).put(var2).put(var3);
      M.flip();
      return M;
   }

   public static void A() {
      d.c();
      d.P(-30.0F, 0.0F, 1.0F, 0.0F);
      d.P(165.0F, 1.0F, 0.0F, 0.0F);
      B();
      d.Y();
   }
}
