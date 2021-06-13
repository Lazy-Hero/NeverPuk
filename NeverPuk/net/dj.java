package net;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.mf;
import net.xn;
import net.z9;
import net.u.e;
import net.ym.b;
import net.ym.d;
import net.ym.h;
import net.ym.i;
import net.ym.j;
import net.ym.l;
import net.ym.q;
import net.ym.s;
import net.ym.t;
import net.yw.n;
import net.yz.aq;
import org.lwjgl.util.vector.Vector3f;

public class dj {
   private static final float X = 1.0E-6F;

   public static j w(String var0, int var1) {
      net.n9.v var2 = z9.G().p().O(var0);
      return B(var2, var1);
   }

   public static j B(net.n9.v var0, int var1) {
      ArrayList var2 = new ArrayList();
      aq[] var3 = aq.VALUES;
      HashMap var4 = new HashMap();

      for(int var5 = 0; var5 < var3.length; ++var5) {
         aq var6 = var3[var5];
         ArrayList var7 = new ArrayList();
         var7.add(B(var6, var0, var1));
         var4.put(var6, var7);
      }

      l var8 = new l(new ArrayList());
      b var9 = new b(var2, var4, true, true, var0, s.w, var8);
      return var9;
   }

   public static j b(j var0, j var1) {
      ArrayList var3 = new ArrayList();
      var3.addAll(var0.h((n)null, (aq)null, 0L));
      mf.O();
      var3.addAll(var1.h((n)null, (aq)null, 0L));
      aq[] var4 = aq.VALUES;
      HashMap var5 = new HashMap();
      int var6 = 0;
      if(var6 < var4.length) {
         aq var7 = var4[var6];
         ArrayList var8 = new ArrayList();
         var8.addAll(var0.h((n)null, var7, 0L));
         var8.addAll(var1.h((n)null, var7, 0L));
         var5.put(var7, var8);
         ++var6;
      }

      var6 = var0.a();
      boolean var14 = var0.t();
      net.n9.v var15 = var0.o();
      s var9 = var0.D();
      l var10 = var0.q();
      b var11 = new b(var3, var5, (boolean)var6, var14, var15, var9, var10);
      return var11;
   }

   public static t B(aq var0, net.n9.v var1, int var2) {
      Vector3f var3 = new Vector3f(0.0F, 0.0F, 0.0F);
      Vector3f var4 = new Vector3f(16.0F, 16.0F, 16.0F);
      q var5 = new q(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      net.ym.z var6 = new net.ym.z(var0, var2, "#" + var0.f(), var5);
      d var7 = d.X0_Y0;
      Object var8 = null;
      boolean var9 = false;
      boolean var10 = true;
      i var11 = new i();
      t var12 = var11.d(var3, var4, var6, var1, var0, var7, (h)var8, var9, var10);
      return var12;
   }

   public static j N(String var0, String var1, String var2) {
      net.n9.b var3 = z9.G().p();
      net.n9.v var4 = var3.S(var1);
      net.n9.v var5 = var3.S(var2);
      return G(var0, var4, var5);
   }

   public static j G(String var0, net.n9.v var1, net.n9.v var2) {
      String var3 = mf.O();
      if(var1 != null && var2 != null) {
         net.ym.v var4 = z9.a();
         return null;
      } else {
         return null;
      }
   }

   private static void f(List var0, net.n9.v var1, net.n9.v var2) {
      ArrayList var3 = new ArrayList();

      for(t var5 : var0) {
         if(var5.t() != var1) {
            var3.add(var5);
            break;
         }

         net.ym.n var6 = new net.ym.n(var5, var2);
         var3.add(var6);
      }

      var0.clear();
      var0.addAll(var3);
   }

   public static void e(Vector3f var0) {
      var0.setX(l(var0.getX()));
      var0.setY(l(var0.getY()));
      var0.setZ(l(var0.getZ()));
   }

   private static float l(float var0) {
      return var0 > -1.0E-6F && var0 < 1.0E-6F?0.0F:(var0 > 0.999999F && var0 < 1.000001F?1.0F:var0);
   }

   public static e W(e var0, net.y9.l var1, net.u.j var2) {
      int var3 = var2.t();
      int var4 = var2.y();
      long var5 = (long)(var3 * 3129871) ^ (long)var4 * 116129781L;
      var5 = var5 * var5 * 42317861L + var5 * 11L;
      double var7 = ((double)((float)(var5 >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D;
      double var9 = ((double)((float)(var5 >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D;
      double var11 = 0.0D;
      if(var1 == net.y9.l.XYZ) {
         var11 = ((double)((float)(var5 >> 20 & 15L) / 15.0F) - 1.0D) * 0.2D;
      }

      return var0.w(var7, var11, var9);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
