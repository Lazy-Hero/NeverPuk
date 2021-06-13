package net.cn;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.cn.e;
import net.cn.w;
import net.l.o;
import net.ns.i;
import net.u.j;
import net.yv.r;

public class f implements e {
   private static final List O = Lists.newArrayList();
   private static final int t;
   private static final int S;
   protected static final net.yw.n x = net.nb.f.ou.p();
   protected static final net.yw.n F = net.nb.f.dr.p();
   private final r C;

   public f(r var1) {
      this.C = var1;
   }

   public net.l.q g(int var1, int var2) {
      o var4 = new o();
      w.a();
      int var5 = 0;
      int var6 = 0;
      int var7 = var1 * 16 + var5;
      int var8 = var2 * 16 + var6;
      var4.Q(var5, 60, var6, F);
      net.yw.n var9 = Q(var7, var8);
      var4.Q(var5, 70, var6, var9);
      ++var6;
      ++var5;
      net.l.q var11 = new net.l.q(this.C, var4, var1, var2);
      var11.Q();
      i[] var13 = this.C.V().h((i[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var14 = var11.O();
      var8 = 0;
      if(var8 < var14.length) {
         var14[var8] = (byte)i.y(var13[var8]);
         ++var8;
      }

      var11.Q();
      return var11;
   }

   public static net.yw.n Q(int var0, int var1) {
      net.yw.n var2 = x;
      if(var0 % 2 != 0 && var1 % 2 != 0) {
         var0 = var0 / 2;
         var1 = var1 / 2;
         if(var0 <= t && var1 <= S) {
            int var3 = net.u.t.l(var0 * t + var1);
            if(var3 < O.size()) {
               var2 = (net.yw.n)O.get(var3);
            }
         }
      }

      return var2;
   }

   public void u(int var1, int var2) {
   }

   public boolean c(net.l.q var1, int var2, int var3) {
      return false;
   }

   public List x(net.ne.q var1, j var2) {
      i var3 = this.C.P(var2);
      return var3.v(var1);
   }

   @Nullable
   public j P(r var1, String var2, j var3, boolean var4) {
      return null;
   }

   public boolean z(r var1, String var2, j var3) {
      return false;
   }

   public void W(net.l.q var1, int var2, int var3) {
   }

   static {
      for(net.y9.l var1 : net.y9.l.m) {
         O.addAll(var1.j().v());
      }

      t = net.u.t.Y(net.u.t.g((float)O.size()));
      S = net.u.t.Y((float)O.size() / (float)t);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
