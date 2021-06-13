package net.y;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.xn;
import net.y.d;
import net.y.m;
import net.y.p;
import net.y9.g5;
import org.lwjgl.util.glu.GLU;

public class h {
   private static final IntBuffer G = m.z(16);
   private static final FloatBuffer n = m.R(16);
   private static final FloatBuffer E = m.R(16);
   private static final FloatBuffer h = m.R(3);
   private static net.u.r F = new net.u.r(0.0D, 0.0D, 0.0D);
   private static float k;
   private static float U;
   private static float o;
   private static float Q;
   private static float l;

   public static void k(net.r.r var0, boolean var1) {
      d.t(2982, n);
      d.t(2983, E);
      p.S();
      d.v(2978, G);
      float var3 = (float)((G.get(0) + G.get(2)) / 2);
      float var4 = (float)((G.get(1) + G.get(3)) / 2);
      GLU.gluUnProject(var3, var4, 0.0F, n, E, G, h);
      F = new net.u.r((double)h.get(0), (double)h.get(1), (double)h.get(2));
      int var5 = var1?1:0;
      float var6 = var0.V;
      float var7 = var0.hN;
      k = net.u.t.m(var7 * 0.017453292F) * (float)(1 - var5 * 2);
      o = net.u.t.A(var7 * 0.017453292F) * (float)(1 - var5 * 2);
      Q = -o * net.u.t.A(var6 * 0.017453292F) * (float)(1 - var5 * 2);
      l = k * net.u.t.A(var6 * 0.017453292F) * (float)(1 - var5 * 2);
      U = net.u.t.m(var6 * 0.017453292F);
   }

   public static net.u.r D(net.ne.l var0, double var1) {
      double var3 = var0.h + (var0.b - var0.h) * var1;
      double var5 = var0.h6 + (var0.hS - var0.h6) * var1;
      double var7 = var0.l + (var0.hr - var0.l) * var1;
      double var9 = var3 + F.p;
      double var11 = var5 + F.H;
      double var13 = var7 + F.a;
      return new net.u.r(var9, var11, var13);
   }

   public static net.yw.n r(net.yv.r var0, net.ne.l var1, float var2) {
      p.S();
      net.u.r var4 = D(var1, (double)var2);
      net.u.j var5 = new net.u.j(var4);
      net.yw.n var6 = var0.Z(var5);
      if(var6.n().y()) {
         float var7 = 0.0F;
         if(var6.Q() instanceof g5) {
            var7 = g5.P(((Integer)var6.i(g5.J)).intValue()) - 0.11111111F;
         }

         float var8 = (float)(var5.h() + 1) - var7;
         if(var4.H >= (double)var8) {
            var6 = var0.Z(var5.h());
         }
      }

      return var6;
   }

   public static float y() {
      return k;
   }

   public static float c() {
      return U;
   }

   public static float P() {
      return o;
   }

   public static float t() {
      return Q;
   }

   public static float d() {
      return l;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
