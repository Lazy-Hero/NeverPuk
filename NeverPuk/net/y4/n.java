package net.y4;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.xn;
import net.nk.f2;
import net.nk.f8;
import net.ns.i;
import net.y4.a;
import net.y4.e;
import net.y4.p;
import net.y4.s;

public class n extends a {
   private final List A = Lists.newArrayList();

   public n() {
      this.A.add(new i.w(net.nk.x.class, 10, 2, 3));
      this.A.add(new i.w(f2.class, 5, 4, 4));
      this.A.add(new i.w(net.nk.k.class, 8, 5, 5));
      this.A.add(new i.w(net.nk.g.class, 2, 5, 5));
      this.A.add(new i.w(f8.class, 3, 4, 4));
   }

   public String O() {
      return "Fortress";
   }

   public List e() {
      return this.A;
   }

   protected boolean Y(int var1, int var2) {
      int var3 = var1 >> 4;
      int var4 = var2 >> 4;
      this.N.setSeed((long)(var3 ^ var4 << 4) ^ this.Q.a());
      this.N.nextInt();
      return this.N.nextInt(3) != 0?false:(var1 != (var3 << 4) + 4 + this.N.nextInt(8)?false:var2 == (var4 << 4) + 4 + this.N.nextInt(8));
   }

   protected s z(int var1, int var2) {
      return new n.d(this.Q, this.N, var1, var2);
   }

   public net.u.j h(net.yv.r var1, net.u.j var2, boolean var3) {
      boolean var10000 = true;
      int var6 = var2.t() >> 4;
      int var7 = var2.y() >> 4;
      p.d();
      int var8 = 0;
      int var9 = -var8;
      boolean var10 = true;
      int var11 = -var8;
      boolean var10002 = true;
      int var13 = var6 + var9;
      int var14 = var7 + var11;
      if(!this.Y(var13, var14) || var3 && var1.P(var13, var14)) {
         ++var11;
         ++var9;
         ++var8;
         return null;
      } else {
         return new net.u.j((var13 << 4) + 8, 64, (var14 << 4) + 8);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class d extends s {
      public d() {
      }

      public d(net.yv.r var1, Random var2, int var3, int var4) {
         super(var3, var4);
         e.q var6 = new e.q(var2, (var3 << 4) + 2, (var4 << 4) + 2);
         p.d();
         this.J.add(var6);
         var6.S(var6, this.J, var2);
         List var7 = var6.c;
         if(!var7.isEmpty()) {
            int var8 = var2.nextInt(var7.size());
            p var9 = (p)var7.remove(var8);
            var9.S(var6, this.J, var2);
         }

         this.O();
         this.n(var1, var2, 48, 70);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
